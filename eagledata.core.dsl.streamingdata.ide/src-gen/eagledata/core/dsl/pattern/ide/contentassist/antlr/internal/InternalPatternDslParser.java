package eagledata.core.dsl.pattern.ide.contentassist.antlr.internal;

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
import eagledata.core.dsl.pattern.services.PatternDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPatternDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'source'", "'language'", "'minretweet'", "'minfavorite'", "'inreplyto'", "'retweet'", "'favorite'", "'all'", "'any'", "'android'", "'ios'", "'web'", "'kms'", "'miles'", "'mts'", "'english'", "'spanish'", "'chinese'", "'import'", "'.*'", "'.'", "'place'", "'='", "'arround'", "','", "'UTM'", "'{'", "'}'", "'region'", "':'", "'list'", "'('", "')'", "'phrase'", "'ordered'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
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


        public InternalPatternDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPatternDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPatternDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPatternDsl.g"; }


    	private PatternDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(PatternDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStreamingModel"
    // InternalPatternDsl.g:53:1: entryRuleStreamingModel : ruleStreamingModel EOF ;
    public final void entryRuleStreamingModel() throws RecognitionException {
        try {
            // InternalPatternDsl.g:54:1: ( ruleStreamingModel EOF )
            // InternalPatternDsl.g:55:1: ruleStreamingModel EOF
            {
             before(grammarAccess.getStreamingModelRule()); 
            pushFollow(FOLLOW_1);
            ruleStreamingModel();

            state._fsp--;

             after(grammarAccess.getStreamingModelRule()); 
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
    // $ANTLR end "entryRuleStreamingModel"


    // $ANTLR start "ruleStreamingModel"
    // InternalPatternDsl.g:62:1: ruleStreamingModel : ( ( rule__StreamingModel__Group__0 ) ) ;
    public final void ruleStreamingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:66:2: ( ( ( rule__StreamingModel__Group__0 ) ) )
            // InternalPatternDsl.g:67:2: ( ( rule__StreamingModel__Group__0 ) )
            {
            // InternalPatternDsl.g:67:2: ( ( rule__StreamingModel__Group__0 ) )
            // InternalPatternDsl.g:68:3: ( rule__StreamingModel__Group__0 )
            {
             before(grammarAccess.getStreamingModelAccess().getGroup()); 
            // InternalPatternDsl.g:69:3: ( rule__StreamingModel__Group__0 )
            // InternalPatternDsl.g:69:4: rule__StreamingModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StreamingModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamingModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamingModel"


    // $ANTLR start "entryRuleStreamingDescription"
    // InternalPatternDsl.g:78:1: entryRuleStreamingDescription : ruleStreamingDescription EOF ;
    public final void entryRuleStreamingDescription() throws RecognitionException {
        try {
            // InternalPatternDsl.g:79:1: ( ruleStreamingDescription EOF )
            // InternalPatternDsl.g:80:1: ruleStreamingDescription EOF
            {
             before(grammarAccess.getStreamingDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleStreamingDescription();

            state._fsp--;

             after(grammarAccess.getStreamingDescriptionRule()); 
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
    // $ANTLR end "entryRuleStreamingDescription"


    // $ANTLR start "ruleStreamingDescription"
    // InternalPatternDsl.g:87:1: ruleStreamingDescription : ( ( rule__StreamingDescription__Alternatives ) ) ;
    public final void ruleStreamingDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:91:2: ( ( ( rule__StreamingDescription__Alternatives ) ) )
            // InternalPatternDsl.g:92:2: ( ( rule__StreamingDescription__Alternatives ) )
            {
            // InternalPatternDsl.g:92:2: ( ( rule__StreamingDescription__Alternatives ) )
            // InternalPatternDsl.g:93:3: ( rule__StreamingDescription__Alternatives )
            {
             before(grammarAccess.getStreamingDescriptionAccess().getAlternatives()); 
            // InternalPatternDsl.g:94:3: ( rule__StreamingDescription__Alternatives )
            // InternalPatternDsl.g:94:4: rule__StreamingDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StreamingDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStreamingDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamingDescription"


    // $ANTLR start "entryRuleImport"
    // InternalPatternDsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalPatternDsl.g:104:1: ( ruleImport EOF )
            // InternalPatternDsl.g:105:1: ruleImport EOF
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
    // InternalPatternDsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalPatternDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalPatternDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalPatternDsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalPatternDsl.g:119:3: ( rule__Import__Group__0 )
            // InternalPatternDsl.g:119:4: rule__Import__Group__0
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
    // InternalPatternDsl.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalPatternDsl.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalPatternDsl.g:130:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalPatternDsl.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalPatternDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalPatternDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalPatternDsl.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalPatternDsl.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalPatternDsl.g:144:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalPatternDsl.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPatternDsl.g:154:1: ( ruleQualifiedName EOF )
            // InternalPatternDsl.g:155:1: ruleQualifiedName EOF
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
    // InternalPatternDsl.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPatternDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPatternDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPatternDsl.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalPatternDsl.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalPatternDsl.g:169:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleGeographicalElement"
    // InternalPatternDsl.g:178:1: entryRuleGeographicalElement : ruleGeographicalElement EOF ;
    public final void entryRuleGeographicalElement() throws RecognitionException {
        try {
            // InternalPatternDsl.g:179:1: ( ruleGeographicalElement EOF )
            // InternalPatternDsl.g:180:1: ruleGeographicalElement EOF
            {
             before(grammarAccess.getGeographicalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGeographicalElement();

            state._fsp--;

             after(grammarAccess.getGeographicalElementRule()); 
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
    // $ANTLR end "entryRuleGeographicalElement"


    // $ANTLR start "ruleGeographicalElement"
    // InternalPatternDsl.g:187:1: ruleGeographicalElement : ( ( rule__GeographicalElement__Alternatives ) ) ;
    public final void ruleGeographicalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:191:2: ( ( ( rule__GeographicalElement__Alternatives ) ) )
            // InternalPatternDsl.g:192:2: ( ( rule__GeographicalElement__Alternatives ) )
            {
            // InternalPatternDsl.g:192:2: ( ( rule__GeographicalElement__Alternatives ) )
            // InternalPatternDsl.g:193:3: ( rule__GeographicalElement__Alternatives )
            {
             before(grammarAccess.getGeographicalElementAccess().getAlternatives()); 
            // InternalPatternDsl.g:194:3: ( rule__GeographicalElement__Alternatives )
            // InternalPatternDsl.g:194:4: rule__GeographicalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GeographicalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeographicalElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeographicalElement"


    // $ANTLR start "entryRulePlace"
    // InternalPatternDsl.g:203:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPatternDsl.g:204:1: ( rulePlace EOF )
            // InternalPatternDsl.g:205:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
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
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPatternDsl.g:212:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:216:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPatternDsl.g:217:2: ( ( rule__Place__Group__0 ) )
            {
            // InternalPatternDsl.g:217:2: ( ( rule__Place__Group__0 ) )
            // InternalPatternDsl.g:218:3: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPatternDsl.g:219:3: ( rule__Place__Group__0 )
            // InternalPatternDsl.g:219:4: rule__Place__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRulePoint"
    // InternalPatternDsl.g:228:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalPatternDsl.g:229:1: ( rulePoint EOF )
            // InternalPatternDsl.g:230:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalPatternDsl.g:237:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:241:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalPatternDsl.g:242:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalPatternDsl.g:242:2: ( ( rule__Point__Group__0 ) )
            // InternalPatternDsl.g:243:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalPatternDsl.g:244:3: ( rule__Point__Group__0 )
            // InternalPatternDsl.g:244:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleCoordinate"
    // InternalPatternDsl.g:253:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalPatternDsl.g:254:1: ( ruleCoordinate EOF )
            // InternalPatternDsl.g:255:1: ruleCoordinate EOF
            {
             before(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinateRule()); 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalPatternDsl.g:262:1: ruleCoordinate : ( ( rule__Coordinate__Alternatives ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:266:2: ( ( ( rule__Coordinate__Alternatives ) ) )
            // InternalPatternDsl.g:267:2: ( ( rule__Coordinate__Alternatives ) )
            {
            // InternalPatternDsl.g:267:2: ( ( rule__Coordinate__Alternatives ) )
            // InternalPatternDsl.g:268:3: ( rule__Coordinate__Alternatives )
            {
             before(grammarAccess.getCoordinateAccess().getAlternatives()); 
            // InternalPatternDsl.g:269:3: ( rule__Coordinate__Alternatives )
            // InternalPatternDsl.g:269:4: rule__Coordinate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleLatLong"
    // InternalPatternDsl.g:278:1: entryRuleLatLong : ruleLatLong EOF ;
    public final void entryRuleLatLong() throws RecognitionException {
        try {
            // InternalPatternDsl.g:279:1: ( ruleLatLong EOF )
            // InternalPatternDsl.g:280:1: ruleLatLong EOF
            {
             before(grammarAccess.getLatLongRule()); 
            pushFollow(FOLLOW_1);
            ruleLatLong();

            state._fsp--;

             after(grammarAccess.getLatLongRule()); 
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
    // $ANTLR end "entryRuleLatLong"


    // $ANTLR start "ruleLatLong"
    // InternalPatternDsl.g:287:1: ruleLatLong : ( ( rule__LatLong__Group__0 ) ) ;
    public final void ruleLatLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:291:2: ( ( ( rule__LatLong__Group__0 ) ) )
            // InternalPatternDsl.g:292:2: ( ( rule__LatLong__Group__0 ) )
            {
            // InternalPatternDsl.g:292:2: ( ( rule__LatLong__Group__0 ) )
            // InternalPatternDsl.g:293:3: ( rule__LatLong__Group__0 )
            {
             before(grammarAccess.getLatLongAccess().getGroup()); 
            // InternalPatternDsl.g:294:3: ( rule__LatLong__Group__0 )
            // InternalPatternDsl.g:294:4: rule__LatLong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LatLong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLatLongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLatLong"


    // $ANTLR start "entryRuleUTM"
    // InternalPatternDsl.g:303:1: entryRuleUTM : ruleUTM EOF ;
    public final void entryRuleUTM() throws RecognitionException {
        try {
            // InternalPatternDsl.g:304:1: ( ruleUTM EOF )
            // InternalPatternDsl.g:305:1: ruleUTM EOF
            {
             before(grammarAccess.getUTMRule()); 
            pushFollow(FOLLOW_1);
            ruleUTM();

            state._fsp--;

             after(grammarAccess.getUTMRule()); 
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
    // $ANTLR end "entryRuleUTM"


    // $ANTLR start "ruleUTM"
    // InternalPatternDsl.g:312:1: ruleUTM : ( ( rule__UTM__Group__0 ) ) ;
    public final void ruleUTM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:316:2: ( ( ( rule__UTM__Group__0 ) ) )
            // InternalPatternDsl.g:317:2: ( ( rule__UTM__Group__0 ) )
            {
            // InternalPatternDsl.g:317:2: ( ( rule__UTM__Group__0 ) )
            // InternalPatternDsl.g:318:3: ( rule__UTM__Group__0 )
            {
             before(grammarAccess.getUTMAccess().getGroup()); 
            // InternalPatternDsl.g:319:3: ( rule__UTM__Group__0 )
            // InternalPatternDsl.g:319:4: rule__UTM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UTM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUTMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUTM"


    // $ANTLR start "entryRuleRegion"
    // InternalPatternDsl.g:328:1: entryRuleRegion : ruleRegion EOF ;
    public final void entryRuleRegion() throws RecognitionException {
        try {
            // InternalPatternDsl.g:329:1: ( ruleRegion EOF )
            // InternalPatternDsl.g:330:1: ruleRegion EOF
            {
             before(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            ruleRegion();

            state._fsp--;

             after(grammarAccess.getRegionRule()); 
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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalPatternDsl.g:337:1: ruleRegion : ( ( rule__Region__Group__0 ) ) ;
    public final void ruleRegion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:341:2: ( ( ( rule__Region__Group__0 ) ) )
            // InternalPatternDsl.g:342:2: ( ( rule__Region__Group__0 ) )
            {
            // InternalPatternDsl.g:342:2: ( ( rule__Region__Group__0 ) )
            // InternalPatternDsl.g:343:3: ( rule__Region__Group__0 )
            {
             before(grammarAccess.getRegionAccess().getGroup()); 
            // InternalPatternDsl.g:344:3: ( rule__Region__Group__0 )
            // InternalPatternDsl.g:344:4: rule__Region__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRulePatternMatcherElement"
    // InternalPatternDsl.g:353:1: entryRulePatternMatcherElement : rulePatternMatcherElement EOF ;
    public final void entryRulePatternMatcherElement() throws RecognitionException {
        try {
            // InternalPatternDsl.g:354:1: ( rulePatternMatcherElement EOF )
            // InternalPatternDsl.g:355:1: rulePatternMatcherElement EOF
            {
             before(grammarAccess.getPatternMatcherElementRule()); 
            pushFollow(FOLLOW_1);
            rulePatternMatcherElement();

            state._fsp--;

             after(grammarAccess.getPatternMatcherElementRule()); 
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
    // $ANTLR end "entryRulePatternMatcherElement"


    // $ANTLR start "rulePatternMatcherElement"
    // InternalPatternDsl.g:362:1: rulePatternMatcherElement : ( ( rule__PatternMatcherElement__Alternatives ) ) ;
    public final void rulePatternMatcherElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:366:2: ( ( ( rule__PatternMatcherElement__Alternatives ) ) )
            // InternalPatternDsl.g:367:2: ( ( rule__PatternMatcherElement__Alternatives ) )
            {
            // InternalPatternDsl.g:367:2: ( ( rule__PatternMatcherElement__Alternatives ) )
            // InternalPatternDsl.g:368:3: ( rule__PatternMatcherElement__Alternatives )
            {
             before(grammarAccess.getPatternMatcherElementAccess().getAlternatives()); 
            // InternalPatternDsl.g:369:3: ( rule__PatternMatcherElement__Alternatives )
            // InternalPatternDsl.g:369:4: rule__PatternMatcherElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PatternMatcherElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternMatcherElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternMatcherElement"


    // $ANTLR start "entryRuleConcept"
    // InternalPatternDsl.g:378:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalPatternDsl.g:379:1: ( ruleConcept EOF )
            // InternalPatternDsl.g:380:1: ruleConcept EOF
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
    // InternalPatternDsl.g:387:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:391:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalPatternDsl.g:392:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalPatternDsl.g:392:2: ( ( rule__Concept__Alternatives ) )
            // InternalPatternDsl.g:393:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalPatternDsl.g:394:3: ( rule__Concept__Alternatives )
            // InternalPatternDsl.g:394:4: rule__Concept__Alternatives
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


    // $ANTLR start "entryRuleTermList"
    // InternalPatternDsl.g:403:1: entryRuleTermList : ruleTermList EOF ;
    public final void entryRuleTermList() throws RecognitionException {
        try {
            // InternalPatternDsl.g:404:1: ( ruleTermList EOF )
            // InternalPatternDsl.g:405:1: ruleTermList EOF
            {
             before(grammarAccess.getTermListRule()); 
            pushFollow(FOLLOW_1);
            ruleTermList();

            state._fsp--;

             after(grammarAccess.getTermListRule()); 
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
    // $ANTLR end "entryRuleTermList"


    // $ANTLR start "ruleTermList"
    // InternalPatternDsl.g:412:1: ruleTermList : ( ( rule__TermList__Group__0 ) ) ;
    public final void ruleTermList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:416:2: ( ( ( rule__TermList__Group__0 ) ) )
            // InternalPatternDsl.g:417:2: ( ( rule__TermList__Group__0 ) )
            {
            // InternalPatternDsl.g:417:2: ( ( rule__TermList__Group__0 ) )
            // InternalPatternDsl.g:418:3: ( rule__TermList__Group__0 )
            {
             before(grammarAccess.getTermListAccess().getGroup()); 
            // InternalPatternDsl.g:419:3: ( rule__TermList__Group__0 )
            // InternalPatternDsl.g:419:4: rule__TermList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermList"


    // $ANTLR start "entryRuleTerm"
    // InternalPatternDsl.g:428:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalPatternDsl.g:429:1: ( ruleTerm EOF )
            // InternalPatternDsl.g:430:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalPatternDsl.g:437:1: ruleTerm : ( ( rule__Term__NameAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:441:2: ( ( ( rule__Term__NameAssignment ) ) )
            // InternalPatternDsl.g:442:2: ( ( rule__Term__NameAssignment ) )
            {
            // InternalPatternDsl.g:442:2: ( ( rule__Term__NameAssignment ) )
            // InternalPatternDsl.g:443:3: ( rule__Term__NameAssignment )
            {
             before(grammarAccess.getTermAccess().getNameAssignment()); 
            // InternalPatternDsl.g:444:3: ( rule__Term__NameAssignment )
            // InternalPatternDsl.g:444:4: rule__Term__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Term__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePhrase"
    // InternalPatternDsl.g:453:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalPatternDsl.g:454:1: ( rulePhrase EOF )
            // InternalPatternDsl.g:455:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalPatternDsl.g:462:1: rulePhrase : ( ( rule__Phrase__Group__0 ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:466:2: ( ( ( rule__Phrase__Group__0 ) ) )
            // InternalPatternDsl.g:467:2: ( ( rule__Phrase__Group__0 ) )
            {
            // InternalPatternDsl.g:467:2: ( ( rule__Phrase__Group__0 ) )
            // InternalPatternDsl.g:468:3: ( rule__Phrase__Group__0 )
            {
             before(grammarAccess.getPhraseAccess().getGroup()); 
            // InternalPatternDsl.g:469:3: ( rule__Phrase__Group__0 )
            // InternalPatternDsl.g:469:4: rule__Phrase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleOption"
    // InternalPatternDsl.g:478:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:479:1: ( ruleOption EOF )
            // InternalPatternDsl.g:480:1: ruleOption EOF
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
    // InternalPatternDsl.g:487:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:491:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalPatternDsl.g:492:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalPatternDsl.g:492:2: ( ( rule__Option__Alternatives ) )
            // InternalPatternDsl.g:493:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalPatternDsl.g:494:3: ( rule__Option__Alternatives )
            // InternalPatternDsl.g:494:4: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleGeoOption"
    // InternalPatternDsl.g:503:1: entryRuleGeoOption : ruleGeoOption EOF ;
    public final void entryRuleGeoOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:504:1: ( ruleGeoOption EOF )
            // InternalPatternDsl.g:505:1: ruleGeoOption EOF
            {
             before(grammarAccess.getGeoOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleGeoOption();

            state._fsp--;

             after(grammarAccess.getGeoOptionRule()); 
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
    // $ANTLR end "entryRuleGeoOption"


    // $ANTLR start "ruleGeoOption"
    // InternalPatternDsl.g:512:1: ruleGeoOption : ( ( rule__GeoOption__Group__0 ) ) ;
    public final void ruleGeoOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:516:2: ( ( ( rule__GeoOption__Group__0 ) ) )
            // InternalPatternDsl.g:517:2: ( ( rule__GeoOption__Group__0 ) )
            {
            // InternalPatternDsl.g:517:2: ( ( rule__GeoOption__Group__0 ) )
            // InternalPatternDsl.g:518:3: ( rule__GeoOption__Group__0 )
            {
             before(grammarAccess.getGeoOptionAccess().getGroup()); 
            // InternalPatternDsl.g:519:3: ( rule__GeoOption__Group__0 )
            // InternalPatternDsl.g:519:4: rule__GeoOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeoOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeoOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeoOption"


    // $ANTLR start "entryRuleSourceOption"
    // InternalPatternDsl.g:528:1: entryRuleSourceOption : ruleSourceOption EOF ;
    public final void entryRuleSourceOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:529:1: ( ruleSourceOption EOF )
            // InternalPatternDsl.g:530:1: ruleSourceOption EOF
            {
             before(grammarAccess.getSourceOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceOption();

            state._fsp--;

             after(grammarAccess.getSourceOptionRule()); 
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
    // $ANTLR end "entryRuleSourceOption"


    // $ANTLR start "ruleSourceOption"
    // InternalPatternDsl.g:537:1: ruleSourceOption : ( ( rule__SourceOption__Group__0 ) ) ;
    public final void ruleSourceOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:541:2: ( ( ( rule__SourceOption__Group__0 ) ) )
            // InternalPatternDsl.g:542:2: ( ( rule__SourceOption__Group__0 ) )
            {
            // InternalPatternDsl.g:542:2: ( ( rule__SourceOption__Group__0 ) )
            // InternalPatternDsl.g:543:3: ( rule__SourceOption__Group__0 )
            {
             before(grammarAccess.getSourceOptionAccess().getGroup()); 
            // InternalPatternDsl.g:544:3: ( rule__SourceOption__Group__0 )
            // InternalPatternDsl.g:544:4: rule__SourceOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceOption"


    // $ANTLR start "entryRuleLanguageOption"
    // InternalPatternDsl.g:553:1: entryRuleLanguageOption : ruleLanguageOption EOF ;
    public final void entryRuleLanguageOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:554:1: ( ruleLanguageOption EOF )
            // InternalPatternDsl.g:555:1: ruleLanguageOption EOF
            {
             before(grammarAccess.getLanguageOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageOption();

            state._fsp--;

             after(grammarAccess.getLanguageOptionRule()); 
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
    // $ANTLR end "entryRuleLanguageOption"


    // $ANTLR start "ruleLanguageOption"
    // InternalPatternDsl.g:562:1: ruleLanguageOption : ( ( rule__LanguageOption__Group__0 ) ) ;
    public final void ruleLanguageOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:566:2: ( ( ( rule__LanguageOption__Group__0 ) ) )
            // InternalPatternDsl.g:567:2: ( ( rule__LanguageOption__Group__0 ) )
            {
            // InternalPatternDsl.g:567:2: ( ( rule__LanguageOption__Group__0 ) )
            // InternalPatternDsl.g:568:3: ( rule__LanguageOption__Group__0 )
            {
             before(grammarAccess.getLanguageOptionAccess().getGroup()); 
            // InternalPatternDsl.g:569:3: ( rule__LanguageOption__Group__0 )
            // InternalPatternDsl.g:569:4: rule__LanguageOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageOption"


    // $ANTLR start "entryRuleBooleanOption"
    // InternalPatternDsl.g:578:1: entryRuleBooleanOption : ruleBooleanOption EOF ;
    public final void entryRuleBooleanOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:579:1: ( ruleBooleanOption EOF )
            // InternalPatternDsl.g:580:1: ruleBooleanOption EOF
            {
             before(grammarAccess.getBooleanOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanOption();

            state._fsp--;

             after(grammarAccess.getBooleanOptionRule()); 
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
    // $ANTLR end "entryRuleBooleanOption"


    // $ANTLR start "ruleBooleanOption"
    // InternalPatternDsl.g:587:1: ruleBooleanOption : ( ( rule__BooleanOption__Group__0 ) ) ;
    public final void ruleBooleanOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:591:2: ( ( ( rule__BooleanOption__Group__0 ) ) )
            // InternalPatternDsl.g:592:2: ( ( rule__BooleanOption__Group__0 ) )
            {
            // InternalPatternDsl.g:592:2: ( ( rule__BooleanOption__Group__0 ) )
            // InternalPatternDsl.g:593:3: ( rule__BooleanOption__Group__0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getGroup()); 
            // InternalPatternDsl.g:594:3: ( rule__BooleanOption__Group__0 )
            // InternalPatternDsl.g:594:4: rule__BooleanOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOption"


    // $ANTLR start "entryRuleIntOption"
    // InternalPatternDsl.g:603:1: entryRuleIntOption : ruleIntOption EOF ;
    public final void entryRuleIntOption() throws RecognitionException {
        try {
            // InternalPatternDsl.g:604:1: ( ruleIntOption EOF )
            // InternalPatternDsl.g:605:1: ruleIntOption EOF
            {
             before(grammarAccess.getIntOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntOption();

            state._fsp--;

             after(grammarAccess.getIntOptionRule()); 
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
    // $ANTLR end "entryRuleIntOption"


    // $ANTLR start "ruleIntOption"
    // InternalPatternDsl.g:612:1: ruleIntOption : ( ( rule__IntOption__Group__0 ) ) ;
    public final void ruleIntOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:616:2: ( ( ( rule__IntOption__Group__0 ) ) )
            // InternalPatternDsl.g:617:2: ( ( rule__IntOption__Group__0 ) )
            {
            // InternalPatternDsl.g:617:2: ( ( rule__IntOption__Group__0 ) )
            // InternalPatternDsl.g:618:3: ( rule__IntOption__Group__0 )
            {
             before(grammarAccess.getIntOptionAccess().getGroup()); 
            // InternalPatternDsl.g:619:3: ( rule__IntOption__Group__0 )
            // InternalPatternDsl.g:619:4: rule__IntOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntOption"


    // $ANTLR start "ruleGeoOptionKey"
    // InternalPatternDsl.g:628:1: ruleGeoOptionKey : ( ( 'in' ) ) ;
    public final void ruleGeoOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:632:1: ( ( ( 'in' ) ) )
            // InternalPatternDsl.g:633:2: ( ( 'in' ) )
            {
            // InternalPatternDsl.g:633:2: ( ( 'in' ) )
            // InternalPatternDsl.g:634:3: ( 'in' )
            {
             before(grammarAccess.getGeoOptionKeyAccess().getInEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:635:3: ( 'in' )
            // InternalPatternDsl.g:635:4: 'in'
            {
            match(input,13,FOLLOW_2); 

            }

             after(grammarAccess.getGeoOptionKeyAccess().getInEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeoOptionKey"


    // $ANTLR start "ruleSourceOptionKey"
    // InternalPatternDsl.g:644:1: ruleSourceOptionKey : ( ( 'source' ) ) ;
    public final void ruleSourceOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:648:1: ( ( ( 'source' ) ) )
            // InternalPatternDsl.g:649:2: ( ( 'source' ) )
            {
            // InternalPatternDsl.g:649:2: ( ( 'source' ) )
            // InternalPatternDsl.g:650:3: ( 'source' )
            {
             before(grammarAccess.getSourceOptionKeyAccess().getSourceEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:651:3: ( 'source' )
            // InternalPatternDsl.g:651:4: 'source'
            {
            match(input,14,FOLLOW_2); 

            }

             after(grammarAccess.getSourceOptionKeyAccess().getSourceEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceOptionKey"


    // $ANTLR start "ruleLanguageOptionKey"
    // InternalPatternDsl.g:660:1: ruleLanguageOptionKey : ( ( 'language' ) ) ;
    public final void ruleLanguageOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:664:1: ( ( ( 'language' ) ) )
            // InternalPatternDsl.g:665:2: ( ( 'language' ) )
            {
            // InternalPatternDsl.g:665:2: ( ( 'language' ) )
            // InternalPatternDsl.g:666:3: ( 'language' )
            {
             before(grammarAccess.getLanguageOptionKeyAccess().getLangEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:667:3: ( 'language' )
            // InternalPatternDsl.g:667:4: 'language'
            {
            match(input,15,FOLLOW_2); 

            }

             after(grammarAccess.getLanguageOptionKeyAccess().getLangEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageOptionKey"


    // $ANTLR start "ruleIntOptionKey"
    // InternalPatternDsl.g:676:1: ruleIntOptionKey : ( ( rule__IntOptionKey__Alternatives ) ) ;
    public final void ruleIntOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:680:1: ( ( ( rule__IntOptionKey__Alternatives ) ) )
            // InternalPatternDsl.g:681:2: ( ( rule__IntOptionKey__Alternatives ) )
            {
            // InternalPatternDsl.g:681:2: ( ( rule__IntOptionKey__Alternatives ) )
            // InternalPatternDsl.g:682:3: ( rule__IntOptionKey__Alternatives )
            {
             before(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 
            // InternalPatternDsl.g:683:3: ( rule__IntOptionKey__Alternatives )
            // InternalPatternDsl.g:683:4: rule__IntOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntOptionKey"


    // $ANTLR start "ruleBooleanOptionKey"
    // InternalPatternDsl.g:692:1: ruleBooleanOptionKey : ( ( rule__BooleanOptionKey__Alternatives ) ) ;
    public final void ruleBooleanOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:696:1: ( ( ( rule__BooleanOptionKey__Alternatives ) ) )
            // InternalPatternDsl.g:697:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            {
            // InternalPatternDsl.g:697:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            // InternalPatternDsl.g:698:3: ( rule__BooleanOptionKey__Alternatives )
            {
             before(grammarAccess.getBooleanOptionKeyAccess().getAlternatives()); 
            // InternalPatternDsl.g:699:3: ( rule__BooleanOptionKey__Alternatives )
            // InternalPatternDsl.g:699:4: rule__BooleanOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOptionKey"


    // $ANTLR start "ruleWordListProperty"
    // InternalPatternDsl.g:708:1: ruleWordListProperty : ( ( rule__WordListProperty__Alternatives ) ) ;
    public final void ruleWordListProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:712:1: ( ( ( rule__WordListProperty__Alternatives ) ) )
            // InternalPatternDsl.g:713:2: ( ( rule__WordListProperty__Alternatives ) )
            {
            // InternalPatternDsl.g:713:2: ( ( rule__WordListProperty__Alternatives ) )
            // InternalPatternDsl.g:714:3: ( rule__WordListProperty__Alternatives )
            {
             before(grammarAccess.getWordListPropertyAccess().getAlternatives()); 
            // InternalPatternDsl.g:715:3: ( rule__WordListProperty__Alternatives )
            // InternalPatternDsl.g:715:4: rule__WordListProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WordListProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWordListPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWordListProperty"


    // $ANTLR start "ruleSource"
    // InternalPatternDsl.g:724:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:728:1: ( ( ( rule__Source__Alternatives ) ) )
            // InternalPatternDsl.g:729:2: ( ( rule__Source__Alternatives ) )
            {
            // InternalPatternDsl.g:729:2: ( ( rule__Source__Alternatives ) )
            // InternalPatternDsl.g:730:3: ( rule__Source__Alternatives )
            {
             before(grammarAccess.getSourceAccess().getAlternatives()); 
            // InternalPatternDsl.g:731:3: ( rule__Source__Alternatives )
            // InternalPatternDsl.g:731:4: rule__Source__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Source__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "ruleDistanceMesurement"
    // InternalPatternDsl.g:740:1: ruleDistanceMesurement : ( ( rule__DistanceMesurement__Alternatives ) ) ;
    public final void ruleDistanceMesurement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:744:1: ( ( ( rule__DistanceMesurement__Alternatives ) ) )
            // InternalPatternDsl.g:745:2: ( ( rule__DistanceMesurement__Alternatives ) )
            {
            // InternalPatternDsl.g:745:2: ( ( rule__DistanceMesurement__Alternatives ) )
            // InternalPatternDsl.g:746:3: ( rule__DistanceMesurement__Alternatives )
            {
             before(grammarAccess.getDistanceMesurementAccess().getAlternatives()); 
            // InternalPatternDsl.g:747:3: ( rule__DistanceMesurement__Alternatives )
            // InternalPatternDsl.g:747:4: rule__DistanceMesurement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DistanceMesurement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceMesurementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceMesurement"


    // $ANTLR start "ruleLanguage"
    // InternalPatternDsl.g:756:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:760:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalPatternDsl.g:761:2: ( ( rule__Language__Alternatives ) )
            {
            // InternalPatternDsl.g:761:2: ( ( rule__Language__Alternatives ) )
            // InternalPatternDsl.g:762:3: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalPatternDsl.g:763:3: ( rule__Language__Alternatives )
            // InternalPatternDsl.g:763:4: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "rule__StreamingDescription__Alternatives"
    // InternalPatternDsl.g:771:1: rule__StreamingDescription__Alternatives : ( ( ruleImport ) | ( ruleGeographicalElement ) | ( rulePatternMatcherElement ) );
    public final void rule__StreamingDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:775:1: ( ( ruleImport ) | ( ruleGeographicalElement ) | ( rulePatternMatcherElement ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 35:
            case 42:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 44:
            case 47:
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
                    // InternalPatternDsl.g:776:2: ( ruleImport )
                    {
                    // InternalPatternDsl.g:776:2: ( ruleImport )
                    // InternalPatternDsl.g:777:3: ruleImport
                    {
                     before(grammarAccess.getStreamingDescriptionAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getStreamingDescriptionAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:782:2: ( ruleGeographicalElement )
                    {
                    // InternalPatternDsl.g:782:2: ( ruleGeographicalElement )
                    // InternalPatternDsl.g:783:3: ruleGeographicalElement
                    {
                     before(grammarAccess.getStreamingDescriptionAccess().getGeographicalElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeographicalElement();

                    state._fsp--;

                     after(grammarAccess.getStreamingDescriptionAccess().getGeographicalElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:788:2: ( rulePatternMatcherElement )
                    {
                    // InternalPatternDsl.g:788:2: ( rulePatternMatcherElement )
                    // InternalPatternDsl.g:789:3: rulePatternMatcherElement
                    {
                     before(grammarAccess.getStreamingDescriptionAccess().getPatternMatcherElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePatternMatcherElement();

                    state._fsp--;

                     after(grammarAccess.getStreamingDescriptionAccess().getPatternMatcherElementParserRuleCall_2()); 

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
    // $ANTLR end "rule__StreamingDescription__Alternatives"


    // $ANTLR start "rule__GeographicalElement__Alternatives"
    // InternalPatternDsl.g:798:1: rule__GeographicalElement__Alternatives : ( ( rulePlace ) | ( ruleRegion ) );
    public final void rule__GeographicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:802:1: ( ( rulePlace ) | ( ruleRegion ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPatternDsl.g:803:2: ( rulePlace )
                    {
                    // InternalPatternDsl.g:803:2: ( rulePlace )
                    // InternalPatternDsl.g:804:3: rulePlace
                    {
                     before(grammarAccess.getGeographicalElementAccess().getPlaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getGeographicalElementAccess().getPlaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:809:2: ( ruleRegion )
                    {
                    // InternalPatternDsl.g:809:2: ( ruleRegion )
                    // InternalPatternDsl.g:810:3: ruleRegion
                    {
                     before(grammarAccess.getGeographicalElementAccess().getRegionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegion();

                    state._fsp--;

                     after(grammarAccess.getGeographicalElementAccess().getRegionParserRuleCall_1()); 

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
    // $ANTLR end "rule__GeographicalElement__Alternatives"


    // $ANTLR start "rule__Coordinate__Alternatives"
    // InternalPatternDsl.g:819:1: rule__Coordinate__Alternatives : ( ( ruleLatLong ) | ( ruleUTM ) );
    public final void rule__Coordinate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:823:1: ( ( ruleLatLong ) | ( ruleUTM ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOUBLE) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPatternDsl.g:824:2: ( ruleLatLong )
                    {
                    // InternalPatternDsl.g:824:2: ( ruleLatLong )
                    // InternalPatternDsl.g:825:3: ruleLatLong
                    {
                     before(grammarAccess.getCoordinateAccess().getLatLongParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLatLong();

                    state._fsp--;

                     after(grammarAccess.getCoordinateAccess().getLatLongParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:830:2: ( ruleUTM )
                    {
                    // InternalPatternDsl.g:830:2: ( ruleUTM )
                    // InternalPatternDsl.g:831:3: ruleUTM
                    {
                     before(grammarAccess.getCoordinateAccess().getUTMParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUTM();

                    state._fsp--;

                     after(grammarAccess.getCoordinateAccess().getUTMParserRuleCall_1()); 

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
    // $ANTLR end "rule__Coordinate__Alternatives"


    // $ANTLR start "rule__PatternMatcherElement__Alternatives"
    // InternalPatternDsl.g:840:1: rule__PatternMatcherElement__Alternatives : ( ( rulePhrase ) | ( ruleConcept ) );
    public final void rule__PatternMatcherElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:844:1: ( ( rulePhrase ) | ( ruleConcept ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==44) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPatternDsl.g:845:2: ( rulePhrase )
                    {
                    // InternalPatternDsl.g:845:2: ( rulePhrase )
                    // InternalPatternDsl.g:846:3: rulePhrase
                    {
                     before(grammarAccess.getPatternMatcherElementAccess().getPhraseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePhrase();

                    state._fsp--;

                     after(grammarAccess.getPatternMatcherElementAccess().getPhraseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:851:2: ( ruleConcept )
                    {
                    // InternalPatternDsl.g:851:2: ( ruleConcept )
                    // InternalPatternDsl.g:852:3: ruleConcept
                    {
                     before(grammarAccess.getPatternMatcherElementAccess().getConceptParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConcept();

                    state._fsp--;

                     after(grammarAccess.getPatternMatcherElementAccess().getConceptParserRuleCall_1()); 

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
    // $ANTLR end "rule__PatternMatcherElement__Alternatives"


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalPatternDsl.g:861:1: rule__Concept__Alternatives : ( ( ruleTermList ) | ( ruleTerm ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:865:1: ( ( ruleTermList ) | ( ruleTerm ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
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
                    // InternalPatternDsl.g:866:2: ( ruleTermList )
                    {
                    // InternalPatternDsl.g:866:2: ( ruleTermList )
                    // InternalPatternDsl.g:867:3: ruleTermList
                    {
                     before(grammarAccess.getConceptAccess().getTermListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTermList();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getTermListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:872:2: ( ruleTerm )
                    {
                    // InternalPatternDsl.g:872:2: ( ruleTerm )
                    // InternalPatternDsl.g:873:3: ruleTerm
                    {
                     before(grammarAccess.getConceptAccess().getTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTerm();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getTermParserRuleCall_1()); 

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


    // $ANTLR start "rule__Option__Alternatives"
    // InternalPatternDsl.g:882:1: rule__Option__Alternatives : ( ( ruleBooleanOption ) | ( ruleGeoOption ) | ( ruleIntOption ) | ( ruleLanguageOption ) | ( ruleSourceOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:886:1: ( ( ruleBooleanOption ) | ( ruleGeoOption ) | ( ruleIntOption ) | ( ruleLanguageOption ) | ( ruleSourceOption ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
            case 19:
            case 20:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 16:
            case 17:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 14:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPatternDsl.g:887:2: ( ruleBooleanOption )
                    {
                    // InternalPatternDsl.g:887:2: ( ruleBooleanOption )
                    // InternalPatternDsl.g:888:3: ruleBooleanOption
                    {
                     before(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:893:2: ( ruleGeoOption )
                    {
                    // InternalPatternDsl.g:893:2: ( ruleGeoOption )
                    // InternalPatternDsl.g:894:3: ruleGeoOption
                    {
                     before(grammarAccess.getOptionAccess().getGeoOptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeoOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getGeoOptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:899:2: ( ruleIntOption )
                    {
                    // InternalPatternDsl.g:899:2: ( ruleIntOption )
                    // InternalPatternDsl.g:900:3: ruleIntOption
                    {
                     before(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:905:2: ( ruleLanguageOption )
                    {
                    // InternalPatternDsl.g:905:2: ( ruleLanguageOption )
                    // InternalPatternDsl.g:906:3: ruleLanguageOption
                    {
                     before(grammarAccess.getOptionAccess().getLanguageOptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguageOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getLanguageOptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPatternDsl.g:911:2: ( ruleSourceOption )
                    {
                    // InternalPatternDsl.g:911:2: ( ruleSourceOption )
                    // InternalPatternDsl.g:912:3: ruleSourceOption
                    {
                     before(grammarAccess.getOptionAccess().getSourceOptionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSourceOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getSourceOptionParserRuleCall_4()); 

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
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__IntOptionKey__Alternatives"
    // InternalPatternDsl.g:921:1: rule__IntOptionKey__Alternatives : ( ( ( 'minretweet' ) ) | ( ( 'minfavorite' ) ) );
    public final void rule__IntOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:925:1: ( ( ( 'minretweet' ) ) | ( ( 'minfavorite' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPatternDsl.g:926:2: ( ( 'minretweet' ) )
                    {
                    // InternalPatternDsl.g:926:2: ( ( 'minretweet' ) )
                    // InternalPatternDsl.g:927:3: ( 'minretweet' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:928:3: ( 'minretweet' )
                    // InternalPatternDsl.g:928:4: 'minretweet'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:932:2: ( ( 'minfavorite' ) )
                    {
                    // InternalPatternDsl.g:932:2: ( ( 'minfavorite' ) )
                    // InternalPatternDsl.g:933:3: ( 'minfavorite' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getSourceEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:934:3: ( 'minfavorite' )
                    // InternalPatternDsl.g:934:4: 'minfavorite'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getSourceEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__IntOptionKey__Alternatives"


    // $ANTLR start "rule__BooleanOptionKey__Alternatives"
    // InternalPatternDsl.g:942:1: rule__BooleanOptionKey__Alternatives : ( ( ( 'inreplyto' ) ) | ( ( 'retweet' ) ) | ( ( 'favorite' ) ) );
    public final void rule__BooleanOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:946:1: ( ( ( 'inreplyto' ) ) | ( ( 'retweet' ) ) | ( ( 'favorite' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPatternDsl.g:947:2: ( ( 'inreplyto' ) )
                    {
                    // InternalPatternDsl.g:947:2: ( ( 'inreplyto' ) )
                    // InternalPatternDsl.g:948:3: ( 'inreplyto' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:949:3: ( 'inreplyto' )
                    // InternalPatternDsl.g:949:4: 'inreplyto'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:953:2: ( ( 'retweet' ) )
                    {
                    // InternalPatternDsl.g:953:2: ( ( 'retweet' ) )
                    // InternalPatternDsl.g:954:3: ( 'retweet' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:955:3: ( 'retweet' )
                    // InternalPatternDsl.g:955:4: 'retweet'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:959:2: ( ( 'favorite' ) )
                    {
                    // InternalPatternDsl.g:959:2: ( ( 'favorite' ) )
                    // InternalPatternDsl.g:960:3: ( 'favorite' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getFavoriteEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:961:3: ( 'favorite' )
                    // InternalPatternDsl.g:961:4: 'favorite'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getFavoriteEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BooleanOptionKey__Alternatives"


    // $ANTLR start "rule__WordListProperty__Alternatives"
    // InternalPatternDsl.g:969:1: rule__WordListProperty__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__WordListProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:973:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPatternDsl.g:974:2: ( ( 'all' ) )
                    {
                    // InternalPatternDsl.g:974:2: ( ( 'all' ) )
                    // InternalPatternDsl.g:975:3: ( 'all' )
                    {
                     before(grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:976:3: ( 'all' )
                    // InternalPatternDsl.g:976:4: 'all'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:980:2: ( ( 'any' ) )
                    {
                    // InternalPatternDsl.g:980:2: ( ( 'any' ) )
                    // InternalPatternDsl.g:981:3: ( 'any' )
                    {
                     before(grammarAccess.getWordListPropertyAccess().getAnyEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:982:3: ( 'any' )
                    // InternalPatternDsl.g:982:4: 'any'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getWordListPropertyAccess().getAnyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__WordListProperty__Alternatives"


    // $ANTLR start "rule__Source__Alternatives"
    // InternalPatternDsl.g:990:1: rule__Source__Alternatives : ( ( ( 'android' ) ) | ( ( 'ios' ) ) | ( ( 'web' ) ) | ( ( 'all' ) ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:994:1: ( ( ( 'android' ) ) | ( ( 'ios' ) ) | ( ( 'web' ) ) | ( ( 'all' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPatternDsl.g:995:2: ( ( 'android' ) )
                    {
                    // InternalPatternDsl.g:995:2: ( ( 'android' ) )
                    // InternalPatternDsl.g:996:3: ( 'android' )
                    {
                     before(grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:997:3: ( 'android' )
                    // InternalPatternDsl.g:997:4: 'android'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1001:2: ( ( 'ios' ) )
                    {
                    // InternalPatternDsl.g:1001:2: ( ( 'ios' ) )
                    // InternalPatternDsl.g:1002:3: ( 'ios' )
                    {
                     before(grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1003:3: ( 'ios' )
                    // InternalPatternDsl.g:1003:4: 'ios'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1007:2: ( ( 'web' ) )
                    {
                    // InternalPatternDsl.g:1007:2: ( ( 'web' ) )
                    // InternalPatternDsl.g:1008:3: ( 'web' )
                    {
                     before(grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1009:3: ( 'web' )
                    // InternalPatternDsl.g:1009:4: 'web'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:1013:2: ( ( 'all' ) )
                    {
                    // InternalPatternDsl.g:1013:2: ( ( 'all' ) )
                    // InternalPatternDsl.g:1014:3: ( 'all' )
                    {
                     before(grammarAccess.getSourceAccess().getAllEnumLiteralDeclaration_3()); 
                    // InternalPatternDsl.g:1015:3: ( 'all' )
                    // InternalPatternDsl.g:1015:4: 'all'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getAllEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Source__Alternatives"


    // $ANTLR start "rule__DistanceMesurement__Alternatives"
    // InternalPatternDsl.g:1023:1: rule__DistanceMesurement__Alternatives : ( ( ( 'kms' ) ) | ( ( 'miles' ) ) | ( ( 'mts' ) ) );
    public final void rule__DistanceMesurement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1027:1: ( ( ( 'kms' ) ) | ( ( 'miles' ) ) | ( ( 'mts' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPatternDsl.g:1028:2: ( ( 'kms' ) )
                    {
                    // InternalPatternDsl.g:1028:2: ( ( 'kms' ) )
                    // InternalPatternDsl.g:1029:3: ( 'kms' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1030:3: ( 'kms' )
                    // InternalPatternDsl.g:1030:4: 'kms'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1034:2: ( ( 'miles' ) )
                    {
                    // InternalPatternDsl.g:1034:2: ( ( 'miles' ) )
                    // InternalPatternDsl.g:1035:3: ( 'miles' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1036:3: ( 'miles' )
                    // InternalPatternDsl.g:1036:4: 'miles'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1040:2: ( ( 'mts' ) )
                    {
                    // InternalPatternDsl.g:1040:2: ( ( 'mts' ) )
                    // InternalPatternDsl.g:1041:3: ( 'mts' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getMtsEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1042:3: ( 'mts' )
                    // InternalPatternDsl.g:1042:4: 'mts'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceMesurementAccess().getMtsEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DistanceMesurement__Alternatives"


    // $ANTLR start "rule__Language__Alternatives"
    // InternalPatternDsl.g:1050:1: rule__Language__Alternatives : ( ( ( 'english' ) ) | ( ( 'spanish' ) ) | ( ( 'chinese' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1054:1: ( ( ( 'english' ) ) | ( ( 'spanish' ) ) | ( ( 'chinese' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPatternDsl.g:1055:2: ( ( 'english' ) )
                    {
                    // InternalPatternDsl.g:1055:2: ( ( 'english' ) )
                    // InternalPatternDsl.g:1056:3: ( 'english' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1057:3: ( 'english' )
                    // InternalPatternDsl.g:1057:4: 'english'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1061:2: ( ( 'spanish' ) )
                    {
                    // InternalPatternDsl.g:1061:2: ( ( 'spanish' ) )
                    // InternalPatternDsl.g:1062:3: ( 'spanish' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1063:3: ( 'spanish' )
                    // InternalPatternDsl.g:1063:4: 'spanish'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1067:2: ( ( 'chinese' ) )
                    {
                    // InternalPatternDsl.g:1067:2: ( ( 'chinese' ) )
                    // InternalPatternDsl.g:1068:3: ( 'chinese' )
                    {
                     before(grammarAccess.getLanguageAccess().getZhEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1069:3: ( 'chinese' )
                    // InternalPatternDsl.g:1069:4: 'chinese'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getZhEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Language__Alternatives"


    // $ANTLR start "rule__StreamingModel__Group__0"
    // InternalPatternDsl.g:1077:1: rule__StreamingModel__Group__0 : rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1 ;
    public final void rule__StreamingModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1081:1: ( rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1 )
            // InternalPatternDsl.g:1082:2: rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StreamingModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamingModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__Group__0"


    // $ANTLR start "rule__StreamingModel__Group__0__Impl"
    // InternalPatternDsl.g:1089:1: rule__StreamingModel__Group__0__Impl : ( ( rule__StreamingModel__DescriptionsAssignment_0 ) ) ;
    public final void rule__StreamingModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1093:1: ( ( ( rule__StreamingModel__DescriptionsAssignment_0 ) ) )
            // InternalPatternDsl.g:1094:1: ( ( rule__StreamingModel__DescriptionsAssignment_0 ) )
            {
            // InternalPatternDsl.g:1094:1: ( ( rule__StreamingModel__DescriptionsAssignment_0 ) )
            // InternalPatternDsl.g:1095:2: ( rule__StreamingModel__DescriptionsAssignment_0 )
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_0()); 
            // InternalPatternDsl.g:1096:2: ( rule__StreamingModel__DescriptionsAssignment_0 )
            // InternalPatternDsl.g:1096:3: rule__StreamingModel__DescriptionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StreamingModel__DescriptionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__Group__0__Impl"


    // $ANTLR start "rule__StreamingModel__Group__1"
    // InternalPatternDsl.g:1104:1: rule__StreamingModel__Group__1 : rule__StreamingModel__Group__1__Impl ;
    public final void rule__StreamingModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1108:1: ( rule__StreamingModel__Group__1__Impl )
            // InternalPatternDsl.g:1109:2: rule__StreamingModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamingModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__Group__1"


    // $ANTLR start "rule__StreamingModel__Group__1__Impl"
    // InternalPatternDsl.g:1115:1: rule__StreamingModel__Group__1__Impl : ( ( rule__StreamingModel__DescriptionsAssignment_1 )* ) ;
    public final void rule__StreamingModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1119:1: ( ( ( rule__StreamingModel__DescriptionsAssignment_1 )* ) )
            // InternalPatternDsl.g:1120:1: ( ( rule__StreamingModel__DescriptionsAssignment_1 )* )
            {
            // InternalPatternDsl.g:1120:1: ( ( rule__StreamingModel__DescriptionsAssignment_1 )* )
            // InternalPatternDsl.g:1121:2: ( rule__StreamingModel__DescriptionsAssignment_1 )*
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_1()); 
            // InternalPatternDsl.g:1122:2: ( rule__StreamingModel__DescriptionsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==32||LA13_0==35||LA13_0==42||LA13_0==44||LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPatternDsl.g:1122:3: rule__StreamingModel__DescriptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StreamingModel__DescriptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalPatternDsl.g:1131:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1135:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalPatternDsl.g:1136:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPatternDsl.g:1143:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1147:1: ( ( 'import' ) )
            // InternalPatternDsl.g:1148:1: ( 'import' )
            {
            // InternalPatternDsl.g:1148:1: ( 'import' )
            // InternalPatternDsl.g:1149:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPatternDsl.g:1158:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1162:1: ( rule__Import__Group__1__Impl )
            // InternalPatternDsl.g:1163:2: rule__Import__Group__1__Impl
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
    // InternalPatternDsl.g:1169:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1173:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalPatternDsl.g:1174:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalPatternDsl.g:1174:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalPatternDsl.g:1175:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalPatternDsl.g:1176:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalPatternDsl.g:1176:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalPatternDsl.g:1185:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1189:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalPatternDsl.g:1190:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPatternDsl.g:1197:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1201:1: ( ( ruleQualifiedName ) )
            // InternalPatternDsl.g:1202:1: ( ruleQualifiedName )
            {
            // InternalPatternDsl.g:1202:1: ( ruleQualifiedName )
            // InternalPatternDsl.g:1203:2: ruleQualifiedName
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
    // InternalPatternDsl.g:1212:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1216:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalPatternDsl.g:1217:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalPatternDsl.g:1223:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1227:1: ( ( ( '.*' )? ) )
            // InternalPatternDsl.g:1228:1: ( ( '.*' )? )
            {
            // InternalPatternDsl.g:1228:1: ( ( '.*' )? )
            // InternalPatternDsl.g:1229:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalPatternDsl.g:1230:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPatternDsl.g:1230:3: '.*'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalPatternDsl.g:1239:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1243:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPatternDsl.g:1244:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPatternDsl.g:1251:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1255:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:1256:1: ( RULE_ID )
            {
            // InternalPatternDsl.g:1256:1: ( RULE_ID )
            // InternalPatternDsl.g:1257:2: RULE_ID
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
    // InternalPatternDsl.g:1266:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1270:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPatternDsl.g:1271:2: rule__QualifiedName__Group__1__Impl
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
    // InternalPatternDsl.g:1277:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1281:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPatternDsl.g:1282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPatternDsl.g:1282:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPatternDsl.g:1283:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalPatternDsl.g:1284:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPatternDsl.g:1284:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalPatternDsl.g:1293:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1297:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPatternDsl.g:1298:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalPatternDsl.g:1305:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1309:1: ( ( '.' ) )
            // InternalPatternDsl.g:1310:1: ( '.' )
            {
            // InternalPatternDsl.g:1310:1: ( '.' )
            // InternalPatternDsl.g:1311:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPatternDsl.g:1320:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1324:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPatternDsl.g:1325:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalPatternDsl.g:1331:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1335:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:1336:1: ( RULE_ID )
            {
            // InternalPatternDsl.g:1336:1: ( RULE_ID )
            // InternalPatternDsl.g:1337:2: RULE_ID
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


    // $ANTLR start "rule__Place__Group__0"
    // InternalPatternDsl.g:1347:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1351:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPatternDsl.g:1352:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalPatternDsl.g:1359:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1363:1: ( ( 'place' ) )
            // InternalPatternDsl.g:1364:1: ( 'place' )
            {
            // InternalPatternDsl.g:1364:1: ( 'place' )
            // InternalPatternDsl.g:1365:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalPatternDsl.g:1374:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1378:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPatternDsl.g:1379:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalPatternDsl.g:1386:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1390:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:1391:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:1391:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalPatternDsl.g:1392:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:1393:2: ( rule__Place__NameAssignment_1 )
            // InternalPatternDsl.g:1393:3: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalPatternDsl.g:1401:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1405:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPatternDsl.g:1406:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalPatternDsl.g:1413:1: rule__Place__Group__2__Impl : ( '=' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1417:1: ( ( '=' ) )
            // InternalPatternDsl.g:1418:1: ( '=' )
            {
            // InternalPatternDsl.g:1418:1: ( '=' )
            // InternalPatternDsl.g:1419:2: '='
            {
             before(grammarAccess.getPlaceAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // InternalPatternDsl.g:1428:1: rule__Place__Group__3 : rule__Place__Group__3__Impl ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1432:1: ( rule__Place__Group__3__Impl )
            // InternalPatternDsl.g:1433:2: rule__Place__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Place__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // InternalPatternDsl.g:1439:1: rule__Place__Group__3__Impl : ( ( rule__Place__PointAssignment_3 ) ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1443:1: ( ( ( rule__Place__PointAssignment_3 ) ) )
            // InternalPatternDsl.g:1444:1: ( ( rule__Place__PointAssignment_3 ) )
            {
            // InternalPatternDsl.g:1444:1: ( ( rule__Place__PointAssignment_3 ) )
            // InternalPatternDsl.g:1445:2: ( rule__Place__PointAssignment_3 )
            {
             before(grammarAccess.getPlaceAccess().getPointAssignment_3()); 
            // InternalPatternDsl.g:1446:2: ( rule__Place__PointAssignment_3 )
            // InternalPatternDsl.g:1446:3: rule__Place__PointAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Place__PointAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getPointAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalPatternDsl.g:1455:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1459:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalPatternDsl.g:1460:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalPatternDsl.g:1467:1: rule__Point__Group__0__Impl : ( ( rule__Point__Group_0__0 )? ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1471:1: ( ( ( rule__Point__Group_0__0 )? ) )
            // InternalPatternDsl.g:1472:1: ( ( rule__Point__Group_0__0 )? )
            {
            // InternalPatternDsl.g:1472:1: ( ( rule__Point__Group_0__0 )? )
            // InternalPatternDsl.g:1473:2: ( rule__Point__Group_0__0 )?
            {
             before(grammarAccess.getPointAccess().getGroup_0()); 
            // InternalPatternDsl.g:1474:2: ( rule__Point__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOUBLE) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=26 && LA16_1<=28)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalPatternDsl.g:1474:3: rule__Point__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Point__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPointAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalPatternDsl.g:1482:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1486:1: ( rule__Point__Group__1__Impl )
            // InternalPatternDsl.g:1487:2: rule__Point__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalPatternDsl.g:1493:1: rule__Point__Group__1__Impl : ( ( rule__Point__CoordinatesAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1497:1: ( ( ( rule__Point__CoordinatesAssignment_1 ) ) )
            // InternalPatternDsl.g:1498:1: ( ( rule__Point__CoordinatesAssignment_1 ) )
            {
            // InternalPatternDsl.g:1498:1: ( ( rule__Point__CoordinatesAssignment_1 ) )
            // InternalPatternDsl.g:1499:2: ( rule__Point__CoordinatesAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_1()); 
            // InternalPatternDsl.g:1500:2: ( rule__Point__CoordinatesAssignment_1 )
            // InternalPatternDsl.g:1500:3: rule__Point__CoordinatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__CoordinatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getCoordinatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group_0__0"
    // InternalPatternDsl.g:1509:1: rule__Point__Group_0__0 : rule__Point__Group_0__0__Impl rule__Point__Group_0__1 ;
    public final void rule__Point__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1513:1: ( rule__Point__Group_0__0__Impl rule__Point__Group_0__1 )
            // InternalPatternDsl.g:1514:2: rule__Point__Group_0__0__Impl rule__Point__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Point__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__0"


    // $ANTLR start "rule__Point__Group_0__0__Impl"
    // InternalPatternDsl.g:1521:1: rule__Point__Group_0__0__Impl : ( ( rule__Point__RadiusAssignment_0_0 ) ) ;
    public final void rule__Point__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1525:1: ( ( ( rule__Point__RadiusAssignment_0_0 ) ) )
            // InternalPatternDsl.g:1526:1: ( ( rule__Point__RadiusAssignment_0_0 ) )
            {
            // InternalPatternDsl.g:1526:1: ( ( rule__Point__RadiusAssignment_0_0 ) )
            // InternalPatternDsl.g:1527:2: ( rule__Point__RadiusAssignment_0_0 )
            {
             before(grammarAccess.getPointAccess().getRadiusAssignment_0_0()); 
            // InternalPatternDsl.g:1528:2: ( rule__Point__RadiusAssignment_0_0 )
            // InternalPatternDsl.g:1528:3: rule__Point__RadiusAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Point__RadiusAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getRadiusAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__0__Impl"


    // $ANTLR start "rule__Point__Group_0__1"
    // InternalPatternDsl.g:1536:1: rule__Point__Group_0__1 : rule__Point__Group_0__1__Impl rule__Point__Group_0__2 ;
    public final void rule__Point__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1540:1: ( rule__Point__Group_0__1__Impl rule__Point__Group_0__2 )
            // InternalPatternDsl.g:1541:2: rule__Point__Group_0__1__Impl rule__Point__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Point__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__1"


    // $ANTLR start "rule__Point__Group_0__1__Impl"
    // InternalPatternDsl.g:1548:1: rule__Point__Group_0__1__Impl : ( ( rule__Point__MesurementAssignment_0_1 ) ) ;
    public final void rule__Point__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1552:1: ( ( ( rule__Point__MesurementAssignment_0_1 ) ) )
            // InternalPatternDsl.g:1553:1: ( ( rule__Point__MesurementAssignment_0_1 ) )
            {
            // InternalPatternDsl.g:1553:1: ( ( rule__Point__MesurementAssignment_0_1 ) )
            // InternalPatternDsl.g:1554:2: ( rule__Point__MesurementAssignment_0_1 )
            {
             before(grammarAccess.getPointAccess().getMesurementAssignment_0_1()); 
            // InternalPatternDsl.g:1555:2: ( rule__Point__MesurementAssignment_0_1 )
            // InternalPatternDsl.g:1555:3: rule__Point__MesurementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Point__MesurementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getMesurementAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__1__Impl"


    // $ANTLR start "rule__Point__Group_0__2"
    // InternalPatternDsl.g:1563:1: rule__Point__Group_0__2 : rule__Point__Group_0__2__Impl ;
    public final void rule__Point__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1567:1: ( rule__Point__Group_0__2__Impl )
            // InternalPatternDsl.g:1568:2: rule__Point__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__2"


    // $ANTLR start "rule__Point__Group_0__2__Impl"
    // InternalPatternDsl.g:1574:1: rule__Point__Group_0__2__Impl : ( 'arround' ) ;
    public final void rule__Point__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1578:1: ( ( 'arround' ) )
            // InternalPatternDsl.g:1579:1: ( 'arround' )
            {
            // InternalPatternDsl.g:1579:1: ( 'arround' )
            // InternalPatternDsl.g:1580:2: 'arround'
            {
             before(grammarAccess.getPointAccess().getArroundKeyword_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getArroundKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__Group_0__2__Impl"


    // $ANTLR start "rule__LatLong__Group__0"
    // InternalPatternDsl.g:1590:1: rule__LatLong__Group__0 : rule__LatLong__Group__0__Impl rule__LatLong__Group__1 ;
    public final void rule__LatLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1594:1: ( rule__LatLong__Group__0__Impl rule__LatLong__Group__1 )
            // InternalPatternDsl.g:1595:2: rule__LatLong__Group__0__Impl rule__LatLong__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LatLong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LatLong__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__0"


    // $ANTLR start "rule__LatLong__Group__0__Impl"
    // InternalPatternDsl.g:1602:1: rule__LatLong__Group__0__Impl : ( ( rule__LatLong__LatAssignment_0 ) ) ;
    public final void rule__LatLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1606:1: ( ( ( rule__LatLong__LatAssignment_0 ) ) )
            // InternalPatternDsl.g:1607:1: ( ( rule__LatLong__LatAssignment_0 ) )
            {
            // InternalPatternDsl.g:1607:1: ( ( rule__LatLong__LatAssignment_0 ) )
            // InternalPatternDsl.g:1608:2: ( rule__LatLong__LatAssignment_0 )
            {
             before(grammarAccess.getLatLongAccess().getLatAssignment_0()); 
            // InternalPatternDsl.g:1609:2: ( rule__LatLong__LatAssignment_0 )
            // InternalPatternDsl.g:1609:3: rule__LatLong__LatAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LatLong__LatAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLatLongAccess().getLatAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__0__Impl"


    // $ANTLR start "rule__LatLong__Group__1"
    // InternalPatternDsl.g:1617:1: rule__LatLong__Group__1 : rule__LatLong__Group__1__Impl rule__LatLong__Group__2 ;
    public final void rule__LatLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1621:1: ( rule__LatLong__Group__1__Impl rule__LatLong__Group__2 )
            // InternalPatternDsl.g:1622:2: rule__LatLong__Group__1__Impl rule__LatLong__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__LatLong__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LatLong__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__1"


    // $ANTLR start "rule__LatLong__Group__1__Impl"
    // InternalPatternDsl.g:1629:1: rule__LatLong__Group__1__Impl : ( ',' ) ;
    public final void rule__LatLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1633:1: ( ( ',' ) )
            // InternalPatternDsl.g:1634:1: ( ',' )
            {
            // InternalPatternDsl.g:1634:1: ( ',' )
            // InternalPatternDsl.g:1635:2: ','
            {
             before(grammarAccess.getLatLongAccess().getCommaKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLatLongAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__1__Impl"


    // $ANTLR start "rule__LatLong__Group__2"
    // InternalPatternDsl.g:1644:1: rule__LatLong__Group__2 : rule__LatLong__Group__2__Impl ;
    public final void rule__LatLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1648:1: ( rule__LatLong__Group__2__Impl )
            // InternalPatternDsl.g:1649:2: rule__LatLong__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LatLong__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__2"


    // $ANTLR start "rule__LatLong__Group__2__Impl"
    // InternalPatternDsl.g:1655:1: rule__LatLong__Group__2__Impl : ( ( rule__LatLong__LongAssignment_2 ) ) ;
    public final void rule__LatLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1659:1: ( ( ( rule__LatLong__LongAssignment_2 ) ) )
            // InternalPatternDsl.g:1660:1: ( ( rule__LatLong__LongAssignment_2 ) )
            {
            // InternalPatternDsl.g:1660:1: ( ( rule__LatLong__LongAssignment_2 ) )
            // InternalPatternDsl.g:1661:2: ( rule__LatLong__LongAssignment_2 )
            {
             before(grammarAccess.getLatLongAccess().getLongAssignment_2()); 
            // InternalPatternDsl.g:1662:2: ( rule__LatLong__LongAssignment_2 )
            // InternalPatternDsl.g:1662:3: rule__LatLong__LongAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LatLong__LongAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLatLongAccess().getLongAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__Group__2__Impl"


    // $ANTLR start "rule__UTM__Group__0"
    // InternalPatternDsl.g:1671:1: rule__UTM__Group__0 : rule__UTM__Group__0__Impl rule__UTM__Group__1 ;
    public final void rule__UTM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1675:1: ( rule__UTM__Group__0__Impl rule__UTM__Group__1 )
            // InternalPatternDsl.g:1676:2: rule__UTM__Group__0__Impl rule__UTM__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__UTM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__0"


    // $ANTLR start "rule__UTM__Group__0__Impl"
    // InternalPatternDsl.g:1683:1: rule__UTM__Group__0__Impl : ( 'UTM' ) ;
    public final void rule__UTM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1687:1: ( ( 'UTM' ) )
            // InternalPatternDsl.g:1688:1: ( 'UTM' )
            {
            // InternalPatternDsl.g:1688:1: ( 'UTM' )
            // InternalPatternDsl.g:1689:2: 'UTM'
            {
             before(grammarAccess.getUTMAccess().getUTMKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getUTMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__0__Impl"


    // $ANTLR start "rule__UTM__Group__1"
    // InternalPatternDsl.g:1698:1: rule__UTM__Group__1 : rule__UTM__Group__1__Impl rule__UTM__Group__2 ;
    public final void rule__UTM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1702:1: ( rule__UTM__Group__1__Impl rule__UTM__Group__2 )
            // InternalPatternDsl.g:1703:2: rule__UTM__Group__1__Impl rule__UTM__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__UTM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__1"


    // $ANTLR start "rule__UTM__Group__1__Impl"
    // InternalPatternDsl.g:1710:1: rule__UTM__Group__1__Impl : ( '{' ) ;
    public final void rule__UTM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1714:1: ( ( '{' ) )
            // InternalPatternDsl.g:1715:1: ( '{' )
            {
            // InternalPatternDsl.g:1715:1: ( '{' )
            // InternalPatternDsl.g:1716:2: '{'
            {
             before(grammarAccess.getUTMAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__1__Impl"


    // $ANTLR start "rule__UTM__Group__2"
    // InternalPatternDsl.g:1725:1: rule__UTM__Group__2 : rule__UTM__Group__2__Impl rule__UTM__Group__3 ;
    public final void rule__UTM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1729:1: ( rule__UTM__Group__2__Impl rule__UTM__Group__3 )
            // InternalPatternDsl.g:1730:2: rule__UTM__Group__2__Impl rule__UTM__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__UTM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__2"


    // $ANTLR start "rule__UTM__Group__2__Impl"
    // InternalPatternDsl.g:1737:1: rule__UTM__Group__2__Impl : ( ( rule__UTM__EAssignment_2 ) ) ;
    public final void rule__UTM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1741:1: ( ( ( rule__UTM__EAssignment_2 ) ) )
            // InternalPatternDsl.g:1742:1: ( ( rule__UTM__EAssignment_2 ) )
            {
            // InternalPatternDsl.g:1742:1: ( ( rule__UTM__EAssignment_2 ) )
            // InternalPatternDsl.g:1743:2: ( rule__UTM__EAssignment_2 )
            {
             before(grammarAccess.getUTMAccess().getEAssignment_2()); 
            // InternalPatternDsl.g:1744:2: ( rule__UTM__EAssignment_2 )
            // InternalPatternDsl.g:1744:3: rule__UTM__EAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UTM__EAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUTMAccess().getEAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__2__Impl"


    // $ANTLR start "rule__UTM__Group__3"
    // InternalPatternDsl.g:1752:1: rule__UTM__Group__3 : rule__UTM__Group__3__Impl rule__UTM__Group__4 ;
    public final void rule__UTM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1756:1: ( rule__UTM__Group__3__Impl rule__UTM__Group__4 )
            // InternalPatternDsl.g:1757:2: rule__UTM__Group__3__Impl rule__UTM__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__UTM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__3"


    // $ANTLR start "rule__UTM__Group__3__Impl"
    // InternalPatternDsl.g:1764:1: rule__UTM__Group__3__Impl : ( ',' ) ;
    public final void rule__UTM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1768:1: ( ( ',' ) )
            // InternalPatternDsl.g:1769:1: ( ',' )
            {
            // InternalPatternDsl.g:1769:1: ( ',' )
            // InternalPatternDsl.g:1770:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__3__Impl"


    // $ANTLR start "rule__UTM__Group__4"
    // InternalPatternDsl.g:1779:1: rule__UTM__Group__4 : rule__UTM__Group__4__Impl rule__UTM__Group__5 ;
    public final void rule__UTM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1783:1: ( rule__UTM__Group__4__Impl rule__UTM__Group__5 )
            // InternalPatternDsl.g:1784:2: rule__UTM__Group__4__Impl rule__UTM__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__UTM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__4"


    // $ANTLR start "rule__UTM__Group__4__Impl"
    // InternalPatternDsl.g:1791:1: rule__UTM__Group__4__Impl : ( ( rule__UTM__NAssignment_4 ) ) ;
    public final void rule__UTM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1795:1: ( ( ( rule__UTM__NAssignment_4 ) ) )
            // InternalPatternDsl.g:1796:1: ( ( rule__UTM__NAssignment_4 ) )
            {
            // InternalPatternDsl.g:1796:1: ( ( rule__UTM__NAssignment_4 ) )
            // InternalPatternDsl.g:1797:2: ( rule__UTM__NAssignment_4 )
            {
             before(grammarAccess.getUTMAccess().getNAssignment_4()); 
            // InternalPatternDsl.g:1798:2: ( rule__UTM__NAssignment_4 )
            // InternalPatternDsl.g:1798:3: rule__UTM__NAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UTM__NAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUTMAccess().getNAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__4__Impl"


    // $ANTLR start "rule__UTM__Group__5"
    // InternalPatternDsl.g:1806:1: rule__UTM__Group__5 : rule__UTM__Group__5__Impl rule__UTM__Group__6 ;
    public final void rule__UTM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1810:1: ( rule__UTM__Group__5__Impl rule__UTM__Group__6 )
            // InternalPatternDsl.g:1811:2: rule__UTM__Group__5__Impl rule__UTM__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__UTM__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__5"


    // $ANTLR start "rule__UTM__Group__5__Impl"
    // InternalPatternDsl.g:1818:1: rule__UTM__Group__5__Impl : ( ',' ) ;
    public final void rule__UTM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1822:1: ( ( ',' ) )
            // InternalPatternDsl.g:1823:1: ( ',' )
            {
            // InternalPatternDsl.g:1823:1: ( ',' )
            // InternalPatternDsl.g:1824:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__5__Impl"


    // $ANTLR start "rule__UTM__Group__6"
    // InternalPatternDsl.g:1833:1: rule__UTM__Group__6 : rule__UTM__Group__6__Impl rule__UTM__Group__7 ;
    public final void rule__UTM__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1837:1: ( rule__UTM__Group__6__Impl rule__UTM__Group__7 )
            // InternalPatternDsl.g:1838:2: rule__UTM__Group__6__Impl rule__UTM__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__UTM__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__6"


    // $ANTLR start "rule__UTM__Group__6__Impl"
    // InternalPatternDsl.g:1845:1: rule__UTM__Group__6__Impl : ( ( rule__UTM__ZAssignment_6 ) ) ;
    public final void rule__UTM__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1849:1: ( ( ( rule__UTM__ZAssignment_6 ) ) )
            // InternalPatternDsl.g:1850:1: ( ( rule__UTM__ZAssignment_6 ) )
            {
            // InternalPatternDsl.g:1850:1: ( ( rule__UTM__ZAssignment_6 ) )
            // InternalPatternDsl.g:1851:2: ( rule__UTM__ZAssignment_6 )
            {
             before(grammarAccess.getUTMAccess().getZAssignment_6()); 
            // InternalPatternDsl.g:1852:2: ( rule__UTM__ZAssignment_6 )
            // InternalPatternDsl.g:1852:3: rule__UTM__ZAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UTM__ZAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUTMAccess().getZAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__6__Impl"


    // $ANTLR start "rule__UTM__Group__7"
    // InternalPatternDsl.g:1860:1: rule__UTM__Group__7 : rule__UTM__Group__7__Impl rule__UTM__Group__8 ;
    public final void rule__UTM__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1864:1: ( rule__UTM__Group__7__Impl rule__UTM__Group__8 )
            // InternalPatternDsl.g:1865:2: rule__UTM__Group__7__Impl rule__UTM__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__UTM__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__7"


    // $ANTLR start "rule__UTM__Group__7__Impl"
    // InternalPatternDsl.g:1872:1: rule__UTM__Group__7__Impl : ( ',' ) ;
    public final void rule__UTM__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1876:1: ( ( ',' ) )
            // InternalPatternDsl.g:1877:1: ( ',' )
            {
            // InternalPatternDsl.g:1877:1: ( ',' )
            // InternalPatternDsl.g:1878:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__7__Impl"


    // $ANTLR start "rule__UTM__Group__8"
    // InternalPatternDsl.g:1887:1: rule__UTM__Group__8 : rule__UTM__Group__8__Impl rule__UTM__Group__9 ;
    public final void rule__UTM__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1891:1: ( rule__UTM__Group__8__Impl rule__UTM__Group__9 )
            // InternalPatternDsl.g:1892:2: rule__UTM__Group__8__Impl rule__UTM__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__UTM__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UTM__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__8"


    // $ANTLR start "rule__UTM__Group__8__Impl"
    // InternalPatternDsl.g:1899:1: rule__UTM__Group__8__Impl : ( ( rule__UTM__HemiAssignment_8 ) ) ;
    public final void rule__UTM__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1903:1: ( ( ( rule__UTM__HemiAssignment_8 ) ) )
            // InternalPatternDsl.g:1904:1: ( ( rule__UTM__HemiAssignment_8 ) )
            {
            // InternalPatternDsl.g:1904:1: ( ( rule__UTM__HemiAssignment_8 ) )
            // InternalPatternDsl.g:1905:2: ( rule__UTM__HemiAssignment_8 )
            {
             before(grammarAccess.getUTMAccess().getHemiAssignment_8()); 
            // InternalPatternDsl.g:1906:2: ( rule__UTM__HemiAssignment_8 )
            // InternalPatternDsl.g:1906:3: rule__UTM__HemiAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__UTM__HemiAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUTMAccess().getHemiAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__8__Impl"


    // $ANTLR start "rule__UTM__Group__9"
    // InternalPatternDsl.g:1914:1: rule__UTM__Group__9 : rule__UTM__Group__9__Impl ;
    public final void rule__UTM__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1918:1: ( rule__UTM__Group__9__Impl )
            // InternalPatternDsl.g:1919:2: rule__UTM__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UTM__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__9"


    // $ANTLR start "rule__UTM__Group__9__Impl"
    // InternalPatternDsl.g:1925:1: rule__UTM__Group__9__Impl : ( '}' ) ;
    public final void rule__UTM__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1929:1: ( ( '}' ) )
            // InternalPatternDsl.g:1930:1: ( '}' )
            {
            // InternalPatternDsl.g:1930:1: ( '}' )
            // InternalPatternDsl.g:1931:2: '}'
            {
             before(grammarAccess.getUTMAccess().getRightCurlyBracketKeyword_9()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__Group__9__Impl"


    // $ANTLR start "rule__Region__Group__0"
    // InternalPatternDsl.g:1941:1: rule__Region__Group__0 : rule__Region__Group__0__Impl rule__Region__Group__1 ;
    public final void rule__Region__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1945:1: ( rule__Region__Group__0__Impl rule__Region__Group__1 )
            // InternalPatternDsl.g:1946:2: rule__Region__Group__0__Impl rule__Region__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Region__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__0"


    // $ANTLR start "rule__Region__Group__0__Impl"
    // InternalPatternDsl.g:1953:1: rule__Region__Group__0__Impl : ( 'region' ) ;
    public final void rule__Region__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1957:1: ( ( 'region' ) )
            // InternalPatternDsl.g:1958:1: ( 'region' )
            {
            // InternalPatternDsl.g:1958:1: ( 'region' )
            // InternalPatternDsl.g:1959:2: 'region'
            {
             before(grammarAccess.getRegionAccess().getRegionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getRegionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__0__Impl"


    // $ANTLR start "rule__Region__Group__1"
    // InternalPatternDsl.g:1968:1: rule__Region__Group__1 : rule__Region__Group__1__Impl rule__Region__Group__2 ;
    public final void rule__Region__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1972:1: ( rule__Region__Group__1__Impl rule__Region__Group__2 )
            // InternalPatternDsl.g:1973:2: rule__Region__Group__1__Impl rule__Region__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Region__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__1"


    // $ANTLR start "rule__Region__Group__1__Impl"
    // InternalPatternDsl.g:1980:1: rule__Region__Group__1__Impl : ( ( rule__Region__NameAssignment_1 ) ) ;
    public final void rule__Region__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1984:1: ( ( ( rule__Region__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:1985:1: ( ( rule__Region__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:1985:1: ( ( rule__Region__NameAssignment_1 ) )
            // InternalPatternDsl.g:1986:2: ( rule__Region__NameAssignment_1 )
            {
             before(grammarAccess.getRegionAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:1987:2: ( rule__Region__NameAssignment_1 )
            // InternalPatternDsl.g:1987:3: rule__Region__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Region__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__1__Impl"


    // $ANTLR start "rule__Region__Group__2"
    // InternalPatternDsl.g:1995:1: rule__Region__Group__2 : rule__Region__Group__2__Impl rule__Region__Group__3 ;
    public final void rule__Region__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1999:1: ( rule__Region__Group__2__Impl rule__Region__Group__3 )
            // InternalPatternDsl.g:2000:2: rule__Region__Group__2__Impl rule__Region__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Region__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__2"


    // $ANTLR start "rule__Region__Group__2__Impl"
    // InternalPatternDsl.g:2007:1: rule__Region__Group__2__Impl : ( '=' ) ;
    public final void rule__Region__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2011:1: ( ( '=' ) )
            // InternalPatternDsl.g:2012:1: ( '=' )
            {
            // InternalPatternDsl.g:2012:1: ( '=' )
            // InternalPatternDsl.g:2013:2: '='
            {
             before(grammarAccess.getRegionAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__2__Impl"


    // $ANTLR start "rule__Region__Group__3"
    // InternalPatternDsl.g:2022:1: rule__Region__Group__3 : rule__Region__Group__3__Impl rule__Region__Group__4 ;
    public final void rule__Region__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2026:1: ( rule__Region__Group__3__Impl rule__Region__Group__4 )
            // InternalPatternDsl.g:2027:2: rule__Region__Group__3__Impl rule__Region__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Region__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__3"


    // $ANTLR start "rule__Region__Group__3__Impl"
    // InternalPatternDsl.g:2034:1: rule__Region__Group__3__Impl : ( '{' ) ;
    public final void rule__Region__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2038:1: ( ( '{' ) )
            // InternalPatternDsl.g:2039:1: ( '{' )
            {
            // InternalPatternDsl.g:2039:1: ( '{' )
            // InternalPatternDsl.g:2040:2: '{'
            {
             before(grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__3__Impl"


    // $ANTLR start "rule__Region__Group__4"
    // InternalPatternDsl.g:2049:1: rule__Region__Group__4 : rule__Region__Group__4__Impl rule__Region__Group__5 ;
    public final void rule__Region__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2053:1: ( rule__Region__Group__4__Impl rule__Region__Group__5 )
            // InternalPatternDsl.g:2054:2: rule__Region__Group__4__Impl rule__Region__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Region__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__4"


    // $ANTLR start "rule__Region__Group__4__Impl"
    // InternalPatternDsl.g:2061:1: rule__Region__Group__4__Impl : ( ( rule__Region__SouthWestBoundaryAssignment_4 ) ) ;
    public final void rule__Region__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2065:1: ( ( ( rule__Region__SouthWestBoundaryAssignment_4 ) ) )
            // InternalPatternDsl.g:2066:1: ( ( rule__Region__SouthWestBoundaryAssignment_4 ) )
            {
            // InternalPatternDsl.g:2066:1: ( ( rule__Region__SouthWestBoundaryAssignment_4 ) )
            // InternalPatternDsl.g:2067:2: ( rule__Region__SouthWestBoundaryAssignment_4 )
            {
             before(grammarAccess.getRegionAccess().getSouthWestBoundaryAssignment_4()); 
            // InternalPatternDsl.g:2068:2: ( rule__Region__SouthWestBoundaryAssignment_4 )
            // InternalPatternDsl.g:2068:3: rule__Region__SouthWestBoundaryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Region__SouthWestBoundaryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getSouthWestBoundaryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__4__Impl"


    // $ANTLR start "rule__Region__Group__5"
    // InternalPatternDsl.g:2076:1: rule__Region__Group__5 : rule__Region__Group__5__Impl rule__Region__Group__6 ;
    public final void rule__Region__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2080:1: ( rule__Region__Group__5__Impl rule__Region__Group__6 )
            // InternalPatternDsl.g:2081:2: rule__Region__Group__5__Impl rule__Region__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Region__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__5"


    // $ANTLR start "rule__Region__Group__5__Impl"
    // InternalPatternDsl.g:2088:1: rule__Region__Group__5__Impl : ( ':' ) ;
    public final void rule__Region__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2092:1: ( ( ':' ) )
            // InternalPatternDsl.g:2093:1: ( ':' )
            {
            // InternalPatternDsl.g:2093:1: ( ':' )
            // InternalPatternDsl.g:2094:2: ':'
            {
             before(grammarAccess.getRegionAccess().getColonKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__5__Impl"


    // $ANTLR start "rule__Region__Group__6"
    // InternalPatternDsl.g:2103:1: rule__Region__Group__6 : rule__Region__Group__6__Impl rule__Region__Group__7 ;
    public final void rule__Region__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2107:1: ( rule__Region__Group__6__Impl rule__Region__Group__7 )
            // InternalPatternDsl.g:2108:2: rule__Region__Group__6__Impl rule__Region__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Region__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Region__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__6"


    // $ANTLR start "rule__Region__Group__6__Impl"
    // InternalPatternDsl.g:2115:1: rule__Region__Group__6__Impl : ( ( rule__Region__NorthEastBoundaryAssignment_6 ) ) ;
    public final void rule__Region__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2119:1: ( ( ( rule__Region__NorthEastBoundaryAssignment_6 ) ) )
            // InternalPatternDsl.g:2120:1: ( ( rule__Region__NorthEastBoundaryAssignment_6 ) )
            {
            // InternalPatternDsl.g:2120:1: ( ( rule__Region__NorthEastBoundaryAssignment_6 ) )
            // InternalPatternDsl.g:2121:2: ( rule__Region__NorthEastBoundaryAssignment_6 )
            {
             before(grammarAccess.getRegionAccess().getNorthEastBoundaryAssignment_6()); 
            // InternalPatternDsl.g:2122:2: ( rule__Region__NorthEastBoundaryAssignment_6 )
            // InternalPatternDsl.g:2122:3: rule__Region__NorthEastBoundaryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Region__NorthEastBoundaryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegionAccess().getNorthEastBoundaryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__6__Impl"


    // $ANTLR start "rule__Region__Group__7"
    // InternalPatternDsl.g:2130:1: rule__Region__Group__7 : rule__Region__Group__7__Impl ;
    public final void rule__Region__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2134:1: ( rule__Region__Group__7__Impl )
            // InternalPatternDsl.g:2135:2: rule__Region__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Region__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__7"


    // $ANTLR start "rule__Region__Group__7__Impl"
    // InternalPatternDsl.g:2141:1: rule__Region__Group__7__Impl : ( '}' ) ;
    public final void rule__Region__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2145:1: ( ( '}' ) )
            // InternalPatternDsl.g:2146:1: ( '}' )
            {
            // InternalPatternDsl.g:2146:1: ( '}' )
            // InternalPatternDsl.g:2147:2: '}'
            {
             before(grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__Group__7__Impl"


    // $ANTLR start "rule__TermList__Group__0"
    // InternalPatternDsl.g:2157:1: rule__TermList__Group__0 : rule__TermList__Group__0__Impl rule__TermList__Group__1 ;
    public final void rule__TermList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2161:1: ( rule__TermList__Group__0__Impl rule__TermList__Group__1 )
            // InternalPatternDsl.g:2162:2: rule__TermList__Group__0__Impl rule__TermList__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__TermList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__0"


    // $ANTLR start "rule__TermList__Group__0__Impl"
    // InternalPatternDsl.g:2169:1: rule__TermList__Group__0__Impl : ( 'list' ) ;
    public final void rule__TermList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2173:1: ( ( 'list' ) )
            // InternalPatternDsl.g:2174:1: ( 'list' )
            {
            // InternalPatternDsl.g:2174:1: ( 'list' )
            // InternalPatternDsl.g:2175:2: 'list'
            {
             before(grammarAccess.getTermListAccess().getListKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__0__Impl"


    // $ANTLR start "rule__TermList__Group__1"
    // InternalPatternDsl.g:2184:1: rule__TermList__Group__1 : rule__TermList__Group__1__Impl rule__TermList__Group__2 ;
    public final void rule__TermList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2188:1: ( rule__TermList__Group__1__Impl rule__TermList__Group__2 )
            // InternalPatternDsl.g:2189:2: rule__TermList__Group__1__Impl rule__TermList__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__TermList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__1"


    // $ANTLR start "rule__TermList__Group__1__Impl"
    // InternalPatternDsl.g:2196:1: rule__TermList__Group__1__Impl : ( ( rule__TermList__PropertyAssignment_1 )? ) ;
    public final void rule__TermList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2200:1: ( ( ( rule__TermList__PropertyAssignment_1 )? ) )
            // InternalPatternDsl.g:2201:1: ( ( rule__TermList__PropertyAssignment_1 )? )
            {
            // InternalPatternDsl.g:2201:1: ( ( rule__TermList__PropertyAssignment_1 )? )
            // InternalPatternDsl.g:2202:2: ( rule__TermList__PropertyAssignment_1 )?
            {
             before(grammarAccess.getTermListAccess().getPropertyAssignment_1()); 
            // InternalPatternDsl.g:2203:2: ( rule__TermList__PropertyAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPatternDsl.g:2203:3: rule__TermList__PropertyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TermList__PropertyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermListAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__1__Impl"


    // $ANTLR start "rule__TermList__Group__2"
    // InternalPatternDsl.g:2211:1: rule__TermList__Group__2 : rule__TermList__Group__2__Impl rule__TermList__Group__3 ;
    public final void rule__TermList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2215:1: ( rule__TermList__Group__2__Impl rule__TermList__Group__3 )
            // InternalPatternDsl.g:2216:2: rule__TermList__Group__2__Impl rule__TermList__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TermList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__2"


    // $ANTLR start "rule__TermList__Group__2__Impl"
    // InternalPatternDsl.g:2223:1: rule__TermList__Group__2__Impl : ( ( rule__TermList__NameAssignment_2 ) ) ;
    public final void rule__TermList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2227:1: ( ( ( rule__TermList__NameAssignment_2 ) ) )
            // InternalPatternDsl.g:2228:1: ( ( rule__TermList__NameAssignment_2 ) )
            {
            // InternalPatternDsl.g:2228:1: ( ( rule__TermList__NameAssignment_2 ) )
            // InternalPatternDsl.g:2229:2: ( rule__TermList__NameAssignment_2 )
            {
             before(grammarAccess.getTermListAccess().getNameAssignment_2()); 
            // InternalPatternDsl.g:2230:2: ( rule__TermList__NameAssignment_2 )
            // InternalPatternDsl.g:2230:3: rule__TermList__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TermList__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTermListAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__2__Impl"


    // $ANTLR start "rule__TermList__Group__3"
    // InternalPatternDsl.g:2238:1: rule__TermList__Group__3 : rule__TermList__Group__3__Impl rule__TermList__Group__4 ;
    public final void rule__TermList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2242:1: ( rule__TermList__Group__3__Impl rule__TermList__Group__4 )
            // InternalPatternDsl.g:2243:2: rule__TermList__Group__3__Impl rule__TermList__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__TermList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__3"


    // $ANTLR start "rule__TermList__Group__3__Impl"
    // InternalPatternDsl.g:2250:1: rule__TermList__Group__3__Impl : ( '=' ) ;
    public final void rule__TermList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2254:1: ( ( '=' ) )
            // InternalPatternDsl.g:2255:1: ( '=' )
            {
            // InternalPatternDsl.g:2255:1: ( '=' )
            // InternalPatternDsl.g:2256:2: '='
            {
             before(grammarAccess.getTermListAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__3__Impl"


    // $ANTLR start "rule__TermList__Group__4"
    // InternalPatternDsl.g:2265:1: rule__TermList__Group__4 : rule__TermList__Group__4__Impl ;
    public final void rule__TermList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2269:1: ( rule__TermList__Group__4__Impl )
            // InternalPatternDsl.g:2270:2: rule__TermList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__4"


    // $ANTLR start "rule__TermList__Group__4__Impl"
    // InternalPatternDsl.g:2276:1: rule__TermList__Group__4__Impl : ( ( rule__TermList__Group_4__0 )? ) ;
    public final void rule__TermList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2280:1: ( ( ( rule__TermList__Group_4__0 )? ) )
            // InternalPatternDsl.g:2281:1: ( ( rule__TermList__Group_4__0 )? )
            {
            // InternalPatternDsl.g:2281:1: ( ( rule__TermList__Group_4__0 )? )
            // InternalPatternDsl.g:2282:2: ( rule__TermList__Group_4__0 )?
            {
             before(grammarAccess.getTermListAccess().getGroup_4()); 
            // InternalPatternDsl.g:2283:2: ( rule__TermList__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPatternDsl.g:2283:3: rule__TermList__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TermList__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermListAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group__4__Impl"


    // $ANTLR start "rule__TermList__Group_4__0"
    // InternalPatternDsl.g:2292:1: rule__TermList__Group_4__0 : rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1 ;
    public final void rule__TermList__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2296:1: ( rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1 )
            // InternalPatternDsl.g:2297:2: rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TermList__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__0"


    // $ANTLR start "rule__TermList__Group_4__0__Impl"
    // InternalPatternDsl.g:2304:1: rule__TermList__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TermList__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2308:1: ( ( '(' ) )
            // InternalPatternDsl.g:2309:1: ( '(' )
            {
            // InternalPatternDsl.g:2309:1: ( '(' )
            // InternalPatternDsl.g:2310:2: '('
            {
             before(grammarAccess.getTermListAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__0__Impl"


    // $ANTLR start "rule__TermList__Group_4__1"
    // InternalPatternDsl.g:2319:1: rule__TermList__Group_4__1 : rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2 ;
    public final void rule__TermList__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2323:1: ( rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2 )
            // InternalPatternDsl.g:2324:2: rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__TermList__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__1"


    // $ANTLR start "rule__TermList__Group_4__1__Impl"
    // InternalPatternDsl.g:2331:1: rule__TermList__Group_4__1__Impl : ( ( rule__TermList__TermsAssignment_4_1 ) ) ;
    public final void rule__TermList__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2335:1: ( ( ( rule__TermList__TermsAssignment_4_1 ) ) )
            // InternalPatternDsl.g:2336:1: ( ( rule__TermList__TermsAssignment_4_1 ) )
            {
            // InternalPatternDsl.g:2336:1: ( ( rule__TermList__TermsAssignment_4_1 ) )
            // InternalPatternDsl.g:2337:2: ( rule__TermList__TermsAssignment_4_1 )
            {
             before(grammarAccess.getTermListAccess().getTermsAssignment_4_1()); 
            // InternalPatternDsl.g:2338:2: ( rule__TermList__TermsAssignment_4_1 )
            // InternalPatternDsl.g:2338:3: rule__TermList__TermsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TermList__TermsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTermListAccess().getTermsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__1__Impl"


    // $ANTLR start "rule__TermList__Group_4__2"
    // InternalPatternDsl.g:2346:1: rule__TermList__Group_4__2 : rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3 ;
    public final void rule__TermList__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2350:1: ( rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3 )
            // InternalPatternDsl.g:2351:2: rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3
            {
            pushFollow(FOLLOW_21);
            rule__TermList__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__2"


    // $ANTLR start "rule__TermList__Group_4__2__Impl"
    // InternalPatternDsl.g:2358:1: rule__TermList__Group_4__2__Impl : ( ( rule__TermList__Group_4_2__0 )* ) ;
    public final void rule__TermList__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2362:1: ( ( ( rule__TermList__Group_4_2__0 )* ) )
            // InternalPatternDsl.g:2363:1: ( ( rule__TermList__Group_4_2__0 )* )
            {
            // InternalPatternDsl.g:2363:1: ( ( rule__TermList__Group_4_2__0 )* )
            // InternalPatternDsl.g:2364:2: ( rule__TermList__Group_4_2__0 )*
            {
             before(grammarAccess.getTermListAccess().getGroup_4_2()); 
            // InternalPatternDsl.g:2365:2: ( rule__TermList__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPatternDsl.g:2365:3: rule__TermList__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TermList__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTermListAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__2__Impl"


    // $ANTLR start "rule__TermList__Group_4__3"
    // InternalPatternDsl.g:2373:1: rule__TermList__Group_4__3 : rule__TermList__Group_4__3__Impl ;
    public final void rule__TermList__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2377:1: ( rule__TermList__Group_4__3__Impl )
            // InternalPatternDsl.g:2378:2: rule__TermList__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermList__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__3"


    // $ANTLR start "rule__TermList__Group_4__3__Impl"
    // InternalPatternDsl.g:2384:1: rule__TermList__Group_4__3__Impl : ( ')' ) ;
    public final void rule__TermList__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2388:1: ( ( ')' ) )
            // InternalPatternDsl.g:2389:1: ( ')' )
            {
            // InternalPatternDsl.g:2389:1: ( ')' )
            // InternalPatternDsl.g:2390:2: ')'
            {
             before(grammarAccess.getTermListAccess().getRightParenthesisKeyword_4_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4__3__Impl"


    // $ANTLR start "rule__TermList__Group_4_2__0"
    // InternalPatternDsl.g:2400:1: rule__TermList__Group_4_2__0 : rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1 ;
    public final void rule__TermList__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2404:1: ( rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1 )
            // InternalPatternDsl.g:2405:2: rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1
            {
            pushFollow(FOLLOW_20);
            rule__TermList__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermList__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4_2__0"


    // $ANTLR start "rule__TermList__Group_4_2__0__Impl"
    // InternalPatternDsl.g:2412:1: rule__TermList__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TermList__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2416:1: ( ( ',' ) )
            // InternalPatternDsl.g:2417:1: ( ',' )
            {
            // InternalPatternDsl.g:2417:1: ( ',' )
            // InternalPatternDsl.g:2418:2: ','
            {
             before(grammarAccess.getTermListAccess().getCommaKeyword_4_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4_2__0__Impl"


    // $ANTLR start "rule__TermList__Group_4_2__1"
    // InternalPatternDsl.g:2427:1: rule__TermList__Group_4_2__1 : rule__TermList__Group_4_2__1__Impl ;
    public final void rule__TermList__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2431:1: ( rule__TermList__Group_4_2__1__Impl )
            // InternalPatternDsl.g:2432:2: rule__TermList__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermList__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4_2__1"


    // $ANTLR start "rule__TermList__Group_4_2__1__Impl"
    // InternalPatternDsl.g:2438:1: rule__TermList__Group_4_2__1__Impl : ( ( rule__TermList__TermsAssignment_4_2_1 ) ) ;
    public final void rule__TermList__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2442:1: ( ( ( rule__TermList__TermsAssignment_4_2_1 ) ) )
            // InternalPatternDsl.g:2443:1: ( ( rule__TermList__TermsAssignment_4_2_1 ) )
            {
            // InternalPatternDsl.g:2443:1: ( ( rule__TermList__TermsAssignment_4_2_1 ) )
            // InternalPatternDsl.g:2444:2: ( rule__TermList__TermsAssignment_4_2_1 )
            {
             before(grammarAccess.getTermListAccess().getTermsAssignment_4_2_1()); 
            // InternalPatternDsl.g:2445:2: ( rule__TermList__TermsAssignment_4_2_1 )
            // InternalPatternDsl.g:2445:3: rule__TermList__TermsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TermList__TermsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTermListAccess().getTermsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__Group_4_2__1__Impl"


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalPatternDsl.g:2454:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2458:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalPatternDsl.g:2459:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Phrase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0"


    // $ANTLR start "rule__Phrase__Group__0__Impl"
    // InternalPatternDsl.g:2466:1: rule__Phrase__Group__0__Impl : ( 'phrase' ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2470:1: ( ( 'phrase' ) )
            // InternalPatternDsl.g:2471:1: ( 'phrase' )
            {
            // InternalPatternDsl.g:2471:1: ( 'phrase' )
            // InternalPatternDsl.g:2472:2: 'phrase'
            {
             before(grammarAccess.getPhraseAccess().getPhraseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getPhraseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__0__Impl"


    // $ANTLR start "rule__Phrase__Group__1"
    // InternalPatternDsl.g:2481:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl rule__Phrase__Group__2 ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2485:1: ( rule__Phrase__Group__1__Impl rule__Phrase__Group__2 )
            // InternalPatternDsl.g:2486:2: rule__Phrase__Group__1__Impl rule__Phrase__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Phrase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1"


    // $ANTLR start "rule__Phrase__Group__1__Impl"
    // InternalPatternDsl.g:2493:1: rule__Phrase__Group__1__Impl : ( ( rule__Phrase__NameAssignment_1 ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2497:1: ( ( ( rule__Phrase__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:2498:1: ( ( rule__Phrase__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:2498:1: ( ( rule__Phrase__NameAssignment_1 ) )
            // InternalPatternDsl.g:2499:2: ( rule__Phrase__NameAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:2500:2: ( rule__Phrase__NameAssignment_1 )
            // InternalPatternDsl.g:2500:3: rule__Phrase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__1__Impl"


    // $ANTLR start "rule__Phrase__Group__2"
    // InternalPatternDsl.g:2508:1: rule__Phrase__Group__2 : rule__Phrase__Group__2__Impl rule__Phrase__Group__3 ;
    public final void rule__Phrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2512:1: ( rule__Phrase__Group__2__Impl rule__Phrase__Group__3 )
            // InternalPatternDsl.g:2513:2: rule__Phrase__Group__2__Impl rule__Phrase__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Phrase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__2"


    // $ANTLR start "rule__Phrase__Group__2__Impl"
    // InternalPatternDsl.g:2520:1: rule__Phrase__Group__2__Impl : ( ( rule__Phrase__OrderedAssignment_2 )? ) ;
    public final void rule__Phrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2524:1: ( ( ( rule__Phrase__OrderedAssignment_2 )? ) )
            // InternalPatternDsl.g:2525:1: ( ( rule__Phrase__OrderedAssignment_2 )? )
            {
            // InternalPatternDsl.g:2525:1: ( ( rule__Phrase__OrderedAssignment_2 )? )
            // InternalPatternDsl.g:2526:2: ( rule__Phrase__OrderedAssignment_2 )?
            {
             before(grammarAccess.getPhraseAccess().getOrderedAssignment_2()); 
            // InternalPatternDsl.g:2527:2: ( rule__Phrase__OrderedAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPatternDsl.g:2527:3: rule__Phrase__OrderedAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phrase__OrderedAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhraseAccess().getOrderedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__2__Impl"


    // $ANTLR start "rule__Phrase__Group__3"
    // InternalPatternDsl.g:2535:1: rule__Phrase__Group__3 : rule__Phrase__Group__3__Impl rule__Phrase__Group__4 ;
    public final void rule__Phrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2539:1: ( rule__Phrase__Group__3__Impl rule__Phrase__Group__4 )
            // InternalPatternDsl.g:2540:2: rule__Phrase__Group__3__Impl rule__Phrase__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Phrase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__3"


    // $ANTLR start "rule__Phrase__Group__3__Impl"
    // InternalPatternDsl.g:2547:1: rule__Phrase__Group__3__Impl : ( '=' ) ;
    public final void rule__Phrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2551:1: ( ( '=' ) )
            // InternalPatternDsl.g:2552:1: ( '=' )
            {
            // InternalPatternDsl.g:2552:1: ( '=' )
            // InternalPatternDsl.g:2553:2: '='
            {
             before(grammarAccess.getPhraseAccess().getEqualsSignKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__3__Impl"


    // $ANTLR start "rule__Phrase__Group__4"
    // InternalPatternDsl.g:2562:1: rule__Phrase__Group__4 : rule__Phrase__Group__4__Impl rule__Phrase__Group__5 ;
    public final void rule__Phrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2566:1: ( rule__Phrase__Group__4__Impl rule__Phrase__Group__5 )
            // InternalPatternDsl.g:2567:2: rule__Phrase__Group__4__Impl rule__Phrase__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Phrase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__4"


    // $ANTLR start "rule__Phrase__Group__4__Impl"
    // InternalPatternDsl.g:2574:1: rule__Phrase__Group__4__Impl : ( '(' ) ;
    public final void rule__Phrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2578:1: ( ( '(' ) )
            // InternalPatternDsl.g:2579:1: ( '(' )
            {
            // InternalPatternDsl.g:2579:1: ( '(' )
            // InternalPatternDsl.g:2580:2: '('
            {
             before(grammarAccess.getPhraseAccess().getLeftParenthesisKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__4__Impl"


    // $ANTLR start "rule__Phrase__Group__5"
    // InternalPatternDsl.g:2589:1: rule__Phrase__Group__5 : rule__Phrase__Group__5__Impl rule__Phrase__Group__6 ;
    public final void rule__Phrase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2593:1: ( rule__Phrase__Group__5__Impl rule__Phrase__Group__6 )
            // InternalPatternDsl.g:2594:2: rule__Phrase__Group__5__Impl rule__Phrase__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Phrase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__5"


    // $ANTLR start "rule__Phrase__Group__5__Impl"
    // InternalPatternDsl.g:2601:1: rule__Phrase__Group__5__Impl : ( ( rule__Phrase__ConceptsAssignment_5 ) ) ;
    public final void rule__Phrase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2605:1: ( ( ( rule__Phrase__ConceptsAssignment_5 ) ) )
            // InternalPatternDsl.g:2606:1: ( ( rule__Phrase__ConceptsAssignment_5 ) )
            {
            // InternalPatternDsl.g:2606:1: ( ( rule__Phrase__ConceptsAssignment_5 ) )
            // InternalPatternDsl.g:2607:2: ( rule__Phrase__ConceptsAssignment_5 )
            {
             before(grammarAccess.getPhraseAccess().getConceptsAssignment_5()); 
            // InternalPatternDsl.g:2608:2: ( rule__Phrase__ConceptsAssignment_5 )
            // InternalPatternDsl.g:2608:3: rule__Phrase__ConceptsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__ConceptsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getConceptsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__5__Impl"


    // $ANTLR start "rule__Phrase__Group__6"
    // InternalPatternDsl.g:2616:1: rule__Phrase__Group__6 : rule__Phrase__Group__6__Impl rule__Phrase__Group__7 ;
    public final void rule__Phrase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2620:1: ( rule__Phrase__Group__6__Impl rule__Phrase__Group__7 )
            // InternalPatternDsl.g:2621:2: rule__Phrase__Group__6__Impl rule__Phrase__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Phrase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__6"


    // $ANTLR start "rule__Phrase__Group__6__Impl"
    // InternalPatternDsl.g:2628:1: rule__Phrase__Group__6__Impl : ( ( rule__Phrase__Group_6__0 )* ) ;
    public final void rule__Phrase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2632:1: ( ( ( rule__Phrase__Group_6__0 )* ) )
            // InternalPatternDsl.g:2633:1: ( ( rule__Phrase__Group_6__0 )* )
            {
            // InternalPatternDsl.g:2633:1: ( ( rule__Phrase__Group_6__0 )* )
            // InternalPatternDsl.g:2634:2: ( rule__Phrase__Group_6__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_6()); 
            // InternalPatternDsl.g:2635:2: ( rule__Phrase__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPatternDsl.g:2635:3: rule__Phrase__Group_6__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Phrase__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__6__Impl"


    // $ANTLR start "rule__Phrase__Group__7"
    // InternalPatternDsl.g:2643:1: rule__Phrase__Group__7 : rule__Phrase__Group__7__Impl rule__Phrase__Group__8 ;
    public final void rule__Phrase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2647:1: ( rule__Phrase__Group__7__Impl rule__Phrase__Group__8 )
            // InternalPatternDsl.g:2648:2: rule__Phrase__Group__7__Impl rule__Phrase__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Phrase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__7"


    // $ANTLR start "rule__Phrase__Group__7__Impl"
    // InternalPatternDsl.g:2655:1: rule__Phrase__Group__7__Impl : ( ')' ) ;
    public final void rule__Phrase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2659:1: ( ( ')' ) )
            // InternalPatternDsl.g:2660:1: ( ')' )
            {
            // InternalPatternDsl.g:2660:1: ( ')' )
            // InternalPatternDsl.g:2661:2: ')'
            {
             before(grammarAccess.getPhraseAccess().getRightParenthesisKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__7__Impl"


    // $ANTLR start "rule__Phrase__Group__8"
    // InternalPatternDsl.g:2670:1: rule__Phrase__Group__8 : rule__Phrase__Group__8__Impl ;
    public final void rule__Phrase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2674:1: ( rule__Phrase__Group__8__Impl )
            // InternalPatternDsl.g:2675:2: rule__Phrase__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__8"


    // $ANTLR start "rule__Phrase__Group__8__Impl"
    // InternalPatternDsl.g:2681:1: rule__Phrase__Group__8__Impl : ( ( rule__Phrase__Group_8__0 )? ) ;
    public final void rule__Phrase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2685:1: ( ( ( rule__Phrase__Group_8__0 )? ) )
            // InternalPatternDsl.g:2686:1: ( ( rule__Phrase__Group_8__0 )? )
            {
            // InternalPatternDsl.g:2686:1: ( ( rule__Phrase__Group_8__0 )? )
            // InternalPatternDsl.g:2687:2: ( rule__Phrase__Group_8__0 )?
            {
             before(grammarAccess.getPhraseAccess().getGroup_8()); 
            // InternalPatternDsl.g:2688:2: ( rule__Phrase__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPatternDsl.g:2688:3: rule__Phrase__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phrase__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhraseAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group__8__Impl"


    // $ANTLR start "rule__Phrase__Group_6__0"
    // InternalPatternDsl.g:2697:1: rule__Phrase__Group_6__0 : rule__Phrase__Group_6__0__Impl rule__Phrase__Group_6__1 ;
    public final void rule__Phrase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2701:1: ( rule__Phrase__Group_6__0__Impl rule__Phrase__Group_6__1 )
            // InternalPatternDsl.g:2702:2: rule__Phrase__Group_6__0__Impl rule__Phrase__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Phrase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_6__0"


    // $ANTLR start "rule__Phrase__Group_6__0__Impl"
    // InternalPatternDsl.g:2709:1: rule__Phrase__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Phrase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2713:1: ( ( ',' ) )
            // InternalPatternDsl.g:2714:1: ( ',' )
            {
            // InternalPatternDsl.g:2714:1: ( ',' )
            // InternalPatternDsl.g:2715:2: ','
            {
             before(grammarAccess.getPhraseAccess().getCommaKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_6__0__Impl"


    // $ANTLR start "rule__Phrase__Group_6__1"
    // InternalPatternDsl.g:2724:1: rule__Phrase__Group_6__1 : rule__Phrase__Group_6__1__Impl ;
    public final void rule__Phrase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2728:1: ( rule__Phrase__Group_6__1__Impl )
            // InternalPatternDsl.g:2729:2: rule__Phrase__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_6__1"


    // $ANTLR start "rule__Phrase__Group_6__1__Impl"
    // InternalPatternDsl.g:2735:1: rule__Phrase__Group_6__1__Impl : ( ( rule__Phrase__ConceptsAssignment_6_1 ) ) ;
    public final void rule__Phrase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2739:1: ( ( ( rule__Phrase__ConceptsAssignment_6_1 ) ) )
            // InternalPatternDsl.g:2740:1: ( ( rule__Phrase__ConceptsAssignment_6_1 ) )
            {
            // InternalPatternDsl.g:2740:1: ( ( rule__Phrase__ConceptsAssignment_6_1 ) )
            // InternalPatternDsl.g:2741:2: ( rule__Phrase__ConceptsAssignment_6_1 )
            {
             before(grammarAccess.getPhraseAccess().getConceptsAssignment_6_1()); 
            // InternalPatternDsl.g:2742:2: ( rule__Phrase__ConceptsAssignment_6_1 )
            // InternalPatternDsl.g:2742:3: rule__Phrase__ConceptsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__ConceptsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getConceptsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_6__1__Impl"


    // $ANTLR start "rule__Phrase__Group_8__0"
    // InternalPatternDsl.g:2751:1: rule__Phrase__Group_8__0 : rule__Phrase__Group_8__0__Impl rule__Phrase__Group_8__1 ;
    public final void rule__Phrase__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2755:1: ( rule__Phrase__Group_8__0__Impl rule__Phrase__Group_8__1 )
            // InternalPatternDsl.g:2756:2: rule__Phrase__Group_8__0__Impl rule__Phrase__Group_8__1
            {
            pushFollow(FOLLOW_24);
            rule__Phrase__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__0"


    // $ANTLR start "rule__Phrase__Group_8__0__Impl"
    // InternalPatternDsl.g:2763:1: rule__Phrase__Group_8__0__Impl : ( '{' ) ;
    public final void rule__Phrase__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2767:1: ( ( '{' ) )
            // InternalPatternDsl.g:2768:1: ( '{' )
            {
            // InternalPatternDsl.g:2768:1: ( '{' )
            // InternalPatternDsl.g:2769:2: '{'
            {
             before(grammarAccess.getPhraseAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getLeftCurlyBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__0__Impl"


    // $ANTLR start "rule__Phrase__Group_8__1"
    // InternalPatternDsl.g:2778:1: rule__Phrase__Group_8__1 : rule__Phrase__Group_8__1__Impl rule__Phrase__Group_8__2 ;
    public final void rule__Phrase__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2782:1: ( rule__Phrase__Group_8__1__Impl rule__Phrase__Group_8__2 )
            // InternalPatternDsl.g:2783:2: rule__Phrase__Group_8__1__Impl rule__Phrase__Group_8__2
            {
            pushFollow(FOLLOW_25);
            rule__Phrase__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__1"


    // $ANTLR start "rule__Phrase__Group_8__1__Impl"
    // InternalPatternDsl.g:2790:1: rule__Phrase__Group_8__1__Impl : ( ( rule__Phrase__OptionsAssignment_8_1 ) ) ;
    public final void rule__Phrase__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2794:1: ( ( ( rule__Phrase__OptionsAssignment_8_1 ) ) )
            // InternalPatternDsl.g:2795:1: ( ( rule__Phrase__OptionsAssignment_8_1 ) )
            {
            // InternalPatternDsl.g:2795:1: ( ( rule__Phrase__OptionsAssignment_8_1 ) )
            // InternalPatternDsl.g:2796:2: ( rule__Phrase__OptionsAssignment_8_1 )
            {
             before(grammarAccess.getPhraseAccess().getOptionsAssignment_8_1()); 
            // InternalPatternDsl.g:2797:2: ( rule__Phrase__OptionsAssignment_8_1 )
            // InternalPatternDsl.g:2797:3: rule__Phrase__OptionsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__OptionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getOptionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__1__Impl"


    // $ANTLR start "rule__Phrase__Group_8__2"
    // InternalPatternDsl.g:2805:1: rule__Phrase__Group_8__2 : rule__Phrase__Group_8__2__Impl rule__Phrase__Group_8__3 ;
    public final void rule__Phrase__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2809:1: ( rule__Phrase__Group_8__2__Impl rule__Phrase__Group_8__3 )
            // InternalPatternDsl.g:2810:2: rule__Phrase__Group_8__2__Impl rule__Phrase__Group_8__3
            {
            pushFollow(FOLLOW_25);
            rule__Phrase__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__2"


    // $ANTLR start "rule__Phrase__Group_8__2__Impl"
    // InternalPatternDsl.g:2817:1: rule__Phrase__Group_8__2__Impl : ( ( rule__Phrase__Group_8_2__0 )* ) ;
    public final void rule__Phrase__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2821:1: ( ( ( rule__Phrase__Group_8_2__0 )* ) )
            // InternalPatternDsl.g:2822:1: ( ( rule__Phrase__Group_8_2__0 )* )
            {
            // InternalPatternDsl.g:2822:1: ( ( rule__Phrase__Group_8_2__0 )* )
            // InternalPatternDsl.g:2823:2: ( rule__Phrase__Group_8_2__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_8_2()); 
            // InternalPatternDsl.g:2824:2: ( rule__Phrase__Group_8_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPatternDsl.g:2824:3: rule__Phrase__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Phrase__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__2__Impl"


    // $ANTLR start "rule__Phrase__Group_8__3"
    // InternalPatternDsl.g:2832:1: rule__Phrase__Group_8__3 : rule__Phrase__Group_8__3__Impl ;
    public final void rule__Phrase__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2836:1: ( rule__Phrase__Group_8__3__Impl )
            // InternalPatternDsl.g:2837:2: rule__Phrase__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__3"


    // $ANTLR start "rule__Phrase__Group_8__3__Impl"
    // InternalPatternDsl.g:2843:1: rule__Phrase__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Phrase__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2847:1: ( ( '}' ) )
            // InternalPatternDsl.g:2848:1: ( '}' )
            {
            // InternalPatternDsl.g:2848:1: ( '}' )
            // InternalPatternDsl.g:2849:2: '}'
            {
             before(grammarAccess.getPhraseAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8__3__Impl"


    // $ANTLR start "rule__Phrase__Group_8_2__0"
    // InternalPatternDsl.g:2859:1: rule__Phrase__Group_8_2__0 : rule__Phrase__Group_8_2__0__Impl rule__Phrase__Group_8_2__1 ;
    public final void rule__Phrase__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2863:1: ( rule__Phrase__Group_8_2__0__Impl rule__Phrase__Group_8_2__1 )
            // InternalPatternDsl.g:2864:2: rule__Phrase__Group_8_2__0__Impl rule__Phrase__Group_8_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Phrase__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8_2__0"


    // $ANTLR start "rule__Phrase__Group_8_2__0__Impl"
    // InternalPatternDsl.g:2871:1: rule__Phrase__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Phrase__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2875:1: ( ( ',' ) )
            // InternalPatternDsl.g:2876:1: ( ',' )
            {
            // InternalPatternDsl.g:2876:1: ( ',' )
            // InternalPatternDsl.g:2877:2: ','
            {
             before(grammarAccess.getPhraseAccess().getCommaKeyword_8_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8_2__0__Impl"


    // $ANTLR start "rule__Phrase__Group_8_2__1"
    // InternalPatternDsl.g:2886:1: rule__Phrase__Group_8_2__1 : rule__Phrase__Group_8_2__1__Impl ;
    public final void rule__Phrase__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2890:1: ( rule__Phrase__Group_8_2__1__Impl )
            // InternalPatternDsl.g:2891:2: rule__Phrase__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8_2__1"


    // $ANTLR start "rule__Phrase__Group_8_2__1__Impl"
    // InternalPatternDsl.g:2897:1: rule__Phrase__Group_8_2__1__Impl : ( ( rule__Phrase__OptionsAssignment_8_2_1 ) ) ;
    public final void rule__Phrase__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2901:1: ( ( ( rule__Phrase__OptionsAssignment_8_2_1 ) ) )
            // InternalPatternDsl.g:2902:1: ( ( rule__Phrase__OptionsAssignment_8_2_1 ) )
            {
            // InternalPatternDsl.g:2902:1: ( ( rule__Phrase__OptionsAssignment_8_2_1 ) )
            // InternalPatternDsl.g:2903:2: ( rule__Phrase__OptionsAssignment_8_2_1 )
            {
             before(grammarAccess.getPhraseAccess().getOptionsAssignment_8_2_1()); 
            // InternalPatternDsl.g:2904:2: ( rule__Phrase__OptionsAssignment_8_2_1 )
            // InternalPatternDsl.g:2904:3: rule__Phrase__OptionsAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__OptionsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getOptionsAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_8_2__1__Impl"


    // $ANTLR start "rule__GeoOption__Group__0"
    // InternalPatternDsl.g:2913:1: rule__GeoOption__Group__0 : rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1 ;
    public final void rule__GeoOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2917:1: ( rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1 )
            // InternalPatternDsl.g:2918:2: rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GeoOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeoOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__0"


    // $ANTLR start "rule__GeoOption__Group__0__Impl"
    // InternalPatternDsl.g:2925:1: rule__GeoOption__Group__0__Impl : ( ( rule__GeoOption__KeyAssignment_0 ) ) ;
    public final void rule__GeoOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2929:1: ( ( ( rule__GeoOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:2930:1: ( ( rule__GeoOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:2930:1: ( ( rule__GeoOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:2931:2: ( rule__GeoOption__KeyAssignment_0 )
            {
             before(grammarAccess.getGeoOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:2932:2: ( rule__GeoOption__KeyAssignment_0 )
            // InternalPatternDsl.g:2932:3: rule__GeoOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GeoOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeoOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__0__Impl"


    // $ANTLR start "rule__GeoOption__Group__1"
    // InternalPatternDsl.g:2940:1: rule__GeoOption__Group__1 : rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2 ;
    public final void rule__GeoOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2944:1: ( rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2 )
            // InternalPatternDsl.g:2945:2: rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GeoOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeoOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__1"


    // $ANTLR start "rule__GeoOption__Group__1__Impl"
    // InternalPatternDsl.g:2952:1: rule__GeoOption__Group__1__Impl : ( '=' ) ;
    public final void rule__GeoOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2956:1: ( ( '=' ) )
            // InternalPatternDsl.g:2957:1: ( '=' )
            {
            // InternalPatternDsl.g:2957:1: ( '=' )
            // InternalPatternDsl.g:2958:2: '='
            {
             before(grammarAccess.getGeoOptionAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGeoOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__1__Impl"


    // $ANTLR start "rule__GeoOption__Group__2"
    // InternalPatternDsl.g:2967:1: rule__GeoOption__Group__2 : rule__GeoOption__Group__2__Impl ;
    public final void rule__GeoOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2971:1: ( rule__GeoOption__Group__2__Impl )
            // InternalPatternDsl.g:2972:2: rule__GeoOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeoOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__2"


    // $ANTLR start "rule__GeoOption__Group__2__Impl"
    // InternalPatternDsl.g:2978:1: rule__GeoOption__Group__2__Impl : ( ( rule__GeoOption__ValueAssignment_2 ) ) ;
    public final void rule__GeoOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2982:1: ( ( ( rule__GeoOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:2983:1: ( ( rule__GeoOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:2983:1: ( ( rule__GeoOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:2984:2: ( rule__GeoOption__ValueAssignment_2 )
            {
             before(grammarAccess.getGeoOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:2985:2: ( rule__GeoOption__ValueAssignment_2 )
            // InternalPatternDsl.g:2985:3: rule__GeoOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GeoOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGeoOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__Group__2__Impl"


    // $ANTLR start "rule__SourceOption__Group__0"
    // InternalPatternDsl.g:2994:1: rule__SourceOption__Group__0 : rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1 ;
    public final void rule__SourceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2998:1: ( rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1 )
            // InternalPatternDsl.g:2999:2: rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SourceOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__0"


    // $ANTLR start "rule__SourceOption__Group__0__Impl"
    // InternalPatternDsl.g:3006:1: rule__SourceOption__Group__0__Impl : ( ( rule__SourceOption__KeyAssignment_0 ) ) ;
    public final void rule__SourceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3010:1: ( ( ( rule__SourceOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3011:1: ( ( rule__SourceOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3011:1: ( ( rule__SourceOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3012:2: ( rule__SourceOption__KeyAssignment_0 )
            {
             before(grammarAccess.getSourceOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3013:2: ( rule__SourceOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3013:3: rule__SourceOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SourceOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSourceOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__0__Impl"


    // $ANTLR start "rule__SourceOption__Group__1"
    // InternalPatternDsl.g:3021:1: rule__SourceOption__Group__1 : rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2 ;
    public final void rule__SourceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3025:1: ( rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2 )
            // InternalPatternDsl.g:3026:2: rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__SourceOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__1"


    // $ANTLR start "rule__SourceOption__Group__1__Impl"
    // InternalPatternDsl.g:3033:1: rule__SourceOption__Group__1__Impl : ( '=' ) ;
    public final void rule__SourceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3037:1: ( ( '=' ) )
            // InternalPatternDsl.g:3038:1: ( '=' )
            {
            // InternalPatternDsl.g:3038:1: ( '=' )
            // InternalPatternDsl.g:3039:2: '='
            {
             before(grammarAccess.getSourceOptionAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSourceOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__1__Impl"


    // $ANTLR start "rule__SourceOption__Group__2"
    // InternalPatternDsl.g:3048:1: rule__SourceOption__Group__2 : rule__SourceOption__Group__2__Impl ;
    public final void rule__SourceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3052:1: ( rule__SourceOption__Group__2__Impl )
            // InternalPatternDsl.g:3053:2: rule__SourceOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__2"


    // $ANTLR start "rule__SourceOption__Group__2__Impl"
    // InternalPatternDsl.g:3059:1: rule__SourceOption__Group__2__Impl : ( ( rule__SourceOption__ValueAssignment_2 ) ) ;
    public final void rule__SourceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3063:1: ( ( ( rule__SourceOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3064:1: ( ( rule__SourceOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3064:1: ( ( rule__SourceOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3065:2: ( rule__SourceOption__ValueAssignment_2 )
            {
             before(grammarAccess.getSourceOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3066:2: ( rule__SourceOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3066:3: rule__SourceOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__Group__2__Impl"


    // $ANTLR start "rule__LanguageOption__Group__0"
    // InternalPatternDsl.g:3075:1: rule__LanguageOption__Group__0 : rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1 ;
    public final void rule__LanguageOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3079:1: ( rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1 )
            // InternalPatternDsl.g:3080:2: rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LanguageOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__0"


    // $ANTLR start "rule__LanguageOption__Group__0__Impl"
    // InternalPatternDsl.g:3087:1: rule__LanguageOption__Group__0__Impl : ( ( rule__LanguageOption__KeyAssignment_0 ) ) ;
    public final void rule__LanguageOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3091:1: ( ( ( rule__LanguageOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3092:1: ( ( rule__LanguageOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3092:1: ( ( rule__LanguageOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3093:2: ( rule__LanguageOption__KeyAssignment_0 )
            {
             before(grammarAccess.getLanguageOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3094:2: ( rule__LanguageOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3094:3: rule__LanguageOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__0__Impl"


    // $ANTLR start "rule__LanguageOption__Group__1"
    // InternalPatternDsl.g:3102:1: rule__LanguageOption__Group__1 : rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2 ;
    public final void rule__LanguageOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3106:1: ( rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2 )
            // InternalPatternDsl.g:3107:2: rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__LanguageOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__1"


    // $ANTLR start "rule__LanguageOption__Group__1__Impl"
    // InternalPatternDsl.g:3114:1: rule__LanguageOption__Group__1__Impl : ( '=' ) ;
    public final void rule__LanguageOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3118:1: ( ( '=' ) )
            // InternalPatternDsl.g:3119:1: ( '=' )
            {
            // InternalPatternDsl.g:3119:1: ( '=' )
            // InternalPatternDsl.g:3120:2: '='
            {
             before(grammarAccess.getLanguageOptionAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLanguageOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__1__Impl"


    // $ANTLR start "rule__LanguageOption__Group__2"
    // InternalPatternDsl.g:3129:1: rule__LanguageOption__Group__2 : rule__LanguageOption__Group__2__Impl ;
    public final void rule__LanguageOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3133:1: ( rule__LanguageOption__Group__2__Impl )
            // InternalPatternDsl.g:3134:2: rule__LanguageOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__2"


    // $ANTLR start "rule__LanguageOption__Group__2__Impl"
    // InternalPatternDsl.g:3140:1: rule__LanguageOption__Group__2__Impl : ( ( rule__LanguageOption__ValueAssignment_2 ) ) ;
    public final void rule__LanguageOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3144:1: ( ( ( rule__LanguageOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3145:1: ( ( rule__LanguageOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3145:1: ( ( rule__LanguageOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3146:2: ( rule__LanguageOption__ValueAssignment_2 )
            {
             before(grammarAccess.getLanguageOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3147:2: ( rule__LanguageOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3147:3: rule__LanguageOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__Group__2__Impl"


    // $ANTLR start "rule__BooleanOption__Group__0"
    // InternalPatternDsl.g:3156:1: rule__BooleanOption__Group__0 : rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 ;
    public final void rule__BooleanOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3160:1: ( rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 )
            // InternalPatternDsl.g:3161:2: rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BooleanOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__0"


    // $ANTLR start "rule__BooleanOption__Group__0__Impl"
    // InternalPatternDsl.g:3168:1: rule__BooleanOption__Group__0__Impl : ( ( rule__BooleanOption__KeyAssignment_0 ) ) ;
    public final void rule__BooleanOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3172:1: ( ( ( rule__BooleanOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3173:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3173:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3174:2: ( rule__BooleanOption__KeyAssignment_0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3175:2: ( rule__BooleanOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3175:3: rule__BooleanOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__0__Impl"


    // $ANTLR start "rule__BooleanOption__Group__1"
    // InternalPatternDsl.g:3183:1: rule__BooleanOption__Group__1 : rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 ;
    public final void rule__BooleanOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3187:1: ( rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 )
            // InternalPatternDsl.g:3188:2: rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__BooleanOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__1"


    // $ANTLR start "rule__BooleanOption__Group__1__Impl"
    // InternalPatternDsl.g:3195:1: rule__BooleanOption__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3199:1: ( ( '=' ) )
            // InternalPatternDsl.g:3200:1: ( '=' )
            {
            // InternalPatternDsl.g:3200:1: ( '=' )
            // InternalPatternDsl.g:3201:2: '='
            {
             before(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__1__Impl"


    // $ANTLR start "rule__BooleanOption__Group__2"
    // InternalPatternDsl.g:3210:1: rule__BooleanOption__Group__2 : rule__BooleanOption__Group__2__Impl ;
    public final void rule__BooleanOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3214:1: ( rule__BooleanOption__Group__2__Impl )
            // InternalPatternDsl.g:3215:2: rule__BooleanOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__2"


    // $ANTLR start "rule__BooleanOption__Group__2__Impl"
    // InternalPatternDsl.g:3221:1: rule__BooleanOption__Group__2__Impl : ( ( rule__BooleanOption__ValueAssignment_2 ) ) ;
    public final void rule__BooleanOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3225:1: ( ( ( rule__BooleanOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3226:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3226:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3227:2: ( rule__BooleanOption__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3228:2: ( rule__BooleanOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3228:3: rule__BooleanOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__2__Impl"


    // $ANTLR start "rule__IntOption__Group__0"
    // InternalPatternDsl.g:3237:1: rule__IntOption__Group__0 : rule__IntOption__Group__0__Impl rule__IntOption__Group__1 ;
    public final void rule__IntOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3241:1: ( rule__IntOption__Group__0__Impl rule__IntOption__Group__1 )
            // InternalPatternDsl.g:3242:2: rule__IntOption__Group__0__Impl rule__IntOption__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IntOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__0"


    // $ANTLR start "rule__IntOption__Group__0__Impl"
    // InternalPatternDsl.g:3249:1: rule__IntOption__Group__0__Impl : ( ( rule__IntOption__KeyAssignment_0 ) ) ;
    public final void rule__IntOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3253:1: ( ( ( rule__IntOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3254:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3254:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3255:2: ( rule__IntOption__KeyAssignment_0 )
            {
             before(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3256:2: ( rule__IntOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3256:3: rule__IntOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__0__Impl"


    // $ANTLR start "rule__IntOption__Group__1"
    // InternalPatternDsl.g:3264:1: rule__IntOption__Group__1 : rule__IntOption__Group__1__Impl rule__IntOption__Group__2 ;
    public final void rule__IntOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3268:1: ( rule__IntOption__Group__1__Impl rule__IntOption__Group__2 )
            // InternalPatternDsl.g:3269:2: rule__IntOption__Group__1__Impl rule__IntOption__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__IntOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__1"


    // $ANTLR start "rule__IntOption__Group__1__Impl"
    // InternalPatternDsl.g:3276:1: rule__IntOption__Group__1__Impl : ( '=' ) ;
    public final void rule__IntOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3280:1: ( ( '=' ) )
            // InternalPatternDsl.g:3281:1: ( '=' )
            {
            // InternalPatternDsl.g:3281:1: ( '=' )
            // InternalPatternDsl.g:3282:2: '='
            {
             before(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__1__Impl"


    // $ANTLR start "rule__IntOption__Group__2"
    // InternalPatternDsl.g:3291:1: rule__IntOption__Group__2 : rule__IntOption__Group__2__Impl ;
    public final void rule__IntOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3295:1: ( rule__IntOption__Group__2__Impl )
            // InternalPatternDsl.g:3296:2: rule__IntOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__2"


    // $ANTLR start "rule__IntOption__Group__2__Impl"
    // InternalPatternDsl.g:3302:1: rule__IntOption__Group__2__Impl : ( ( rule__IntOption__ValueAssignment_2 ) ) ;
    public final void rule__IntOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3306:1: ( ( ( rule__IntOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3307:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3307:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3308:2: ( rule__IntOption__ValueAssignment_2 )
            {
             before(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3309:2: ( rule__IntOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3309:3: rule__IntOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__2__Impl"


    // $ANTLR start "rule__StreamingModel__DescriptionsAssignment_0"
    // InternalPatternDsl.g:3318:1: rule__StreamingModel__DescriptionsAssignment_0 : ( ruleStreamingDescription ) ;
    public final void rule__StreamingModel__DescriptionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3322:1: ( ( ruleStreamingDescription ) )
            // InternalPatternDsl.g:3323:2: ( ruleStreamingDescription )
            {
            // InternalPatternDsl.g:3323:2: ( ruleStreamingDescription )
            // InternalPatternDsl.g:3324:3: ruleStreamingDescription
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamingDescription();

            state._fsp--;

             after(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__DescriptionsAssignment_0"


    // $ANTLR start "rule__StreamingModel__DescriptionsAssignment_1"
    // InternalPatternDsl.g:3333:1: rule__StreamingModel__DescriptionsAssignment_1 : ( ruleStreamingDescription ) ;
    public final void rule__StreamingModel__DescriptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3337:1: ( ( ruleStreamingDescription ) )
            // InternalPatternDsl.g:3338:2: ( ruleStreamingDescription )
            {
            // InternalPatternDsl.g:3338:2: ( ruleStreamingDescription )
            // InternalPatternDsl.g:3339:3: ruleStreamingDescription
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamingDescription();

            state._fsp--;

             after(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamingModel__DescriptionsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalPatternDsl.g:3348:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3352:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalPatternDsl.g:3353:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalPatternDsl.g:3353:2: ( ruleQualifiedNameWithWildcard )
            // InternalPatternDsl.g:3354:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Place__NameAssignment_1"
    // InternalPatternDsl.g:3363:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3367:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3368:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3368:2: ( RULE_ID )
            // InternalPatternDsl.g:3369:3: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__PointAssignment_3"
    // InternalPatternDsl.g:3378:1: rule__Place__PointAssignment_3 : ( rulePoint ) ;
    public final void rule__Place__PointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3382:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3383:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3383:2: ( rulePoint )
            // InternalPatternDsl.g:3384:3: rulePoint
            {
             before(grammarAccess.getPlaceAccess().getPointPointParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPlaceAccess().getPointPointParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__PointAssignment_3"


    // $ANTLR start "rule__Point__RadiusAssignment_0_0"
    // InternalPatternDsl.g:3393:1: rule__Point__RadiusAssignment_0_0 : ( RULE_DOUBLE ) ;
    public final void rule__Point__RadiusAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3397:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3398:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3398:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3399:3: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getRadiusDOUBLETerminalRuleCall_0_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getRadiusDOUBLETerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__RadiusAssignment_0_0"


    // $ANTLR start "rule__Point__MesurementAssignment_0_1"
    // InternalPatternDsl.g:3408:1: rule__Point__MesurementAssignment_0_1 : ( ruleDistanceMesurement ) ;
    public final void rule__Point__MesurementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3412:1: ( ( ruleDistanceMesurement ) )
            // InternalPatternDsl.g:3413:2: ( ruleDistanceMesurement )
            {
            // InternalPatternDsl.g:3413:2: ( ruleDistanceMesurement )
            // InternalPatternDsl.g:3414:3: ruleDistanceMesurement
            {
             before(grammarAccess.getPointAccess().getMesurementDistanceMesurementEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistanceMesurement();

            state._fsp--;

             after(grammarAccess.getPointAccess().getMesurementDistanceMesurementEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__MesurementAssignment_0_1"


    // $ANTLR start "rule__Point__CoordinatesAssignment_1"
    // InternalPatternDsl.g:3423:1: rule__Point__CoordinatesAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Point__CoordinatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3427:1: ( ( ruleCoordinate ) )
            // InternalPatternDsl.g:3428:2: ( ruleCoordinate )
            {
            // InternalPatternDsl.g:3428:2: ( ruleCoordinate )
            // InternalPatternDsl.g:3429:3: ruleCoordinate
            {
             before(grammarAccess.getPointAccess().getCoordinatesCoordinateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getPointAccess().getCoordinatesCoordinateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Point__CoordinatesAssignment_1"


    // $ANTLR start "rule__LatLong__LatAssignment_0"
    // InternalPatternDsl.g:3438:1: rule__LatLong__LatAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__LatLong__LatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3442:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3443:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3443:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3444:3: RULE_DOUBLE
            {
             before(grammarAccess.getLatLongAccess().getLatDOUBLETerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLatLongAccess().getLatDOUBLETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__LatAssignment_0"


    // $ANTLR start "rule__LatLong__LongAssignment_2"
    // InternalPatternDsl.g:3453:1: rule__LatLong__LongAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__LatLong__LongAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3457:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3458:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3458:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3459:3: RULE_DOUBLE
            {
             before(grammarAccess.getLatLongAccess().getLongDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getLatLongAccess().getLongDOUBLETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LatLong__LongAssignment_2"


    // $ANTLR start "rule__UTM__EAssignment_2"
    // InternalPatternDsl.g:3468:1: rule__UTM__EAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3472:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3473:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3473:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3474:3: RULE_DOUBLE
            {
             before(grammarAccess.getUTMAccess().getEDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getEDOUBLETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__EAssignment_2"


    // $ANTLR start "rule__UTM__NAssignment_4"
    // InternalPatternDsl.g:3483:1: rule__UTM__NAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3487:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3488:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3488:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3489:3: RULE_DOUBLE
            {
             before(grammarAccess.getUTMAccess().getNDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getNDOUBLETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__NAssignment_4"


    // $ANTLR start "rule__UTM__ZAssignment_6"
    // InternalPatternDsl.g:3498:1: rule__UTM__ZAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__ZAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3502:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3503:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3503:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3504:3: RULE_DOUBLE
            {
             before(grammarAccess.getUTMAccess().getZDOUBLETerminalRuleCall_6_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getZDOUBLETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__ZAssignment_6"


    // $ANTLR start "rule__UTM__HemiAssignment_8"
    // InternalPatternDsl.g:3513:1: rule__UTM__HemiAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__HemiAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3517:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3518:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3518:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3519:3: RULE_DOUBLE
            {
             before(grammarAccess.getUTMAccess().getHemiDOUBLETerminalRuleCall_8_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getUTMAccess().getHemiDOUBLETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UTM__HemiAssignment_8"


    // $ANTLR start "rule__Region__NameAssignment_1"
    // InternalPatternDsl.g:3528:1: rule__Region__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Region__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3532:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3533:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3533:2: ( RULE_ID )
            // InternalPatternDsl.g:3534:3: RULE_ID
            {
             before(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__NameAssignment_1"


    // $ANTLR start "rule__Region__SouthWestBoundaryAssignment_4"
    // InternalPatternDsl.g:3543:1: rule__Region__SouthWestBoundaryAssignment_4 : ( rulePoint ) ;
    public final void rule__Region__SouthWestBoundaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3547:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3548:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3548:2: ( rulePoint )
            // InternalPatternDsl.g:3549:3: rulePoint
            {
             before(grammarAccess.getRegionAccess().getSouthWestBoundaryPointParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getSouthWestBoundaryPointParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__SouthWestBoundaryAssignment_4"


    // $ANTLR start "rule__Region__NorthEastBoundaryAssignment_6"
    // InternalPatternDsl.g:3558:1: rule__Region__NorthEastBoundaryAssignment_6 : ( rulePoint ) ;
    public final void rule__Region__NorthEastBoundaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3562:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3563:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3563:2: ( rulePoint )
            // InternalPatternDsl.g:3564:3: rulePoint
            {
             before(grammarAccess.getRegionAccess().getNorthEastBoundaryPointParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getRegionAccess().getNorthEastBoundaryPointParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Region__NorthEastBoundaryAssignment_6"


    // $ANTLR start "rule__TermList__PropertyAssignment_1"
    // InternalPatternDsl.g:3573:1: rule__TermList__PropertyAssignment_1 : ( ruleWordListProperty ) ;
    public final void rule__TermList__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3577:1: ( ( ruleWordListProperty ) )
            // InternalPatternDsl.g:3578:2: ( ruleWordListProperty )
            {
            // InternalPatternDsl.g:3578:2: ( ruleWordListProperty )
            // InternalPatternDsl.g:3579:3: ruleWordListProperty
            {
             before(grammarAccess.getTermListAccess().getPropertyWordListPropertyEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWordListProperty();

            state._fsp--;

             after(grammarAccess.getTermListAccess().getPropertyWordListPropertyEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__PropertyAssignment_1"


    // $ANTLR start "rule__TermList__NameAssignment_2"
    // InternalPatternDsl.g:3588:1: rule__TermList__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TermList__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3592:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3593:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3593:2: ( RULE_ID )
            // InternalPatternDsl.g:3594:3: RULE_ID
            {
             before(grammarAccess.getTermListAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__NameAssignment_2"


    // $ANTLR start "rule__TermList__TermsAssignment_4_1"
    // InternalPatternDsl.g:3603:1: rule__TermList__TermsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TermList__TermsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3607:1: ( ( RULE_STRING ) )
            // InternalPatternDsl.g:3608:2: ( RULE_STRING )
            {
            // InternalPatternDsl.g:3608:2: ( RULE_STRING )
            // InternalPatternDsl.g:3609:3: RULE_STRING
            {
             before(grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__TermsAssignment_4_1"


    // $ANTLR start "rule__TermList__TermsAssignment_4_2_1"
    // InternalPatternDsl.g:3618:1: rule__TermList__TermsAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__TermList__TermsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3622:1: ( ( RULE_STRING ) )
            // InternalPatternDsl.g:3623:2: ( RULE_STRING )
            {
            // InternalPatternDsl.g:3623:2: ( RULE_STRING )
            // InternalPatternDsl.g:3624:3: RULE_STRING
            {
             before(grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermList__TermsAssignment_4_2_1"


    // $ANTLR start "rule__Term__NameAssignment"
    // InternalPatternDsl.g:3633:1: rule__Term__NameAssignment : ( RULE_ID ) ;
    public final void rule__Term__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3637:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3638:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3638:2: ( RULE_ID )
            // InternalPatternDsl.g:3639:3: RULE_ID
            {
             before(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__NameAssignment"


    // $ANTLR start "rule__Phrase__NameAssignment_1"
    // InternalPatternDsl.g:3648:1: rule__Phrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3652:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3653:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3653:2: ( RULE_ID )
            // InternalPatternDsl.g:3654:3: RULE_ID
            {
             before(grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__NameAssignment_1"


    // $ANTLR start "rule__Phrase__OrderedAssignment_2"
    // InternalPatternDsl.g:3663:1: rule__Phrase__OrderedAssignment_2 : ( ( 'ordered' ) ) ;
    public final void rule__Phrase__OrderedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3667:1: ( ( ( 'ordered' ) ) )
            // InternalPatternDsl.g:3668:2: ( ( 'ordered' ) )
            {
            // InternalPatternDsl.g:3668:2: ( ( 'ordered' ) )
            // InternalPatternDsl.g:3669:3: ( 'ordered' )
            {
             before(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 
            // InternalPatternDsl.g:3670:3: ( 'ordered' )
            // InternalPatternDsl.g:3671:4: 'ordered'
            {
             before(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 

            }

             after(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__OrderedAssignment_2"


    // $ANTLR start "rule__Phrase__ConceptsAssignment_5"
    // InternalPatternDsl.g:3682:1: rule__Phrase__ConceptsAssignment_5 : ( ruleConcept ) ;
    public final void rule__Phrase__ConceptsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3686:1: ( ( ruleConcept ) )
            // InternalPatternDsl.g:3687:2: ( ruleConcept )
            {
            // InternalPatternDsl.g:3687:2: ( ruleConcept )
            // InternalPatternDsl.g:3688:3: ruleConcept
            {
             before(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__ConceptsAssignment_5"


    // $ANTLR start "rule__Phrase__ConceptsAssignment_6_1"
    // InternalPatternDsl.g:3697:1: rule__Phrase__ConceptsAssignment_6_1 : ( ruleConcept ) ;
    public final void rule__Phrase__ConceptsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3701:1: ( ( ruleConcept ) )
            // InternalPatternDsl.g:3702:2: ( ruleConcept )
            {
            // InternalPatternDsl.g:3702:2: ( ruleConcept )
            // InternalPatternDsl.g:3703:3: ruleConcept
            {
             before(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__ConceptsAssignment_6_1"


    // $ANTLR start "rule__Phrase__OptionsAssignment_8_1"
    // InternalPatternDsl.g:3712:1: rule__Phrase__OptionsAssignment_8_1 : ( ruleOption ) ;
    public final void rule__Phrase__OptionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3716:1: ( ( ruleOption ) )
            // InternalPatternDsl.g:3717:2: ( ruleOption )
            {
            // InternalPatternDsl.g:3717:2: ( ruleOption )
            // InternalPatternDsl.g:3718:3: ruleOption
            {
             before(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__OptionsAssignment_8_1"


    // $ANTLR start "rule__Phrase__OptionsAssignment_8_2_1"
    // InternalPatternDsl.g:3727:1: rule__Phrase__OptionsAssignment_8_2_1 : ( ruleOption ) ;
    public final void rule__Phrase__OptionsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3731:1: ( ( ruleOption ) )
            // InternalPatternDsl.g:3732:2: ( ruleOption )
            {
            // InternalPatternDsl.g:3732:2: ( ruleOption )
            // InternalPatternDsl.g:3733:3: ruleOption
            {
             before(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__OptionsAssignment_8_2_1"


    // $ANTLR start "rule__GeoOption__KeyAssignment_0"
    // InternalPatternDsl.g:3742:1: rule__GeoOption__KeyAssignment_0 : ( ruleGeoOptionKey ) ;
    public final void rule__GeoOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3746:1: ( ( ruleGeoOptionKey ) )
            // InternalPatternDsl.g:3747:2: ( ruleGeoOptionKey )
            {
            // InternalPatternDsl.g:3747:2: ( ruleGeoOptionKey )
            // InternalPatternDsl.g:3748:3: ruleGeoOptionKey
            {
             before(grammarAccess.getGeoOptionAccess().getKeyGeoOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGeoOptionKey();

            state._fsp--;

             after(grammarAccess.getGeoOptionAccess().getKeyGeoOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__KeyAssignment_0"


    // $ANTLR start "rule__GeoOption__ValueAssignment_2"
    // InternalPatternDsl.g:3757:1: rule__GeoOption__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeoOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3761:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPatternDsl.g:3762:2: ( ( ruleQualifiedName ) )
            {
            // InternalPatternDsl.g:3762:2: ( ( ruleQualifiedName ) )
            // InternalPatternDsl.g:3763:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeoOptionAccess().getValueGeographicalElementCrossReference_2_0()); 
            // InternalPatternDsl.g:3764:3: ( ruleQualifiedName )
            // InternalPatternDsl.g:3765:4: ruleQualifiedName
            {
             before(grammarAccess.getGeoOptionAccess().getValueGeographicalElementQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeoOptionAccess().getValueGeographicalElementQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGeoOptionAccess().getValueGeographicalElementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeoOption__ValueAssignment_2"


    // $ANTLR start "rule__SourceOption__KeyAssignment_0"
    // InternalPatternDsl.g:3776:1: rule__SourceOption__KeyAssignment_0 : ( ruleSourceOptionKey ) ;
    public final void rule__SourceOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3780:1: ( ( ruleSourceOptionKey ) )
            // InternalPatternDsl.g:3781:2: ( ruleSourceOptionKey )
            {
            // InternalPatternDsl.g:3781:2: ( ruleSourceOptionKey )
            // InternalPatternDsl.g:3782:3: ruleSourceOptionKey
            {
             before(grammarAccess.getSourceOptionAccess().getKeySourceOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceOptionKey();

            state._fsp--;

             after(grammarAccess.getSourceOptionAccess().getKeySourceOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__KeyAssignment_0"


    // $ANTLR start "rule__SourceOption__ValueAssignment_2"
    // InternalPatternDsl.g:3791:1: rule__SourceOption__ValueAssignment_2 : ( ruleSource ) ;
    public final void rule__SourceOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3795:1: ( ( ruleSource ) )
            // InternalPatternDsl.g:3796:2: ( ruleSource )
            {
            // InternalPatternDsl.g:3796:2: ( ruleSource )
            // InternalPatternDsl.g:3797:3: ruleSource
            {
             before(grammarAccess.getSourceOptionAccess().getValueSourceEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSource();

            state._fsp--;

             after(grammarAccess.getSourceOptionAccess().getValueSourceEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceOption__ValueAssignment_2"


    // $ANTLR start "rule__LanguageOption__KeyAssignment_0"
    // InternalPatternDsl.g:3806:1: rule__LanguageOption__KeyAssignment_0 : ( ruleLanguageOptionKey ) ;
    public final void rule__LanguageOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3810:1: ( ( ruleLanguageOptionKey ) )
            // InternalPatternDsl.g:3811:2: ( ruleLanguageOptionKey )
            {
            // InternalPatternDsl.g:3811:2: ( ruleLanguageOptionKey )
            // InternalPatternDsl.g:3812:3: ruleLanguageOptionKey
            {
             before(grammarAccess.getLanguageOptionAccess().getKeyLanguageOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageOptionKey();

            state._fsp--;

             after(grammarAccess.getLanguageOptionAccess().getKeyLanguageOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__KeyAssignment_0"


    // $ANTLR start "rule__LanguageOption__ValueAssignment_2"
    // InternalPatternDsl.g:3821:1: rule__LanguageOption__ValueAssignment_2 : ( ruleLanguage ) ;
    public final void rule__LanguageOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3825:1: ( ( ruleLanguage ) )
            // InternalPatternDsl.g:3826:2: ( ruleLanguage )
            {
            // InternalPatternDsl.g:3826:2: ( ruleLanguage )
            // InternalPatternDsl.g:3827:3: ruleLanguage
            {
             before(grammarAccess.getLanguageOptionAccess().getValueLanguageEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageOptionAccess().getValueLanguageEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageOption__ValueAssignment_2"


    // $ANTLR start "rule__BooleanOption__KeyAssignment_0"
    // InternalPatternDsl.g:3836:1: rule__BooleanOption__KeyAssignment_0 : ( ruleBooleanOptionKey ) ;
    public final void rule__BooleanOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3840:1: ( ( ruleBooleanOptionKey ) )
            // InternalPatternDsl.g:3841:2: ( ruleBooleanOptionKey )
            {
            // InternalPatternDsl.g:3841:2: ( ruleBooleanOptionKey )
            // InternalPatternDsl.g:3842:3: ruleBooleanOptionKey
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOptionKey();

            state._fsp--;

             after(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__KeyAssignment_0"


    // $ANTLR start "rule__BooleanOption__ValueAssignment_2"
    // InternalPatternDsl.g:3851:1: rule__BooleanOption__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3855:1: ( ( RULE_BOOLEAN ) )
            // InternalPatternDsl.g:3856:2: ( RULE_BOOLEAN )
            {
            // InternalPatternDsl.g:3856:2: ( RULE_BOOLEAN )
            // InternalPatternDsl.g:3857:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__ValueAssignment_2"


    // $ANTLR start "rule__IntOption__KeyAssignment_0"
    // InternalPatternDsl.g:3866:1: rule__IntOption__KeyAssignment_0 : ( ruleIntOptionKey ) ;
    public final void rule__IntOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3870:1: ( ( ruleIntOptionKey ) )
            // InternalPatternDsl.g:3871:2: ( ruleIntOptionKey )
            {
            // InternalPatternDsl.g:3871:2: ( ruleIntOptionKey )
            // InternalPatternDsl.g:3872:3: ruleIntOptionKey
            {
             before(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntOptionKey();

            state._fsp--;

             after(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__KeyAssignment_0"


    // $ANTLR start "rule__IntOption__ValueAssignment_2"
    // InternalPatternDsl.g:3881:1: rule__IntOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3885:1: ( ( RULE_INT ) )
            // InternalPatternDsl.g:3886:2: ( RULE_INT )
            {
            // InternalPatternDsl.g:3886:2: ( RULE_INT )
            // InternalPatternDsl.g:3887:3: RULE_INT
            {
             before(grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000940900000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000940900000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});

}