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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'source'", "'language'", "'String'", "'Url'", "'Int'", "'LongInt'", "'Real'", "'Date'", "'Time'", "'Year'", "'Month'", "'Day'", "'Boolean'", "'Lat'", "'Long'", "'Percent'", "'Email'", "'Currency'", "'CreditCard'", "'IBAN'", "'ISBN'", "'ISSN'", "'Inet'", "'minretweet'", "'minfavorite'", "'inreplyto'", "'retweet'", "'favorite'", "'all'", "'any'", "'android'", "'ios'", "'web'", "'kms'", "'miles'", "'mts'", "'english'", "'spanish'", "'chinese'", "'import'", "'.*'", "'.'", "'place'", "'='", "'arround'", "','", "'UTM'", "'{'", "'}'", "'region'", "':'", "'list'", "'('", "')'", "'phrase'", "'ordered'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleTermKey"
    // InternalPatternDsl.g:428:1: entryRuleTermKey : ruleTermKey EOF ;
    public final void entryRuleTermKey() throws RecognitionException {
        try {
            // InternalPatternDsl.g:429:1: ( ruleTermKey EOF )
            // InternalPatternDsl.g:430:1: ruleTermKey EOF
            {
             before(grammarAccess.getTermKeyRule()); 
            pushFollow(FOLLOW_1);
            ruleTermKey();

            state._fsp--;

             after(grammarAccess.getTermKeyRule()); 
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
    // $ANTLR end "entryRuleTermKey"


    // $ANTLR start "ruleTermKey"
    // InternalPatternDsl.g:437:1: ruleTermKey : ( ( rule__TermKey__Group__0 ) ) ;
    public final void ruleTermKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:441:2: ( ( ( rule__TermKey__Group__0 ) ) )
            // InternalPatternDsl.g:442:2: ( ( rule__TermKey__Group__0 ) )
            {
            // InternalPatternDsl.g:442:2: ( ( rule__TermKey__Group__0 ) )
            // InternalPatternDsl.g:443:3: ( rule__TermKey__Group__0 )
            {
             before(grammarAccess.getTermKeyAccess().getGroup()); 
            // InternalPatternDsl.g:444:3: ( rule__TermKey__Group__0 )
            // InternalPatternDsl.g:444:4: rule__TermKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermKey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermKey"


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


    // $ANTLR start "ruleBasicType"
    // InternalPatternDsl.g:628:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:632:1: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalPatternDsl.g:633:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalPatternDsl.g:633:2: ( ( rule__BasicType__Alternatives ) )
            // InternalPatternDsl.g:634:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalPatternDsl.g:635:3: ( rule__BasicType__Alternatives )
            // InternalPatternDsl.g:635:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "ruleGeoOptionKey"
    // InternalPatternDsl.g:644:1: ruleGeoOptionKey : ( ( 'in' ) ) ;
    public final void ruleGeoOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:648:1: ( ( ( 'in' ) ) )
            // InternalPatternDsl.g:649:2: ( ( 'in' ) )
            {
            // InternalPatternDsl.g:649:2: ( ( 'in' ) )
            // InternalPatternDsl.g:650:3: ( 'in' )
            {
             before(grammarAccess.getGeoOptionKeyAccess().getInEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:651:3: ( 'in' )
            // InternalPatternDsl.g:651:4: 'in'
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
    // InternalPatternDsl.g:660:1: ruleSourceOptionKey : ( ( 'source' ) ) ;
    public final void ruleSourceOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:664:1: ( ( ( 'source' ) ) )
            // InternalPatternDsl.g:665:2: ( ( 'source' ) )
            {
            // InternalPatternDsl.g:665:2: ( ( 'source' ) )
            // InternalPatternDsl.g:666:3: ( 'source' )
            {
             before(grammarAccess.getSourceOptionKeyAccess().getSourceEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:667:3: ( 'source' )
            // InternalPatternDsl.g:667:4: 'source'
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
    // InternalPatternDsl.g:676:1: ruleLanguageOptionKey : ( ( 'language' ) ) ;
    public final void ruleLanguageOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:680:1: ( ( ( 'language' ) ) )
            // InternalPatternDsl.g:681:2: ( ( 'language' ) )
            {
            // InternalPatternDsl.g:681:2: ( ( 'language' ) )
            // InternalPatternDsl.g:682:3: ( 'language' )
            {
             before(grammarAccess.getLanguageOptionKeyAccess().getLangEnumLiteralDeclaration()); 
            // InternalPatternDsl.g:683:3: ( 'language' )
            // InternalPatternDsl.g:683:4: 'language'
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
    // InternalPatternDsl.g:692:1: ruleIntOptionKey : ( ( rule__IntOptionKey__Alternatives ) ) ;
    public final void ruleIntOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:696:1: ( ( ( rule__IntOptionKey__Alternatives ) ) )
            // InternalPatternDsl.g:697:2: ( ( rule__IntOptionKey__Alternatives ) )
            {
            // InternalPatternDsl.g:697:2: ( ( rule__IntOptionKey__Alternatives ) )
            // InternalPatternDsl.g:698:3: ( rule__IntOptionKey__Alternatives )
            {
             before(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 
            // InternalPatternDsl.g:699:3: ( rule__IntOptionKey__Alternatives )
            // InternalPatternDsl.g:699:4: rule__IntOptionKey__Alternatives
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
    // InternalPatternDsl.g:708:1: ruleBooleanOptionKey : ( ( rule__BooleanOptionKey__Alternatives ) ) ;
    public final void ruleBooleanOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:712:1: ( ( ( rule__BooleanOptionKey__Alternatives ) ) )
            // InternalPatternDsl.g:713:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            {
            // InternalPatternDsl.g:713:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            // InternalPatternDsl.g:714:3: ( rule__BooleanOptionKey__Alternatives )
            {
             before(grammarAccess.getBooleanOptionKeyAccess().getAlternatives()); 
            // InternalPatternDsl.g:715:3: ( rule__BooleanOptionKey__Alternatives )
            // InternalPatternDsl.g:715:4: rule__BooleanOptionKey__Alternatives
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
    // InternalPatternDsl.g:724:1: ruleWordListProperty : ( ( rule__WordListProperty__Alternatives ) ) ;
    public final void ruleWordListProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:728:1: ( ( ( rule__WordListProperty__Alternatives ) ) )
            // InternalPatternDsl.g:729:2: ( ( rule__WordListProperty__Alternatives ) )
            {
            // InternalPatternDsl.g:729:2: ( ( rule__WordListProperty__Alternatives ) )
            // InternalPatternDsl.g:730:3: ( rule__WordListProperty__Alternatives )
            {
             before(grammarAccess.getWordListPropertyAccess().getAlternatives()); 
            // InternalPatternDsl.g:731:3: ( rule__WordListProperty__Alternatives )
            // InternalPatternDsl.g:731:4: rule__WordListProperty__Alternatives
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
    // InternalPatternDsl.g:740:1: ruleSource : ( ( rule__Source__Alternatives ) ) ;
    public final void ruleSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:744:1: ( ( ( rule__Source__Alternatives ) ) )
            // InternalPatternDsl.g:745:2: ( ( rule__Source__Alternatives ) )
            {
            // InternalPatternDsl.g:745:2: ( ( rule__Source__Alternatives ) )
            // InternalPatternDsl.g:746:3: ( rule__Source__Alternatives )
            {
             before(grammarAccess.getSourceAccess().getAlternatives()); 
            // InternalPatternDsl.g:747:3: ( rule__Source__Alternatives )
            // InternalPatternDsl.g:747:4: rule__Source__Alternatives
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
    // InternalPatternDsl.g:756:1: ruleDistanceMesurement : ( ( rule__DistanceMesurement__Alternatives ) ) ;
    public final void ruleDistanceMesurement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:760:1: ( ( ( rule__DistanceMesurement__Alternatives ) ) )
            // InternalPatternDsl.g:761:2: ( ( rule__DistanceMesurement__Alternatives ) )
            {
            // InternalPatternDsl.g:761:2: ( ( rule__DistanceMesurement__Alternatives ) )
            // InternalPatternDsl.g:762:3: ( rule__DistanceMesurement__Alternatives )
            {
             before(grammarAccess.getDistanceMesurementAccess().getAlternatives()); 
            // InternalPatternDsl.g:763:3: ( rule__DistanceMesurement__Alternatives )
            // InternalPatternDsl.g:763:4: rule__DistanceMesurement__Alternatives
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
    // InternalPatternDsl.g:772:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:776:1: ( ( ( rule__Language__Alternatives ) ) )
            // InternalPatternDsl.g:777:2: ( ( rule__Language__Alternatives ) )
            {
            // InternalPatternDsl.g:777:2: ( ( rule__Language__Alternatives ) )
            // InternalPatternDsl.g:778:3: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // InternalPatternDsl.g:779:3: ( rule__Language__Alternatives )
            // InternalPatternDsl.g:779:4: rule__Language__Alternatives
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
    // InternalPatternDsl.g:787:1: rule__StreamingDescription__Alternatives : ( ( ruleImport ) | ( ruleGeographicalElement ) | ( rulePatternMatcherElement ) );
    public final void rule__StreamingDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:791:1: ( ( ruleImport ) | ( ruleGeographicalElement ) | ( rulePatternMatcherElement ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt1=1;
                }
                break;
            case 56:
            case 63:
                {
                alt1=2;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 65:
            case 68:
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
                    // InternalPatternDsl.g:792:2: ( ruleImport )
                    {
                    // InternalPatternDsl.g:792:2: ( ruleImport )
                    // InternalPatternDsl.g:793:3: ruleImport
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
                    // InternalPatternDsl.g:798:2: ( ruleGeographicalElement )
                    {
                    // InternalPatternDsl.g:798:2: ( ruleGeographicalElement )
                    // InternalPatternDsl.g:799:3: ruleGeographicalElement
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
                    // InternalPatternDsl.g:804:2: ( rulePatternMatcherElement )
                    {
                    // InternalPatternDsl.g:804:2: ( rulePatternMatcherElement )
                    // InternalPatternDsl.g:805:3: rulePatternMatcherElement
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
    // InternalPatternDsl.g:814:1: rule__GeographicalElement__Alternatives : ( ( rulePlace ) | ( ruleRegion ) );
    public final void rule__GeographicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:818:1: ( ( rulePlace ) | ( ruleRegion ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==63) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPatternDsl.g:819:2: ( rulePlace )
                    {
                    // InternalPatternDsl.g:819:2: ( rulePlace )
                    // InternalPatternDsl.g:820:3: rulePlace
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
                    // InternalPatternDsl.g:825:2: ( ruleRegion )
                    {
                    // InternalPatternDsl.g:825:2: ( ruleRegion )
                    // InternalPatternDsl.g:826:3: ruleRegion
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
    // InternalPatternDsl.g:835:1: rule__Coordinate__Alternatives : ( ( ruleLatLong ) | ( ruleUTM ) );
    public final void rule__Coordinate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:839:1: ( ( ruleLatLong ) | ( ruleUTM ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DOUBLE) ) {
                alt3=1;
            }
            else if ( (LA3_0==60) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPatternDsl.g:840:2: ( ruleLatLong )
                    {
                    // InternalPatternDsl.g:840:2: ( ruleLatLong )
                    // InternalPatternDsl.g:841:3: ruleLatLong
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
                    // InternalPatternDsl.g:846:2: ( ruleUTM )
                    {
                    // InternalPatternDsl.g:846:2: ( ruleUTM )
                    // InternalPatternDsl.g:847:3: ruleUTM
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
    // InternalPatternDsl.g:856:1: rule__PatternMatcherElement__Alternatives : ( ( rulePhrase ) | ( ruleConcept ) );
    public final void rule__PatternMatcherElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:860:1: ( ( rulePhrase ) | ( ruleConcept ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==68) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=16 && LA4_0<=36)||LA4_0==65) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPatternDsl.g:861:2: ( rulePhrase )
                    {
                    // InternalPatternDsl.g:861:2: ( rulePhrase )
                    // InternalPatternDsl.g:862:3: rulePhrase
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
                    // InternalPatternDsl.g:867:2: ( ruleConcept )
                    {
                    // InternalPatternDsl.g:867:2: ( ruleConcept )
                    // InternalPatternDsl.g:868:3: ruleConcept
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
    // InternalPatternDsl.g:877:1: rule__Concept__Alternatives : ( ( ruleTermList ) | ( ruleTermKey ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:881:1: ( ( ruleTermList ) | ( ruleTermKey ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=16 && LA5_0<=36)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPatternDsl.g:882:2: ( ruleTermList )
                    {
                    // InternalPatternDsl.g:882:2: ( ruleTermList )
                    // InternalPatternDsl.g:883:3: ruleTermList
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
                    // InternalPatternDsl.g:888:2: ( ruleTermKey )
                    {
                    // InternalPatternDsl.g:888:2: ( ruleTermKey )
                    // InternalPatternDsl.g:889:3: ruleTermKey
                    {
                     before(grammarAccess.getConceptAccess().getTermKeyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTermKey();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getTermKeyParserRuleCall_1()); 

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
    // InternalPatternDsl.g:898:1: rule__Option__Alternatives : ( ( ruleBooleanOption ) | ( ruleGeoOption ) | ( ruleIntOption ) | ( ruleLanguageOption ) | ( ruleSourceOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:902:1: ( ( ruleBooleanOption ) | ( ruleGeoOption ) | ( ruleIntOption ) | ( ruleLanguageOption ) | ( ruleSourceOption ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
            case 41:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 37:
            case 38:
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
                    // InternalPatternDsl.g:903:2: ( ruleBooleanOption )
                    {
                    // InternalPatternDsl.g:903:2: ( ruleBooleanOption )
                    // InternalPatternDsl.g:904:3: ruleBooleanOption
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
                    // InternalPatternDsl.g:909:2: ( ruleGeoOption )
                    {
                    // InternalPatternDsl.g:909:2: ( ruleGeoOption )
                    // InternalPatternDsl.g:910:3: ruleGeoOption
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
                    // InternalPatternDsl.g:915:2: ( ruleIntOption )
                    {
                    // InternalPatternDsl.g:915:2: ( ruleIntOption )
                    // InternalPatternDsl.g:916:3: ruleIntOption
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
                    // InternalPatternDsl.g:921:2: ( ruleLanguageOption )
                    {
                    // InternalPatternDsl.g:921:2: ( ruleLanguageOption )
                    // InternalPatternDsl.g:922:3: ruleLanguageOption
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
                    // InternalPatternDsl.g:927:2: ( ruleSourceOption )
                    {
                    // InternalPatternDsl.g:927:2: ( ruleSourceOption )
                    // InternalPatternDsl.g:928:3: ruleSourceOption
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


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalPatternDsl.g:937:1: rule__BasicType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:941:1: ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) )
            int alt7=21;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            case 28:
                {
                alt7=13;
                }
                break;
            case 29:
                {
                alt7=14;
                }
                break;
            case 30:
                {
                alt7=15;
                }
                break;
            case 31:
                {
                alt7=16;
                }
                break;
            case 32:
                {
                alt7=17;
                }
                break;
            case 33:
                {
                alt7=18;
                }
                break;
            case 34:
                {
                alt7=19;
                }
                break;
            case 35:
                {
                alt7=20;
                }
                break;
            case 36:
                {
                alt7=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPatternDsl.g:942:2: ( ( 'String' ) )
                    {
                    // InternalPatternDsl.g:942:2: ( ( 'String' ) )
                    // InternalPatternDsl.g:943:3: ( 'String' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:944:3: ( 'String' )
                    // InternalPatternDsl.g:944:4: 'String'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:948:2: ( ( 'Url' ) )
                    {
                    // InternalPatternDsl.g:948:2: ( ( 'Url' ) )
                    // InternalPatternDsl.g:949:3: ( 'Url' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:950:3: ( 'Url' )
                    // InternalPatternDsl.g:950:4: 'Url'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:954:2: ( ( 'Int' ) )
                    {
                    // InternalPatternDsl.g:954:2: ( ( 'Int' ) )
                    // InternalPatternDsl.g:955:3: ( 'Int' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:956:3: ( 'Int' )
                    // InternalPatternDsl.g:956:4: 'Int'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:960:2: ( ( 'LongInt' ) )
                    {
                    // InternalPatternDsl.g:960:2: ( ( 'LongInt' ) )
                    // InternalPatternDsl.g:961:3: ( 'LongInt' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 
                    // InternalPatternDsl.g:962:3: ( 'LongInt' )
                    // InternalPatternDsl.g:962:4: 'LongInt'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPatternDsl.g:966:2: ( ( 'Real' ) )
                    {
                    // InternalPatternDsl.g:966:2: ( ( 'Real' ) )
                    // InternalPatternDsl.g:967:3: ( 'Real' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 
                    // InternalPatternDsl.g:968:3: ( 'Real' )
                    // InternalPatternDsl.g:968:4: 'Real'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPatternDsl.g:972:2: ( ( 'Date' ) )
                    {
                    // InternalPatternDsl.g:972:2: ( ( 'Date' ) )
                    // InternalPatternDsl.g:973:3: ( 'Date' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 
                    // InternalPatternDsl.g:974:3: ( 'Date' )
                    // InternalPatternDsl.g:974:4: 'Date'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPatternDsl.g:978:2: ( ( 'Time' ) )
                    {
                    // InternalPatternDsl.g:978:2: ( ( 'Time' ) )
                    // InternalPatternDsl.g:979:3: ( 'Time' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 
                    // InternalPatternDsl.g:980:3: ( 'Time' )
                    // InternalPatternDsl.g:980:4: 'Time'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPatternDsl.g:984:2: ( ( 'Year' ) )
                    {
                    // InternalPatternDsl.g:984:2: ( ( 'Year' ) )
                    // InternalPatternDsl.g:985:3: ( 'Year' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    // InternalPatternDsl.g:986:3: ( 'Year' )
                    // InternalPatternDsl.g:986:4: 'Year'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPatternDsl.g:990:2: ( ( 'Month' ) )
                    {
                    // InternalPatternDsl.g:990:2: ( ( 'Month' ) )
                    // InternalPatternDsl.g:991:3: ( 'Month' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 
                    // InternalPatternDsl.g:992:3: ( 'Month' )
                    // InternalPatternDsl.g:992:4: 'Month'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPatternDsl.g:996:2: ( ( 'Day' ) )
                    {
                    // InternalPatternDsl.g:996:2: ( ( 'Day' ) )
                    // InternalPatternDsl.g:997:3: ( 'Day' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 
                    // InternalPatternDsl.g:998:3: ( 'Day' )
                    // InternalPatternDsl.g:998:4: 'Day'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalPatternDsl.g:1002:2: ( ( 'Boolean' ) )
                    {
                    // InternalPatternDsl.g:1002:2: ( ( 'Boolean' ) )
                    // InternalPatternDsl.g:1003:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 
                    // InternalPatternDsl.g:1004:3: ( 'Boolean' )
                    // InternalPatternDsl.g:1004:4: 'Boolean'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalPatternDsl.g:1008:2: ( ( 'Lat' ) )
                    {
                    // InternalPatternDsl.g:1008:2: ( ( 'Lat' ) )
                    // InternalPatternDsl.g:1009:3: ( 'Lat' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 
                    // InternalPatternDsl.g:1010:3: ( 'Lat' )
                    // InternalPatternDsl.g:1010:4: 'Lat'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalPatternDsl.g:1014:2: ( ( 'Long' ) )
                    {
                    // InternalPatternDsl.g:1014:2: ( ( 'Long' ) )
                    // InternalPatternDsl.g:1015:3: ( 'Long' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 
                    // InternalPatternDsl.g:1016:3: ( 'Long' )
                    // InternalPatternDsl.g:1016:4: 'Long'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalPatternDsl.g:1020:2: ( ( 'Percent' ) )
                    {
                    // InternalPatternDsl.g:1020:2: ( ( 'Percent' ) )
                    // InternalPatternDsl.g:1021:3: ( 'Percent' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 
                    // InternalPatternDsl.g:1022:3: ( 'Percent' )
                    // InternalPatternDsl.g:1022:4: 'Percent'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalPatternDsl.g:1026:2: ( ( 'Email' ) )
                    {
                    // InternalPatternDsl.g:1026:2: ( ( 'Email' ) )
                    // InternalPatternDsl.g:1027:3: ( 'Email' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 
                    // InternalPatternDsl.g:1028:3: ( 'Email' )
                    // InternalPatternDsl.g:1028:4: 'Email'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalPatternDsl.g:1032:2: ( ( 'Currency' ) )
                    {
                    // InternalPatternDsl.g:1032:2: ( ( 'Currency' ) )
                    // InternalPatternDsl.g:1033:3: ( 'Currency' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 
                    // InternalPatternDsl.g:1034:3: ( 'Currency' )
                    // InternalPatternDsl.g:1034:4: 'Currency'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalPatternDsl.g:1038:2: ( ( 'CreditCard' ) )
                    {
                    // InternalPatternDsl.g:1038:2: ( ( 'CreditCard' ) )
                    // InternalPatternDsl.g:1039:3: ( 'CreditCard' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 
                    // InternalPatternDsl.g:1040:3: ( 'CreditCard' )
                    // InternalPatternDsl.g:1040:4: 'CreditCard'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalPatternDsl.g:1044:2: ( ( 'IBAN' ) )
                    {
                    // InternalPatternDsl.g:1044:2: ( ( 'IBAN' ) )
                    // InternalPatternDsl.g:1045:3: ( 'IBAN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 
                    // InternalPatternDsl.g:1046:3: ( 'IBAN' )
                    // InternalPatternDsl.g:1046:4: 'IBAN'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalPatternDsl.g:1050:2: ( ( 'ISBN' ) )
                    {
                    // InternalPatternDsl.g:1050:2: ( ( 'ISBN' ) )
                    // InternalPatternDsl.g:1051:3: ( 'ISBN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 
                    // InternalPatternDsl.g:1052:3: ( 'ISBN' )
                    // InternalPatternDsl.g:1052:4: 'ISBN'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalPatternDsl.g:1056:2: ( ( 'ISSN' ) )
                    {
                    // InternalPatternDsl.g:1056:2: ( ( 'ISSN' ) )
                    // InternalPatternDsl.g:1057:3: ( 'ISSN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 
                    // InternalPatternDsl.g:1058:3: ( 'ISSN' )
                    // InternalPatternDsl.g:1058:4: 'ISSN'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalPatternDsl.g:1062:2: ( ( 'Inet' ) )
                    {
                    // InternalPatternDsl.g:1062:2: ( ( 'Inet' ) )
                    // InternalPatternDsl.g:1063:3: ( 'Inet' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20()); 
                    // InternalPatternDsl.g:1064:3: ( 'Inet' )
                    // InternalPatternDsl.g:1064:4: 'Inet'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20()); 

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__IntOptionKey__Alternatives"
    // InternalPatternDsl.g:1072:1: rule__IntOptionKey__Alternatives : ( ( ( 'minretweet' ) ) | ( ( 'minfavorite' ) ) );
    public final void rule__IntOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1076:1: ( ( ( 'minretweet' ) ) | ( ( 'minfavorite' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPatternDsl.g:1077:2: ( ( 'minretweet' ) )
                    {
                    // InternalPatternDsl.g:1077:2: ( ( 'minretweet' ) )
                    // InternalPatternDsl.g:1078:3: ( 'minretweet' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1079:3: ( 'minretweet' )
                    // InternalPatternDsl.g:1079:4: 'minretweet'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1083:2: ( ( 'minfavorite' ) )
                    {
                    // InternalPatternDsl.g:1083:2: ( ( 'minfavorite' ) )
                    // InternalPatternDsl.g:1084:3: ( 'minfavorite' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getSourceEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1085:3: ( 'minfavorite' )
                    // InternalPatternDsl.g:1085:4: 'minfavorite'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalPatternDsl.g:1093:1: rule__BooleanOptionKey__Alternatives : ( ( ( 'inreplyto' ) ) | ( ( 'retweet' ) ) | ( ( 'favorite' ) ) );
    public final void rule__BooleanOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1097:1: ( ( ( 'inreplyto' ) ) | ( ( 'retweet' ) ) | ( ( 'favorite' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPatternDsl.g:1098:2: ( ( 'inreplyto' ) )
                    {
                    // InternalPatternDsl.g:1098:2: ( ( 'inreplyto' ) )
                    // InternalPatternDsl.g:1099:3: ( 'inreplyto' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1100:3: ( 'inreplyto' )
                    // InternalPatternDsl.g:1100:4: 'inreplyto'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1104:2: ( ( 'retweet' ) )
                    {
                    // InternalPatternDsl.g:1104:2: ( ( 'retweet' ) )
                    // InternalPatternDsl.g:1105:3: ( 'retweet' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1106:3: ( 'retweet' )
                    // InternalPatternDsl.g:1106:4: 'retweet'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1110:2: ( ( 'favorite' ) )
                    {
                    // InternalPatternDsl.g:1110:2: ( ( 'favorite' ) )
                    // InternalPatternDsl.g:1111:3: ( 'favorite' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getFavoriteEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1112:3: ( 'favorite' )
                    // InternalPatternDsl.g:1112:4: 'favorite'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalPatternDsl.g:1120:1: rule__WordListProperty__Alternatives : ( ( ( 'all' ) ) | ( ( 'any' ) ) );
    public final void rule__WordListProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1124:1: ( ( ( 'all' ) ) | ( ( 'any' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==42) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPatternDsl.g:1125:2: ( ( 'all' ) )
                    {
                    // InternalPatternDsl.g:1125:2: ( ( 'all' ) )
                    // InternalPatternDsl.g:1126:3: ( 'all' )
                    {
                     before(grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1127:3: ( 'all' )
                    // InternalPatternDsl.g:1127:4: 'all'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1131:2: ( ( 'any' ) )
                    {
                    // InternalPatternDsl.g:1131:2: ( ( 'any' ) )
                    // InternalPatternDsl.g:1132:3: ( 'any' )
                    {
                     before(grammarAccess.getWordListPropertyAccess().getAnyEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1133:3: ( 'any' )
                    // InternalPatternDsl.g:1133:4: 'any'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalPatternDsl.g:1141:1: rule__Source__Alternatives : ( ( ( 'android' ) ) | ( ( 'ios' ) ) | ( ( 'web' ) ) | ( ( 'all' ) ) );
    public final void rule__Source__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1145:1: ( ( ( 'android' ) ) | ( ( 'ios' ) ) | ( ( 'web' ) ) | ( ( 'all' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt11=1;
                }
                break;
            case 45:
                {
                alt11=2;
                }
                break;
            case 46:
                {
                alt11=3;
                }
                break;
            case 42:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPatternDsl.g:1146:2: ( ( 'android' ) )
                    {
                    // InternalPatternDsl.g:1146:2: ( ( 'android' ) )
                    // InternalPatternDsl.g:1147:3: ( 'android' )
                    {
                     before(grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1148:3: ( 'android' )
                    // InternalPatternDsl.g:1148:4: 'android'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1152:2: ( ( 'ios' ) )
                    {
                    // InternalPatternDsl.g:1152:2: ( ( 'ios' ) )
                    // InternalPatternDsl.g:1153:3: ( 'ios' )
                    {
                     before(grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1154:3: ( 'ios' )
                    // InternalPatternDsl.g:1154:4: 'ios'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1158:2: ( ( 'web' ) )
                    {
                    // InternalPatternDsl.g:1158:2: ( ( 'web' ) )
                    // InternalPatternDsl.g:1159:3: ( 'web' )
                    {
                     before(grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1160:3: ( 'web' )
                    // InternalPatternDsl.g:1160:4: 'web'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:1164:2: ( ( 'all' ) )
                    {
                    // InternalPatternDsl.g:1164:2: ( ( 'all' ) )
                    // InternalPatternDsl.g:1165:3: ( 'all' )
                    {
                     before(grammarAccess.getSourceAccess().getAllEnumLiteralDeclaration_3()); 
                    // InternalPatternDsl.g:1166:3: ( 'all' )
                    // InternalPatternDsl.g:1166:4: 'all'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalPatternDsl.g:1174:1: rule__DistanceMesurement__Alternatives : ( ( ( 'kms' ) ) | ( ( 'miles' ) ) | ( ( 'mts' ) ) );
    public final void rule__DistanceMesurement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1178:1: ( ( ( 'kms' ) ) | ( ( 'miles' ) ) | ( ( 'mts' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt12=1;
                }
                break;
            case 48:
                {
                alt12=2;
                }
                break;
            case 49:
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
                    // InternalPatternDsl.g:1179:2: ( ( 'kms' ) )
                    {
                    // InternalPatternDsl.g:1179:2: ( ( 'kms' ) )
                    // InternalPatternDsl.g:1180:3: ( 'kms' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1181:3: ( 'kms' )
                    // InternalPatternDsl.g:1181:4: 'kms'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1185:2: ( ( 'miles' ) )
                    {
                    // InternalPatternDsl.g:1185:2: ( ( 'miles' ) )
                    // InternalPatternDsl.g:1186:3: ( 'miles' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1187:3: ( 'miles' )
                    // InternalPatternDsl.g:1187:4: 'miles'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1191:2: ( ( 'mts' ) )
                    {
                    // InternalPatternDsl.g:1191:2: ( ( 'mts' ) )
                    // InternalPatternDsl.g:1192:3: ( 'mts' )
                    {
                     before(grammarAccess.getDistanceMesurementAccess().getMtsEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1193:3: ( 'mts' )
                    // InternalPatternDsl.g:1193:4: 'mts'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalPatternDsl.g:1201:1: rule__Language__Alternatives : ( ( ( 'english' ) ) | ( ( 'spanish' ) ) | ( ( 'chinese' ) ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1205:1: ( ( ( 'english' ) ) | ( ( 'spanish' ) ) | ( ( 'chinese' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt13=1;
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 52:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPatternDsl.g:1206:2: ( ( 'english' ) )
                    {
                    // InternalPatternDsl.g:1206:2: ( ( 'english' ) )
                    // InternalPatternDsl.g:1207:3: ( 'english' )
                    {
                     before(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0()); 
                    // InternalPatternDsl.g:1208:3: ( 'english' )
                    // InternalPatternDsl.g:1208:4: 'english'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1212:2: ( ( 'spanish' ) )
                    {
                    // InternalPatternDsl.g:1212:2: ( ( 'spanish' ) )
                    // InternalPatternDsl.g:1213:3: ( 'spanish' )
                    {
                     before(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1()); 
                    // InternalPatternDsl.g:1214:3: ( 'spanish' )
                    // InternalPatternDsl.g:1214:4: 'spanish'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1218:2: ( ( 'chinese' ) )
                    {
                    // InternalPatternDsl.g:1218:2: ( ( 'chinese' ) )
                    // InternalPatternDsl.g:1219:3: ( 'chinese' )
                    {
                     before(grammarAccess.getLanguageAccess().getZhEnumLiteralDeclaration_2()); 
                    // InternalPatternDsl.g:1220:3: ( 'chinese' )
                    // InternalPatternDsl.g:1220:4: 'chinese'
                    {
                    match(input,52,FOLLOW_2); 

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
    // InternalPatternDsl.g:1228:1: rule__StreamingModel__Group__0 : rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1 ;
    public final void rule__StreamingModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1232:1: ( rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1 )
            // InternalPatternDsl.g:1233:2: rule__StreamingModel__Group__0__Impl rule__StreamingModel__Group__1
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
    // InternalPatternDsl.g:1240:1: rule__StreamingModel__Group__0__Impl : ( ( rule__StreamingModel__DescriptionsAssignment_0 ) ) ;
    public final void rule__StreamingModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1244:1: ( ( ( rule__StreamingModel__DescriptionsAssignment_0 ) ) )
            // InternalPatternDsl.g:1245:1: ( ( rule__StreamingModel__DescriptionsAssignment_0 ) )
            {
            // InternalPatternDsl.g:1245:1: ( ( rule__StreamingModel__DescriptionsAssignment_0 ) )
            // InternalPatternDsl.g:1246:2: ( rule__StreamingModel__DescriptionsAssignment_0 )
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_0()); 
            // InternalPatternDsl.g:1247:2: ( rule__StreamingModel__DescriptionsAssignment_0 )
            // InternalPatternDsl.g:1247:3: rule__StreamingModel__DescriptionsAssignment_0
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
    // InternalPatternDsl.g:1255:1: rule__StreamingModel__Group__1 : rule__StreamingModel__Group__1__Impl ;
    public final void rule__StreamingModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1259:1: ( rule__StreamingModel__Group__1__Impl )
            // InternalPatternDsl.g:1260:2: rule__StreamingModel__Group__1__Impl
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
    // InternalPatternDsl.g:1266:1: rule__StreamingModel__Group__1__Impl : ( ( rule__StreamingModel__DescriptionsAssignment_1 )* ) ;
    public final void rule__StreamingModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1270:1: ( ( ( rule__StreamingModel__DescriptionsAssignment_1 )* ) )
            // InternalPatternDsl.g:1271:1: ( ( rule__StreamingModel__DescriptionsAssignment_1 )* )
            {
            // InternalPatternDsl.g:1271:1: ( ( rule__StreamingModel__DescriptionsAssignment_1 )* )
            // InternalPatternDsl.g:1272:2: ( rule__StreamingModel__DescriptionsAssignment_1 )*
            {
             before(grammarAccess.getStreamingModelAccess().getDescriptionsAssignment_1()); 
            // InternalPatternDsl.g:1273:2: ( rule__StreamingModel__DescriptionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=36)||LA14_0==53||LA14_0==56||LA14_0==63||LA14_0==65||LA14_0==68) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPatternDsl.g:1273:3: rule__StreamingModel__DescriptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StreamingModel__DescriptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalPatternDsl.g:1282:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1286:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalPatternDsl.g:1287:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalPatternDsl.g:1294:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1298:1: ( ( 'import' ) )
            // InternalPatternDsl.g:1299:1: ( 'import' )
            {
            // InternalPatternDsl.g:1299:1: ( 'import' )
            // InternalPatternDsl.g:1300:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPatternDsl.g:1309:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1313:1: ( rule__Import__Group__1__Impl )
            // InternalPatternDsl.g:1314:2: rule__Import__Group__1__Impl
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
    // InternalPatternDsl.g:1320:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1324:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalPatternDsl.g:1325:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalPatternDsl.g:1325:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalPatternDsl.g:1326:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalPatternDsl.g:1327:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalPatternDsl.g:1327:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalPatternDsl.g:1336:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1340:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalPatternDsl.g:1341:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalPatternDsl.g:1348:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1352:1: ( ( ruleQualifiedName ) )
            // InternalPatternDsl.g:1353:1: ( ruleQualifiedName )
            {
            // InternalPatternDsl.g:1353:1: ( ruleQualifiedName )
            // InternalPatternDsl.g:1354:2: ruleQualifiedName
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
    // InternalPatternDsl.g:1363:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1367:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalPatternDsl.g:1368:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalPatternDsl.g:1374:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1378:1: ( ( ( '.*' )? ) )
            // InternalPatternDsl.g:1379:1: ( ( '.*' )? )
            {
            // InternalPatternDsl.g:1379:1: ( ( '.*' )? )
            // InternalPatternDsl.g:1380:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalPatternDsl.g:1381:2: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPatternDsl.g:1381:3: '.*'
                    {
                    match(input,54,FOLLOW_2); 

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
    // InternalPatternDsl.g:1390:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1394:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPatternDsl.g:1395:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalPatternDsl.g:1402:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1406:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:1407:1: ( RULE_ID )
            {
            // InternalPatternDsl.g:1407:1: ( RULE_ID )
            // InternalPatternDsl.g:1408:2: RULE_ID
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
    // InternalPatternDsl.g:1417:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1421:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPatternDsl.g:1422:2: rule__QualifiedName__Group__1__Impl
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
    // InternalPatternDsl.g:1428:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1432:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPatternDsl.g:1433:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPatternDsl.g:1433:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPatternDsl.g:1434:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalPatternDsl.g:1435:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPatternDsl.g:1435:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalPatternDsl.g:1444:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1448:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPatternDsl.g:1449:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalPatternDsl.g:1456:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1460:1: ( ( '.' ) )
            // InternalPatternDsl.g:1461:1: ( '.' )
            {
            // InternalPatternDsl.g:1461:1: ( '.' )
            // InternalPatternDsl.g:1462:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalPatternDsl.g:1471:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1475:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPatternDsl.g:1476:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalPatternDsl.g:1482:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1486:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:1487:1: ( RULE_ID )
            {
            // InternalPatternDsl.g:1487:1: ( RULE_ID )
            // InternalPatternDsl.g:1488:2: RULE_ID
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
    // InternalPatternDsl.g:1498:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1502:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPatternDsl.g:1503:2: rule__Place__Group__0__Impl rule__Place__Group__1
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
    // InternalPatternDsl.g:1510:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1514:1: ( ( 'place' ) )
            // InternalPatternDsl.g:1515:1: ( 'place' )
            {
            // InternalPatternDsl.g:1515:1: ( 'place' )
            // InternalPatternDsl.g:1516:2: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalPatternDsl.g:1525:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1529:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPatternDsl.g:1530:2: rule__Place__Group__1__Impl rule__Place__Group__2
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
    // InternalPatternDsl.g:1537:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1541:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:1542:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:1542:1: ( ( rule__Place__NameAssignment_1 ) )
            // InternalPatternDsl.g:1543:2: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:1544:2: ( rule__Place__NameAssignment_1 )
            // InternalPatternDsl.g:1544:3: rule__Place__NameAssignment_1
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
    // InternalPatternDsl.g:1552:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1556:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPatternDsl.g:1557:2: rule__Place__Group__2__Impl rule__Place__Group__3
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
    // InternalPatternDsl.g:1564:1: rule__Place__Group__2__Impl : ( '=' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1568:1: ( ( '=' ) )
            // InternalPatternDsl.g:1569:1: ( '=' )
            {
            // InternalPatternDsl.g:1569:1: ( '=' )
            // InternalPatternDsl.g:1570:2: '='
            {
             before(grammarAccess.getPlaceAccess().getEqualsSignKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:1579:1: rule__Place__Group__3 : rule__Place__Group__3__Impl ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1583:1: ( rule__Place__Group__3__Impl )
            // InternalPatternDsl.g:1584:2: rule__Place__Group__3__Impl
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
    // InternalPatternDsl.g:1590:1: rule__Place__Group__3__Impl : ( ( rule__Place__PointAssignment_3 ) ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1594:1: ( ( ( rule__Place__PointAssignment_3 ) ) )
            // InternalPatternDsl.g:1595:1: ( ( rule__Place__PointAssignment_3 ) )
            {
            // InternalPatternDsl.g:1595:1: ( ( rule__Place__PointAssignment_3 ) )
            // InternalPatternDsl.g:1596:2: ( rule__Place__PointAssignment_3 )
            {
             before(grammarAccess.getPlaceAccess().getPointAssignment_3()); 
            // InternalPatternDsl.g:1597:2: ( rule__Place__PointAssignment_3 )
            // InternalPatternDsl.g:1597:3: rule__Place__PointAssignment_3
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
    // InternalPatternDsl.g:1606:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1610:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalPatternDsl.g:1611:2: rule__Point__Group__0__Impl rule__Point__Group__1
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
    // InternalPatternDsl.g:1618:1: rule__Point__Group__0__Impl : ( ( rule__Point__Group_0__0 )? ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1622:1: ( ( ( rule__Point__Group_0__0 )? ) )
            // InternalPatternDsl.g:1623:1: ( ( rule__Point__Group_0__0 )? )
            {
            // InternalPatternDsl.g:1623:1: ( ( rule__Point__Group_0__0 )? )
            // InternalPatternDsl.g:1624:2: ( rule__Point__Group_0__0 )?
            {
             before(grammarAccess.getPointAccess().getGroup_0()); 
            // InternalPatternDsl.g:1625:2: ( rule__Point__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOUBLE) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=47 && LA17_1<=49)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalPatternDsl.g:1625:3: rule__Point__Group_0__0
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
    // InternalPatternDsl.g:1633:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1637:1: ( rule__Point__Group__1__Impl )
            // InternalPatternDsl.g:1638:2: rule__Point__Group__1__Impl
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
    // InternalPatternDsl.g:1644:1: rule__Point__Group__1__Impl : ( ( rule__Point__CoordinatesAssignment_1 ) ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1648:1: ( ( ( rule__Point__CoordinatesAssignment_1 ) ) )
            // InternalPatternDsl.g:1649:1: ( ( rule__Point__CoordinatesAssignment_1 ) )
            {
            // InternalPatternDsl.g:1649:1: ( ( rule__Point__CoordinatesAssignment_1 ) )
            // InternalPatternDsl.g:1650:2: ( rule__Point__CoordinatesAssignment_1 )
            {
             before(grammarAccess.getPointAccess().getCoordinatesAssignment_1()); 
            // InternalPatternDsl.g:1651:2: ( rule__Point__CoordinatesAssignment_1 )
            // InternalPatternDsl.g:1651:3: rule__Point__CoordinatesAssignment_1
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
    // InternalPatternDsl.g:1660:1: rule__Point__Group_0__0 : rule__Point__Group_0__0__Impl rule__Point__Group_0__1 ;
    public final void rule__Point__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1664:1: ( rule__Point__Group_0__0__Impl rule__Point__Group_0__1 )
            // InternalPatternDsl.g:1665:2: rule__Point__Group_0__0__Impl rule__Point__Group_0__1
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
    // InternalPatternDsl.g:1672:1: rule__Point__Group_0__0__Impl : ( ( rule__Point__RadiusAssignment_0_0 ) ) ;
    public final void rule__Point__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1676:1: ( ( ( rule__Point__RadiusAssignment_0_0 ) ) )
            // InternalPatternDsl.g:1677:1: ( ( rule__Point__RadiusAssignment_0_0 ) )
            {
            // InternalPatternDsl.g:1677:1: ( ( rule__Point__RadiusAssignment_0_0 ) )
            // InternalPatternDsl.g:1678:2: ( rule__Point__RadiusAssignment_0_0 )
            {
             before(grammarAccess.getPointAccess().getRadiusAssignment_0_0()); 
            // InternalPatternDsl.g:1679:2: ( rule__Point__RadiusAssignment_0_0 )
            // InternalPatternDsl.g:1679:3: rule__Point__RadiusAssignment_0_0
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
    // InternalPatternDsl.g:1687:1: rule__Point__Group_0__1 : rule__Point__Group_0__1__Impl rule__Point__Group_0__2 ;
    public final void rule__Point__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1691:1: ( rule__Point__Group_0__1__Impl rule__Point__Group_0__2 )
            // InternalPatternDsl.g:1692:2: rule__Point__Group_0__1__Impl rule__Point__Group_0__2
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
    // InternalPatternDsl.g:1699:1: rule__Point__Group_0__1__Impl : ( ( rule__Point__MesurementAssignment_0_1 ) ) ;
    public final void rule__Point__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1703:1: ( ( ( rule__Point__MesurementAssignment_0_1 ) ) )
            // InternalPatternDsl.g:1704:1: ( ( rule__Point__MesurementAssignment_0_1 ) )
            {
            // InternalPatternDsl.g:1704:1: ( ( rule__Point__MesurementAssignment_0_1 ) )
            // InternalPatternDsl.g:1705:2: ( rule__Point__MesurementAssignment_0_1 )
            {
             before(grammarAccess.getPointAccess().getMesurementAssignment_0_1()); 
            // InternalPatternDsl.g:1706:2: ( rule__Point__MesurementAssignment_0_1 )
            // InternalPatternDsl.g:1706:3: rule__Point__MesurementAssignment_0_1
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
    // InternalPatternDsl.g:1714:1: rule__Point__Group_0__2 : rule__Point__Group_0__2__Impl ;
    public final void rule__Point__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1718:1: ( rule__Point__Group_0__2__Impl )
            // InternalPatternDsl.g:1719:2: rule__Point__Group_0__2__Impl
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
    // InternalPatternDsl.g:1725:1: rule__Point__Group_0__2__Impl : ( 'arround' ) ;
    public final void rule__Point__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1729:1: ( ( 'arround' ) )
            // InternalPatternDsl.g:1730:1: ( 'arround' )
            {
            // InternalPatternDsl.g:1730:1: ( 'arround' )
            // InternalPatternDsl.g:1731:2: 'arround'
            {
             before(grammarAccess.getPointAccess().getArroundKeyword_0_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalPatternDsl.g:1741:1: rule__LatLong__Group__0 : rule__LatLong__Group__0__Impl rule__LatLong__Group__1 ;
    public final void rule__LatLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1745:1: ( rule__LatLong__Group__0__Impl rule__LatLong__Group__1 )
            // InternalPatternDsl.g:1746:2: rule__LatLong__Group__0__Impl rule__LatLong__Group__1
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
    // InternalPatternDsl.g:1753:1: rule__LatLong__Group__0__Impl : ( ( rule__LatLong__LatAssignment_0 ) ) ;
    public final void rule__LatLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1757:1: ( ( ( rule__LatLong__LatAssignment_0 ) ) )
            // InternalPatternDsl.g:1758:1: ( ( rule__LatLong__LatAssignment_0 ) )
            {
            // InternalPatternDsl.g:1758:1: ( ( rule__LatLong__LatAssignment_0 ) )
            // InternalPatternDsl.g:1759:2: ( rule__LatLong__LatAssignment_0 )
            {
             before(grammarAccess.getLatLongAccess().getLatAssignment_0()); 
            // InternalPatternDsl.g:1760:2: ( rule__LatLong__LatAssignment_0 )
            // InternalPatternDsl.g:1760:3: rule__LatLong__LatAssignment_0
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
    // InternalPatternDsl.g:1768:1: rule__LatLong__Group__1 : rule__LatLong__Group__1__Impl rule__LatLong__Group__2 ;
    public final void rule__LatLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1772:1: ( rule__LatLong__Group__1__Impl rule__LatLong__Group__2 )
            // InternalPatternDsl.g:1773:2: rule__LatLong__Group__1__Impl rule__LatLong__Group__2
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
    // InternalPatternDsl.g:1780:1: rule__LatLong__Group__1__Impl : ( ',' ) ;
    public final void rule__LatLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1784:1: ( ( ',' ) )
            // InternalPatternDsl.g:1785:1: ( ',' )
            {
            // InternalPatternDsl.g:1785:1: ( ',' )
            // InternalPatternDsl.g:1786:2: ','
            {
             before(grammarAccess.getLatLongAccess().getCommaKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPatternDsl.g:1795:1: rule__LatLong__Group__2 : rule__LatLong__Group__2__Impl ;
    public final void rule__LatLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1799:1: ( rule__LatLong__Group__2__Impl )
            // InternalPatternDsl.g:1800:2: rule__LatLong__Group__2__Impl
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
    // InternalPatternDsl.g:1806:1: rule__LatLong__Group__2__Impl : ( ( rule__LatLong__LongAssignment_2 ) ) ;
    public final void rule__LatLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1810:1: ( ( ( rule__LatLong__LongAssignment_2 ) ) )
            // InternalPatternDsl.g:1811:1: ( ( rule__LatLong__LongAssignment_2 ) )
            {
            // InternalPatternDsl.g:1811:1: ( ( rule__LatLong__LongAssignment_2 ) )
            // InternalPatternDsl.g:1812:2: ( rule__LatLong__LongAssignment_2 )
            {
             before(grammarAccess.getLatLongAccess().getLongAssignment_2()); 
            // InternalPatternDsl.g:1813:2: ( rule__LatLong__LongAssignment_2 )
            // InternalPatternDsl.g:1813:3: rule__LatLong__LongAssignment_2
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
    // InternalPatternDsl.g:1822:1: rule__UTM__Group__0 : rule__UTM__Group__0__Impl rule__UTM__Group__1 ;
    public final void rule__UTM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1826:1: ( rule__UTM__Group__0__Impl rule__UTM__Group__1 )
            // InternalPatternDsl.g:1827:2: rule__UTM__Group__0__Impl rule__UTM__Group__1
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
    // InternalPatternDsl.g:1834:1: rule__UTM__Group__0__Impl : ( 'UTM' ) ;
    public final void rule__UTM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1838:1: ( ( 'UTM' ) )
            // InternalPatternDsl.g:1839:1: ( 'UTM' )
            {
            // InternalPatternDsl.g:1839:1: ( 'UTM' )
            // InternalPatternDsl.g:1840:2: 'UTM'
            {
             before(grammarAccess.getUTMAccess().getUTMKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalPatternDsl.g:1849:1: rule__UTM__Group__1 : rule__UTM__Group__1__Impl rule__UTM__Group__2 ;
    public final void rule__UTM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1853:1: ( rule__UTM__Group__1__Impl rule__UTM__Group__2 )
            // InternalPatternDsl.g:1854:2: rule__UTM__Group__1__Impl rule__UTM__Group__2
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
    // InternalPatternDsl.g:1861:1: rule__UTM__Group__1__Impl : ( '{' ) ;
    public final void rule__UTM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1865:1: ( ( '{' ) )
            // InternalPatternDsl.g:1866:1: ( '{' )
            {
            // InternalPatternDsl.g:1866:1: ( '{' )
            // InternalPatternDsl.g:1867:2: '{'
            {
             before(grammarAccess.getUTMAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalPatternDsl.g:1876:1: rule__UTM__Group__2 : rule__UTM__Group__2__Impl rule__UTM__Group__3 ;
    public final void rule__UTM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1880:1: ( rule__UTM__Group__2__Impl rule__UTM__Group__3 )
            // InternalPatternDsl.g:1881:2: rule__UTM__Group__2__Impl rule__UTM__Group__3
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
    // InternalPatternDsl.g:1888:1: rule__UTM__Group__2__Impl : ( ( rule__UTM__EAssignment_2 ) ) ;
    public final void rule__UTM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1892:1: ( ( ( rule__UTM__EAssignment_2 ) ) )
            // InternalPatternDsl.g:1893:1: ( ( rule__UTM__EAssignment_2 ) )
            {
            // InternalPatternDsl.g:1893:1: ( ( rule__UTM__EAssignment_2 ) )
            // InternalPatternDsl.g:1894:2: ( rule__UTM__EAssignment_2 )
            {
             before(grammarAccess.getUTMAccess().getEAssignment_2()); 
            // InternalPatternDsl.g:1895:2: ( rule__UTM__EAssignment_2 )
            // InternalPatternDsl.g:1895:3: rule__UTM__EAssignment_2
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
    // InternalPatternDsl.g:1903:1: rule__UTM__Group__3 : rule__UTM__Group__3__Impl rule__UTM__Group__4 ;
    public final void rule__UTM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1907:1: ( rule__UTM__Group__3__Impl rule__UTM__Group__4 )
            // InternalPatternDsl.g:1908:2: rule__UTM__Group__3__Impl rule__UTM__Group__4
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
    // InternalPatternDsl.g:1915:1: rule__UTM__Group__3__Impl : ( ',' ) ;
    public final void rule__UTM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1919:1: ( ( ',' ) )
            // InternalPatternDsl.g:1920:1: ( ',' )
            {
            // InternalPatternDsl.g:1920:1: ( ',' )
            // InternalPatternDsl.g:1921:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_3()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPatternDsl.g:1930:1: rule__UTM__Group__4 : rule__UTM__Group__4__Impl rule__UTM__Group__5 ;
    public final void rule__UTM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1934:1: ( rule__UTM__Group__4__Impl rule__UTM__Group__5 )
            // InternalPatternDsl.g:1935:2: rule__UTM__Group__4__Impl rule__UTM__Group__5
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
    // InternalPatternDsl.g:1942:1: rule__UTM__Group__4__Impl : ( ( rule__UTM__NAssignment_4 ) ) ;
    public final void rule__UTM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1946:1: ( ( ( rule__UTM__NAssignment_4 ) ) )
            // InternalPatternDsl.g:1947:1: ( ( rule__UTM__NAssignment_4 ) )
            {
            // InternalPatternDsl.g:1947:1: ( ( rule__UTM__NAssignment_4 ) )
            // InternalPatternDsl.g:1948:2: ( rule__UTM__NAssignment_4 )
            {
             before(grammarAccess.getUTMAccess().getNAssignment_4()); 
            // InternalPatternDsl.g:1949:2: ( rule__UTM__NAssignment_4 )
            // InternalPatternDsl.g:1949:3: rule__UTM__NAssignment_4
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
    // InternalPatternDsl.g:1957:1: rule__UTM__Group__5 : rule__UTM__Group__5__Impl rule__UTM__Group__6 ;
    public final void rule__UTM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1961:1: ( rule__UTM__Group__5__Impl rule__UTM__Group__6 )
            // InternalPatternDsl.g:1962:2: rule__UTM__Group__5__Impl rule__UTM__Group__6
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
    // InternalPatternDsl.g:1969:1: rule__UTM__Group__5__Impl : ( ',' ) ;
    public final void rule__UTM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1973:1: ( ( ',' ) )
            // InternalPatternDsl.g:1974:1: ( ',' )
            {
            // InternalPatternDsl.g:1974:1: ( ',' )
            // InternalPatternDsl.g:1975:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_5()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPatternDsl.g:1984:1: rule__UTM__Group__6 : rule__UTM__Group__6__Impl rule__UTM__Group__7 ;
    public final void rule__UTM__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:1988:1: ( rule__UTM__Group__6__Impl rule__UTM__Group__7 )
            // InternalPatternDsl.g:1989:2: rule__UTM__Group__6__Impl rule__UTM__Group__7
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
    // InternalPatternDsl.g:1996:1: rule__UTM__Group__6__Impl : ( ( rule__UTM__ZAssignment_6 ) ) ;
    public final void rule__UTM__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2000:1: ( ( ( rule__UTM__ZAssignment_6 ) ) )
            // InternalPatternDsl.g:2001:1: ( ( rule__UTM__ZAssignment_6 ) )
            {
            // InternalPatternDsl.g:2001:1: ( ( rule__UTM__ZAssignment_6 ) )
            // InternalPatternDsl.g:2002:2: ( rule__UTM__ZAssignment_6 )
            {
             before(grammarAccess.getUTMAccess().getZAssignment_6()); 
            // InternalPatternDsl.g:2003:2: ( rule__UTM__ZAssignment_6 )
            // InternalPatternDsl.g:2003:3: rule__UTM__ZAssignment_6
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
    // InternalPatternDsl.g:2011:1: rule__UTM__Group__7 : rule__UTM__Group__7__Impl rule__UTM__Group__8 ;
    public final void rule__UTM__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2015:1: ( rule__UTM__Group__7__Impl rule__UTM__Group__8 )
            // InternalPatternDsl.g:2016:2: rule__UTM__Group__7__Impl rule__UTM__Group__8
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
    // InternalPatternDsl.g:2023:1: rule__UTM__Group__7__Impl : ( ',' ) ;
    public final void rule__UTM__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2027:1: ( ( ',' ) )
            // InternalPatternDsl.g:2028:1: ( ',' )
            {
            // InternalPatternDsl.g:2028:1: ( ',' )
            // InternalPatternDsl.g:2029:2: ','
            {
             before(grammarAccess.getUTMAccess().getCommaKeyword_7()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPatternDsl.g:2038:1: rule__UTM__Group__8 : rule__UTM__Group__8__Impl rule__UTM__Group__9 ;
    public final void rule__UTM__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2042:1: ( rule__UTM__Group__8__Impl rule__UTM__Group__9 )
            // InternalPatternDsl.g:2043:2: rule__UTM__Group__8__Impl rule__UTM__Group__9
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
    // InternalPatternDsl.g:2050:1: rule__UTM__Group__8__Impl : ( ( rule__UTM__HemiAssignment_8 ) ) ;
    public final void rule__UTM__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2054:1: ( ( ( rule__UTM__HemiAssignment_8 ) ) )
            // InternalPatternDsl.g:2055:1: ( ( rule__UTM__HemiAssignment_8 ) )
            {
            // InternalPatternDsl.g:2055:1: ( ( rule__UTM__HemiAssignment_8 ) )
            // InternalPatternDsl.g:2056:2: ( rule__UTM__HemiAssignment_8 )
            {
             before(grammarAccess.getUTMAccess().getHemiAssignment_8()); 
            // InternalPatternDsl.g:2057:2: ( rule__UTM__HemiAssignment_8 )
            // InternalPatternDsl.g:2057:3: rule__UTM__HemiAssignment_8
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
    // InternalPatternDsl.g:2065:1: rule__UTM__Group__9 : rule__UTM__Group__9__Impl ;
    public final void rule__UTM__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2069:1: ( rule__UTM__Group__9__Impl )
            // InternalPatternDsl.g:2070:2: rule__UTM__Group__9__Impl
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
    // InternalPatternDsl.g:2076:1: rule__UTM__Group__9__Impl : ( '}' ) ;
    public final void rule__UTM__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2080:1: ( ( '}' ) )
            // InternalPatternDsl.g:2081:1: ( '}' )
            {
            // InternalPatternDsl.g:2081:1: ( '}' )
            // InternalPatternDsl.g:2082:2: '}'
            {
             before(grammarAccess.getUTMAccess().getRightCurlyBracketKeyword_9()); 
            match(input,62,FOLLOW_2); 
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
    // InternalPatternDsl.g:2092:1: rule__Region__Group__0 : rule__Region__Group__0__Impl rule__Region__Group__1 ;
    public final void rule__Region__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2096:1: ( rule__Region__Group__0__Impl rule__Region__Group__1 )
            // InternalPatternDsl.g:2097:2: rule__Region__Group__0__Impl rule__Region__Group__1
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
    // InternalPatternDsl.g:2104:1: rule__Region__Group__0__Impl : ( 'region' ) ;
    public final void rule__Region__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2108:1: ( ( 'region' ) )
            // InternalPatternDsl.g:2109:1: ( 'region' )
            {
            // InternalPatternDsl.g:2109:1: ( 'region' )
            // InternalPatternDsl.g:2110:2: 'region'
            {
             before(grammarAccess.getRegionAccess().getRegionKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalPatternDsl.g:2119:1: rule__Region__Group__1 : rule__Region__Group__1__Impl rule__Region__Group__2 ;
    public final void rule__Region__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2123:1: ( rule__Region__Group__1__Impl rule__Region__Group__2 )
            // InternalPatternDsl.g:2124:2: rule__Region__Group__1__Impl rule__Region__Group__2
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
    // InternalPatternDsl.g:2131:1: rule__Region__Group__1__Impl : ( ( rule__Region__NameAssignment_1 ) ) ;
    public final void rule__Region__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2135:1: ( ( ( rule__Region__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:2136:1: ( ( rule__Region__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:2136:1: ( ( rule__Region__NameAssignment_1 ) )
            // InternalPatternDsl.g:2137:2: ( rule__Region__NameAssignment_1 )
            {
             before(grammarAccess.getRegionAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:2138:2: ( rule__Region__NameAssignment_1 )
            // InternalPatternDsl.g:2138:3: rule__Region__NameAssignment_1
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
    // InternalPatternDsl.g:2146:1: rule__Region__Group__2 : rule__Region__Group__2__Impl rule__Region__Group__3 ;
    public final void rule__Region__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2150:1: ( rule__Region__Group__2__Impl rule__Region__Group__3 )
            // InternalPatternDsl.g:2151:2: rule__Region__Group__2__Impl rule__Region__Group__3
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
    // InternalPatternDsl.g:2158:1: rule__Region__Group__2__Impl : ( '=' ) ;
    public final void rule__Region__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2162:1: ( ( '=' ) )
            // InternalPatternDsl.g:2163:1: ( '=' )
            {
            // InternalPatternDsl.g:2163:1: ( '=' )
            // InternalPatternDsl.g:2164:2: '='
            {
             before(grammarAccess.getRegionAccess().getEqualsSignKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:2173:1: rule__Region__Group__3 : rule__Region__Group__3__Impl rule__Region__Group__4 ;
    public final void rule__Region__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2177:1: ( rule__Region__Group__3__Impl rule__Region__Group__4 )
            // InternalPatternDsl.g:2178:2: rule__Region__Group__3__Impl rule__Region__Group__4
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
    // InternalPatternDsl.g:2185:1: rule__Region__Group__3__Impl : ( '{' ) ;
    public final void rule__Region__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2189:1: ( ( '{' ) )
            // InternalPatternDsl.g:2190:1: ( '{' )
            {
            // InternalPatternDsl.g:2190:1: ( '{' )
            // InternalPatternDsl.g:2191:2: '{'
            {
             before(grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
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
    // InternalPatternDsl.g:2200:1: rule__Region__Group__4 : rule__Region__Group__4__Impl rule__Region__Group__5 ;
    public final void rule__Region__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2204:1: ( rule__Region__Group__4__Impl rule__Region__Group__5 )
            // InternalPatternDsl.g:2205:2: rule__Region__Group__4__Impl rule__Region__Group__5
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
    // InternalPatternDsl.g:2212:1: rule__Region__Group__4__Impl : ( ( rule__Region__SouthWestBoundaryAssignment_4 ) ) ;
    public final void rule__Region__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2216:1: ( ( ( rule__Region__SouthWestBoundaryAssignment_4 ) ) )
            // InternalPatternDsl.g:2217:1: ( ( rule__Region__SouthWestBoundaryAssignment_4 ) )
            {
            // InternalPatternDsl.g:2217:1: ( ( rule__Region__SouthWestBoundaryAssignment_4 ) )
            // InternalPatternDsl.g:2218:2: ( rule__Region__SouthWestBoundaryAssignment_4 )
            {
             before(grammarAccess.getRegionAccess().getSouthWestBoundaryAssignment_4()); 
            // InternalPatternDsl.g:2219:2: ( rule__Region__SouthWestBoundaryAssignment_4 )
            // InternalPatternDsl.g:2219:3: rule__Region__SouthWestBoundaryAssignment_4
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
    // InternalPatternDsl.g:2227:1: rule__Region__Group__5 : rule__Region__Group__5__Impl rule__Region__Group__6 ;
    public final void rule__Region__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2231:1: ( rule__Region__Group__5__Impl rule__Region__Group__6 )
            // InternalPatternDsl.g:2232:2: rule__Region__Group__5__Impl rule__Region__Group__6
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
    // InternalPatternDsl.g:2239:1: rule__Region__Group__5__Impl : ( ':' ) ;
    public final void rule__Region__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2243:1: ( ( ':' ) )
            // InternalPatternDsl.g:2244:1: ( ':' )
            {
            // InternalPatternDsl.g:2244:1: ( ':' )
            // InternalPatternDsl.g:2245:2: ':'
            {
             before(grammarAccess.getRegionAccess().getColonKeyword_5()); 
            match(input,64,FOLLOW_2); 
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
    // InternalPatternDsl.g:2254:1: rule__Region__Group__6 : rule__Region__Group__6__Impl rule__Region__Group__7 ;
    public final void rule__Region__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2258:1: ( rule__Region__Group__6__Impl rule__Region__Group__7 )
            // InternalPatternDsl.g:2259:2: rule__Region__Group__6__Impl rule__Region__Group__7
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
    // InternalPatternDsl.g:2266:1: rule__Region__Group__6__Impl : ( ( rule__Region__NorthEastBoundaryAssignment_6 ) ) ;
    public final void rule__Region__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2270:1: ( ( ( rule__Region__NorthEastBoundaryAssignment_6 ) ) )
            // InternalPatternDsl.g:2271:1: ( ( rule__Region__NorthEastBoundaryAssignment_6 ) )
            {
            // InternalPatternDsl.g:2271:1: ( ( rule__Region__NorthEastBoundaryAssignment_6 ) )
            // InternalPatternDsl.g:2272:2: ( rule__Region__NorthEastBoundaryAssignment_6 )
            {
             before(grammarAccess.getRegionAccess().getNorthEastBoundaryAssignment_6()); 
            // InternalPatternDsl.g:2273:2: ( rule__Region__NorthEastBoundaryAssignment_6 )
            // InternalPatternDsl.g:2273:3: rule__Region__NorthEastBoundaryAssignment_6
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
    // InternalPatternDsl.g:2281:1: rule__Region__Group__7 : rule__Region__Group__7__Impl ;
    public final void rule__Region__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2285:1: ( rule__Region__Group__7__Impl )
            // InternalPatternDsl.g:2286:2: rule__Region__Group__7__Impl
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
    // InternalPatternDsl.g:2292:1: rule__Region__Group__7__Impl : ( '}' ) ;
    public final void rule__Region__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2296:1: ( ( '}' ) )
            // InternalPatternDsl.g:2297:1: ( '}' )
            {
            // InternalPatternDsl.g:2297:1: ( '}' )
            // InternalPatternDsl.g:2298:2: '}'
            {
             before(grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,62,FOLLOW_2); 
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
    // InternalPatternDsl.g:2308:1: rule__TermList__Group__0 : rule__TermList__Group__0__Impl rule__TermList__Group__1 ;
    public final void rule__TermList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2312:1: ( rule__TermList__Group__0__Impl rule__TermList__Group__1 )
            // InternalPatternDsl.g:2313:2: rule__TermList__Group__0__Impl rule__TermList__Group__1
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
    // InternalPatternDsl.g:2320:1: rule__TermList__Group__0__Impl : ( 'list' ) ;
    public final void rule__TermList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2324:1: ( ( 'list' ) )
            // InternalPatternDsl.g:2325:1: ( 'list' )
            {
            // InternalPatternDsl.g:2325:1: ( 'list' )
            // InternalPatternDsl.g:2326:2: 'list'
            {
             before(grammarAccess.getTermListAccess().getListKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalPatternDsl.g:2335:1: rule__TermList__Group__1 : rule__TermList__Group__1__Impl rule__TermList__Group__2 ;
    public final void rule__TermList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2339:1: ( rule__TermList__Group__1__Impl rule__TermList__Group__2 )
            // InternalPatternDsl.g:2340:2: rule__TermList__Group__1__Impl rule__TermList__Group__2
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
    // InternalPatternDsl.g:2347:1: rule__TermList__Group__1__Impl : ( ( rule__TermList__PropertyAssignment_1 )? ) ;
    public final void rule__TermList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2351:1: ( ( ( rule__TermList__PropertyAssignment_1 )? ) )
            // InternalPatternDsl.g:2352:1: ( ( rule__TermList__PropertyAssignment_1 )? )
            {
            // InternalPatternDsl.g:2352:1: ( ( rule__TermList__PropertyAssignment_1 )? )
            // InternalPatternDsl.g:2353:2: ( rule__TermList__PropertyAssignment_1 )?
            {
             before(grammarAccess.getTermListAccess().getPropertyAssignment_1()); 
            // InternalPatternDsl.g:2354:2: ( rule__TermList__PropertyAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=42 && LA18_0<=43)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPatternDsl.g:2354:3: rule__TermList__PropertyAssignment_1
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
    // InternalPatternDsl.g:2362:1: rule__TermList__Group__2 : rule__TermList__Group__2__Impl rule__TermList__Group__3 ;
    public final void rule__TermList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2366:1: ( rule__TermList__Group__2__Impl rule__TermList__Group__3 )
            // InternalPatternDsl.g:2367:2: rule__TermList__Group__2__Impl rule__TermList__Group__3
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
    // InternalPatternDsl.g:2374:1: rule__TermList__Group__2__Impl : ( ( rule__TermList__NameAssignment_2 ) ) ;
    public final void rule__TermList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2378:1: ( ( ( rule__TermList__NameAssignment_2 ) ) )
            // InternalPatternDsl.g:2379:1: ( ( rule__TermList__NameAssignment_2 ) )
            {
            // InternalPatternDsl.g:2379:1: ( ( rule__TermList__NameAssignment_2 ) )
            // InternalPatternDsl.g:2380:2: ( rule__TermList__NameAssignment_2 )
            {
             before(grammarAccess.getTermListAccess().getNameAssignment_2()); 
            // InternalPatternDsl.g:2381:2: ( rule__TermList__NameAssignment_2 )
            // InternalPatternDsl.g:2381:3: rule__TermList__NameAssignment_2
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
    // InternalPatternDsl.g:2389:1: rule__TermList__Group__3 : rule__TermList__Group__3__Impl rule__TermList__Group__4 ;
    public final void rule__TermList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2393:1: ( rule__TermList__Group__3__Impl rule__TermList__Group__4 )
            // InternalPatternDsl.g:2394:2: rule__TermList__Group__3__Impl rule__TermList__Group__4
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
    // InternalPatternDsl.g:2401:1: rule__TermList__Group__3__Impl : ( '=' ) ;
    public final void rule__TermList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2405:1: ( ( '=' ) )
            // InternalPatternDsl.g:2406:1: ( '=' )
            {
            // InternalPatternDsl.g:2406:1: ( '=' )
            // InternalPatternDsl.g:2407:2: '='
            {
             before(grammarAccess.getTermListAccess().getEqualsSignKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:2416:1: rule__TermList__Group__4 : rule__TermList__Group__4__Impl ;
    public final void rule__TermList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2420:1: ( rule__TermList__Group__4__Impl )
            // InternalPatternDsl.g:2421:2: rule__TermList__Group__4__Impl
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
    // InternalPatternDsl.g:2427:1: rule__TermList__Group__4__Impl : ( ( rule__TermList__Group_4__0 )? ) ;
    public final void rule__TermList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2431:1: ( ( ( rule__TermList__Group_4__0 )? ) )
            // InternalPatternDsl.g:2432:1: ( ( rule__TermList__Group_4__0 )? )
            {
            // InternalPatternDsl.g:2432:1: ( ( rule__TermList__Group_4__0 )? )
            // InternalPatternDsl.g:2433:2: ( rule__TermList__Group_4__0 )?
            {
             before(grammarAccess.getTermListAccess().getGroup_4()); 
            // InternalPatternDsl.g:2434:2: ( rule__TermList__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==66) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPatternDsl.g:2434:3: rule__TermList__Group_4__0
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
    // InternalPatternDsl.g:2443:1: rule__TermList__Group_4__0 : rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1 ;
    public final void rule__TermList__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2447:1: ( rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1 )
            // InternalPatternDsl.g:2448:2: rule__TermList__Group_4__0__Impl rule__TermList__Group_4__1
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
    // InternalPatternDsl.g:2455:1: rule__TermList__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TermList__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2459:1: ( ( '(' ) )
            // InternalPatternDsl.g:2460:1: ( '(' )
            {
            // InternalPatternDsl.g:2460:1: ( '(' )
            // InternalPatternDsl.g:2461:2: '('
            {
             before(grammarAccess.getTermListAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalPatternDsl.g:2470:1: rule__TermList__Group_4__1 : rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2 ;
    public final void rule__TermList__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2474:1: ( rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2 )
            // InternalPatternDsl.g:2475:2: rule__TermList__Group_4__1__Impl rule__TermList__Group_4__2
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
    // InternalPatternDsl.g:2482:1: rule__TermList__Group_4__1__Impl : ( ( rule__TermList__TermsAssignment_4_1 ) ) ;
    public final void rule__TermList__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2486:1: ( ( ( rule__TermList__TermsAssignment_4_1 ) ) )
            // InternalPatternDsl.g:2487:1: ( ( rule__TermList__TermsAssignment_4_1 ) )
            {
            // InternalPatternDsl.g:2487:1: ( ( rule__TermList__TermsAssignment_4_1 ) )
            // InternalPatternDsl.g:2488:2: ( rule__TermList__TermsAssignment_4_1 )
            {
             before(grammarAccess.getTermListAccess().getTermsAssignment_4_1()); 
            // InternalPatternDsl.g:2489:2: ( rule__TermList__TermsAssignment_4_1 )
            // InternalPatternDsl.g:2489:3: rule__TermList__TermsAssignment_4_1
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
    // InternalPatternDsl.g:2497:1: rule__TermList__Group_4__2 : rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3 ;
    public final void rule__TermList__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2501:1: ( rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3 )
            // InternalPatternDsl.g:2502:2: rule__TermList__Group_4__2__Impl rule__TermList__Group_4__3
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
    // InternalPatternDsl.g:2509:1: rule__TermList__Group_4__2__Impl : ( ( rule__TermList__Group_4_2__0 )* ) ;
    public final void rule__TermList__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2513:1: ( ( ( rule__TermList__Group_4_2__0 )* ) )
            // InternalPatternDsl.g:2514:1: ( ( rule__TermList__Group_4_2__0 )* )
            {
            // InternalPatternDsl.g:2514:1: ( ( rule__TermList__Group_4_2__0 )* )
            // InternalPatternDsl.g:2515:2: ( rule__TermList__Group_4_2__0 )*
            {
             before(grammarAccess.getTermListAccess().getGroup_4_2()); 
            // InternalPatternDsl.g:2516:2: ( rule__TermList__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==59) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPatternDsl.g:2516:3: rule__TermList__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TermList__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPatternDsl.g:2524:1: rule__TermList__Group_4__3 : rule__TermList__Group_4__3__Impl ;
    public final void rule__TermList__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2528:1: ( rule__TermList__Group_4__3__Impl )
            // InternalPatternDsl.g:2529:2: rule__TermList__Group_4__3__Impl
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
    // InternalPatternDsl.g:2535:1: rule__TermList__Group_4__3__Impl : ( ')' ) ;
    public final void rule__TermList__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2539:1: ( ( ')' ) )
            // InternalPatternDsl.g:2540:1: ( ')' )
            {
            // InternalPatternDsl.g:2540:1: ( ')' )
            // InternalPatternDsl.g:2541:2: ')'
            {
             before(grammarAccess.getTermListAccess().getRightParenthesisKeyword_4_3()); 
            match(input,67,FOLLOW_2); 
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
    // InternalPatternDsl.g:2551:1: rule__TermList__Group_4_2__0 : rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1 ;
    public final void rule__TermList__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2555:1: ( rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1 )
            // InternalPatternDsl.g:2556:2: rule__TermList__Group_4_2__0__Impl rule__TermList__Group_4_2__1
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
    // InternalPatternDsl.g:2563:1: rule__TermList__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TermList__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2567:1: ( ( ',' ) )
            // InternalPatternDsl.g:2568:1: ( ',' )
            {
            // InternalPatternDsl.g:2568:1: ( ',' )
            // InternalPatternDsl.g:2569:2: ','
            {
             before(grammarAccess.getTermListAccess().getCommaKeyword_4_2_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPatternDsl.g:2578:1: rule__TermList__Group_4_2__1 : rule__TermList__Group_4_2__1__Impl ;
    public final void rule__TermList__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2582:1: ( rule__TermList__Group_4_2__1__Impl )
            // InternalPatternDsl.g:2583:2: rule__TermList__Group_4_2__1__Impl
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
    // InternalPatternDsl.g:2589:1: rule__TermList__Group_4_2__1__Impl : ( ( rule__TermList__TermsAssignment_4_2_1 ) ) ;
    public final void rule__TermList__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2593:1: ( ( ( rule__TermList__TermsAssignment_4_2_1 ) ) )
            // InternalPatternDsl.g:2594:1: ( ( rule__TermList__TermsAssignment_4_2_1 ) )
            {
            // InternalPatternDsl.g:2594:1: ( ( rule__TermList__TermsAssignment_4_2_1 ) )
            // InternalPatternDsl.g:2595:2: ( rule__TermList__TermsAssignment_4_2_1 )
            {
             before(grammarAccess.getTermListAccess().getTermsAssignment_4_2_1()); 
            // InternalPatternDsl.g:2596:2: ( rule__TermList__TermsAssignment_4_2_1 )
            // InternalPatternDsl.g:2596:3: rule__TermList__TermsAssignment_4_2_1
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


    // $ANTLR start "rule__TermKey__Group__0"
    // InternalPatternDsl.g:2605:1: rule__TermKey__Group__0 : rule__TermKey__Group__0__Impl rule__TermKey__Group__1 ;
    public final void rule__TermKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2609:1: ( rule__TermKey__Group__0__Impl rule__TermKey__Group__1 )
            // InternalPatternDsl.g:2610:2: rule__TermKey__Group__0__Impl rule__TermKey__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__TermKey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermKey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__Group__0"


    // $ANTLR start "rule__TermKey__Group__0__Impl"
    // InternalPatternDsl.g:2617:1: rule__TermKey__Group__0__Impl : ( ( rule__TermKey__TypeAssignment_0 ) ) ;
    public final void rule__TermKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2621:1: ( ( ( rule__TermKey__TypeAssignment_0 ) ) )
            // InternalPatternDsl.g:2622:1: ( ( rule__TermKey__TypeAssignment_0 ) )
            {
            // InternalPatternDsl.g:2622:1: ( ( rule__TermKey__TypeAssignment_0 ) )
            // InternalPatternDsl.g:2623:2: ( rule__TermKey__TypeAssignment_0 )
            {
             before(grammarAccess.getTermKeyAccess().getTypeAssignment_0()); 
            // InternalPatternDsl.g:2624:2: ( rule__TermKey__TypeAssignment_0 )
            // InternalPatternDsl.g:2624:3: rule__TermKey__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TermKey__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermKeyAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__Group__0__Impl"


    // $ANTLR start "rule__TermKey__Group__1"
    // InternalPatternDsl.g:2632:1: rule__TermKey__Group__1 : rule__TermKey__Group__1__Impl ;
    public final void rule__TermKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2636:1: ( rule__TermKey__Group__1__Impl )
            // InternalPatternDsl.g:2637:2: rule__TermKey__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermKey__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__Group__1"


    // $ANTLR start "rule__TermKey__Group__1__Impl"
    // InternalPatternDsl.g:2643:1: rule__TermKey__Group__1__Impl : ( ( rule__TermKey__NameAssignment_1 ) ) ;
    public final void rule__TermKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2647:1: ( ( ( rule__TermKey__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:2648:1: ( ( rule__TermKey__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:2648:1: ( ( rule__TermKey__NameAssignment_1 ) )
            // InternalPatternDsl.g:2649:2: ( rule__TermKey__NameAssignment_1 )
            {
             before(grammarAccess.getTermKeyAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:2650:2: ( rule__TermKey__NameAssignment_1 )
            // InternalPatternDsl.g:2650:3: rule__TermKey__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermKey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermKeyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__Group__1__Impl"


    // $ANTLR start "rule__Phrase__Group__0"
    // InternalPatternDsl.g:2659:1: rule__Phrase__Group__0 : rule__Phrase__Group__0__Impl rule__Phrase__Group__1 ;
    public final void rule__Phrase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2663:1: ( rule__Phrase__Group__0__Impl rule__Phrase__Group__1 )
            // InternalPatternDsl.g:2664:2: rule__Phrase__Group__0__Impl rule__Phrase__Group__1
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
    // InternalPatternDsl.g:2671:1: rule__Phrase__Group__0__Impl : ( 'phrase' ) ;
    public final void rule__Phrase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2675:1: ( ( 'phrase' ) )
            // InternalPatternDsl.g:2676:1: ( 'phrase' )
            {
            // InternalPatternDsl.g:2676:1: ( 'phrase' )
            // InternalPatternDsl.g:2677:2: 'phrase'
            {
             before(grammarAccess.getPhraseAccess().getPhraseKeyword_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalPatternDsl.g:2686:1: rule__Phrase__Group__1 : rule__Phrase__Group__1__Impl rule__Phrase__Group__2 ;
    public final void rule__Phrase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2690:1: ( rule__Phrase__Group__1__Impl rule__Phrase__Group__2 )
            // InternalPatternDsl.g:2691:2: rule__Phrase__Group__1__Impl rule__Phrase__Group__2
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
    // InternalPatternDsl.g:2698:1: rule__Phrase__Group__1__Impl : ( ( rule__Phrase__NameAssignment_1 ) ) ;
    public final void rule__Phrase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2702:1: ( ( ( rule__Phrase__NameAssignment_1 ) ) )
            // InternalPatternDsl.g:2703:1: ( ( rule__Phrase__NameAssignment_1 ) )
            {
            // InternalPatternDsl.g:2703:1: ( ( rule__Phrase__NameAssignment_1 ) )
            // InternalPatternDsl.g:2704:2: ( rule__Phrase__NameAssignment_1 )
            {
             before(grammarAccess.getPhraseAccess().getNameAssignment_1()); 
            // InternalPatternDsl.g:2705:2: ( rule__Phrase__NameAssignment_1 )
            // InternalPatternDsl.g:2705:3: rule__Phrase__NameAssignment_1
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
    // InternalPatternDsl.g:2713:1: rule__Phrase__Group__2 : rule__Phrase__Group__2__Impl rule__Phrase__Group__3 ;
    public final void rule__Phrase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2717:1: ( rule__Phrase__Group__2__Impl rule__Phrase__Group__3 )
            // InternalPatternDsl.g:2718:2: rule__Phrase__Group__2__Impl rule__Phrase__Group__3
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
    // InternalPatternDsl.g:2725:1: rule__Phrase__Group__2__Impl : ( ( rule__Phrase__OrderedAssignment_2 )? ) ;
    public final void rule__Phrase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2729:1: ( ( ( rule__Phrase__OrderedAssignment_2 )? ) )
            // InternalPatternDsl.g:2730:1: ( ( rule__Phrase__OrderedAssignment_2 )? )
            {
            // InternalPatternDsl.g:2730:1: ( ( rule__Phrase__OrderedAssignment_2 )? )
            // InternalPatternDsl.g:2731:2: ( rule__Phrase__OrderedAssignment_2 )?
            {
             before(grammarAccess.getPhraseAccess().getOrderedAssignment_2()); 
            // InternalPatternDsl.g:2732:2: ( rule__Phrase__OrderedAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==69) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPatternDsl.g:2732:3: rule__Phrase__OrderedAssignment_2
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
    // InternalPatternDsl.g:2740:1: rule__Phrase__Group__3 : rule__Phrase__Group__3__Impl rule__Phrase__Group__4 ;
    public final void rule__Phrase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2744:1: ( rule__Phrase__Group__3__Impl rule__Phrase__Group__4 )
            // InternalPatternDsl.g:2745:2: rule__Phrase__Group__3__Impl rule__Phrase__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalPatternDsl.g:2752:1: rule__Phrase__Group__3__Impl : ( '{' ) ;
    public final void rule__Phrase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2756:1: ( ( '{' ) )
            // InternalPatternDsl.g:2757:1: ( '{' )
            {
            // InternalPatternDsl.g:2757:1: ( '{' )
            // InternalPatternDsl.g:2758:2: '{'
            {
             before(grammarAccess.getPhraseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalPatternDsl.g:2767:1: rule__Phrase__Group__4 : rule__Phrase__Group__4__Impl rule__Phrase__Group__5 ;
    public final void rule__Phrase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2771:1: ( rule__Phrase__Group__4__Impl rule__Phrase__Group__5 )
            // InternalPatternDsl.g:2772:2: rule__Phrase__Group__4__Impl rule__Phrase__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalPatternDsl.g:2779:1: rule__Phrase__Group__4__Impl : ( ( rule__Phrase__ConceptsAssignment_4 ) ) ;
    public final void rule__Phrase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2783:1: ( ( ( rule__Phrase__ConceptsAssignment_4 ) ) )
            // InternalPatternDsl.g:2784:1: ( ( rule__Phrase__ConceptsAssignment_4 ) )
            {
            // InternalPatternDsl.g:2784:1: ( ( rule__Phrase__ConceptsAssignment_4 ) )
            // InternalPatternDsl.g:2785:2: ( rule__Phrase__ConceptsAssignment_4 )
            {
             before(grammarAccess.getPhraseAccess().getConceptsAssignment_4()); 
            // InternalPatternDsl.g:2786:2: ( rule__Phrase__ConceptsAssignment_4 )
            // InternalPatternDsl.g:2786:3: rule__Phrase__ConceptsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__ConceptsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getConceptsAssignment_4()); 

            }


            }

        }
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
    // InternalPatternDsl.g:2794:1: rule__Phrase__Group__5 : rule__Phrase__Group__5__Impl rule__Phrase__Group__6 ;
    public final void rule__Phrase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2798:1: ( rule__Phrase__Group__5__Impl rule__Phrase__Group__6 )
            // InternalPatternDsl.g:2799:2: rule__Phrase__Group__5__Impl rule__Phrase__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalPatternDsl.g:2806:1: rule__Phrase__Group__5__Impl : ( ( rule__Phrase__Group_5__0 )* ) ;
    public final void rule__Phrase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2810:1: ( ( ( rule__Phrase__Group_5__0 )* ) )
            // InternalPatternDsl.g:2811:1: ( ( rule__Phrase__Group_5__0 )* )
            {
            // InternalPatternDsl.g:2811:1: ( ( rule__Phrase__Group_5__0 )* )
            // InternalPatternDsl.g:2812:2: ( rule__Phrase__Group_5__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_5()); 
            // InternalPatternDsl.g:2813:2: ( rule__Phrase__Group_5__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPatternDsl.g:2813:3: rule__Phrase__Group_5__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Phrase__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalPatternDsl.g:2821:1: rule__Phrase__Group__6 : rule__Phrase__Group__6__Impl rule__Phrase__Group__7 ;
    public final void rule__Phrase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2825:1: ( rule__Phrase__Group__6__Impl rule__Phrase__Group__7 )
            // InternalPatternDsl.g:2826:2: rule__Phrase__Group__6__Impl rule__Phrase__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalPatternDsl.g:2833:1: rule__Phrase__Group__6__Impl : ( '}' ) ;
    public final void rule__Phrase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2837:1: ( ( '}' ) )
            // InternalPatternDsl.g:2838:1: ( '}' )
            {
            // InternalPatternDsl.g:2838:1: ( '}' )
            // InternalPatternDsl.g:2839:2: '}'
            {
             before(grammarAccess.getPhraseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalPatternDsl.g:2848:1: rule__Phrase__Group__7 : rule__Phrase__Group__7__Impl ;
    public final void rule__Phrase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2852:1: ( rule__Phrase__Group__7__Impl )
            // InternalPatternDsl.g:2853:2: rule__Phrase__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalPatternDsl.g:2859:1: rule__Phrase__Group__7__Impl : ( ( rule__Phrase__Group_7__0 )? ) ;
    public final void rule__Phrase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2863:1: ( ( ( rule__Phrase__Group_7__0 )? ) )
            // InternalPatternDsl.g:2864:1: ( ( rule__Phrase__Group_7__0 )? )
            {
            // InternalPatternDsl.g:2864:1: ( ( rule__Phrase__Group_7__0 )? )
            // InternalPatternDsl.g:2865:2: ( rule__Phrase__Group_7__0 )?
            {
             before(grammarAccess.getPhraseAccess().getGroup_7()); 
            // InternalPatternDsl.g:2866:2: ( rule__Phrase__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPatternDsl.g:2866:3: rule__Phrase__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Phrase__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhraseAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Phrase__Group_5__0"
    // InternalPatternDsl.g:2875:1: rule__Phrase__Group_5__0 : rule__Phrase__Group_5__0__Impl rule__Phrase__Group_5__1 ;
    public final void rule__Phrase__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2879:1: ( rule__Phrase__Group_5__0__Impl rule__Phrase__Group_5__1 )
            // InternalPatternDsl.g:2880:2: rule__Phrase__Group_5__0__Impl rule__Phrase__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Phrase__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_5__0"


    // $ANTLR start "rule__Phrase__Group_5__0__Impl"
    // InternalPatternDsl.g:2887:1: rule__Phrase__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Phrase__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2891:1: ( ( ',' ) )
            // InternalPatternDsl.g:2892:1: ( ',' )
            {
            // InternalPatternDsl.g:2892:1: ( ',' )
            // InternalPatternDsl.g:2893:2: ','
            {
             before(grammarAccess.getPhraseAccess().getCommaKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_5__0__Impl"


    // $ANTLR start "rule__Phrase__Group_5__1"
    // InternalPatternDsl.g:2902:1: rule__Phrase__Group_5__1 : rule__Phrase__Group_5__1__Impl ;
    public final void rule__Phrase__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2906:1: ( rule__Phrase__Group_5__1__Impl )
            // InternalPatternDsl.g:2907:2: rule__Phrase__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_5__1"


    // $ANTLR start "rule__Phrase__Group_5__1__Impl"
    // InternalPatternDsl.g:2913:1: rule__Phrase__Group_5__1__Impl : ( ( rule__Phrase__ConceptsAssignment_5_1 ) ) ;
    public final void rule__Phrase__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2917:1: ( ( ( rule__Phrase__ConceptsAssignment_5_1 ) ) )
            // InternalPatternDsl.g:2918:1: ( ( rule__Phrase__ConceptsAssignment_5_1 ) )
            {
            // InternalPatternDsl.g:2918:1: ( ( rule__Phrase__ConceptsAssignment_5_1 ) )
            // InternalPatternDsl.g:2919:2: ( rule__Phrase__ConceptsAssignment_5_1 )
            {
             before(grammarAccess.getPhraseAccess().getConceptsAssignment_5_1()); 
            // InternalPatternDsl.g:2920:2: ( rule__Phrase__ConceptsAssignment_5_1 )
            // InternalPatternDsl.g:2920:3: rule__Phrase__ConceptsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__ConceptsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getConceptsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_5__1__Impl"


    // $ANTLR start "rule__Phrase__Group_7__0"
    // InternalPatternDsl.g:2929:1: rule__Phrase__Group_7__0 : rule__Phrase__Group_7__0__Impl rule__Phrase__Group_7__1 ;
    public final void rule__Phrase__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2933:1: ( rule__Phrase__Group_7__0__Impl rule__Phrase__Group_7__1 )
            // InternalPatternDsl.g:2934:2: rule__Phrase__Group_7__0__Impl rule__Phrase__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__Phrase__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__0"


    // $ANTLR start "rule__Phrase__Group_7__0__Impl"
    // InternalPatternDsl.g:2941:1: rule__Phrase__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Phrase__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2945:1: ( ( '(' ) )
            // InternalPatternDsl.g:2946:1: ( '(' )
            {
            // InternalPatternDsl.g:2946:1: ( '(' )
            // InternalPatternDsl.g:2947:2: '('
            {
             before(grammarAccess.getPhraseAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__0__Impl"


    // $ANTLR start "rule__Phrase__Group_7__1"
    // InternalPatternDsl.g:2956:1: rule__Phrase__Group_7__1 : rule__Phrase__Group_7__1__Impl rule__Phrase__Group_7__2 ;
    public final void rule__Phrase__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2960:1: ( rule__Phrase__Group_7__1__Impl rule__Phrase__Group_7__2 )
            // InternalPatternDsl.g:2961:2: rule__Phrase__Group_7__1__Impl rule__Phrase__Group_7__2
            {
            pushFollow(FOLLOW_21);
            rule__Phrase__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__1"


    // $ANTLR start "rule__Phrase__Group_7__1__Impl"
    // InternalPatternDsl.g:2968:1: rule__Phrase__Group_7__1__Impl : ( ( rule__Phrase__OptionsAssignment_7_1 ) ) ;
    public final void rule__Phrase__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2972:1: ( ( ( rule__Phrase__OptionsAssignment_7_1 ) ) )
            // InternalPatternDsl.g:2973:1: ( ( rule__Phrase__OptionsAssignment_7_1 ) )
            {
            // InternalPatternDsl.g:2973:1: ( ( rule__Phrase__OptionsAssignment_7_1 ) )
            // InternalPatternDsl.g:2974:2: ( rule__Phrase__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getPhraseAccess().getOptionsAssignment_7_1()); 
            // InternalPatternDsl.g:2975:2: ( rule__Phrase__OptionsAssignment_7_1 )
            // InternalPatternDsl.g:2975:3: rule__Phrase__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__1__Impl"


    // $ANTLR start "rule__Phrase__Group_7__2"
    // InternalPatternDsl.g:2983:1: rule__Phrase__Group_7__2 : rule__Phrase__Group_7__2__Impl rule__Phrase__Group_7__3 ;
    public final void rule__Phrase__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2987:1: ( rule__Phrase__Group_7__2__Impl rule__Phrase__Group_7__3 )
            // InternalPatternDsl.g:2988:2: rule__Phrase__Group_7__2__Impl rule__Phrase__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__Phrase__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__2"


    // $ANTLR start "rule__Phrase__Group_7__2__Impl"
    // InternalPatternDsl.g:2995:1: rule__Phrase__Group_7__2__Impl : ( ( rule__Phrase__Group_7_2__0 )* ) ;
    public final void rule__Phrase__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:2999:1: ( ( ( rule__Phrase__Group_7_2__0 )* ) )
            // InternalPatternDsl.g:3000:1: ( ( rule__Phrase__Group_7_2__0 )* )
            {
            // InternalPatternDsl.g:3000:1: ( ( rule__Phrase__Group_7_2__0 )* )
            // InternalPatternDsl.g:3001:2: ( rule__Phrase__Group_7_2__0 )*
            {
             before(grammarAccess.getPhraseAccess().getGroup_7_2()); 
            // InternalPatternDsl.g:3002:2: ( rule__Phrase__Group_7_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPatternDsl.g:3002:3: rule__Phrase__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Phrase__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__2__Impl"


    // $ANTLR start "rule__Phrase__Group_7__3"
    // InternalPatternDsl.g:3010:1: rule__Phrase__Group_7__3 : rule__Phrase__Group_7__3__Impl ;
    public final void rule__Phrase__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3014:1: ( rule__Phrase__Group_7__3__Impl )
            // InternalPatternDsl.g:3015:2: rule__Phrase__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__3"


    // $ANTLR start "rule__Phrase__Group_7__3__Impl"
    // InternalPatternDsl.g:3021:1: rule__Phrase__Group_7__3__Impl : ( ')' ) ;
    public final void rule__Phrase__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3025:1: ( ( ')' ) )
            // InternalPatternDsl.g:3026:1: ( ')' )
            {
            // InternalPatternDsl.g:3026:1: ( ')' )
            // InternalPatternDsl.g:3027:2: ')'
            {
             before(grammarAccess.getPhraseAccess().getRightParenthesisKeyword_7_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7__3__Impl"


    // $ANTLR start "rule__Phrase__Group_7_2__0"
    // InternalPatternDsl.g:3037:1: rule__Phrase__Group_7_2__0 : rule__Phrase__Group_7_2__0__Impl rule__Phrase__Group_7_2__1 ;
    public final void rule__Phrase__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3041:1: ( rule__Phrase__Group_7_2__0__Impl rule__Phrase__Group_7_2__1 )
            // InternalPatternDsl.g:3042:2: rule__Phrase__Group_7_2__0__Impl rule__Phrase__Group_7_2__1
            {
            pushFollow(FOLLOW_25);
            rule__Phrase__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7_2__0"


    // $ANTLR start "rule__Phrase__Group_7_2__0__Impl"
    // InternalPatternDsl.g:3049:1: rule__Phrase__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Phrase__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3053:1: ( ( ',' ) )
            // InternalPatternDsl.g:3054:1: ( ',' )
            {
            // InternalPatternDsl.g:3054:1: ( ',' )
            // InternalPatternDsl.g:3055:2: ','
            {
             before(grammarAccess.getPhraseAccess().getCommaKeyword_7_2_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPhraseAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7_2__0__Impl"


    // $ANTLR start "rule__Phrase__Group_7_2__1"
    // InternalPatternDsl.g:3064:1: rule__Phrase__Group_7_2__1 : rule__Phrase__Group_7_2__1__Impl ;
    public final void rule__Phrase__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3068:1: ( rule__Phrase__Group_7_2__1__Impl )
            // InternalPatternDsl.g:3069:2: rule__Phrase__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7_2__1"


    // $ANTLR start "rule__Phrase__Group_7_2__1__Impl"
    // InternalPatternDsl.g:3075:1: rule__Phrase__Group_7_2__1__Impl : ( ( rule__Phrase__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__Phrase__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3079:1: ( ( ( rule__Phrase__OptionsAssignment_7_2_1 ) ) )
            // InternalPatternDsl.g:3080:1: ( ( rule__Phrase__OptionsAssignment_7_2_1 ) )
            {
            // InternalPatternDsl.g:3080:1: ( ( rule__Phrase__OptionsAssignment_7_2_1 ) )
            // InternalPatternDsl.g:3081:2: ( rule__Phrase__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getPhraseAccess().getOptionsAssignment_7_2_1()); 
            // InternalPatternDsl.g:3082:2: ( rule__Phrase__OptionsAssignment_7_2_1 )
            // InternalPatternDsl.g:3082:3: rule__Phrase__OptionsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Phrase__OptionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getOptionsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Group_7_2__1__Impl"


    // $ANTLR start "rule__GeoOption__Group__0"
    // InternalPatternDsl.g:3091:1: rule__GeoOption__Group__0 : rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1 ;
    public final void rule__GeoOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3095:1: ( rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1 )
            // InternalPatternDsl.g:3096:2: rule__GeoOption__Group__0__Impl rule__GeoOption__Group__1
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
    // InternalPatternDsl.g:3103:1: rule__GeoOption__Group__0__Impl : ( ( rule__GeoOption__KeyAssignment_0 ) ) ;
    public final void rule__GeoOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3107:1: ( ( ( rule__GeoOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3108:1: ( ( rule__GeoOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3108:1: ( ( rule__GeoOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3109:2: ( rule__GeoOption__KeyAssignment_0 )
            {
             before(grammarAccess.getGeoOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3110:2: ( rule__GeoOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3110:3: rule__GeoOption__KeyAssignment_0
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
    // InternalPatternDsl.g:3118:1: rule__GeoOption__Group__1 : rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2 ;
    public final void rule__GeoOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3122:1: ( rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2 )
            // InternalPatternDsl.g:3123:2: rule__GeoOption__Group__1__Impl rule__GeoOption__Group__2
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
    // InternalPatternDsl.g:3130:1: rule__GeoOption__Group__1__Impl : ( '=' ) ;
    public final void rule__GeoOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3134:1: ( ( '=' ) )
            // InternalPatternDsl.g:3135:1: ( '=' )
            {
            // InternalPatternDsl.g:3135:1: ( '=' )
            // InternalPatternDsl.g:3136:2: '='
            {
             before(grammarAccess.getGeoOptionAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:3145:1: rule__GeoOption__Group__2 : rule__GeoOption__Group__2__Impl ;
    public final void rule__GeoOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3149:1: ( rule__GeoOption__Group__2__Impl )
            // InternalPatternDsl.g:3150:2: rule__GeoOption__Group__2__Impl
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
    // InternalPatternDsl.g:3156:1: rule__GeoOption__Group__2__Impl : ( ( rule__GeoOption__ValueAssignment_2 ) ) ;
    public final void rule__GeoOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3160:1: ( ( ( rule__GeoOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3161:1: ( ( rule__GeoOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3161:1: ( ( rule__GeoOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3162:2: ( rule__GeoOption__ValueAssignment_2 )
            {
             before(grammarAccess.getGeoOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3163:2: ( rule__GeoOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3163:3: rule__GeoOption__ValueAssignment_2
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
    // InternalPatternDsl.g:3172:1: rule__SourceOption__Group__0 : rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1 ;
    public final void rule__SourceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3176:1: ( rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1 )
            // InternalPatternDsl.g:3177:2: rule__SourceOption__Group__0__Impl rule__SourceOption__Group__1
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
    // InternalPatternDsl.g:3184:1: rule__SourceOption__Group__0__Impl : ( ( rule__SourceOption__KeyAssignment_0 ) ) ;
    public final void rule__SourceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3188:1: ( ( ( rule__SourceOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3189:1: ( ( rule__SourceOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3189:1: ( ( rule__SourceOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3190:2: ( rule__SourceOption__KeyAssignment_0 )
            {
             before(grammarAccess.getSourceOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3191:2: ( rule__SourceOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3191:3: rule__SourceOption__KeyAssignment_0
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
    // InternalPatternDsl.g:3199:1: rule__SourceOption__Group__1 : rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2 ;
    public final void rule__SourceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3203:1: ( rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2 )
            // InternalPatternDsl.g:3204:2: rule__SourceOption__Group__1__Impl rule__SourceOption__Group__2
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
    // InternalPatternDsl.g:3211:1: rule__SourceOption__Group__1__Impl : ( '=' ) ;
    public final void rule__SourceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3215:1: ( ( '=' ) )
            // InternalPatternDsl.g:3216:1: ( '=' )
            {
            // InternalPatternDsl.g:3216:1: ( '=' )
            // InternalPatternDsl.g:3217:2: '='
            {
             before(grammarAccess.getSourceOptionAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:3226:1: rule__SourceOption__Group__2 : rule__SourceOption__Group__2__Impl ;
    public final void rule__SourceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3230:1: ( rule__SourceOption__Group__2__Impl )
            // InternalPatternDsl.g:3231:2: rule__SourceOption__Group__2__Impl
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
    // InternalPatternDsl.g:3237:1: rule__SourceOption__Group__2__Impl : ( ( rule__SourceOption__ValueAssignment_2 ) ) ;
    public final void rule__SourceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3241:1: ( ( ( rule__SourceOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3242:1: ( ( rule__SourceOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3242:1: ( ( rule__SourceOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3243:2: ( rule__SourceOption__ValueAssignment_2 )
            {
             before(grammarAccess.getSourceOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3244:2: ( rule__SourceOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3244:3: rule__SourceOption__ValueAssignment_2
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
    // InternalPatternDsl.g:3253:1: rule__LanguageOption__Group__0 : rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1 ;
    public final void rule__LanguageOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3257:1: ( rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1 )
            // InternalPatternDsl.g:3258:2: rule__LanguageOption__Group__0__Impl rule__LanguageOption__Group__1
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
    // InternalPatternDsl.g:3265:1: rule__LanguageOption__Group__0__Impl : ( ( rule__LanguageOption__KeyAssignment_0 ) ) ;
    public final void rule__LanguageOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3269:1: ( ( ( rule__LanguageOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3270:1: ( ( rule__LanguageOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3270:1: ( ( rule__LanguageOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3271:2: ( rule__LanguageOption__KeyAssignment_0 )
            {
             before(grammarAccess.getLanguageOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3272:2: ( rule__LanguageOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3272:3: rule__LanguageOption__KeyAssignment_0
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
    // InternalPatternDsl.g:3280:1: rule__LanguageOption__Group__1 : rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2 ;
    public final void rule__LanguageOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3284:1: ( rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2 )
            // InternalPatternDsl.g:3285:2: rule__LanguageOption__Group__1__Impl rule__LanguageOption__Group__2
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
    // InternalPatternDsl.g:3292:1: rule__LanguageOption__Group__1__Impl : ( '=' ) ;
    public final void rule__LanguageOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3296:1: ( ( '=' ) )
            // InternalPatternDsl.g:3297:1: ( '=' )
            {
            // InternalPatternDsl.g:3297:1: ( '=' )
            // InternalPatternDsl.g:3298:2: '='
            {
             before(grammarAccess.getLanguageOptionAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:3307:1: rule__LanguageOption__Group__2 : rule__LanguageOption__Group__2__Impl ;
    public final void rule__LanguageOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3311:1: ( rule__LanguageOption__Group__2__Impl )
            // InternalPatternDsl.g:3312:2: rule__LanguageOption__Group__2__Impl
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
    // InternalPatternDsl.g:3318:1: rule__LanguageOption__Group__2__Impl : ( ( rule__LanguageOption__ValueAssignment_2 ) ) ;
    public final void rule__LanguageOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3322:1: ( ( ( rule__LanguageOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3323:1: ( ( rule__LanguageOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3323:1: ( ( rule__LanguageOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3324:2: ( rule__LanguageOption__ValueAssignment_2 )
            {
             before(grammarAccess.getLanguageOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3325:2: ( rule__LanguageOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3325:3: rule__LanguageOption__ValueAssignment_2
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
    // InternalPatternDsl.g:3334:1: rule__BooleanOption__Group__0 : rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 ;
    public final void rule__BooleanOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3338:1: ( rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 )
            // InternalPatternDsl.g:3339:2: rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1
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
    // InternalPatternDsl.g:3346:1: rule__BooleanOption__Group__0__Impl : ( ( rule__BooleanOption__KeyAssignment_0 ) ) ;
    public final void rule__BooleanOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3350:1: ( ( ( rule__BooleanOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3351:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3351:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3352:2: ( rule__BooleanOption__KeyAssignment_0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3353:2: ( rule__BooleanOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3353:3: rule__BooleanOption__KeyAssignment_0
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
    // InternalPatternDsl.g:3361:1: rule__BooleanOption__Group__1 : rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 ;
    public final void rule__BooleanOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3365:1: ( rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 )
            // InternalPatternDsl.g:3366:2: rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2
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
    // InternalPatternDsl.g:3373:1: rule__BooleanOption__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3377:1: ( ( '=' ) )
            // InternalPatternDsl.g:3378:1: ( '=' )
            {
            // InternalPatternDsl.g:3378:1: ( '=' )
            // InternalPatternDsl.g:3379:2: '='
            {
             before(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:3388:1: rule__BooleanOption__Group__2 : rule__BooleanOption__Group__2__Impl ;
    public final void rule__BooleanOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3392:1: ( rule__BooleanOption__Group__2__Impl )
            // InternalPatternDsl.g:3393:2: rule__BooleanOption__Group__2__Impl
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
    // InternalPatternDsl.g:3399:1: rule__BooleanOption__Group__2__Impl : ( ( rule__BooleanOption__ValueAssignment_2 ) ) ;
    public final void rule__BooleanOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3403:1: ( ( ( rule__BooleanOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3404:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3404:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3405:2: ( rule__BooleanOption__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3406:2: ( rule__BooleanOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3406:3: rule__BooleanOption__ValueAssignment_2
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
    // InternalPatternDsl.g:3415:1: rule__IntOption__Group__0 : rule__IntOption__Group__0__Impl rule__IntOption__Group__1 ;
    public final void rule__IntOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3419:1: ( rule__IntOption__Group__0__Impl rule__IntOption__Group__1 )
            // InternalPatternDsl.g:3420:2: rule__IntOption__Group__0__Impl rule__IntOption__Group__1
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
    // InternalPatternDsl.g:3427:1: rule__IntOption__Group__0__Impl : ( ( rule__IntOption__KeyAssignment_0 ) ) ;
    public final void rule__IntOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3431:1: ( ( ( rule__IntOption__KeyAssignment_0 ) ) )
            // InternalPatternDsl.g:3432:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            {
            // InternalPatternDsl.g:3432:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            // InternalPatternDsl.g:3433:2: ( rule__IntOption__KeyAssignment_0 )
            {
             before(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 
            // InternalPatternDsl.g:3434:2: ( rule__IntOption__KeyAssignment_0 )
            // InternalPatternDsl.g:3434:3: rule__IntOption__KeyAssignment_0
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
    // InternalPatternDsl.g:3442:1: rule__IntOption__Group__1 : rule__IntOption__Group__1__Impl rule__IntOption__Group__2 ;
    public final void rule__IntOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3446:1: ( rule__IntOption__Group__1__Impl rule__IntOption__Group__2 )
            // InternalPatternDsl.g:3447:2: rule__IntOption__Group__1__Impl rule__IntOption__Group__2
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
    // InternalPatternDsl.g:3454:1: rule__IntOption__Group__1__Impl : ( '=' ) ;
    public final void rule__IntOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3458:1: ( ( '=' ) )
            // InternalPatternDsl.g:3459:1: ( '=' )
            {
            // InternalPatternDsl.g:3459:1: ( '=' )
            // InternalPatternDsl.g:3460:2: '='
            {
             before(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPatternDsl.g:3469:1: rule__IntOption__Group__2 : rule__IntOption__Group__2__Impl ;
    public final void rule__IntOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3473:1: ( rule__IntOption__Group__2__Impl )
            // InternalPatternDsl.g:3474:2: rule__IntOption__Group__2__Impl
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
    // InternalPatternDsl.g:3480:1: rule__IntOption__Group__2__Impl : ( ( rule__IntOption__ValueAssignment_2 ) ) ;
    public final void rule__IntOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3484:1: ( ( ( rule__IntOption__ValueAssignment_2 ) ) )
            // InternalPatternDsl.g:3485:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            {
            // InternalPatternDsl.g:3485:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            // InternalPatternDsl.g:3486:2: ( rule__IntOption__ValueAssignment_2 )
            {
             before(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 
            // InternalPatternDsl.g:3487:2: ( rule__IntOption__ValueAssignment_2 )
            // InternalPatternDsl.g:3487:3: rule__IntOption__ValueAssignment_2
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
    // InternalPatternDsl.g:3496:1: rule__StreamingModel__DescriptionsAssignment_0 : ( ruleStreamingDescription ) ;
    public final void rule__StreamingModel__DescriptionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3500:1: ( ( ruleStreamingDescription ) )
            // InternalPatternDsl.g:3501:2: ( ruleStreamingDescription )
            {
            // InternalPatternDsl.g:3501:2: ( ruleStreamingDescription )
            // InternalPatternDsl.g:3502:3: ruleStreamingDescription
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
    // InternalPatternDsl.g:3511:1: rule__StreamingModel__DescriptionsAssignment_1 : ( ruleStreamingDescription ) ;
    public final void rule__StreamingModel__DescriptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3515:1: ( ( ruleStreamingDescription ) )
            // InternalPatternDsl.g:3516:2: ( ruleStreamingDescription )
            {
            // InternalPatternDsl.g:3516:2: ( ruleStreamingDescription )
            // InternalPatternDsl.g:3517:3: ruleStreamingDescription
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
    // InternalPatternDsl.g:3526:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3530:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalPatternDsl.g:3531:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalPatternDsl.g:3531:2: ( ruleQualifiedNameWithWildcard )
            // InternalPatternDsl.g:3532:3: ruleQualifiedNameWithWildcard
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
    // InternalPatternDsl.g:3541:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3545:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3546:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3546:2: ( RULE_ID )
            // InternalPatternDsl.g:3547:3: RULE_ID
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
    // InternalPatternDsl.g:3556:1: rule__Place__PointAssignment_3 : ( rulePoint ) ;
    public final void rule__Place__PointAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3560:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3561:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3561:2: ( rulePoint )
            // InternalPatternDsl.g:3562:3: rulePoint
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
    // InternalPatternDsl.g:3571:1: rule__Point__RadiusAssignment_0_0 : ( RULE_DOUBLE ) ;
    public final void rule__Point__RadiusAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3575:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3576:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3576:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3577:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3586:1: rule__Point__MesurementAssignment_0_1 : ( ruleDistanceMesurement ) ;
    public final void rule__Point__MesurementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3590:1: ( ( ruleDistanceMesurement ) )
            // InternalPatternDsl.g:3591:2: ( ruleDistanceMesurement )
            {
            // InternalPatternDsl.g:3591:2: ( ruleDistanceMesurement )
            // InternalPatternDsl.g:3592:3: ruleDistanceMesurement
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
    // InternalPatternDsl.g:3601:1: rule__Point__CoordinatesAssignment_1 : ( ruleCoordinate ) ;
    public final void rule__Point__CoordinatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3605:1: ( ( ruleCoordinate ) )
            // InternalPatternDsl.g:3606:2: ( ruleCoordinate )
            {
            // InternalPatternDsl.g:3606:2: ( ruleCoordinate )
            // InternalPatternDsl.g:3607:3: ruleCoordinate
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
    // InternalPatternDsl.g:3616:1: rule__LatLong__LatAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__LatLong__LatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3620:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3621:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3621:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3622:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3631:1: rule__LatLong__LongAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__LatLong__LongAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3635:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3636:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3636:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3637:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3646:1: rule__UTM__EAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__EAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3650:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3651:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3651:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3652:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3661:1: rule__UTM__NAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3665:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3666:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3666:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3667:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3676:1: rule__UTM__ZAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__ZAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3680:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3681:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3681:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3682:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3691:1: rule__UTM__HemiAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__UTM__HemiAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3695:1: ( ( RULE_DOUBLE ) )
            // InternalPatternDsl.g:3696:2: ( RULE_DOUBLE )
            {
            // InternalPatternDsl.g:3696:2: ( RULE_DOUBLE )
            // InternalPatternDsl.g:3697:3: RULE_DOUBLE
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
    // InternalPatternDsl.g:3706:1: rule__Region__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Region__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3710:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3711:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3711:2: ( RULE_ID )
            // InternalPatternDsl.g:3712:3: RULE_ID
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
    // InternalPatternDsl.g:3721:1: rule__Region__SouthWestBoundaryAssignment_4 : ( rulePoint ) ;
    public final void rule__Region__SouthWestBoundaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3725:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3726:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3726:2: ( rulePoint )
            // InternalPatternDsl.g:3727:3: rulePoint
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
    // InternalPatternDsl.g:3736:1: rule__Region__NorthEastBoundaryAssignment_6 : ( rulePoint ) ;
    public final void rule__Region__NorthEastBoundaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3740:1: ( ( rulePoint ) )
            // InternalPatternDsl.g:3741:2: ( rulePoint )
            {
            // InternalPatternDsl.g:3741:2: ( rulePoint )
            // InternalPatternDsl.g:3742:3: rulePoint
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
    // InternalPatternDsl.g:3751:1: rule__TermList__PropertyAssignment_1 : ( ruleWordListProperty ) ;
    public final void rule__TermList__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3755:1: ( ( ruleWordListProperty ) )
            // InternalPatternDsl.g:3756:2: ( ruleWordListProperty )
            {
            // InternalPatternDsl.g:3756:2: ( ruleWordListProperty )
            // InternalPatternDsl.g:3757:3: ruleWordListProperty
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
    // InternalPatternDsl.g:3766:1: rule__TermList__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TermList__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3770:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3771:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3771:2: ( RULE_ID )
            // InternalPatternDsl.g:3772:3: RULE_ID
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
    // InternalPatternDsl.g:3781:1: rule__TermList__TermsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TermList__TermsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3785:1: ( ( RULE_STRING ) )
            // InternalPatternDsl.g:3786:2: ( RULE_STRING )
            {
            // InternalPatternDsl.g:3786:2: ( RULE_STRING )
            // InternalPatternDsl.g:3787:3: RULE_STRING
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
    // InternalPatternDsl.g:3796:1: rule__TermList__TermsAssignment_4_2_1 : ( RULE_STRING ) ;
    public final void rule__TermList__TermsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3800:1: ( ( RULE_STRING ) )
            // InternalPatternDsl.g:3801:2: ( RULE_STRING )
            {
            // InternalPatternDsl.g:3801:2: ( RULE_STRING )
            // InternalPatternDsl.g:3802:3: RULE_STRING
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


    // $ANTLR start "rule__TermKey__TypeAssignment_0"
    // InternalPatternDsl.g:3811:1: rule__TermKey__TypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__TermKey__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3815:1: ( ( ruleBasicType ) )
            // InternalPatternDsl.g:3816:2: ( ruleBasicType )
            {
            // InternalPatternDsl.g:3816:2: ( ruleBasicType )
            // InternalPatternDsl.g:3817:3: ruleBasicType
            {
             before(grammarAccess.getTermKeyAccess().getTypeBasicTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getTermKeyAccess().getTypeBasicTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__TypeAssignment_0"


    // $ANTLR start "rule__TermKey__NameAssignment_1"
    // InternalPatternDsl.g:3826:1: rule__TermKey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TermKey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3830:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3831:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3831:2: ( RULE_ID )
            // InternalPatternDsl.g:3832:3: RULE_ID
            {
             before(grammarAccess.getTermKeyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTermKeyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermKey__NameAssignment_1"


    // $ANTLR start "rule__Phrase__NameAssignment_1"
    // InternalPatternDsl.g:3841:1: rule__Phrase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Phrase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3845:1: ( ( RULE_ID ) )
            // InternalPatternDsl.g:3846:2: ( RULE_ID )
            {
            // InternalPatternDsl.g:3846:2: ( RULE_ID )
            // InternalPatternDsl.g:3847:3: RULE_ID
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
    // InternalPatternDsl.g:3856:1: rule__Phrase__OrderedAssignment_2 : ( ( 'ordered' ) ) ;
    public final void rule__Phrase__OrderedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3860:1: ( ( ( 'ordered' ) ) )
            // InternalPatternDsl.g:3861:2: ( ( 'ordered' ) )
            {
            // InternalPatternDsl.g:3861:2: ( ( 'ordered' ) )
            // InternalPatternDsl.g:3862:3: ( 'ordered' )
            {
             before(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 
            // InternalPatternDsl.g:3863:3: ( 'ordered' )
            // InternalPatternDsl.g:3864:4: 'ordered'
            {
             before(grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0()); 
            match(input,69,FOLLOW_2); 
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


    // $ANTLR start "rule__Phrase__ConceptsAssignment_4"
    // InternalPatternDsl.g:3875:1: rule__Phrase__ConceptsAssignment_4 : ( ruleConcept ) ;
    public final void rule__Phrase__ConceptsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3879:1: ( ( ruleConcept ) )
            // InternalPatternDsl.g:3880:2: ( ruleConcept )
            {
            // InternalPatternDsl.g:3880:2: ( ruleConcept )
            // InternalPatternDsl.g:3881:3: ruleConcept
            {
             before(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__ConceptsAssignment_4"


    // $ANTLR start "rule__Phrase__ConceptsAssignment_5_1"
    // InternalPatternDsl.g:3890:1: rule__Phrase__ConceptsAssignment_5_1 : ( ruleConcept ) ;
    public final void rule__Phrase__ConceptsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3894:1: ( ( ruleConcept ) )
            // InternalPatternDsl.g:3895:2: ( ruleConcept )
            {
            // InternalPatternDsl.g:3895:2: ( ruleConcept )
            // InternalPatternDsl.g:3896:3: ruleConcept
            {
             before(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__ConceptsAssignment_5_1"


    // $ANTLR start "rule__Phrase__OptionsAssignment_7_1"
    // InternalPatternDsl.g:3905:1: rule__Phrase__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__Phrase__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3909:1: ( ( ruleOption ) )
            // InternalPatternDsl.g:3910:2: ( ruleOption )
            {
            // InternalPatternDsl.g:3910:2: ( ruleOption )
            // InternalPatternDsl.g:3911:3: ruleOption
            {
             before(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__OptionsAssignment_7_1"


    // $ANTLR start "rule__Phrase__OptionsAssignment_7_2_1"
    // InternalPatternDsl.g:3920:1: rule__Phrase__OptionsAssignment_7_2_1 : ( ruleOption ) ;
    public final void rule__Phrase__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3924:1: ( ( ruleOption ) )
            // InternalPatternDsl.g:3925:2: ( ruleOption )
            {
            // InternalPatternDsl.g:3925:2: ( ruleOption )
            // InternalPatternDsl.g:3926:3: ruleOption
            {
             before(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__OptionsAssignment_7_2_1"


    // $ANTLR start "rule__GeoOption__KeyAssignment_0"
    // InternalPatternDsl.g:3935:1: rule__GeoOption__KeyAssignment_0 : ( ruleGeoOptionKey ) ;
    public final void rule__GeoOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3939:1: ( ( ruleGeoOptionKey ) )
            // InternalPatternDsl.g:3940:2: ( ruleGeoOptionKey )
            {
            // InternalPatternDsl.g:3940:2: ( ruleGeoOptionKey )
            // InternalPatternDsl.g:3941:3: ruleGeoOptionKey
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
    // InternalPatternDsl.g:3950:1: rule__GeoOption__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeoOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3954:1: ( ( ( ruleQualifiedName ) ) )
            // InternalPatternDsl.g:3955:2: ( ( ruleQualifiedName ) )
            {
            // InternalPatternDsl.g:3955:2: ( ( ruleQualifiedName ) )
            // InternalPatternDsl.g:3956:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeoOptionAccess().getValueGeographicalElementCrossReference_2_0()); 
            // InternalPatternDsl.g:3957:3: ( ruleQualifiedName )
            // InternalPatternDsl.g:3958:4: ruleQualifiedName
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
    // InternalPatternDsl.g:3969:1: rule__SourceOption__KeyAssignment_0 : ( ruleSourceOptionKey ) ;
    public final void rule__SourceOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3973:1: ( ( ruleSourceOptionKey ) )
            // InternalPatternDsl.g:3974:2: ( ruleSourceOptionKey )
            {
            // InternalPatternDsl.g:3974:2: ( ruleSourceOptionKey )
            // InternalPatternDsl.g:3975:3: ruleSourceOptionKey
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
    // InternalPatternDsl.g:3984:1: rule__SourceOption__ValueAssignment_2 : ( ruleSource ) ;
    public final void rule__SourceOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:3988:1: ( ( ruleSource ) )
            // InternalPatternDsl.g:3989:2: ( ruleSource )
            {
            // InternalPatternDsl.g:3989:2: ( ruleSource )
            // InternalPatternDsl.g:3990:3: ruleSource
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
    // InternalPatternDsl.g:3999:1: rule__LanguageOption__KeyAssignment_0 : ( ruleLanguageOptionKey ) ;
    public final void rule__LanguageOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4003:1: ( ( ruleLanguageOptionKey ) )
            // InternalPatternDsl.g:4004:2: ( ruleLanguageOptionKey )
            {
            // InternalPatternDsl.g:4004:2: ( ruleLanguageOptionKey )
            // InternalPatternDsl.g:4005:3: ruleLanguageOptionKey
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
    // InternalPatternDsl.g:4014:1: rule__LanguageOption__ValueAssignment_2 : ( ruleLanguage ) ;
    public final void rule__LanguageOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4018:1: ( ( ruleLanguage ) )
            // InternalPatternDsl.g:4019:2: ( ruleLanguage )
            {
            // InternalPatternDsl.g:4019:2: ( ruleLanguage )
            // InternalPatternDsl.g:4020:3: ruleLanguage
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
    // InternalPatternDsl.g:4029:1: rule__BooleanOption__KeyAssignment_0 : ( ruleBooleanOptionKey ) ;
    public final void rule__BooleanOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4033:1: ( ( ruleBooleanOptionKey ) )
            // InternalPatternDsl.g:4034:2: ( ruleBooleanOptionKey )
            {
            // InternalPatternDsl.g:4034:2: ( ruleBooleanOptionKey )
            // InternalPatternDsl.g:4035:3: ruleBooleanOptionKey
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
    // InternalPatternDsl.g:4044:1: rule__BooleanOption__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4048:1: ( ( RULE_BOOLEAN ) )
            // InternalPatternDsl.g:4049:2: ( RULE_BOOLEAN )
            {
            // InternalPatternDsl.g:4049:2: ( RULE_BOOLEAN )
            // InternalPatternDsl.g:4050:3: RULE_BOOLEAN
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
    // InternalPatternDsl.g:4059:1: rule__IntOption__KeyAssignment_0 : ( ruleIntOptionKey ) ;
    public final void rule__IntOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4063:1: ( ( ruleIntOptionKey ) )
            // InternalPatternDsl.g:4064:2: ( ruleIntOptionKey )
            {
            // InternalPatternDsl.g:4064:2: ( ruleIntOptionKey )
            // InternalPatternDsl.g:4065:3: ruleIntOptionKey
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
    // InternalPatternDsl.g:4074:1: rule__IntOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPatternDsl.g:4078:1: ( ( RULE_INT ) )
            // InternalPatternDsl.g:4079:2: ( RULE_INT )
            {
            // InternalPatternDsl.g:4079:2: ( RULE_INT )
            // InternalPatternDsl.g:4080:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8120001FFFFF0000L,0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8120001FFFFF0002L,0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C0000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000003E00000E000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000740000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});

}