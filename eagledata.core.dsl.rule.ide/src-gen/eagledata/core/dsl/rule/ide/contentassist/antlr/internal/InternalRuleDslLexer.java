package eagledata.core.dsl.rule.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslLexer extends Lexer {
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int RULE_SELECTOPERATOR=8;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_CONDITIONALOPERATOR=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=11;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int RULE_LOGICALOPERATOR=9;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_DOUBLE=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int RULE_SETOPERATOR=14;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalRuleDslLexer() {;} 
    public InternalRuleDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRuleDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:11:7: ( '=' )
            // InternalRuleDsl.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:12:7: ( '||' )
            // InternalRuleDsl.g:12:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:13:7: ( '&&' )
            // InternalRuleDsl.g:13:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:14:7: ( '+=' )
            // InternalRuleDsl.g:14:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:15:7: ( '-=' )
            // InternalRuleDsl.g:15:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:16:7: ( '*=' )
            // InternalRuleDsl.g:16:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:17:7: ( '/=' )
            // InternalRuleDsl.g:17:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:18:7: ( '%=' )
            // InternalRuleDsl.g:18:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:19:7: ( '==' )
            // InternalRuleDsl.g:19:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20:7: ( '!=' )
            // InternalRuleDsl.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:21:7: ( '===' )
            // InternalRuleDsl.g:21:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:22:7: ( '!==' )
            // InternalRuleDsl.g:22:9: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:23:7: ( '>=' )
            // InternalRuleDsl.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:24:7: ( '>' )
            // InternalRuleDsl.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:25:7: ( '<' )
            // InternalRuleDsl.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:26:7: ( '->' )
            // InternalRuleDsl.g:26:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:27:7: ( '..<' )
            // InternalRuleDsl.g:27:9: '..<'
            {
            match("..<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:28:7: ( '..' )
            // InternalRuleDsl.g:28:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:29:7: ( '=>' )
            // InternalRuleDsl.g:29:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:30:7: ( '<>' )
            // InternalRuleDsl.g:30:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:31:7: ( '?:' )
            // InternalRuleDsl.g:31:9: '?:'
            {
            match("?:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:32:7: ( '+' )
            // InternalRuleDsl.g:32:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:33:7: ( '-' )
            // InternalRuleDsl.g:33:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:34:7: ( '*' )
            // InternalRuleDsl.g:34:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:35:7: ( '**' )
            // InternalRuleDsl.g:35:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:36:7: ( '/' )
            // InternalRuleDsl.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:37:7: ( '%' )
            // InternalRuleDsl.g:37:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:38:7: ( '!' )
            // InternalRuleDsl.g:38:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:39:7: ( '++' )
            // InternalRuleDsl.g:39:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:40:7: ( '--' )
            // InternalRuleDsl.g:40:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:41:7: ( '.' )
            // InternalRuleDsl.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:42:7: ( 'val' )
            // InternalRuleDsl.g:42:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:43:7: ( 'extends' )
            // InternalRuleDsl.g:43:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:44:7: ( 'static' )
            // InternalRuleDsl.g:44:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:45:7: ( 'import' )
            // InternalRuleDsl.g:45:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:46:7: ( 'extension' )
            // InternalRuleDsl.g:46:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:47:7: ( 'super' )
            // InternalRuleDsl.g:47:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:48:7: ( 'false' )
            // InternalRuleDsl.g:48:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:49:7: ( '{' )
            // InternalRuleDsl.g:49:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:50:7: ( 'on' )
            // InternalRuleDsl.g:50:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:51:7: ( 'do' )
            // InternalRuleDsl.g:51:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:52:7: ( '}' )
            // InternalRuleDsl.g:52:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:53:7: ( ':' )
            // InternalRuleDsl.g:53:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:54:7: ( 'then' )
            // InternalRuleDsl.g:54:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:55:7: ( 'select' )
            // InternalRuleDsl.g:55:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:56:7: ( 'from' )
            // InternalRuleDsl.g:56:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:57:7: ( ',' )
            // InternalRuleDsl.g:57:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:58:7: ( 'where' )
            // InternalRuleDsl.g:58:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:59:7: ( 'and' )
            // InternalRuleDsl.g:59:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:60:7: ( '(' )
            // InternalRuleDsl.g:60:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:61:7: ( ')' )
            // InternalRuleDsl.g:61:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:62:7: ( 'compose' )
            // InternalRuleDsl.g:62:9: 'compose'
            {
            match("compose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:63:7: ( 'to' )
            // InternalRuleDsl.g:63:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:64:7: ( '@' )
            // InternalRuleDsl.g:64:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:65:7: ( 'instanceof' )
            // InternalRuleDsl.g:65:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:66:7: ( 'as' )
            // InternalRuleDsl.g:66:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:67:7: ( '#' )
            // InternalRuleDsl.g:67:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:68:7: ( '[' )
            // InternalRuleDsl.g:68:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:69:7: ( ']' )
            // InternalRuleDsl.g:69:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:70:7: ( ';' )
            // InternalRuleDsl.g:70:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:71:7: ( 'if' )
            // InternalRuleDsl.g:71:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:72:7: ( 'else' )
            // InternalRuleDsl.g:72:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:73:7: ( 'switch' )
            // InternalRuleDsl.g:73:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:74:7: ( 'default' )
            // InternalRuleDsl.g:74:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:75:7: ( 'case' )
            // InternalRuleDsl.g:75:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:76:7: ( 'for' )
            // InternalRuleDsl.g:76:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:77:7: ( 'while' )
            // InternalRuleDsl.g:77:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:78:7: ( 'new' )
            // InternalRuleDsl.g:78:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:79:7: ( 'null' )
            // InternalRuleDsl.g:79:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:80:7: ( 'typeof' )
            // InternalRuleDsl.g:80:9: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:81:7: ( 'throw' )
            // InternalRuleDsl.g:81:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:82:7: ( 'return' )
            // InternalRuleDsl.g:82:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:83:7: ( 'try' )
            // InternalRuleDsl.g:83:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:84:7: ( 'finally' )
            // InternalRuleDsl.g:84:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:85:7: ( 'synchronized' )
            // InternalRuleDsl.g:85:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:86:7: ( 'catch' )
            // InternalRuleDsl.g:86:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:87:7: ( '?' )
            // InternalRuleDsl.g:87:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:88:7: ( '&' )
            // InternalRuleDsl.g:88:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:89:7: ( '::' )
            // InternalRuleDsl.g:89:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:90:7: ( '?.' )
            // InternalRuleDsl.g:90:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:91:7: ( '|' )
            // InternalRuleDsl.g:91:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:92:8: ( 'var' )
            // InternalRuleDsl.g:92:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:93:8: ( 'true' )
            // InternalRuleDsl.g:93:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20669:15: ( ( '+' | '-' | '*' | 'DIV' ) )
            // InternalRuleDsl.g:20669:17: ( '+' | '-' | '*' | 'DIV' )
            {
            // InternalRuleDsl.g:20669:17: ( '+' | '-' | '*' | 'DIV' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt1=1;
                }
                break;
            case '-':
                {
                alt1=2;
                }
                break;
            case '*':
                {
                alt1=3;
                }
                break;
            case 'D':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:20669:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20669:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:20669:26: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:20669:30: 'DIV'
                    {
                    match("DIV"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_LOGICALOPERATOR"
    public final void mRULE_LOGICALOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_LOGICALOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20671:22: ( ( '>' | '<' | '>=' | '<=' | '=' ) )
            // InternalRuleDsl.g:20671:24: ( '>' | '<' | '>=' | '<=' | '=' )
            {
            // InternalRuleDsl.g:20671:24: ( '>' | '<' | '>=' | '<=' | '=' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=3;
                }
                else {
                    alt2=1;}
                }
                break;
            case '<':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=2;}
                }
                break;
            case '=':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:20671:25: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20671:29: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:20671:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:20671:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalRuleDsl.g:20671:43: '='
                    {
                    match('='); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICALOPERATOR"

    // $ANTLR start "RULE_CONDITIONALOPERATOR"
    public final void mRULE_CONDITIONALOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_CONDITIONALOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20673:26: ( ( 'AND' | 'OR' ) )
            // InternalRuleDsl.g:20673:28: ( 'AND' | 'OR' )
            {
            // InternalRuleDsl.g:20673:28: ( 'AND' | 'OR' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='A') ) {
                alt3=1;
            }
            else if ( (LA3_0=='O') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:20673:29: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20673:35: 'OR'
                    {
                    match("OR"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONDITIONALOPERATOR"

    // $ANTLR start "RULE_SELECTOPERATOR"
    public final void mRULE_SELECTOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_SELECTOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20675:21: ( ( 'COUNT' | 'MIN' | 'MAX' ) )
            // InternalRuleDsl.g:20675:23: ( 'COUNT' | 'MIN' | 'MAX' )
            {
            // InternalRuleDsl.g:20675:23: ( 'COUNT' | 'MIN' | 'MAX' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='C') ) {
                alt4=1;
            }
            else if ( (LA4_0=='M') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='I') ) {
                    alt4=2;
                }
                else if ( (LA4_2=='A') ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:20675:24: 'COUNT'
                    {
                    match("COUNT"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20675:32: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:20675:38: 'MAX'
                    {
                    match("MAX"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECTOPERATOR"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20677:13: ( RULE_INT '.' RULE_INT )
            // InternalRuleDsl.g:20677:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_SETOPERATOR"
    public final void mRULE_SETOPERATOR() throws RecognitionException {
        try {
            int _type = RULE_SETOPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20679:18: ( ( 'UNION' | 'EXCEPT' | 'INTERSECT' ) )
            // InternalRuleDsl.g:20679:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
            {
            // InternalRuleDsl.g:20679:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 'U':
                {
                alt5=1;
                }
                break;
            case 'E':
                {
                alt5=2;
                }
                break;
            case 'I':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:20679:21: 'UNION'
                    {
                    match("UNION"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20679:29: 'EXCEPT'
                    {
                    match("EXCEPT"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:20679:38: 'INTERSECT'
                    {
                    match("INTERSECT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SETOPERATOR"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20681:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalRuleDsl.g:20681:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalRuleDsl.g:20681:12: ( '0x' | '0X' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='x') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='X') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuleDsl.g:20681:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20681:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalRuleDsl.g:20681:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalRuleDsl.g:20681:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='#') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuleDsl.g:20681:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalRuleDsl.g:20681:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='B'||LA8_0=='b') ) {
                        alt8=1;
                    }
                    else if ( (LA8_0=='L'||LA8_0=='l') ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRuleDsl.g:20681:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // InternalRuleDsl.g:20681:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20683:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalRuleDsl.g:20683:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalRuleDsl.g:20683:21: ( '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||LA10_0=='_') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20685:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalRuleDsl.g:20685:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalRuleDsl.g:20685:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='E'||LA12_0=='e') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDsl.g:20685:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalRuleDsl.g:20685:36: ( '+' | '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRuleDsl.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalRuleDsl.g:20685:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='B'||LA13_0=='b') ) {
                alt13=1;
            }
            else if ( (LA13_0=='D'||LA13_0=='F'||LA13_0=='L'||LA13_0=='d'||LA13_0=='f'||LA13_0=='l') ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalRuleDsl.g:20685:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20685:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20687:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalRuleDsl.g:20687:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalRuleDsl.g:20687:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRuleDsl.g:20687:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRuleDsl.g:20687:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='$'||(LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20689:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalRuleDsl.g:20689:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalRuleDsl.g:20689:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRuleDsl.g:20689:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalRuleDsl.g:20689:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRuleDsl.g:20689:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:20689:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalRuleDsl.g:20689:44: ( '\"' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\"') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalRuleDsl.g:20689:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:20689:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalRuleDsl.g:20689:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRuleDsl.g:20689:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:20689:62: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalRuleDsl.g:20689:79: ( '\\'' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\'') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalRuleDsl.g:20689:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20691:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRuleDsl.g:20691:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRuleDsl.g:20691:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRuleDsl.g:20691:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20693:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRuleDsl.g:20693:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRuleDsl.g:20693:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRuleDsl.g:20693:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalRuleDsl.g:20693:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRuleDsl.g:20693:41: ( '\\r' )? '\\n'
                    {
                    // InternalRuleDsl.g:20693:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalRuleDsl.g:20693:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20695:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRuleDsl.g:20695:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRuleDsl.g:20695:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRuleDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:20697:16: ( . )
            // InternalRuleDsl.g:20697:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRuleDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_CONDITIONALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=98;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalRuleDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalRuleDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalRuleDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalRuleDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalRuleDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalRuleDsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalRuleDsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalRuleDsl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalRuleDsl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalRuleDsl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalRuleDsl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalRuleDsl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalRuleDsl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalRuleDsl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalRuleDsl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalRuleDsl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalRuleDsl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalRuleDsl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalRuleDsl.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalRuleDsl.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalRuleDsl.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalRuleDsl.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalRuleDsl.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalRuleDsl.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalRuleDsl.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalRuleDsl.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalRuleDsl.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalRuleDsl.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalRuleDsl.g:1:178: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // InternalRuleDsl.g:1:184: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // InternalRuleDsl.g:1:190: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // InternalRuleDsl.g:1:196: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // InternalRuleDsl.g:1:202: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // InternalRuleDsl.g:1:208: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // InternalRuleDsl.g:1:214: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // InternalRuleDsl.g:1:220: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // InternalRuleDsl.g:1:226: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // InternalRuleDsl.g:1:232: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // InternalRuleDsl.g:1:238: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // InternalRuleDsl.g:1:244: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // InternalRuleDsl.g:1:250: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // InternalRuleDsl.g:1:256: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // InternalRuleDsl.g:1:262: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // InternalRuleDsl.g:1:268: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // InternalRuleDsl.g:1:274: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // InternalRuleDsl.g:1:280: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // InternalRuleDsl.g:1:286: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // InternalRuleDsl.g:1:292: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // InternalRuleDsl.g:1:298: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // InternalRuleDsl.g:1:304: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // InternalRuleDsl.g:1:310: T__69
                {
                mT__69(); 

                }
                break;
            case 52 :
                // InternalRuleDsl.g:1:316: T__70
                {
                mT__70(); 

                }
                break;
            case 53 :
                // InternalRuleDsl.g:1:322: T__71
                {
                mT__71(); 

                }
                break;
            case 54 :
                // InternalRuleDsl.g:1:328: T__72
                {
                mT__72(); 

                }
                break;
            case 55 :
                // InternalRuleDsl.g:1:334: T__73
                {
                mT__73(); 

                }
                break;
            case 56 :
                // InternalRuleDsl.g:1:340: T__74
                {
                mT__74(); 

                }
                break;
            case 57 :
                // InternalRuleDsl.g:1:346: T__75
                {
                mT__75(); 

                }
                break;
            case 58 :
                // InternalRuleDsl.g:1:352: T__76
                {
                mT__76(); 

                }
                break;
            case 59 :
                // InternalRuleDsl.g:1:358: T__77
                {
                mT__77(); 

                }
                break;
            case 60 :
                // InternalRuleDsl.g:1:364: T__78
                {
                mT__78(); 

                }
                break;
            case 61 :
                // InternalRuleDsl.g:1:370: T__79
                {
                mT__79(); 

                }
                break;
            case 62 :
                // InternalRuleDsl.g:1:376: T__80
                {
                mT__80(); 

                }
                break;
            case 63 :
                // InternalRuleDsl.g:1:382: T__81
                {
                mT__81(); 

                }
                break;
            case 64 :
                // InternalRuleDsl.g:1:388: T__82
                {
                mT__82(); 

                }
                break;
            case 65 :
                // InternalRuleDsl.g:1:394: T__83
                {
                mT__83(); 

                }
                break;
            case 66 :
                // InternalRuleDsl.g:1:400: T__84
                {
                mT__84(); 

                }
                break;
            case 67 :
                // InternalRuleDsl.g:1:406: T__85
                {
                mT__85(); 

                }
                break;
            case 68 :
                // InternalRuleDsl.g:1:412: T__86
                {
                mT__86(); 

                }
                break;
            case 69 :
                // InternalRuleDsl.g:1:418: T__87
                {
                mT__87(); 

                }
                break;
            case 70 :
                // InternalRuleDsl.g:1:424: T__88
                {
                mT__88(); 

                }
                break;
            case 71 :
                // InternalRuleDsl.g:1:430: T__89
                {
                mT__89(); 

                }
                break;
            case 72 :
                // InternalRuleDsl.g:1:436: T__90
                {
                mT__90(); 

                }
                break;
            case 73 :
                // InternalRuleDsl.g:1:442: T__91
                {
                mT__91(); 

                }
                break;
            case 74 :
                // InternalRuleDsl.g:1:448: T__92
                {
                mT__92(); 

                }
                break;
            case 75 :
                // InternalRuleDsl.g:1:454: T__93
                {
                mT__93(); 

                }
                break;
            case 76 :
                // InternalRuleDsl.g:1:460: T__94
                {
                mT__94(); 

                }
                break;
            case 77 :
                // InternalRuleDsl.g:1:466: T__95
                {
                mT__95(); 

                }
                break;
            case 78 :
                // InternalRuleDsl.g:1:472: T__96
                {
                mT__96(); 

                }
                break;
            case 79 :
                // InternalRuleDsl.g:1:478: T__97
                {
                mT__97(); 

                }
                break;
            case 80 :
                // InternalRuleDsl.g:1:484: T__98
                {
                mT__98(); 

                }
                break;
            case 81 :
                // InternalRuleDsl.g:1:490: T__99
                {
                mT__99(); 

                }
                break;
            case 82 :
                // InternalRuleDsl.g:1:496: T__100
                {
                mT__100(); 

                }
                break;
            case 83 :
                // InternalRuleDsl.g:1:503: T__101
                {
                mT__101(); 

                }
                break;
            case 84 :
                // InternalRuleDsl.g:1:510: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 85 :
                // InternalRuleDsl.g:1:524: RULE_LOGICALOPERATOR
                {
                mRULE_LOGICALOPERATOR(); 

                }
                break;
            case 86 :
                // InternalRuleDsl.g:1:545: RULE_CONDITIONALOPERATOR
                {
                mRULE_CONDITIONALOPERATOR(); 

                }
                break;
            case 87 :
                // InternalRuleDsl.g:1:570: RULE_SELECTOPERATOR
                {
                mRULE_SELECTOPERATOR(); 

                }
                break;
            case 88 :
                // InternalRuleDsl.g:1:590: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 89 :
                // InternalRuleDsl.g:1:602: RULE_SETOPERATOR
                {
                mRULE_SETOPERATOR(); 

                }
                break;
            case 90 :
                // InternalRuleDsl.g:1:619: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 91 :
                // InternalRuleDsl.g:1:628: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 92 :
                // InternalRuleDsl.g:1:637: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 93 :
                // InternalRuleDsl.g:1:650: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 94 :
                // InternalRuleDsl.g:1:658: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 95 :
                // InternalRuleDsl.g:1:670: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 96 :
                // InternalRuleDsl.g:1:686: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 97 :
                // InternalRuleDsl.g:1:702: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 98 :
                // InternalRuleDsl.g:1:710: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\1\uffff\1\70\1\72\1\74\1\77\1\103\1\106\1\112\1\114\1\116\1\120\1\123\1\125\1\130\5\132\1\uffff\2\132\1\uffff\1\157\1\132\1\uffff\2\132\2\uffff\1\132\5\uffff\7\132\1\u008b\3\132\1\u008b\1\65\5\uffff\1\u0095\26\uffff\1\u0097\6\uffff\1\u009a\4\uffff\1\132\1\uffff\11\132\1\u00a6\4\132\1\uffff\1\u00ab\1\u00ac\1\132\3\uffff\1\132\1\u00b0\2\132\1\uffff\2\132\1\u00b7\2\uffff\2\132\5\uffff\5\132\1\u00c0\3\132\2\uffff\1\u008b\2\uffff\3\132\11\uffff\1\u00c7\1\u00c8\11\132\1\uffff\2\132\1\u00d4\1\132\2\uffff\3\132\1\uffff\1\132\1\u00da\3\132\1\u00de\1\uffff\3\132\1\u00e2\2\132\1\u00e5\1\u00c0\1\uffff\1\132\2\u00e7\3\132\2\uffff\1\132\1\u00ec\10\132\1\u00f5\1\uffff\2\132\1\u00f8\2\132\1\uffff\1\u00fb\2\132\1\uffff\1\132\1\u00ff\1\132\1\uffff\1\u0101\1\132\1\uffff\1\132\1\uffff\4\132\1\uffff\1\132\1\u010a\5\132\1\u0110\1\uffff\2\132\1\uffff\1\u0113\1\132\1\uffff\1\u0115\1\u0116\1\132\1\uffff\1\u0118\1\uffff\1\132\1\u00e7\1\u011a\4\132\1\u011f\1\uffff\1\u0120\1\u0121\1\132\1\u0123\1\132\1\uffff\2\132\1\uffff\1\u0127\2\uffff\1\132\1\uffff\1\u0129\1\uffff\1\u011a\1\132\1\u012b\1\132\3\uffff\1\132\1\uffff\1\132\1\u012f\1\u0130\1\uffff\1\u0131\1\uffff\1\132\1\uffff\3\132\3\uffff\1\132\1\u0137\2\132\1\u011a\1\uffff\1\132\1\u013b\1\132\1\uffff\1\u013d\1\uffff";
    static final String DFA26_eofS =
        "\u013e\uffff";
    static final String DFA26_minS =
        "\1\0\1\75\1\174\1\46\1\53\1\55\2\52\4\75\2\56\1\141\1\154\1\145\1\146\1\141\1\uffff\1\156\1\145\1\uffff\1\72\1\150\1\uffff\1\150\1\156\2\uffff\1\141\5\uffff\2\145\1\111\1\116\1\122\1\117\1\101\1\56\1\116\1\130\1\116\1\56\1\44\5\uffff\1\75\26\uffff\1\75\6\uffff\1\74\4\uffff\1\154\1\uffff\1\164\1\163\1\141\1\160\1\154\1\151\1\156\1\160\1\163\1\44\1\154\1\157\1\162\1\156\1\uffff\2\44\1\146\3\uffff\1\145\1\44\1\160\1\165\1\uffff\1\145\1\144\1\44\2\uffff\1\155\1\163\5\uffff\1\167\1\154\1\164\1\126\1\104\1\44\1\125\1\116\1\130\2\uffff\1\56\2\uffff\1\111\1\103\1\124\11\uffff\2\44\2\145\1\164\2\145\1\164\1\143\1\157\1\164\1\uffff\1\163\1\155\1\44\1\141\2\uffff\1\141\1\156\1\157\1\uffff\1\145\1\44\1\145\1\162\1\154\1\44\1\uffff\1\160\1\145\1\143\1\44\1\154\1\165\2\44\1\uffff\1\116\2\44\1\117\2\105\2\uffff\1\156\1\44\1\151\1\162\2\143\1\150\1\162\1\141\1\145\1\44\1\uffff\1\154\1\165\1\44\1\167\1\157\1\uffff\1\44\2\145\1\uffff\1\157\1\44\1\150\1\uffff\1\44\1\162\1\uffff\1\124\1\uffff\1\116\1\120\1\122\1\144\1\uffff\1\143\1\44\1\164\1\150\1\162\1\164\1\156\1\44\1\uffff\2\154\1\uffff\1\44\1\146\1\uffff\2\44\1\163\1\uffff\1\44\1\uffff\1\156\2\44\1\124\1\123\1\163\1\151\1\44\1\uffff\2\44\1\157\1\44\1\143\1\uffff\1\171\1\164\1\uffff\1\44\2\uffff\1\145\1\uffff\1\44\1\uffff\1\44\1\105\1\44\1\157\3\uffff\1\156\1\uffff\1\145\2\44\1\uffff\1\44\1\uffff\1\103\1\uffff\1\156\1\151\1\157\3\uffff\1\124\1\44\1\172\1\146\1\44\1\uffff\1\145\1\44\1\144\1\uffff\1\44\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\76\1\174\1\46\1\75\1\76\5\75\1\76\1\56\1\72\1\141\1\170\1\171\1\156\1\162\1\uffff\1\156\1\157\1\uffff\1\72\1\171\1\uffff\1\150\1\163\2\uffff\1\157\5\uffff\1\165\1\145\1\111\1\116\1\122\1\117\1\111\1\170\1\116\1\130\1\116\1\154\1\172\5\uffff\1\75\26\uffff\1\75\6\uffff\1\74\4\uffff\1\162\1\uffff\1\164\1\163\1\141\1\160\1\154\1\151\1\156\1\160\1\163\1\172\1\154\1\157\1\162\1\156\1\uffff\2\172\1\146\3\uffff\1\162\1\172\1\160\1\171\1\uffff\1\151\1\144\1\172\2\uffff\1\155\1\164\5\uffff\1\167\1\154\1\164\1\126\1\104\1\172\1\125\1\116\1\130\2\uffff\1\154\2\uffff\1\111\1\103\1\124\11\uffff\2\172\2\145\1\164\2\145\1\164\1\143\1\157\1\164\1\uffff\1\163\1\155\1\172\1\141\2\uffff\1\141\1\156\1\157\1\uffff\1\145\1\172\1\145\1\162\1\154\1\172\1\uffff\1\160\1\145\1\143\1\172\1\154\1\165\2\172\1\uffff\1\116\2\172\1\117\2\105\2\uffff\1\156\1\172\1\151\1\162\2\143\1\150\1\162\1\141\1\145\1\172\1\uffff\1\154\1\165\1\172\1\167\1\157\1\uffff\1\172\2\145\1\uffff\1\157\1\172\1\150\1\uffff\1\172\1\162\1\uffff\1\124\1\uffff\1\116\1\120\1\122\1\163\1\uffff\1\143\1\172\1\164\1\150\1\162\1\164\1\156\1\172\1\uffff\2\154\1\uffff\1\172\1\146\1\uffff\2\172\1\163\1\uffff\1\172\1\uffff\1\156\2\172\1\124\1\123\1\163\1\151\1\172\1\uffff\2\172\1\157\1\172\1\143\1\uffff\1\171\1\164\1\uffff\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff\1\172\1\105\1\172\1\157\3\uffff\1\156\1\uffff\1\145\2\172\1\uffff\1\172\1\uffff\1\103\1\uffff\1\156\1\151\1\157\3\uffff\1\124\2\172\1\146\1\172\1\uffff\1\145\1\172\1\144\1\uffff\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\23\uffff\1\47\2\uffff\1\52\2\uffff\1\57\2\uffff\1\62\1\63\1\uffff\1\66\1\71\1\72\1\73\1\74\15\uffff\1\135\2\136\1\141\1\142\1\uffff\1\23\1\1\1\2\1\121\1\3\1\116\1\4\1\35\1\26\1\5\1\20\1\36\1\27\1\6\1\31\1\30\1\7\1\137\1\140\1\32\1\10\1\33\1\uffff\1\34\1\15\1\16\1\24\1\125\1\17\1\uffff\1\37\1\25\1\120\1\115\1\uffff\1\135\16\uffff\1\47\3\uffff\1\52\1\117\1\53\4\uffff\1\57\3\uffff\1\62\1\63\2\uffff\1\66\1\71\1\72\1\73\1\74\11\uffff\1\132\1\133\1\uffff\1\134\1\130\3\uffff\1\136\1\141\1\13\1\11\1\14\1\12\1\15\1\21\1\22\13\uffff\1\75\4\uffff\1\50\1\51\3\uffff\1\65\6\uffff\1\70\10\uffff\1\126\6\uffff\1\40\1\122\13\uffff\1\102\5\uffff\1\111\3\uffff\1\61\3\uffff\1\104\2\uffff\1\124\1\uffff\1\127\4\uffff\1\76\10\uffff\1\56\2\uffff\1\54\2\uffff\1\123\3\uffff\1\101\1\uffff\1\105\10\uffff\1\45\5\uffff\1\46\2\uffff\1\107\1\uffff\1\60\1\103\1\uffff\1\114\1\uffff\1\131\4\uffff\1\42\1\55\1\77\1\uffff\1\43\3\uffff\1\106\1\uffff\1\110\1\uffff\1\41\3\uffff\1\112\1\100\1\64\5\uffff\1\44\3\uffff\1\67\1\uffff\1\113";
    static final String DFA26_specialS =
        "\1\0\u013d\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\11\1\62\1\40\1\61\1\10\1\3\1\63\1\34\1\35\1\6\1\4\1\31\1\5\1\14\1\7\1\53\11\57\1\27\1\43\1\13\1\1\1\12\1\15\1\37\1\47\1\61\1\51\1\46\1\55\3\61\1\56\3\61\1\52\1\61\1\50\5\61\1\54\5\61\1\41\1\65\1\42\1\60\1\61\1\65\1\33\1\61\1\36\1\25\1\17\1\22\2\61\1\21\4\61\1\44\1\24\2\61\1\45\1\20\1\30\1\61\1\16\1\32\3\61\1\23\1\2\1\26\uff82\65",
            "\1\66\1\67",
            "\1\71",
            "\1\73",
            "\1\76\21\uffff\1\75",
            "\1\102\17\uffff\1\100\1\101",
            "\1\105\22\uffff\1\104",
            "\1\110\4\uffff\1\111\15\uffff\1\107",
            "\1\113",
            "\1\115",
            "\1\117",
            "\1\122\1\121",
            "\1\124",
            "\1\127\13\uffff\1\126",
            "\1\131",
            "\1\134\13\uffff\1\133",
            "\1\137\16\uffff\1\135\1\136\1\uffff\1\140\1\uffff\1\141",
            "\1\144\6\uffff\1\142\1\143",
            "\1\145\7\uffff\1\150\5\uffff\1\147\2\uffff\1\146",
            "",
            "\1\152",
            "\1\154\11\uffff\1\153",
            "",
            "\1\156",
            "\1\160\6\uffff\1\161\2\uffff\1\163\6\uffff\1\162",
            "",
            "\1\165",
            "\1\166\4\uffff\1\167",
            "",
            "",
            "\1\173\15\uffff\1\172",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081\17\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0089\7\uffff\1\u0088",
            "\1\u008e\1\uffff\12\u008c\10\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d\13\uffff\1\u008a\6\uffff\1\u008c\2\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d\13\uffff\1\u008a",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u008e\1\uffff\12\u008c\10\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d\22\uffff\1\u008c\2\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d",
            "\1\132\34\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "\1\u009b\5\uffff\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00ad",
            "",
            "",
            "",
            "\1\u00ae\14\uffff\1\u00af",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00b1",
            "\1\u00b3\3\uffff\1\u00b2",
            "",
            "\1\u00b4\3\uffff\1\u00b5",
            "\1\u00b6",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9\1\u00ba",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\1\u008e\1\uffff\12\u008c\10\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d\22\uffff\1\u008c\2\uffff\1\u008d\1\uffff\3\u008d\5\uffff\1\u008d",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00d5",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00e3",
            "\1\u00e4",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u00e6",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "",
            "\1\u00eb",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0100",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0102",
            "",
            "\1\u0103",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107\16\uffff\1\u0108",
            "",
            "\1\u0109",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0114",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0117",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u0119",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0122",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "",
            "\1\u0128",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u012a",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u012c",
            "",
            "",
            "",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "",
            "\1\u0136",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u0138",
            "\1\u0139",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "\1\u013a",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u013c",
            "",
            "\1\132\13\uffff\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_CONDITIONALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='=') ) {s = 1;}

                        else if ( (LA26_0=='|') ) {s = 2;}

                        else if ( (LA26_0=='&') ) {s = 3;}

                        else if ( (LA26_0=='+') ) {s = 4;}

                        else if ( (LA26_0=='-') ) {s = 5;}

                        else if ( (LA26_0=='*') ) {s = 6;}

                        else if ( (LA26_0=='/') ) {s = 7;}

                        else if ( (LA26_0=='%') ) {s = 8;}

                        else if ( (LA26_0=='!') ) {s = 9;}

                        else if ( (LA26_0=='>') ) {s = 10;}

                        else if ( (LA26_0=='<') ) {s = 11;}

                        else if ( (LA26_0=='.') ) {s = 12;}

                        else if ( (LA26_0=='?') ) {s = 13;}

                        else if ( (LA26_0=='v') ) {s = 14;}

                        else if ( (LA26_0=='e') ) {s = 15;}

                        else if ( (LA26_0=='s') ) {s = 16;}

                        else if ( (LA26_0=='i') ) {s = 17;}

                        else if ( (LA26_0=='f') ) {s = 18;}

                        else if ( (LA26_0=='{') ) {s = 19;}

                        else if ( (LA26_0=='o') ) {s = 20;}

                        else if ( (LA26_0=='d') ) {s = 21;}

                        else if ( (LA26_0=='}') ) {s = 22;}

                        else if ( (LA26_0==':') ) {s = 23;}

                        else if ( (LA26_0=='t') ) {s = 24;}

                        else if ( (LA26_0==',') ) {s = 25;}

                        else if ( (LA26_0=='w') ) {s = 26;}

                        else if ( (LA26_0=='a') ) {s = 27;}

                        else if ( (LA26_0=='(') ) {s = 28;}

                        else if ( (LA26_0==')') ) {s = 29;}

                        else if ( (LA26_0=='c') ) {s = 30;}

                        else if ( (LA26_0=='@') ) {s = 31;}

                        else if ( (LA26_0=='#') ) {s = 32;}

                        else if ( (LA26_0=='[') ) {s = 33;}

                        else if ( (LA26_0==']') ) {s = 34;}

                        else if ( (LA26_0==';') ) {s = 35;}

                        else if ( (LA26_0=='n') ) {s = 36;}

                        else if ( (LA26_0=='r') ) {s = 37;}

                        else if ( (LA26_0=='D') ) {s = 38;}

                        else if ( (LA26_0=='A') ) {s = 39;}

                        else if ( (LA26_0=='O') ) {s = 40;}

                        else if ( (LA26_0=='C') ) {s = 41;}

                        else if ( (LA26_0=='M') ) {s = 42;}

                        else if ( (LA26_0=='0') ) {s = 43;}

                        else if ( (LA26_0=='U') ) {s = 44;}

                        else if ( (LA26_0=='E') ) {s = 45;}

                        else if ( (LA26_0=='I') ) {s = 46;}

                        else if ( ((LA26_0>='1' && LA26_0<='9')) ) {s = 47;}

                        else if ( (LA26_0=='^') ) {s = 48;}

                        else if ( (LA26_0=='$'||LA26_0=='B'||(LA26_0>='F' && LA26_0<='H')||(LA26_0>='J' && LA26_0<='L')||LA26_0=='N'||(LA26_0>='P' && LA26_0<='T')||(LA26_0>='V' && LA26_0<='Z')||LA26_0=='_'||LA26_0=='b'||(LA26_0>='g' && LA26_0<='h')||(LA26_0>='j' && LA26_0<='m')||(LA26_0>='p' && LA26_0<='q')||LA26_0=='u'||(LA26_0>='x' && LA26_0<='z')) ) {s = 49;}

                        else if ( (LA26_0=='\"') ) {s = 50;}

                        else if ( (LA26_0=='\'') ) {s = 51;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 52;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='\\'||LA26_0=='`'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}