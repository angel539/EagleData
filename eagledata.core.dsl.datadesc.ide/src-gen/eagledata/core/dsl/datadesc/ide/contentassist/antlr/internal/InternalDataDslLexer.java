package eagledata.core.dsl.datadesc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_CARDINALITY_SYMBOLS=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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

    public InternalDataDslLexer() {;} 
    public InternalDataDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDataDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDataDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:11:7: ( 'order' )
            // InternalDataDsl.g:11:9: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:12:7: ( 'char' )
            // InternalDataDsl.g:12:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:13:7: ( 'digit' )
            // InternalDataDsl.g:13:9: 'digit'
            {
            match("digit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:14:7: ( 'anycase_string' )
            // InternalDataDsl.g:14:9: 'anycase_string'
            {
            match("anycase_string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:15:7: ( 'lowercase_string' )
            // InternalDataDsl.g:15:9: 'lowercase_string'
            {
            match("lowercase_string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:16:7: ( 'uppercase_string' )
            // InternalDataDsl.g:16:9: 'uppercase_string'
            {
            match("uppercase_string"); 


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
            // InternalDataDsl.g:17:7: ( 'digits' )
            // InternalDataDsl.g:17:9: 'digits'
            {
            match("digits"); 


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
            // InternalDataDsl.g:18:7: ( 'String' )
            // InternalDataDsl.g:18:9: 'String'
            {
            match("String"); 


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
            // InternalDataDsl.g:19:7: ( 'Url' )
            // InternalDataDsl.g:19:9: 'Url'
            {
            match("Url"); 


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
            // InternalDataDsl.g:20:7: ( 'Int' )
            // InternalDataDsl.g:20:9: 'Int'
            {
            match("Int"); 


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
            // InternalDataDsl.g:21:7: ( 'LongInt' )
            // InternalDataDsl.g:21:9: 'LongInt'
            {
            match("LongInt"); 


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
            // InternalDataDsl.g:22:7: ( 'Real' )
            // InternalDataDsl.g:22:9: 'Real'
            {
            match("Real"); 


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
            // InternalDataDsl.g:23:7: ( 'Date' )
            // InternalDataDsl.g:23:9: 'Date'
            {
            match("Date"); 


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
            // InternalDataDsl.g:24:7: ( 'Time' )
            // InternalDataDsl.g:24:9: 'Time'
            {
            match("Time"); 


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
            // InternalDataDsl.g:25:7: ( 'Year' )
            // InternalDataDsl.g:25:9: 'Year'
            {
            match("Year"); 


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
            // InternalDataDsl.g:26:7: ( 'Month' )
            // InternalDataDsl.g:26:9: 'Month'
            {
            match("Month"); 


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
            // InternalDataDsl.g:27:7: ( 'Day' )
            // InternalDataDsl.g:27:9: 'Day'
            {
            match("Day"); 


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
            // InternalDataDsl.g:28:7: ( 'Boolean' )
            // InternalDataDsl.g:28:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalDataDsl.g:29:7: ( 'Lat' )
            // InternalDataDsl.g:29:9: 'Lat'
            {
            match("Lat"); 


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
            // InternalDataDsl.g:30:7: ( 'Long' )
            // InternalDataDsl.g:30:9: 'Long'
            {
            match("Long"); 


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
            // InternalDataDsl.g:31:7: ( 'Percent' )
            // InternalDataDsl.g:31:9: 'Percent'
            {
            match("Percent"); 


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
            // InternalDataDsl.g:32:7: ( 'Email' )
            // InternalDataDsl.g:32:9: 'Email'
            {
            match("Email"); 


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
            // InternalDataDsl.g:33:7: ( 'Currency' )
            // InternalDataDsl.g:33:9: 'Currency'
            {
            match("Currency"); 


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
            // InternalDataDsl.g:34:7: ( 'CreditCard' )
            // InternalDataDsl.g:34:9: 'CreditCard'
            {
            match("CreditCard"); 


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
            // InternalDataDsl.g:35:7: ( 'IBAN' )
            // InternalDataDsl.g:35:9: 'IBAN'
            {
            match("IBAN"); 


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
            // InternalDataDsl.g:36:7: ( 'ISBN' )
            // InternalDataDsl.g:36:9: 'ISBN'
            {
            match("ISBN"); 


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
            // InternalDataDsl.g:37:7: ( 'ISSN' )
            // InternalDataDsl.g:37:9: 'ISSN'
            {
            match("ISSN"); 


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
            // InternalDataDsl.g:38:7: ( 'Inet' )
            // InternalDataDsl.g:38:9: 'Inet'
            {
            match("Inet"); 


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
            // InternalDataDsl.g:39:7: ( 'null' )
            // InternalDataDsl.g:39:9: 'null'
            {
            match("null"); 


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
            // InternalDataDsl.g:40:7: ( 'separator' )
            // InternalDataDsl.g:40:9: 'separator'
            {
            match("separator"); 


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
            // InternalDataDsl.g:41:7: ( 'default' )
            // InternalDataDsl.g:41:9: 'default'
            {
            match("default"); 


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
            // InternalDataDsl.g:42:7: ( 'regex' )
            // InternalDataDsl.g:42:9: 'regex'
            {
            match("regex"); 


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
            // InternalDataDsl.g:43:7: ( 'flags' )
            // InternalDataDsl.g:43:9: 'flags'
            {
            match("flags"); 


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
            // InternalDataDsl.g:44:7: ( 'decimalchar' )
            // InternalDataDsl.g:44:9: 'decimalchar'
            {
            match("decimalchar"); 


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
            // InternalDataDsl.g:45:7: ( 'pattern' )
            // InternalDataDsl.g:45:9: 'pattern'
            {
            match("pattern"); 


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
            // InternalDataDsl.g:46:7: ( 'format' )
            // InternalDataDsl.g:46:9: 'format'
            {
            match("format"); 


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
            // InternalDataDsl.g:47:7: ( 'minLength' )
            // InternalDataDsl.g:47:9: 'minLength'
            {
            match("minLength"); 


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
            // InternalDataDsl.g:48:7: ( 'maxLength' )
            // InternalDataDsl.g:48:9: 'maxLength'
            {
            match("maxLength"); 


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
            // InternalDataDsl.g:49:7: ( 'min' )
            // InternalDataDsl.g:49:9: 'min'
            {
            match("min"); 


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
            // InternalDataDsl.g:50:7: ( 'max' )
            // InternalDataDsl.g:50:9: 'max'
            {
            match("max"); 


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
            // InternalDataDsl.g:51:7: ( 'defaultvalue' )
            // InternalDataDsl.g:51:9: 'defaultvalue'
            {
            match("defaultvalue"); 


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
            // InternalDataDsl.g:52:7: ( 'minDouble' )
            // InternalDataDsl.g:52:9: 'minDouble'
            {
            match("minDouble"); 


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
            // InternalDataDsl.g:53:7: ( 'maxDouble' )
            // InternalDataDsl.g:53:9: 'maxDouble'
            {
            match("maxDouble"); 


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
            // InternalDataDsl.g:54:7: ( 'defaultvalueDouble' )
            // InternalDataDsl.g:54:9: 'defaultvalueDouble'
            {
            match("defaultvalueDouble"); 


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
            // InternalDataDsl.g:55:7: ( 'nullable' )
            // InternalDataDsl.g:55:9: 'nullable'
            {
            match("nullable"); 


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
            // InternalDataDsl.g:56:7: ( 'casesensitive' )
            // InternalDataDsl.g:56:9: 'casesensitive'
            {
            match("casesensitive"); 


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
            // InternalDataDsl.g:57:7: ( 'import' )
            // InternalDataDsl.g:57:9: 'import'
            {
            match("import"); 


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
            // InternalDataDsl.g:58:7: ( '.*' )
            // InternalDataDsl.g:58:9: '.*'
            {
            match(".*"); 


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
            // InternalDataDsl.g:59:7: ( '.' )
            // InternalDataDsl.g:59:9: '.'
            {
            match('.'); 

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
            // InternalDataDsl.g:60:7: ( 'package' )
            // InternalDataDsl.g:60:9: 'package'
            {
            match("package"); 


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
            // InternalDataDsl.g:61:7: ( '{' )
            // InternalDataDsl.g:61:9: '{'
            {
            match('{'); 

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
            // InternalDataDsl.g:62:7: ( '}' )
            // InternalDataDsl.g:62:9: '}'
            {
            match('}'); 

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
            // InternalDataDsl.g:63:7: ( '@' )
            // InternalDataDsl.g:63:9: '@'
            {
            match('@'); 

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
            // InternalDataDsl.g:64:7: ( '[' )
            // InternalDataDsl.g:64:9: '['
            {
            match('['); 

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
            // InternalDataDsl.g:65:7: ( ',' )
            // InternalDataDsl.g:65:9: ','
            {
            match(','); 

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
            // InternalDataDsl.g:66:7: ( ']' )
            // InternalDataDsl.g:66:9: ']'
            {
            match(']'); 

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
            // InternalDataDsl.g:67:7: ( '(' )
            // InternalDataDsl.g:67:9: '('
            {
            match('('); 

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
            // InternalDataDsl.g:68:7: ( ')' )
            // InternalDataDsl.g:68:9: ')'
            {
            match(')'); 

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
            // InternalDataDsl.g:69:7: ( 'description' )
            // InternalDataDsl.g:69:9: 'description'
            {
            match("description"); 


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
            // InternalDataDsl.g:70:7: ( ':' )
            // InternalDataDsl.g:70:9: ':'
            {
            match(':'); 

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
            // InternalDataDsl.g:71:7: ( 'fragment' )
            // InternalDataDsl.g:71:9: 'fragment'
            {
            match("fragment"); 


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
            // InternalDataDsl.g:72:7: ( 'feed' )
            // InternalDataDsl.g:72:9: 'feed'
            {
            match("feed"); 


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
            // InternalDataDsl.g:73:7: ( 'datatype' )
            // InternalDataDsl.g:73:9: 'datatype'
            {
            match("datatype"); 


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
            // InternalDataDsl.g:74:7: ( 'enumeration' )
            // InternalDataDsl.g:74:9: 'enumeration'
            {
            match("enumeration"); 


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
            // InternalDataDsl.g:75:7: ( '=' )
            // InternalDataDsl.g:75:9: '='
            {
            match('='); 

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
            // InternalDataDsl.g:76:7: ( 'key' )
            // InternalDataDsl.g:76:9: 'key'
            {
            match("key"); 


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
            // InternalDataDsl.g:77:7: ( 'unique' )
            // InternalDataDsl.g:77:9: 'unique'
            {
            match("unique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6899:14: ( ( 'true' | 'false' ) )
            // InternalDataDsl.g:6899:16: ( 'true' | 'false' )
            {
            // InternalDataDsl.g:6899:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataDsl.g:6899:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:6899:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_CARDINALITY_SYMBOLS"
    public final void mRULE_CARDINALITY_SYMBOLS() throws RecognitionException {
        try {
            int _type = RULE_CARDINALITY_SYMBOLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6901:26: ( ( '0' | '1' | '2' | '-1' ) )
            // InternalDataDsl.g:6901:28: ( '0' | '1' | '2' | '-1' )
            {
            // InternalDataDsl.g:6901:28: ( '0' | '1' | '2' | '-1' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt2=1;
                }
                break;
            case '1':
                {
                alt2=2;
                }
                break;
            case '2':
                {
                alt2=3;
                }
                break;
            case '-':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:6901:29: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:6901:33: '1'
                    {
                    match('1'); 

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:6901:37: '2'
                    {
                    match('2'); 

                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:6901:41: '-1'
                    {
                    match("-1"); 


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
    // $ANTLR end "RULE_CARDINALITY_SYMBOLS"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6903:13: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalDataDsl.g:6903:15: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalDataDsl.g:6903:15: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataDsl.g:6903:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6905:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDataDsl.g:6905:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDataDsl.g:6905:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:6905:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDataDsl.g:6905:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6907:10: ( ( '0' .. '9' )+ )
            // InternalDataDsl.g:6907:12: ( '0' .. '9' )+
            {
            // InternalDataDsl.g:6907:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDataDsl.g:6907:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDataDsl.g:6909:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDataDsl.g:6909:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDataDsl.g:6909:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:6909:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDataDsl.g:6909:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDsl.g:6909:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataDsl.g:6909:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:6909:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDataDsl.g:6909:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDataDsl.g:6909:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDataDsl.g:6909:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

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
            // InternalDataDsl.g:6911:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDataDsl.g:6911:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDataDsl.g:6911:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataDsl.g:6911:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalDataDsl.g:6913:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDataDsl.g:6913:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDataDsl.g:6913:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataDsl.g:6913:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalDataDsl.g:6913:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:6913:41: ( '\\r' )? '\\n'
                    {
                    // InternalDataDsl.g:6913:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDataDsl.g:6913:41: '\\r'
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
            // InternalDataDsl.g:6915:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDataDsl.g:6915:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDataDsl.g:6915:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDataDsl.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalDataDsl.g:6917:16: ( . )
            // InternalDataDsl.g:6917:18: .
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
        // InternalDataDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BOOLEAN | RULE_CARDINALITY_SYMBOLS | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=77;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalDataDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalDataDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalDataDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalDataDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalDataDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalDataDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalDataDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalDataDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalDataDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalDataDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalDataDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalDataDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalDataDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalDataDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalDataDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalDataDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalDataDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalDataDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalDataDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalDataDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalDataDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalDataDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalDataDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalDataDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalDataDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalDataDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalDataDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalDataDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalDataDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalDataDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalDataDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalDataDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalDataDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalDataDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalDataDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalDataDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalDataDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalDataDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalDataDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalDataDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalDataDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalDataDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalDataDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalDataDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalDataDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalDataDsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalDataDsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalDataDsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalDataDsl.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalDataDsl.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalDataDsl.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalDataDsl.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalDataDsl.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalDataDsl.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalDataDsl.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalDataDsl.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalDataDsl.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalDataDsl.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalDataDsl.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalDataDsl.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalDataDsl.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalDataDsl.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalDataDsl.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalDataDsl.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalDataDsl.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalDataDsl.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalDataDsl.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalDataDsl.g:1:412: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 69 :
                // InternalDataDsl.g:1:425: RULE_CARDINALITY_SYMBOLS
                {
                mRULE_CARDINALITY_SYMBOLS(); 

                }
                break;
            case 70 :
                // InternalDataDsl.g:1:450: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 71 :
                // InternalDataDsl.g:1:462: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // InternalDataDsl.g:1:470: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // InternalDataDsl.g:1:479: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalDataDsl.g:1:491: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // InternalDataDsl.g:1:507: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalDataDsl.g:1:523: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalDataDsl.g:1:531: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\32\66\1\136\11\uffff\1\66\1\uffff\2\66\3\154\1\64\1\160\1\64\1\uffff\3\64\2\uffff\1\66\1\uffff\46\66\13\uffff\1\66\1\uffff\2\66\2\uffff\1\160\1\154\5\uffff\15\66\1\u00b2\1\u00b3\5\66\1\u00b9\2\66\1\u00bc\22\66\1\u00d1\1\u00d4\2\66\1\u00d7\2\66\1\u00da\13\66\2\uffff\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00eb\1\uffff\1\u00ec\1\u00ed\1\uffff\1\u00ee\1\u00ef\6\66\1\u00f7\5\66\1\u00fd\5\66\1\uffff\2\66\1\uffff\2\66\1\uffff\1\u0107\1\u0108\1\uffff\1\66\1\u010b\11\66\4\uffff\1\66\5\uffff\1\u0116\2\66\1\u0119\3\66\1\uffff\1\66\1\u011e\1\u011f\2\66\1\uffff\1\u0107\10\66\2\uffff\1\66\1\u012b\1\uffff\7\66\1\u0133\1\u0134\1\66\1\uffff\2\66\1\uffff\4\66\2\uffff\1\u013c\7\66\1\u0144\2\66\1\uffff\1\u0148\6\66\2\uffff\1\u014f\1\u0150\1\u0151\4\66\1\uffff\1\66\1\u0157\1\u0158\4\66\1\uffff\3\66\1\uffff\2\66\1\u0162\3\66\3\uffff\1\u0166\1\66\1\u0168\1\66\1\u016a\2\uffff\11\66\1\uffff\3\66\1\uffff\1\66\1\uffff\1\u0178\1\uffff\1\u0179\1\u017a\1\u017b\1\u017c\10\66\1\u0185\5\uffff\3\66\1\u0189\1\u018a\3\66\1\uffff\1\u018e\1\66\1\u0191\2\uffff\3\66\1\uffff\1\u0195\1\66\1\uffff\3\66\1\uffff\1\66\1\u019b\3\66\1\uffff\3\66\1\u01a2\1\u01a3\1\66\2\uffff\1\u01a5\1\uffff";
    static final String DFA15_eofS =
        "\u01a6\uffff";
    static final String DFA15_minS =
        "\1\0\1\162\2\141\1\156\1\157\1\156\1\164\1\162\1\102\1\141\1\145\1\141\1\151\1\145\2\157\1\145\1\155\1\162\1\165\2\145\3\141\1\155\1\52\11\uffff\1\156\1\uffff\1\145\1\162\3\56\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\144\1\uffff\1\141\1\163\1\147\1\143\1\164\1\171\1\167\1\160\1\151\1\162\1\154\1\145\1\101\1\102\1\156\1\164\1\141\1\164\1\155\1\141\1\156\1\157\1\162\1\141\1\162\1\145\1\154\1\160\1\147\1\141\1\162\1\141\1\145\1\154\1\143\1\156\1\170\1\160\13\uffff\1\165\1\uffff\1\171\1\165\2\uffff\2\56\5\uffff\1\145\1\162\1\145\1\151\1\141\1\151\1\143\1\141\1\143\2\145\1\161\1\151\2\60\1\164\3\116\1\147\1\60\1\154\1\145\1\60\1\145\1\162\1\164\1\154\1\143\1\151\1\162\1\144\1\154\1\141\1\145\1\147\1\155\1\147\1\144\1\163\1\164\1\153\2\60\1\157\1\155\1\60\1\145\1\162\1\60\1\163\1\164\1\165\1\155\1\162\1\164\1\141\2\162\1\165\1\156\2\uffff\5\60\1\uffff\2\60\1\uffff\2\60\1\150\2\145\1\154\1\145\1\151\1\60\1\162\1\170\1\163\1\141\1\155\1\60\2\145\1\141\1\145\1\157\1\uffff\1\145\1\157\1\uffff\1\162\1\145\1\uffff\2\60\1\uffff\1\145\1\60\1\154\1\141\1\151\1\171\1\163\2\143\1\145\1\147\4\uffff\1\156\5\uffff\1\60\1\141\1\156\1\60\1\156\1\164\1\142\1\uffff\1\141\2\60\1\164\1\145\1\uffff\1\60\1\162\1\147\1\156\1\165\1\156\1\165\1\164\1\162\2\uffff\1\156\1\60\1\uffff\1\164\1\154\2\160\1\145\2\141\2\60\1\164\1\uffff\1\156\1\164\1\uffff\1\143\1\103\1\154\1\164\2\uffff\1\60\2\156\1\145\1\147\1\142\1\147\1\142\1\60\1\141\1\163\1\uffff\1\60\1\143\1\164\1\145\1\137\2\163\2\uffff\3\60\1\171\1\141\1\145\1\157\1\uffff\1\164\2\60\1\164\1\154\1\164\1\154\1\uffff\1\164\1\151\1\141\1\uffff\1\150\1\151\1\60\1\163\2\145\3\uffff\1\60\1\162\1\60\1\162\1\60\2\uffff\1\150\1\145\1\150\1\145\1\151\1\164\1\154\1\141\1\157\1\uffff\1\164\2\137\1\uffff\1\144\1\uffff\1\60\1\uffff\4\60\1\157\1\151\1\165\1\162\1\156\1\162\2\163\1\60\5\uffff\1\156\1\166\1\145\2\60\1\151\2\164\1\uffff\1\60\1\145\1\60\2\uffff\1\156\2\162\1\uffff\1\60\1\157\1\uffff\1\147\2\151\1\uffff\1\165\1\60\2\156\1\142\1\uffff\2\147\1\154\2\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\162\1\150\1\151\1\156\1\157\1\160\1\164\1\162\1\156\1\157\1\145\1\141\1\151\1\145\2\157\1\145\1\155\2\165\2\145\1\162\1\141\1\151\1\155\1\52\11\uffff\1\156\1\uffff\1\145\1\162\5\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\1\141\1\163\1\147\1\163\1\164\1\171\1\167\1\160\1\151\1\162\1\154\1\164\1\101\1\123\1\156\1\164\1\141\1\171\1\155\1\141\1\156\1\157\1\162\1\141\1\162\1\145\1\154\1\160\1\147\1\141\1\162\1\141\1\145\1\154\1\164\1\156\1\170\1\160\13\uffff\1\165\1\uffff\1\171\1\165\2\uffff\2\71\5\uffff\1\145\1\162\1\145\1\151\1\141\1\151\1\143\1\141\1\143\2\145\1\161\1\151\2\172\1\164\3\116\1\147\1\172\1\154\1\145\1\172\1\145\1\162\1\164\1\154\1\143\1\151\1\162\1\144\1\154\1\141\1\145\1\147\1\155\1\147\1\144\1\163\1\164\1\153\2\172\1\157\1\155\1\172\1\145\1\162\1\172\1\163\1\164\1\165\1\155\1\162\1\164\1\141\2\162\1\165\1\156\2\uffff\5\172\1\uffff\2\172\1\uffff\2\172\1\150\2\145\1\154\1\145\1\151\1\172\1\162\1\170\1\163\1\141\1\155\1\172\2\145\1\141\1\145\1\157\1\uffff\1\145\1\157\1\uffff\1\162\1\145\1\uffff\2\172\1\uffff\1\145\1\172\1\154\1\141\1\151\1\171\1\163\2\143\1\145\1\147\4\uffff\1\156\5\uffff\1\172\1\141\1\156\1\172\1\156\1\164\1\142\1\uffff\1\141\2\172\1\164\1\145\1\uffff\1\172\1\162\1\147\1\156\1\165\1\156\1\165\1\164\1\162\2\uffff\1\156\1\172\1\uffff\1\164\1\154\2\160\1\145\2\141\2\172\1\164\1\uffff\1\156\1\164\1\uffff\1\143\1\103\1\154\1\164\2\uffff\1\172\2\156\1\145\1\147\1\142\1\147\1\142\1\172\1\141\1\163\1\uffff\1\172\1\143\1\164\1\145\1\137\2\163\2\uffff\3\172\1\171\1\141\1\145\1\157\1\uffff\1\164\2\172\1\164\1\154\1\164\1\154\1\uffff\1\164\1\151\1\141\1\uffff\1\150\1\151\1\172\1\163\2\145\3\uffff\1\172\1\162\1\172\1\162\1\172\2\uffff\1\150\1\145\1\150\1\145\1\151\1\164\1\154\1\141\1\157\1\uffff\1\164\2\137\1\uffff\1\144\1\uffff\1\172\1\uffff\4\172\1\157\1\151\1\165\1\162\1\156\1\162\2\163\1\172\5\uffff\1\156\1\166\1\145\2\172\1\151\2\164\1\uffff\1\172\1\145\1\172\2\uffff\1\156\2\162\1\uffff\1\172\1\157\1\uffff\1\147\2\151\1\uffff\1\165\1\172\2\156\1\142\1\uffff\2\147\1\154\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\34\uffff\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\74\1\uffff\1\101\10\uffff\1\107\3\uffff\1\114\1\115\1\uffff\1\107\46\uffff\1\60\1\61\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\74\1\uffff\1\101\2\uffff\1\105\1\106\2\uffff\1\110\1\111\1\112\1\113\1\114\75\uffff\1\11\1\12\5\uffff\1\23\2\uffff\1\21\24\uffff\1\47\2\uffff\1\50\2\uffff\1\102\2\uffff\1\2\13\uffff\1\34\1\31\1\32\1\33\1\uffff\1\24\1\14\1\15\1\16\1\17\7\uffff\1\35\5\uffff\1\76\11\uffff\1\104\1\1\2\uffff\1\3\12\uffff\1\20\2\uffff\1\26\4\uffff\1\40\1\41\13\uffff\1\7\7\uffff\1\103\1\10\7\uffff\1\44\7\uffff\1\57\3\uffff\1\37\6\uffff\1\13\1\22\1\25\5\uffff\1\43\1\62\11\uffff\1\77\3\uffff\1\27\1\uffff\1\55\1\uffff\1\75\15\uffff\1\36\1\45\1\52\1\46\1\53\10\uffff\1\30\3\uffff\1\42\1\73\3\uffff\1\100\2\uffff\1\51\3\uffff\1\56\5\uffff\1\4\6\uffff\1\5\1\6\1\uffff\1\54";
    static final String DFA15_specialS =
        "\1\2\57\uffff\1\1\1\0\u0174\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\64\1\60\4\64\1\61\1\42\1\43\2\64\1\40\1\54\1\33\1\62\1\51\1\52\1\53\7\55\1\44\2\64\1\46\2\64\1\36\1\57\1\20\1\23\1\14\1\22\3\57\1\11\2\57\1\12\1\17\2\57\1\21\1\57\1\13\1\7\1\15\1\10\3\57\1\16\1\57\1\37\1\64\1\41\1\56\1\57\1\64\1\4\1\57\1\2\1\3\1\45\1\27\2\57\1\32\1\57\1\47\1\5\1\31\1\24\1\1\1\30\1\57\1\26\1\25\1\50\1\6\5\57\1\34\1\64\1\35\uff82\64",
            "\1\65",
            "\1\70\6\uffff\1\67",
            "\1\73\3\uffff\1\72\3\uffff\1\71",
            "\1\74",
            "\1\75",
            "\1\77\1\uffff\1\76",
            "\1\100",
            "\1\101",
            "\1\103\20\uffff\1\104\32\uffff\1\102",
            "\1\106\15\uffff\1\105",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\120\2\uffff\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\130\3\uffff\1\127\6\uffff\1\124\2\uffff\1\125\2\uffff\1\126",
            "\1\131",
            "\1\133\7\uffff\1\132",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "",
            "\1\152",
            "\1\153",
            "\1\155\1\uffff\12\156",
            "\1\155\1\uffff\12\156",
            "\1\155\1\uffff\12\156",
            "\1\155\1\157\10\155",
            "\1\155\1\uffff\12\156",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\0\161",
            "\0\161",
            "\1\162\4\uffff\1\163",
            "",
            "",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\172\2\uffff\1\171\14\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\16\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086\20\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\4\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\20\uffff\1\u009d",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
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
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\155\1\uffff\12\156",
            "\1\155\1\uffff\12\155",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00ba",
            "\1\u00bb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\12\66\7\uffff\3\66\1\u00d0\7\66\1\u00cf\16\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u00d3\7\66\1\u00d2\16\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d5",
            "\1\u00d6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d8",
            "\1\u00d9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\10\66\1\u00ea\21\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\1\u00f6\31\66",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0109",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\22\66\1\u010a\7\66",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "",
            "",
            "\1\u0115",
            "",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0117",
            "\1\u0118",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0120",
            "\1\u0121",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "",
            "\1\u012a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0145",
            "\1\u0146",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\25\66\1\u0147\4\66",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0167",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0169",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u018f",
            "\12\66\7\uffff\3\66\1\u0190\26\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0196",
            "",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\u019a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01a4",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BOOLEAN | RULE_CARDINALITY_SYMBOLS | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_49 = input.LA(1);

                        s = -1;
                        if ( ((LA15_49>='\u0000' && LA15_49<='\uFFFF')) ) {s = 113;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_48 = input.LA(1);

                        s = -1;
                        if ( ((LA15_48>='\u0000' && LA15_48<='\uFFFF')) ) {s = 113;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='o') ) {s = 1;}

                        else if ( (LA15_0=='c') ) {s = 2;}

                        else if ( (LA15_0=='d') ) {s = 3;}

                        else if ( (LA15_0=='a') ) {s = 4;}

                        else if ( (LA15_0=='l') ) {s = 5;}

                        else if ( (LA15_0=='u') ) {s = 6;}

                        else if ( (LA15_0=='S') ) {s = 7;}

                        else if ( (LA15_0=='U') ) {s = 8;}

                        else if ( (LA15_0=='I') ) {s = 9;}

                        else if ( (LA15_0=='L') ) {s = 10;}

                        else if ( (LA15_0=='R') ) {s = 11;}

                        else if ( (LA15_0=='D') ) {s = 12;}

                        else if ( (LA15_0=='T') ) {s = 13;}

                        else if ( (LA15_0=='Y') ) {s = 14;}

                        else if ( (LA15_0=='M') ) {s = 15;}

                        else if ( (LA15_0=='B') ) {s = 16;}

                        else if ( (LA15_0=='P') ) {s = 17;}

                        else if ( (LA15_0=='E') ) {s = 18;}

                        else if ( (LA15_0=='C') ) {s = 19;}

                        else if ( (LA15_0=='n') ) {s = 20;}

                        else if ( (LA15_0=='s') ) {s = 21;}

                        else if ( (LA15_0=='r') ) {s = 22;}

                        else if ( (LA15_0=='f') ) {s = 23;}

                        else if ( (LA15_0=='p') ) {s = 24;}

                        else if ( (LA15_0=='m') ) {s = 25;}

                        else if ( (LA15_0=='i') ) {s = 26;}

                        else if ( (LA15_0=='.') ) {s = 27;}

                        else if ( (LA15_0=='{') ) {s = 28;}

                        else if ( (LA15_0=='}') ) {s = 29;}

                        else if ( (LA15_0=='@') ) {s = 30;}

                        else if ( (LA15_0=='[') ) {s = 31;}

                        else if ( (LA15_0==',') ) {s = 32;}

                        else if ( (LA15_0==']') ) {s = 33;}

                        else if ( (LA15_0=='(') ) {s = 34;}

                        else if ( (LA15_0==')') ) {s = 35;}

                        else if ( (LA15_0==':') ) {s = 36;}

                        else if ( (LA15_0=='e') ) {s = 37;}

                        else if ( (LA15_0=='=') ) {s = 38;}

                        else if ( (LA15_0=='k') ) {s = 39;}

                        else if ( (LA15_0=='t') ) {s = 40;}

                        else if ( (LA15_0=='0') ) {s = 41;}

                        else if ( (LA15_0=='1') ) {s = 42;}

                        else if ( (LA15_0=='2') ) {s = 43;}

                        else if ( (LA15_0=='-') ) {s = 44;}

                        else if ( ((LA15_0>='3' && LA15_0<='9')) ) {s = 45;}

                        else if ( (LA15_0=='^') ) {s = 46;}

                        else if ( (LA15_0=='A'||(LA15_0>='F' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='K')||(LA15_0>='N' && LA15_0<='O')||LA15_0=='Q'||(LA15_0>='V' && LA15_0<='X')||LA15_0=='Z'||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='h')||LA15_0=='j'||LA15_0=='q'||(LA15_0>='v' && LA15_0<='z')) ) {s = 47;}

                        else if ( (LA15_0=='\"') ) {s = 48;}

                        else if ( (LA15_0=='\'') ) {s = 49;}

                        else if ( (LA15_0=='/') ) {s = 50;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 51;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<='+')||(LA15_0>=';' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='?')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}