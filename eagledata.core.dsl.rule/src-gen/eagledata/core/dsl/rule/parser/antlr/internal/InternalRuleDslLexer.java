package eagledata.core.dsl.rule.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslLexer extends Lexer {
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

    public InternalRuleDslLexer() {;} 
    public InternalRuleDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRuleDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:11:7: ( 'import' )
            // InternalRuleDsl.g:11:9: 'import'
            {
            match("import"); 


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
            // InternalRuleDsl.g:12:7: ( '.*' )
            // InternalRuleDsl.g:12:9: '.*'
            {
            match(".*"); 


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
            // InternalRuleDsl.g:13:7: ( '.' )
            // InternalRuleDsl.g:13:9: '.'
            {
            match('.'); 

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
            // InternalRuleDsl.g:14:7: ( '{' )
            // InternalRuleDsl.g:14:9: '{'
            {
            match('{'); 

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
            // InternalRuleDsl.g:15:7: ( 'on' )
            // InternalRuleDsl.g:15:9: 'on'
            {
            match("on"); 


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
            // InternalRuleDsl.g:16:7: ( 'do' )
            // InternalRuleDsl.g:16:9: 'do'
            {
            match("do"); 


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
            // InternalRuleDsl.g:17:7: ( '}' )
            // InternalRuleDsl.g:17:9: '}'
            {
            match('}'); 

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
            // InternalRuleDsl.g:18:7: ( ':' )
            // InternalRuleDsl.g:18:9: ':'
            {
            match(':'); 

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
            // InternalRuleDsl.g:19:7: ( 'then' )
            // InternalRuleDsl.g:19:9: 'then'
            {
            match("then"); 


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
            // InternalRuleDsl.g:20:7: ( '*' )
            // InternalRuleDsl.g:20:9: '*'
            {
            match('*'); 

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
            // InternalRuleDsl.g:21:7: ( 'select' )
            // InternalRuleDsl.g:21:9: 'select'
            {
            match("select"); 


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
            // InternalRuleDsl.g:22:7: ( ',' )
            // InternalRuleDsl.g:22:9: ','
            {
            match(','); 

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
            // InternalRuleDsl.g:23:7: ( 'from' )
            // InternalRuleDsl.g:23:9: 'from'
            {
            match("from"); 


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
            // InternalRuleDsl.g:24:7: ( 'where' )
            // InternalRuleDsl.g:24:9: 'where'
            {
            match("where"); 


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
            // InternalRuleDsl.g:25:7: ( 'AND' )
            // InternalRuleDsl.g:25:9: 'AND'
            {
            match("AND"); 


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
            // InternalRuleDsl.g:26:7: ( '(' )
            // InternalRuleDsl.g:26:9: '('
            {
            match('('); 

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
            // InternalRuleDsl.g:27:7: ( ')' )
            // InternalRuleDsl.g:27:9: ')'
            {
            match(')'); 

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
            // InternalRuleDsl.g:28:7: ( 'compose' )
            // InternalRuleDsl.g:28:9: 'compose'
            {
            match("compose"); 


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
            // InternalRuleDsl.g:29:7: ( '+' )
            // InternalRuleDsl.g:29:9: '+'
            {
            match('+'); 

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
            // InternalRuleDsl.g:30:7: ( 'to' )
            // InternalRuleDsl.g:30:9: 'to'
            {
            match("to"); 


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
            // InternalRuleDsl.g:31:7: ( '@' )
            // InternalRuleDsl.g:31:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1619:15: ( ( '+' | '-' | '*' | 'DIV' ) )
            // InternalRuleDsl.g:1619:17: ( '+' | '-' | '*' | 'DIV' )
            {
            // InternalRuleDsl.g:1619:17: ( '+' | '-' | '*' | 'DIV' )
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
                    // InternalRuleDsl.g:1619:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1619:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1619:26: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:1619:30: 'DIV'
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
            // InternalRuleDsl.g:1621:22: ( ( '>' | '<' | '>=' | '<=' | '=' ) )
            // InternalRuleDsl.g:1621:24: ( '>' | '<' | '>=' | '<=' | '=' )
            {
            // InternalRuleDsl.g:1621:24: ( '>' | '<' | '>=' | '<=' | '=' )
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
                    // InternalRuleDsl.g:1621:25: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1621:29: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1621:33: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalRuleDsl.g:1621:38: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalRuleDsl.g:1621:43: '='
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
            // InternalRuleDsl.g:1623:26: ( ( 'AND' | 'OR' ) )
            // InternalRuleDsl.g:1623:28: ( 'AND' | 'OR' )
            {
            // InternalRuleDsl.g:1623:28: ( 'AND' | 'OR' )
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
                    // InternalRuleDsl.g:1623:29: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1623:35: 'OR'
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
            // InternalRuleDsl.g:1625:21: ( ( 'COUNT' | 'MIN' | 'MAX' ) )
            // InternalRuleDsl.g:1625:23: ( 'COUNT' | 'MIN' | 'MAX' )
            {
            // InternalRuleDsl.g:1625:23: ( 'COUNT' | 'MIN' | 'MAX' )
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
                    // InternalRuleDsl.g:1625:24: 'COUNT'
                    {
                    match("COUNT"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1625:32: 'MIN'
                    {
                    match("MIN"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1625:38: 'MAX'
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
            // InternalRuleDsl.g:1627:13: ( RULE_INT '.' RULE_INT )
            // InternalRuleDsl.g:1627:15: RULE_INT '.' RULE_INT
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
            // InternalRuleDsl.g:1629:18: ( ( 'UNION' | 'EXCEPT' | 'INTERSECT' ) )
            // InternalRuleDsl.g:1629:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
            {
            // InternalRuleDsl.g:1629:20: ( 'UNION' | 'EXCEPT' | 'INTERSECT' )
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
                    // InternalRuleDsl.g:1629:21: 'UNION'
                    {
                    match("UNION"); 


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1629:29: 'EXCEPT'
                    {
                    match("EXCEPT"); 


                    }
                    break;
                case 3 :
                    // InternalRuleDsl.g:1629:38: 'INTERSECT'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRuleDsl.g:1631:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRuleDsl.g:1631:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRuleDsl.g:1631:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuleDsl.g:1631:11: '^'
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

            // InternalRuleDsl.g:1631:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRuleDsl.g:
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
            	    break loop7;
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
            // InternalRuleDsl.g:1633:19: ( ( '0' .. '9' )+ )
            // InternalRuleDsl.g:1633:21: ( '0' .. '9' )+
            {
            // InternalRuleDsl.g:1633:21: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRuleDsl.g:1633:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

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
            // InternalRuleDsl.g:1635:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRuleDsl.g:1635:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRuleDsl.g:1635:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuleDsl.g:1635:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRuleDsl.g:1635:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1635:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:1635:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1635:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRuleDsl.g:1635:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1635:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRuleDsl.g:1635:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalRuleDsl.g:1637:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRuleDsl.g:1637:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRuleDsl.g:1637:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRuleDsl.g:1637:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalRuleDsl.g:1639:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRuleDsl.g:1639:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRuleDsl.g:1639:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRuleDsl.g:1639:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalRuleDsl.g:1639:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRuleDsl.g:1639:41: ( '\\r' )? '\\n'
                    {
                    // InternalRuleDsl.g:1639:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRuleDsl.g:1639:41: '\\r'
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
            // InternalRuleDsl.g:1641:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRuleDsl.g:1641:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRuleDsl.g:1641:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalRuleDsl.g:1643:16: ( . )
            // InternalRuleDsl.g:1643:18: .
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
        // InternalRuleDsl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_CONDITIONALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=33;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalRuleDsl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalRuleDsl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalRuleDsl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalRuleDsl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalRuleDsl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalRuleDsl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalRuleDsl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalRuleDsl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalRuleDsl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalRuleDsl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalRuleDsl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalRuleDsl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalRuleDsl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalRuleDsl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalRuleDsl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalRuleDsl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalRuleDsl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalRuleDsl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalRuleDsl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalRuleDsl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalRuleDsl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalRuleDsl.g:1:136: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 23 :
                // InternalRuleDsl.g:1:150: RULE_LOGICALOPERATOR
                {
                mRULE_LOGICALOPERATOR(); 

                }
                break;
            case 24 :
                // InternalRuleDsl.g:1:171: RULE_CONDITIONALOPERATOR
                {
                mRULE_CONDITIONALOPERATOR(); 

                }
                break;
            case 25 :
                // InternalRuleDsl.g:1:196: RULE_SELECTOPERATOR
                {
                mRULE_SELECTOPERATOR(); 

                }
                break;
            case 26 :
                // InternalRuleDsl.g:1:216: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 27 :
                // InternalRuleDsl.g:1:228: RULE_SETOPERATOR
                {
                mRULE_SETOPERATOR(); 

                }
                break;
            case 28 :
                // InternalRuleDsl.g:1:245: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalRuleDsl.g:1:253: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalRuleDsl.g:1:265: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalRuleDsl.g:1:281: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalRuleDsl.g:1:297: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalRuleDsl.g:1:305: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\50\1\52\1\uffff\2\50\2\uffff\1\50\1\uffff\1\50\1\uffff\3\50\2\uffff\1\50\3\uffff\1\50\3\uffff\3\50\1\46\3\50\1\46\1\uffff\3\46\2\uffff\1\50\4\uffff\1\115\1\116\2\uffff\1\50\1\120\1\uffff\1\50\1\uffff\3\50\2\uffff\1\50\3\uffff\1\50\1\uffff\1\127\3\50\1\uffff\3\50\4\uffff\1\50\2\uffff\1\50\1\uffff\3\50\1\143\1\50\1\75\1\uffff\1\50\2\146\4\50\1\153\1\50\1\155\1\50\1\uffff\2\50\1\uffff\4\50\1\uffff\1\50\1\uffff\1\166\1\50\1\146\1\170\2\50\1\173\1\174\1\uffff\1\50\1\uffff\1\170\1\50\2\uffff\1\177\1\50\1\uffff\1\50\1\170";
    static final String DFA17_eofS =
        "\u0082\uffff";
    static final String DFA17_minS =
        "\1\0\1\155\1\52\1\uffff\1\156\1\157\2\uffff\1\150\1\uffff\1\145\1\uffff\1\162\1\150\1\116\2\uffff\1\157\3\uffff\1\111\3\uffff\1\122\1\117\1\101\1\56\1\116\1\130\1\116\1\101\1\uffff\2\0\1\52\2\uffff\1\160\4\uffff\2\60\2\uffff\1\145\1\60\1\uffff\1\154\1\uffff\1\157\1\145\1\104\2\uffff\1\155\3\uffff\1\126\1\uffff\1\60\1\125\1\116\1\130\1\uffff\1\111\1\103\1\124\4\uffff\1\157\2\uffff\1\156\1\uffff\1\145\1\155\1\162\1\60\1\160\1\60\1\uffff\1\116\2\60\1\117\2\105\1\162\1\60\1\143\1\60\1\145\1\uffff\1\157\1\124\1\uffff\1\116\1\120\1\122\1\164\1\uffff\1\164\1\uffff\1\60\1\163\2\60\1\124\1\123\2\60\1\uffff\1\145\1\uffff\1\60\1\105\2\uffff\1\60\1\103\1\uffff\1\124\1\60";
    static final String DFA17_maxS =
        "\1\uffff\1\155\1\52\1\uffff\1\156\1\157\2\uffff\1\157\1\uffff\1\145\1\uffff\1\162\1\150\1\116\2\uffff\1\157\3\uffff\1\111\3\uffff\1\122\1\117\1\111\1\71\1\116\1\130\1\116\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\4\uffff\2\172\2\uffff\1\145\1\172\1\uffff\1\154\1\uffff\1\157\1\145\1\104\2\uffff\1\155\3\uffff\1\126\1\uffff\1\172\1\125\1\116\1\130\1\uffff\1\111\1\103\1\124\4\uffff\1\157\2\uffff\1\156\1\uffff\1\145\1\155\1\162\1\172\1\160\1\172\1\uffff\1\116\2\172\1\117\2\105\1\162\1\172\1\143\1\172\1\145\1\uffff\1\157\1\124\1\uffff\1\116\1\120\1\122\1\164\1\uffff\1\164\1\uffff\1\172\1\163\2\172\1\124\1\123\2\172\1\uffff\1\145\1\uffff\1\172\1\105\2\uffff\1\172\1\103\1\uffff\1\124\1\172";
    static final String DFA17_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\1\10\1\uffff\1\12\1\uffff\1\14\3\uffff\1\20\1\21\1\uffff\1\23\1\25\1\26\1\uffff\3\27\10\uffff\1\34\3\uffff\1\40\1\41\1\uffff\1\34\1\2\1\3\1\4\2\uffff\1\7\1\10\2\uffff\1\12\1\uffff\1\14\3\uffff\1\20\1\21\1\uffff\1\23\1\25\1\26\1\uffff\1\27\4\uffff\1\32\3\uffff\1\35\1\36\1\37\1\40\1\uffff\1\5\1\6\1\uffff\1\24\6\uffff\1\30\13\uffff\1\17\2\uffff\1\31\4\uffff\1\11\1\uffff\1\15\10\uffff\1\16\1\uffff\1\33\2\uffff\1\1\1\13\2\uffff\1\22\2\uffff";
    static final String DFA17_specialS =
        "\1\0\41\uffff\1\1\1\2\136\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\4\46\1\43\1\17\1\20\1\11\1\22\1\13\1\24\1\2\1\44\12\34\1\7\1\46\1\27\1\30\1\26\1\46\1\23\1\16\1\41\1\32\1\25\1\36\3\41\1\37\3\41\1\33\1\41\1\31\5\41\1\35\5\41\3\46\1\40\1\41\1\46\2\41\1\21\1\5\1\41\1\14\2\41\1\1\5\41\1\4\3\41\1\12\1\10\2\41\1\15\3\41\1\3\1\46\1\6\uff82\46",
            "\1\47",
            "\1\51",
            "",
            "\1\54",
            "\1\55",
            "",
            "",
            "\1\60\6\uffff\1\61",
            "",
            "\1\63",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "\1\76",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\103\7\uffff\1\102",
            "\1\104\1\uffff\12\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\110",
            "\0\110",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\117",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "\1\126",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\1\136",
            "",
            "",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\144",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\145",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\154",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\167",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\171",
            "\1\172",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\175",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\176",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_OPERATOR | RULE_LOGICALOPERATOR | RULE_CONDITIONALOPERATOR | RULE_SELECTOPERATOR | RULE_DOUBLE | RULE_SETOPERATOR | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='i') ) {s = 1;}

                        else if ( (LA17_0=='.') ) {s = 2;}

                        else if ( (LA17_0=='{') ) {s = 3;}

                        else if ( (LA17_0=='o') ) {s = 4;}

                        else if ( (LA17_0=='d') ) {s = 5;}

                        else if ( (LA17_0=='}') ) {s = 6;}

                        else if ( (LA17_0==':') ) {s = 7;}

                        else if ( (LA17_0=='t') ) {s = 8;}

                        else if ( (LA17_0=='*') ) {s = 9;}

                        else if ( (LA17_0=='s') ) {s = 10;}

                        else if ( (LA17_0==',') ) {s = 11;}

                        else if ( (LA17_0=='f') ) {s = 12;}

                        else if ( (LA17_0=='w') ) {s = 13;}

                        else if ( (LA17_0=='A') ) {s = 14;}

                        else if ( (LA17_0=='(') ) {s = 15;}

                        else if ( (LA17_0==')') ) {s = 16;}

                        else if ( (LA17_0=='c') ) {s = 17;}

                        else if ( (LA17_0=='+') ) {s = 18;}

                        else if ( (LA17_0=='@') ) {s = 19;}

                        else if ( (LA17_0=='-') ) {s = 20;}

                        else if ( (LA17_0=='D') ) {s = 21;}

                        else if ( (LA17_0=='>') ) {s = 22;}

                        else if ( (LA17_0=='<') ) {s = 23;}

                        else if ( (LA17_0=='=') ) {s = 24;}

                        else if ( (LA17_0=='O') ) {s = 25;}

                        else if ( (LA17_0=='C') ) {s = 26;}

                        else if ( (LA17_0=='M') ) {s = 27;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 28;}

                        else if ( (LA17_0=='U') ) {s = 29;}

                        else if ( (LA17_0=='E') ) {s = 30;}

                        else if ( (LA17_0=='I') ) {s = 31;}

                        else if ( (LA17_0=='^') ) {s = 32;}

                        else if ( (LA17_0=='B'||(LA17_0>='F' && LA17_0<='H')||(LA17_0>='J' && LA17_0<='L')||LA17_0=='N'||(LA17_0>='P' && LA17_0<='T')||(LA17_0>='V' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='b')||LA17_0=='e'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='n')||(LA17_0>='p' && LA17_0<='r')||(LA17_0>='u' && LA17_0<='v')||(LA17_0>='x' && LA17_0<='z')) ) {s = 33;}

                        else if ( (LA17_0=='\"') ) {s = 34;}

                        else if ( (LA17_0=='\'') ) {s = 35;}

                        else if ( (LA17_0=='/') ) {s = 36;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 37;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||LA17_0==';'||LA17_0=='?'||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_34 = input.LA(1);

                        s = -1;
                        if ( ((LA17_34>='\u0000' && LA17_34<='\uFFFF')) ) {s = 72;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_35 = input.LA(1);

                        s = -1;
                        if ( ((LA17_35>='\u0000' && LA17_35<='\uFFFF')) ) {s = 72;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}