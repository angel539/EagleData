package eagledata.core.dsl.pattern.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eagledata.core.dsl.pattern.services.PatternDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPatternDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'place'", "'='", "'arround'", "','", "'UTM'", "'{'", "'}'", "'region'", "':'", "'list'", "'('", "')'", "'phrase'", "'ordered'", "'in'", "'source'", "'language'", "'minretweet'", "'minfavorite'", "'inreplyto'", "'retweet'", "'favorite'", "'all'", "'any'", "'android'", "'ios'", "'web'", "'kms'", "'miles'", "'mts'", "'english'", "'spanish'", "'chinese'"
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

        public InternalPatternDslParser(TokenStream input, PatternDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StreamingModel";
       	}

       	@Override
       	protected PatternDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStreamingModel"
    // InternalPatternDsl.g:65:1: entryRuleStreamingModel returns [EObject current=null] : iv_ruleStreamingModel= ruleStreamingModel EOF ;
    public final EObject entryRuleStreamingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamingModel = null;


        try {
            // InternalPatternDsl.g:65:55: (iv_ruleStreamingModel= ruleStreamingModel EOF )
            // InternalPatternDsl.g:66:2: iv_ruleStreamingModel= ruleStreamingModel EOF
            {
             newCompositeNode(grammarAccess.getStreamingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreamingModel=ruleStreamingModel();

            state._fsp--;

             current =iv_ruleStreamingModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamingModel"


    // $ANTLR start "ruleStreamingModel"
    // InternalPatternDsl.g:72:1: ruleStreamingModel returns [EObject current=null] : ( ( (lv_descriptions_0_0= ruleStreamingDescription ) ) ( (lv_descriptions_1_0= ruleStreamingDescription ) )* ) ;
    public final EObject ruleStreamingModel() throws RecognitionException {
        EObject current = null;

        EObject lv_descriptions_0_0 = null;

        EObject lv_descriptions_1_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:78:2: ( ( ( (lv_descriptions_0_0= ruleStreamingDescription ) ) ( (lv_descriptions_1_0= ruleStreamingDescription ) )* ) )
            // InternalPatternDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleStreamingDescription ) ) ( (lv_descriptions_1_0= ruleStreamingDescription ) )* )
            {
            // InternalPatternDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleStreamingDescription ) ) ( (lv_descriptions_1_0= ruleStreamingDescription ) )* )
            // InternalPatternDsl.g:80:3: ( (lv_descriptions_0_0= ruleStreamingDescription ) ) ( (lv_descriptions_1_0= ruleStreamingDescription ) )*
            {
            // InternalPatternDsl.g:80:3: ( (lv_descriptions_0_0= ruleStreamingDescription ) )
            // InternalPatternDsl.g:81:4: (lv_descriptions_0_0= ruleStreamingDescription )
            {
            // InternalPatternDsl.g:81:4: (lv_descriptions_0_0= ruleStreamingDescription )
            // InternalPatternDsl.g:82:5: lv_descriptions_0_0= ruleStreamingDescription
            {

            					newCompositeNode(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_descriptions_0_0=ruleStreamingDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStreamingModelRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.StreamingDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPatternDsl.g:99:3: ( (lv_descriptions_1_0= ruleStreamingDescription ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==16||LA1_0==23||LA1_0==25||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPatternDsl.g:100:4: (lv_descriptions_1_0= ruleStreamingDescription )
            	    {
            	    // InternalPatternDsl.g:100:4: (lv_descriptions_1_0= ruleStreamingDescription )
            	    // InternalPatternDsl.g:101:5: lv_descriptions_1_0= ruleStreamingDescription
            	    {

            	    					newCompositeNode(grammarAccess.getStreamingModelAccess().getDescriptionsStreamingDescriptionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_descriptions_1_0=ruleStreamingDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStreamingModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptions",
            	    						lv_descriptions_1_0,
            	    						"eagledata.core.dsl.pattern.PatternDsl.StreamingDescription");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamingModel"


    // $ANTLR start "entryRuleStreamingDescription"
    // InternalPatternDsl.g:122:1: entryRuleStreamingDescription returns [EObject current=null] : iv_ruleStreamingDescription= ruleStreamingDescription EOF ;
    public final EObject entryRuleStreamingDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamingDescription = null;


        try {
            // InternalPatternDsl.g:122:61: (iv_ruleStreamingDescription= ruleStreamingDescription EOF )
            // InternalPatternDsl.g:123:2: iv_ruleStreamingDescription= ruleStreamingDescription EOF
            {
             newCompositeNode(grammarAccess.getStreamingDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreamingDescription=ruleStreamingDescription();

            state._fsp--;

             current =iv_ruleStreamingDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamingDescription"


    // $ANTLR start "ruleStreamingDescription"
    // InternalPatternDsl.g:129:1: ruleStreamingDescription returns [EObject current=null] : (this_Import_0= ruleImport | this_GeographicalElement_1= ruleGeographicalElement | this_PatternMatcherElement_2= rulePatternMatcherElement ) ;
    public final EObject ruleStreamingDescription() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_GeographicalElement_1 = null;

        EObject this_PatternMatcherElement_2 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:135:2: ( (this_Import_0= ruleImport | this_GeographicalElement_1= ruleGeographicalElement | this_PatternMatcherElement_2= rulePatternMatcherElement ) )
            // InternalPatternDsl.g:136:2: (this_Import_0= ruleImport | this_GeographicalElement_1= ruleGeographicalElement | this_PatternMatcherElement_2= rulePatternMatcherElement )
            {
            // InternalPatternDsl.g:136:2: (this_Import_0= ruleImport | this_GeographicalElement_1= ruleGeographicalElement | this_PatternMatcherElement_2= rulePatternMatcherElement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 16:
            case 23:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 25:
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPatternDsl.g:137:3: this_Import_0= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getStreamingDescriptionAccess().getImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    			current = this_Import_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:146:3: this_GeographicalElement_1= ruleGeographicalElement
                    {

                    			newCompositeNode(grammarAccess.getStreamingDescriptionAccess().getGeographicalElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeographicalElement_1=ruleGeographicalElement();

                    state._fsp--;


                    			current = this_GeographicalElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:155:3: this_PatternMatcherElement_2= rulePatternMatcherElement
                    {

                    			newCompositeNode(grammarAccess.getStreamingDescriptionAccess().getPatternMatcherElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PatternMatcherElement_2=rulePatternMatcherElement();

                    state._fsp--;


                    			current = this_PatternMatcherElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamingDescription"


    // $ANTLR start "entryRuleImport"
    // InternalPatternDsl.g:167:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalPatternDsl.g:167:47: (iv_ruleImport= ruleImport EOF )
            // InternalPatternDsl.g:168:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPatternDsl.g:174:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:180:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalPatternDsl.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalPatternDsl.g:181:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalPatternDsl.g:182:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalPatternDsl.g:186:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalPatternDsl.g:187:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalPatternDsl.g:187:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalPatternDsl.g:188:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"eagledata.core.dsl.pattern.PatternDsl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalPatternDsl.g:209:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalPatternDsl.g:209:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalPatternDsl.g:210:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalPatternDsl.g:216:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:222:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalPatternDsl.g:223:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalPatternDsl.g:223:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalPatternDsl.g:224:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalPatternDsl.g:234:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPatternDsl.g:235:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPatternDsl.g:245:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPatternDsl.g:245:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPatternDsl.g:246:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPatternDsl.g:252:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:258:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPatternDsl.g:259:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPatternDsl.g:259:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPatternDsl.g:260:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalPatternDsl.g:267:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPatternDsl.g:268:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGeographicalElement"
    // InternalPatternDsl.g:285:1: entryRuleGeographicalElement returns [EObject current=null] : iv_ruleGeographicalElement= ruleGeographicalElement EOF ;
    public final EObject entryRuleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalElement = null;


        try {
            // InternalPatternDsl.g:285:60: (iv_ruleGeographicalElement= ruleGeographicalElement EOF )
            // InternalPatternDsl.g:286:2: iv_ruleGeographicalElement= ruleGeographicalElement EOF
            {
             newCompositeNode(grammarAccess.getGeographicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeographicalElement=ruleGeographicalElement();

            state._fsp--;

             current =iv_ruleGeographicalElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeographicalElement"


    // $ANTLR start "ruleGeographicalElement"
    // InternalPatternDsl.g:292:1: ruleGeographicalElement returns [EObject current=null] : (this_Place_0= rulePlace | this_Region_1= ruleRegion ) ;
    public final EObject ruleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Place_0 = null;

        EObject this_Region_1 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:298:2: ( (this_Place_0= rulePlace | this_Region_1= ruleRegion ) )
            // InternalPatternDsl.g:299:2: (this_Place_0= rulePlace | this_Region_1= ruleRegion )
            {
            // InternalPatternDsl.g:299:2: (this_Place_0= rulePlace | this_Region_1= ruleRegion )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPatternDsl.g:300:3: this_Place_0= rulePlace
                    {

                    			newCompositeNode(grammarAccess.getGeographicalElementAccess().getPlaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Place_0=rulePlace();

                    state._fsp--;


                    			current = this_Place_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:309:3: this_Region_1= ruleRegion
                    {

                    			newCompositeNode(grammarAccess.getGeographicalElementAccess().getRegionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Region_1=ruleRegion();

                    state._fsp--;


                    			current = this_Region_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeographicalElement"


    // $ANTLR start "entryRulePlace"
    // InternalPatternDsl.g:321:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPatternDsl.g:321:46: (iv_rulePlace= rulePlace EOF )
            // InternalPatternDsl.g:322:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPatternDsl.g:328:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_point_3_0= rulePoint ) ) ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_point_3_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:334:2: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_point_3_0= rulePoint ) ) ) )
            // InternalPatternDsl.g:335:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_point_3_0= rulePoint ) ) )
            {
            // InternalPatternDsl.g:335:2: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_point_3_0= rulePoint ) ) )
            // InternalPatternDsl.g:336:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_point_3_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
            		
            // InternalPatternDsl.g:340:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPatternDsl.g:341:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPatternDsl.g:341:4: (lv_name_1_0= RULE_ID )
            // InternalPatternDsl.g:342:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getEqualsSignKeyword_2());
            		
            // InternalPatternDsl.g:362:3: ( (lv_point_3_0= rulePoint ) )
            // InternalPatternDsl.g:363:4: (lv_point_3_0= rulePoint )
            {
            // InternalPatternDsl.g:363:4: (lv_point_3_0= rulePoint )
            // InternalPatternDsl.g:364:5: lv_point_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getPlaceAccess().getPointPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_point_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlaceRule());
            					}
            					set(
            						current,
            						"point",
            						lv_point_3_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRulePoint"
    // InternalPatternDsl.g:385:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalPatternDsl.g:385:46: (iv_rulePoint= rulePoint EOF )
            // InternalPatternDsl.g:386:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalPatternDsl.g:392:1: rulePoint returns [EObject current=null] : ( ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )? ( (lv_coordinates_3_0= ruleCoordinate ) ) ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_radius_0_0=null;
        Token otherlv_2=null;
        Enumerator lv_mesurement_1_0 = null;

        EObject lv_coordinates_3_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:398:2: ( ( ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )? ( (lv_coordinates_3_0= ruleCoordinate ) ) ) )
            // InternalPatternDsl.g:399:2: ( ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )? ( (lv_coordinates_3_0= ruleCoordinate ) ) )
            {
            // InternalPatternDsl.g:399:2: ( ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )? ( (lv_coordinates_3_0= ruleCoordinate ) ) )
            // InternalPatternDsl.g:400:3: ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )? ( (lv_coordinates_3_0= ruleCoordinate ) )
            {
            // InternalPatternDsl.g:400:3: ( ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOUBLE) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=43 && LA6_1<=45)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalPatternDsl.g:401:4: ( (lv_radius_0_0= RULE_DOUBLE ) ) ( (lv_mesurement_1_0= ruleDistanceMesurement ) ) otherlv_2= 'arround'
                    {
                    // InternalPatternDsl.g:401:4: ( (lv_radius_0_0= RULE_DOUBLE ) )
                    // InternalPatternDsl.g:402:5: (lv_radius_0_0= RULE_DOUBLE )
                    {
                    // InternalPatternDsl.g:402:5: (lv_radius_0_0= RULE_DOUBLE )
                    // InternalPatternDsl.g:403:6: lv_radius_0_0= RULE_DOUBLE
                    {
                    lv_radius_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); 

                    						newLeafNode(lv_radius_0_0, grammarAccess.getPointAccess().getRadiusDOUBLETerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPointRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"radius",
                    							lv_radius_0_0,
                    							"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
                    					

                    }


                    }

                    // InternalPatternDsl.g:419:4: ( (lv_mesurement_1_0= ruleDistanceMesurement ) )
                    // InternalPatternDsl.g:420:5: (lv_mesurement_1_0= ruleDistanceMesurement )
                    {
                    // InternalPatternDsl.g:420:5: (lv_mesurement_1_0= ruleDistanceMesurement )
                    // InternalPatternDsl.g:421:6: lv_mesurement_1_0= ruleDistanceMesurement
                    {

                    						newCompositeNode(grammarAccess.getPointAccess().getMesurementDistanceMesurementEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_mesurement_1_0=ruleDistanceMesurement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPointRule());
                    						}
                    						set(
                    							current,
                    							"mesurement",
                    							lv_mesurement_1_0,
                    							"eagledata.core.dsl.pattern.PatternDsl.DistanceMesurement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPointAccess().getArroundKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalPatternDsl.g:443:3: ( (lv_coordinates_3_0= ruleCoordinate ) )
            // InternalPatternDsl.g:444:4: (lv_coordinates_3_0= ruleCoordinate )
            {
            // InternalPatternDsl.g:444:4: (lv_coordinates_3_0= ruleCoordinate )
            // InternalPatternDsl.g:445:5: lv_coordinates_3_0= ruleCoordinate
            {

            					newCompositeNode(grammarAccess.getPointAccess().getCoordinatesCoordinateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_coordinates_3_0=ruleCoordinate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"coordinates",
            						lv_coordinates_3_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Coordinate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleCoordinate"
    // InternalPatternDsl.g:466:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalPatternDsl.g:466:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalPatternDsl.g:467:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalPatternDsl.g:473:1: ruleCoordinate returns [EObject current=null] : (this_LatLong_0= ruleLatLong | this_UTM_1= ruleUTM ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject this_LatLong_0 = null;

        EObject this_UTM_1 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:479:2: ( (this_LatLong_0= ruleLatLong | this_UTM_1= ruleUTM ) )
            // InternalPatternDsl.g:480:2: (this_LatLong_0= ruleLatLong | this_UTM_1= ruleUTM )
            {
            // InternalPatternDsl.g:480:2: (this_LatLong_0= ruleLatLong | this_UTM_1= ruleUTM )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOUBLE) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPatternDsl.g:481:3: this_LatLong_0= ruleLatLong
                    {

                    			newCompositeNode(grammarAccess.getCoordinateAccess().getLatLongParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LatLong_0=ruleLatLong();

                    state._fsp--;


                    			current = this_LatLong_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:490:3: this_UTM_1= ruleUTM
                    {

                    			newCompositeNode(grammarAccess.getCoordinateAccess().getUTMParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UTM_1=ruleUTM();

                    state._fsp--;


                    			current = this_UTM_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleLatLong"
    // InternalPatternDsl.g:502:1: entryRuleLatLong returns [EObject current=null] : iv_ruleLatLong= ruleLatLong EOF ;
    public final EObject entryRuleLatLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLatLong = null;


        try {
            // InternalPatternDsl.g:502:48: (iv_ruleLatLong= ruleLatLong EOF )
            // InternalPatternDsl.g:503:2: iv_ruleLatLong= ruleLatLong EOF
            {
             newCompositeNode(grammarAccess.getLatLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLatLong=ruleLatLong();

            state._fsp--;

             current =iv_ruleLatLong; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLatLong"


    // $ANTLR start "ruleLatLong"
    // InternalPatternDsl.g:509:1: ruleLatLong returns [EObject current=null] : ( ( (lv_lat_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_long_2_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleLatLong() throws RecognitionException {
        EObject current = null;

        Token lv_lat_0_0=null;
        Token otherlv_1=null;
        Token lv_long_2_0=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:515:2: ( ( ( (lv_lat_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_long_2_0= RULE_DOUBLE ) ) ) )
            // InternalPatternDsl.g:516:2: ( ( (lv_lat_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_long_2_0= RULE_DOUBLE ) ) )
            {
            // InternalPatternDsl.g:516:2: ( ( (lv_lat_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_long_2_0= RULE_DOUBLE ) ) )
            // InternalPatternDsl.g:517:3: ( (lv_lat_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_long_2_0= RULE_DOUBLE ) )
            {
            // InternalPatternDsl.g:517:3: ( (lv_lat_0_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:518:4: (lv_lat_0_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:518:4: (lv_lat_0_0= RULE_DOUBLE )
            // InternalPatternDsl.g:519:5: lv_lat_0_0= RULE_DOUBLE
            {
            lv_lat_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_11); 

            					newLeafNode(lv_lat_0_0, grammarAccess.getLatLongAccess().getLatDOUBLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLatLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lat",
            						lv_lat_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLatLongAccess().getCommaKeyword_1());
            		
            // InternalPatternDsl.g:539:3: ( (lv_long_2_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:540:4: (lv_long_2_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:540:4: (lv_long_2_0= RULE_DOUBLE )
            // InternalPatternDsl.g:541:5: lv_long_2_0= RULE_DOUBLE
            {
            lv_long_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            					newLeafNode(lv_long_2_0, grammarAccess.getLatLongAccess().getLongDOUBLETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLatLongRule());
            					}
            					setWithLastConsumed(
            						current,
            						"long",
            						lv_long_2_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLatLong"


    // $ANTLR start "entryRuleUTM"
    // InternalPatternDsl.g:561:1: entryRuleUTM returns [EObject current=null] : iv_ruleUTM= ruleUTM EOF ;
    public final EObject entryRuleUTM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUTM = null;


        try {
            // InternalPatternDsl.g:561:44: (iv_ruleUTM= ruleUTM EOF )
            // InternalPatternDsl.g:562:2: iv_ruleUTM= ruleUTM EOF
            {
             newCompositeNode(grammarAccess.getUTMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUTM=ruleUTM();

            state._fsp--;

             current =iv_ruleUTM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUTM"


    // $ANTLR start "ruleUTM"
    // InternalPatternDsl.g:568:1: ruleUTM returns [EObject current=null] : (otherlv_0= 'UTM' otherlv_1= '{' ( (lv_e_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_Hemi_8_0= RULE_DOUBLE ) ) otherlv_9= '}' ) ;
    public final EObject ruleUTM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_e_2_0=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;
        Token otherlv_7=null;
        Token lv_Hemi_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:574:2: ( (otherlv_0= 'UTM' otherlv_1= '{' ( (lv_e_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_Hemi_8_0= RULE_DOUBLE ) ) otherlv_9= '}' ) )
            // InternalPatternDsl.g:575:2: (otherlv_0= 'UTM' otherlv_1= '{' ( (lv_e_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_Hemi_8_0= RULE_DOUBLE ) ) otherlv_9= '}' )
            {
            // InternalPatternDsl.g:575:2: (otherlv_0= 'UTM' otherlv_1= '{' ( (lv_e_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_Hemi_8_0= RULE_DOUBLE ) ) otherlv_9= '}' )
            // InternalPatternDsl.g:576:3: otherlv_0= 'UTM' otherlv_1= '{' ( (lv_e_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_z_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_Hemi_8_0= RULE_DOUBLE ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getUTMAccess().getUTMKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getUTMAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPatternDsl.g:584:3: ( (lv_e_2_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:585:4: (lv_e_2_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:585:4: (lv_e_2_0= RULE_DOUBLE )
            // InternalPatternDsl.g:586:5: lv_e_2_0= RULE_DOUBLE
            {
            lv_e_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_11); 

            					newLeafNode(lv_e_2_0, grammarAccess.getUTMAccess().getEDOUBLETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUTMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"e",
            						lv_e_2_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getUTMAccess().getCommaKeyword_3());
            		
            // InternalPatternDsl.g:606:3: ( (lv_n_4_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:607:4: (lv_n_4_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:607:4: (lv_n_4_0= RULE_DOUBLE )
            // InternalPatternDsl.g:608:5: lv_n_4_0= RULE_DOUBLE
            {
            lv_n_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_11); 

            					newLeafNode(lv_n_4_0, grammarAccess.getUTMAccess().getNDOUBLETerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUTMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_4_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getUTMAccess().getCommaKeyword_5());
            		
            // InternalPatternDsl.g:628:3: ( (lv_z_6_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:629:4: (lv_z_6_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:629:4: (lv_z_6_0= RULE_DOUBLE )
            // InternalPatternDsl.g:630:5: lv_z_6_0= RULE_DOUBLE
            {
            lv_z_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_11); 

            					newLeafNode(lv_z_6_0, grammarAccess.getUTMAccess().getZDOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUTMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"z",
            						lv_z_6_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getUTMAccess().getCommaKeyword_7());
            		
            // InternalPatternDsl.g:650:3: ( (lv_Hemi_8_0= RULE_DOUBLE ) )
            // InternalPatternDsl.g:651:4: (lv_Hemi_8_0= RULE_DOUBLE )
            {
            // InternalPatternDsl.g:651:4: (lv_Hemi_8_0= RULE_DOUBLE )
            // InternalPatternDsl.g:652:5: lv_Hemi_8_0= RULE_DOUBLE
            {
            lv_Hemi_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_14); 

            					newLeafNode(lv_Hemi_8_0, grammarAccess.getUTMAccess().getHemiDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUTMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Hemi",
            						lv_Hemi_8_0,
            						"eagledata.core.dsl.pattern.PatternDsl.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getUTMAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUTM"


    // $ANTLR start "entryRuleRegion"
    // InternalPatternDsl.g:676:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalPatternDsl.g:676:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalPatternDsl.g:677:2: iv_ruleRegion= ruleRegion EOF
            {
             newCompositeNode(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;

             current =iv_ruleRegion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalPatternDsl.g:683:1: ruleRegion returns [EObject current=null] : (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_southWestBoundary_4_0= rulePoint ) ) otherlv_5= ':' ( (lv_northEastBoundary_6_0= rulePoint ) ) otherlv_7= '}' ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_southWestBoundary_4_0 = null;

        EObject lv_northEastBoundary_6_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:689:2: ( (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_southWestBoundary_4_0= rulePoint ) ) otherlv_5= ':' ( (lv_northEastBoundary_6_0= rulePoint ) ) otherlv_7= '}' ) )
            // InternalPatternDsl.g:690:2: (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_southWestBoundary_4_0= rulePoint ) ) otherlv_5= ':' ( (lv_northEastBoundary_6_0= rulePoint ) ) otherlv_7= '}' )
            {
            // InternalPatternDsl.g:690:2: (otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_southWestBoundary_4_0= rulePoint ) ) otherlv_5= ':' ( (lv_northEastBoundary_6_0= rulePoint ) ) otherlv_7= '}' )
            // InternalPatternDsl.g:691:3: otherlv_0= 'region' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_southWestBoundary_4_0= rulePoint ) ) otherlv_5= ':' ( (lv_northEastBoundary_6_0= rulePoint ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRegionAccess().getRegionKeyword_0());
            		
            // InternalPatternDsl.g:695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPatternDsl.g:696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPatternDsl.g:696:4: (lv_name_1_0= RULE_ID )
            // InternalPatternDsl.g:697:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPatternDsl.g:721:3: ( (lv_southWestBoundary_4_0= rulePoint ) )
            // InternalPatternDsl.g:722:4: (lv_southWestBoundary_4_0= rulePoint )
            {
            // InternalPatternDsl.g:722:4: (lv_southWestBoundary_4_0= rulePoint )
            // InternalPatternDsl.g:723:5: lv_southWestBoundary_4_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getSouthWestBoundaryPointParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_southWestBoundary_4_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					set(
            						current,
            						"southWestBoundary",
            						lv_southWestBoundary_4_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRegionAccess().getColonKeyword_5());
            		
            // InternalPatternDsl.g:744:3: ( (lv_northEastBoundary_6_0= rulePoint ) )
            // InternalPatternDsl.g:745:4: (lv_northEastBoundary_6_0= rulePoint )
            {
            // InternalPatternDsl.g:745:4: (lv_northEastBoundary_6_0= rulePoint )
            // InternalPatternDsl.g:746:5: lv_northEastBoundary_6_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getNorthEastBoundaryPointParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_northEastBoundary_6_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					set(
            						current,
            						"northEastBoundary",
            						lv_northEastBoundary_6_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRulePatternMatcherElement"
    // InternalPatternDsl.g:771:1: entryRulePatternMatcherElement returns [EObject current=null] : iv_rulePatternMatcherElement= rulePatternMatcherElement EOF ;
    public final EObject entryRulePatternMatcherElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternMatcherElement = null;


        try {
            // InternalPatternDsl.g:771:62: (iv_rulePatternMatcherElement= rulePatternMatcherElement EOF )
            // InternalPatternDsl.g:772:2: iv_rulePatternMatcherElement= rulePatternMatcherElement EOF
            {
             newCompositeNode(grammarAccess.getPatternMatcherElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternMatcherElement=rulePatternMatcherElement();

            state._fsp--;

             current =iv_rulePatternMatcherElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternMatcherElement"


    // $ANTLR start "rulePatternMatcherElement"
    // InternalPatternDsl.g:778:1: rulePatternMatcherElement returns [EObject current=null] : (this_Phrase_0= rulePhrase | this_Concept_1= ruleConcept ) ;
    public final EObject rulePatternMatcherElement() throws RecognitionException {
        EObject current = null;

        EObject this_Phrase_0 = null;

        EObject this_Concept_1 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:784:2: ( (this_Phrase_0= rulePhrase | this_Concept_1= ruleConcept ) )
            // InternalPatternDsl.g:785:2: (this_Phrase_0= rulePhrase | this_Concept_1= ruleConcept )
            {
            // InternalPatternDsl.g:785:2: (this_Phrase_0= rulePhrase | this_Concept_1= ruleConcept )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPatternDsl.g:786:3: this_Phrase_0= rulePhrase
                    {

                    			newCompositeNode(grammarAccess.getPatternMatcherElementAccess().getPhraseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Phrase_0=rulePhrase();

                    state._fsp--;


                    			current = this_Phrase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:795:3: this_Concept_1= ruleConcept
                    {

                    			newCompositeNode(grammarAccess.getPatternMatcherElementAccess().getConceptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concept_1=ruleConcept();

                    state._fsp--;


                    			current = this_Concept_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternMatcherElement"


    // $ANTLR start "entryRuleConcept"
    // InternalPatternDsl.g:807:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalPatternDsl.g:807:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalPatternDsl.g:808:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalPatternDsl.g:814:1: ruleConcept returns [EObject current=null] : (this_TermList_0= ruleTermList | this_Term_1= ruleTerm ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_TermList_0 = null;

        EObject this_Term_1 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:820:2: ( (this_TermList_0= ruleTermList | this_Term_1= ruleTerm ) )
            // InternalPatternDsl.g:821:2: (this_TermList_0= ruleTermList | this_Term_1= ruleTerm )
            {
            // InternalPatternDsl.g:821:2: (this_TermList_0= ruleTermList | this_Term_1= ruleTerm )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPatternDsl.g:822:3: this_TermList_0= ruleTermList
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getTermListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TermList_0=ruleTermList();

                    state._fsp--;


                    			current = this_TermList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:831:3: this_Term_1= ruleTerm
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getTermParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Term_1=ruleTerm();

                    state._fsp--;


                    			current = this_Term_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleTermList"
    // InternalPatternDsl.g:843:1: entryRuleTermList returns [EObject current=null] : iv_ruleTermList= ruleTermList EOF ;
    public final EObject entryRuleTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermList = null;


        try {
            // InternalPatternDsl.g:843:49: (iv_ruleTermList= ruleTermList EOF )
            // InternalPatternDsl.g:844:2: iv_ruleTermList= ruleTermList EOF
            {
             newCompositeNode(grammarAccess.getTermListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermList=ruleTermList();

            state._fsp--;

             current =iv_ruleTermList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermList"


    // $ANTLR start "ruleTermList"
    // InternalPatternDsl.g:850:1: ruleTermList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_property_1_0= ruleWordListProperty ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_terms_5_0=null;
        Token otherlv_6=null;
        Token lv_terms_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:856:2: ( (otherlv_0= 'list' ( (lv_property_1_0= ruleWordListProperty ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )? ) )
            // InternalPatternDsl.g:857:2: (otherlv_0= 'list' ( (lv_property_1_0= ruleWordListProperty ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )? )
            {
            // InternalPatternDsl.g:857:2: (otherlv_0= 'list' ( (lv_property_1_0= ruleWordListProperty ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )? )
            // InternalPatternDsl.g:858:3: otherlv_0= 'list' ( (lv_property_1_0= ruleWordListProperty ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTermListAccess().getListKeyword_0());
            		
            // InternalPatternDsl.g:862:3: ( (lv_property_1_0= ruleWordListProperty ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=38 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPatternDsl.g:863:4: (lv_property_1_0= ruleWordListProperty )
                    {
                    // InternalPatternDsl.g:863:4: (lv_property_1_0= ruleWordListProperty )
                    // InternalPatternDsl.g:864:5: lv_property_1_0= ruleWordListProperty
                    {

                    					newCompositeNode(grammarAccess.getTermListAccess().getPropertyWordListPropertyEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_property_1_0=ruleWordListProperty();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermListRule());
                    					}
                    					set(
                    						current,
                    						"property",
                    						lv_property_1_0,
                    						"eagledata.core.dsl.pattern.PatternDsl.WordListProperty");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPatternDsl.g:881:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPatternDsl.g:882:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPatternDsl.g:882:4: (lv_name_2_0= RULE_ID )
            // InternalPatternDsl.g:883:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTermListAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getTermListAccess().getEqualsSignKeyword_3());
            		
            // InternalPatternDsl.g:903:3: (otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPatternDsl.g:904:4: otherlv_4= '(' ( (lv_terms_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTermListAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalPatternDsl.g:908:4: ( (lv_terms_5_0= RULE_STRING ) )
                    // InternalPatternDsl.g:909:5: (lv_terms_5_0= RULE_STRING )
                    {
                    // InternalPatternDsl.g:909:5: (lv_terms_5_0= RULE_STRING )
                    // InternalPatternDsl.g:910:6: lv_terms_5_0= RULE_STRING
                    {
                    lv_terms_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_terms_5_0, grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTermListRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"terms",
                    							lv_terms_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalPatternDsl.g:926:4: (otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPatternDsl.g:927:5: otherlv_6= ',' ( (lv_terms_7_0= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_18); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTermListAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPatternDsl.g:931:5: ( (lv_terms_7_0= RULE_STRING ) )
                    	    // InternalPatternDsl.g:932:6: (lv_terms_7_0= RULE_STRING )
                    	    {
                    	    // InternalPatternDsl.g:932:6: (lv_terms_7_0= RULE_STRING )
                    	    // InternalPatternDsl.g:933:7: lv_terms_7_0= RULE_STRING
                    	    {
                    	    lv_terms_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    							newLeafNode(lv_terms_7_0, grammarAccess.getTermListAccess().getTermsSTRINGTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTermListRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"terms",
                    	    								lv_terms_7_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTermListAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermList"


    // $ANTLR start "entryRuleTerm"
    // InternalPatternDsl.g:959:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalPatternDsl.g:959:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalPatternDsl.g:960:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalPatternDsl.g:966:1: ruleTerm returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:972:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPatternDsl.g:973:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPatternDsl.g:973:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPatternDsl.g:974:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPatternDsl.g:974:3: (lv_name_0_0= RULE_ID )
            // InternalPatternDsl.g:975:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTermRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePhrase"
    // InternalPatternDsl.g:994:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // InternalPatternDsl.g:994:47: (iv_rulePhrase= rulePhrase EOF )
            // InternalPatternDsl.g:995:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalPatternDsl.g:1001:1: rulePhrase returns [EObject current=null] : (otherlv_0= 'phrase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ordered_2_0= 'ordered' ) )? otherlv_3= '=' otherlv_4= '(' ( (lv_concepts_5_0= ruleConcept ) ) (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )* otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )? ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_ordered_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_concepts_5_0 = null;

        EObject lv_concepts_7_0 = null;

        EObject lv_options_10_0 = null;

        EObject lv_options_12_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1007:2: ( (otherlv_0= 'phrase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ordered_2_0= 'ordered' ) )? otherlv_3= '=' otherlv_4= '(' ( (lv_concepts_5_0= ruleConcept ) ) (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )* otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )? ) )
            // InternalPatternDsl.g:1008:2: (otherlv_0= 'phrase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ordered_2_0= 'ordered' ) )? otherlv_3= '=' otherlv_4= '(' ( (lv_concepts_5_0= ruleConcept ) ) (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )* otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )? )
            {
            // InternalPatternDsl.g:1008:2: (otherlv_0= 'phrase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ordered_2_0= 'ordered' ) )? otherlv_3= '=' otherlv_4= '(' ( (lv_concepts_5_0= ruleConcept ) ) (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )* otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )? )
            // InternalPatternDsl.g:1009:3: otherlv_0= 'phrase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_ordered_2_0= 'ordered' ) )? otherlv_3= '=' otherlv_4= '(' ( (lv_concepts_5_0= ruleConcept ) ) (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )* otherlv_8= ')' (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPhraseAccess().getPhraseKeyword_0());
            		
            // InternalPatternDsl.g:1013:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPatternDsl.g:1014:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPatternDsl.g:1014:4: (lv_name_1_0= RULE_ID )
            // InternalPatternDsl.g:1015:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhraseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhraseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPatternDsl.g:1031:3: ( (lv_ordered_2_0= 'ordered' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPatternDsl.g:1032:4: (lv_ordered_2_0= 'ordered' )
                    {
                    // InternalPatternDsl.g:1032:4: (lv_ordered_2_0= 'ordered' )
                    // InternalPatternDsl.g:1033:5: lv_ordered_2_0= 'ordered'
                    {
                    lv_ordered_2_0=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(lv_ordered_2_0, grammarAccess.getPhraseAccess().getOrderedOrderedKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPhraseRule());
                    					}
                    					setWithLastConsumed(current, "ordered", true, "ordered");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getPhraseAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getPhraseAccess().getLeftParenthesisKeyword_4());
            		
            // InternalPatternDsl.g:1053:3: ( (lv_concepts_5_0= ruleConcept ) )
            // InternalPatternDsl.g:1054:4: (lv_concepts_5_0= ruleConcept )
            {
            // InternalPatternDsl.g:1054:4: (lv_concepts_5_0= ruleConcept )
            // InternalPatternDsl.g:1055:5: lv_concepts_5_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_concepts_5_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhraseRule());
            					}
            					add(
            						current,
            						"concepts",
            						lv_concepts_5_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPatternDsl.g:1072:3: (otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPatternDsl.g:1073:4: otherlv_6= ',' ( (lv_concepts_7_0= ruleConcept ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPhraseAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalPatternDsl.g:1077:4: ( (lv_concepts_7_0= ruleConcept ) )
            	    // InternalPatternDsl.g:1078:5: (lv_concepts_7_0= ruleConcept )
            	    {
            	    // InternalPatternDsl.g:1078:5: (lv_concepts_7_0= ruleConcept )
            	    // InternalPatternDsl.g:1079:6: lv_concepts_7_0= ruleConcept
            	    {

            	    						newCompositeNode(grammarAccess.getPhraseAccess().getConceptsConceptParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_concepts_7_0=ruleConcept();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhraseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"concepts",
            	    							lv_concepts_7_0,
            	    							"eagledata.core.dsl.pattern.PatternDsl.Concept");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getPhraseAccess().getRightParenthesisKeyword_7());
            		
            // InternalPatternDsl.g:1101:3: (otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPatternDsl.g:1102:4: otherlv_9= '{' ( (lv_options_10_0= ruleOption ) ) (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getPhraseAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalPatternDsl.g:1106:4: ( (lv_options_10_0= ruleOption ) )
                    // InternalPatternDsl.g:1107:5: (lv_options_10_0= ruleOption )
                    {
                    // InternalPatternDsl.g:1107:5: (lv_options_10_0= ruleOption )
                    // InternalPatternDsl.g:1108:6: lv_options_10_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_options_10_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhraseRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_10_0,
                    							"eagledata.core.dsl.pattern.PatternDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPatternDsl.g:1125:4: (otherlv_11= ',' ( (lv_options_12_0= ruleOption ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalPatternDsl.g:1126:5: otherlv_11= ',' ( (lv_options_12_0= ruleOption ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_24); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPhraseAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalPatternDsl.g:1130:5: ( (lv_options_12_0= ruleOption ) )
                    	    // InternalPatternDsl.g:1131:6: (lv_options_12_0= ruleOption )
                    	    {
                    	    // InternalPatternDsl.g:1131:6: (lv_options_12_0= ruleOption )
                    	    // InternalPatternDsl.g:1132:7: lv_options_12_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getPhraseAccess().getOptionsOptionParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_options_12_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPhraseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_12_0,
                    	    								"eagledata.core.dsl.pattern.PatternDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getPhraseAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleOption"
    // InternalPatternDsl.g:1159:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalPatternDsl.g:1159:47: (iv_ruleOption= ruleOption EOF )
            // InternalPatternDsl.g:1160:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalPatternDsl.g:1166:1: ruleOption returns [EObject current=null] : (this_BooleanOption_0= ruleBooleanOption | this_GeoOption_1= ruleGeoOption | this_IntOption_2= ruleIntOption | this_LanguageOption_3= ruleLanguageOption | this_SourceOption_4= ruleSourceOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanOption_0 = null;

        EObject this_GeoOption_1 = null;

        EObject this_IntOption_2 = null;

        EObject this_LanguageOption_3 = null;

        EObject this_SourceOption_4 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1172:2: ( (this_BooleanOption_0= ruleBooleanOption | this_GeoOption_1= ruleGeoOption | this_IntOption_2= ruleIntOption | this_LanguageOption_3= ruleLanguageOption | this_SourceOption_4= ruleSourceOption ) )
            // InternalPatternDsl.g:1173:2: (this_BooleanOption_0= ruleBooleanOption | this_GeoOption_1= ruleGeoOption | this_IntOption_2= ruleIntOption | this_LanguageOption_3= ruleLanguageOption | this_SourceOption_4= ruleSourceOption )
            {
            // InternalPatternDsl.g:1173:2: (this_BooleanOption_0= ruleBooleanOption | this_GeoOption_1= ruleGeoOption | this_IntOption_2= ruleIntOption | this_LanguageOption_3= ruleLanguageOption | this_SourceOption_4= ruleSourceOption )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 33:
            case 34:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            case 31:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalPatternDsl.g:1174:3: this_BooleanOption_0= ruleBooleanOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanOption_0=ruleBooleanOption();

                    state._fsp--;


                    			current = this_BooleanOption_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1183:3: this_GeoOption_1= ruleGeoOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getGeoOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeoOption_1=ruleGeoOption();

                    state._fsp--;


                    			current = this_GeoOption_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1192:3: this_IntOption_2= ruleIntOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntOption_2=ruleIntOption();

                    state._fsp--;


                    			current = this_IntOption_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:1201:3: this_LanguageOption_3= ruleLanguageOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getLanguageOptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageOption_3=ruleLanguageOption();

                    state._fsp--;


                    			current = this_LanguageOption_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPatternDsl.g:1210:3: this_SourceOption_4= ruleSourceOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getSourceOptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SourceOption_4=ruleSourceOption();

                    state._fsp--;


                    			current = this_SourceOption_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleGeoOption"
    // InternalPatternDsl.g:1222:1: entryRuleGeoOption returns [EObject current=null] : iv_ruleGeoOption= ruleGeoOption EOF ;
    public final EObject entryRuleGeoOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeoOption = null;


        try {
            // InternalPatternDsl.g:1222:50: (iv_ruleGeoOption= ruleGeoOption EOF )
            // InternalPatternDsl.g:1223:2: iv_ruleGeoOption= ruleGeoOption EOF
            {
             newCompositeNode(grammarAccess.getGeoOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeoOption=ruleGeoOption();

            state._fsp--;

             current =iv_ruleGeoOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeoOption"


    // $ANTLR start "ruleGeoOption"
    // InternalPatternDsl.g:1229:1: ruleGeoOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleGeoOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGeoOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1235:2: ( ( ( (lv_key_0_0= ruleGeoOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalPatternDsl.g:1236:2: ( ( (lv_key_0_0= ruleGeoOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalPatternDsl.g:1236:2: ( ( (lv_key_0_0= ruleGeoOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            // InternalPatternDsl.g:1237:3: ( (lv_key_0_0= ruleGeoOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) )
            {
            // InternalPatternDsl.g:1237:3: ( (lv_key_0_0= ruleGeoOptionKey ) )
            // InternalPatternDsl.g:1238:4: (lv_key_0_0= ruleGeoOptionKey )
            {
            // InternalPatternDsl.g:1238:4: (lv_key_0_0= ruleGeoOptionKey )
            // InternalPatternDsl.g:1239:5: lv_key_0_0= ruleGeoOptionKey
            {

            					newCompositeNode(grammarAccess.getGeoOptionAccess().getKeyGeoOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_key_0_0=ruleGeoOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeoOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.GeoOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGeoOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalPatternDsl.g:1260:3: ( ( ruleQualifiedName ) )
            // InternalPatternDsl.g:1261:4: ( ruleQualifiedName )
            {
            // InternalPatternDsl.g:1261:4: ( ruleQualifiedName )
            // InternalPatternDsl.g:1262:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeoOptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeoOptionAccess().getValueGeographicalElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeoOption"


    // $ANTLR start "entryRuleSourceOption"
    // InternalPatternDsl.g:1280:1: entryRuleSourceOption returns [EObject current=null] : iv_ruleSourceOption= ruleSourceOption EOF ;
    public final EObject entryRuleSourceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceOption = null;


        try {
            // InternalPatternDsl.g:1280:53: (iv_ruleSourceOption= ruleSourceOption EOF )
            // InternalPatternDsl.g:1281:2: iv_ruleSourceOption= ruleSourceOption EOF
            {
             newCompositeNode(grammarAccess.getSourceOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceOption=ruleSourceOption();

            state._fsp--;

             current =iv_ruleSourceOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceOption"


    // $ANTLR start "ruleSourceOption"
    // InternalPatternDsl.g:1287:1: ruleSourceOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleSourceOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleSource ) ) ) ;
    public final EObject ruleSourceOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_key_0_0 = null;

        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1293:2: ( ( ( (lv_key_0_0= ruleSourceOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleSource ) ) ) )
            // InternalPatternDsl.g:1294:2: ( ( (lv_key_0_0= ruleSourceOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleSource ) ) )
            {
            // InternalPatternDsl.g:1294:2: ( ( (lv_key_0_0= ruleSourceOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleSource ) ) )
            // InternalPatternDsl.g:1295:3: ( (lv_key_0_0= ruleSourceOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleSource ) )
            {
            // InternalPatternDsl.g:1295:3: ( (lv_key_0_0= ruleSourceOptionKey ) )
            // InternalPatternDsl.g:1296:4: (lv_key_0_0= ruleSourceOptionKey )
            {
            // InternalPatternDsl.g:1296:4: (lv_key_0_0= ruleSourceOptionKey )
            // InternalPatternDsl.g:1297:5: lv_key_0_0= ruleSourceOptionKey
            {

            					newCompositeNode(grammarAccess.getSourceOptionAccess().getKeySourceOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_key_0_0=ruleSourceOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.SourceOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalPatternDsl.g:1318:3: ( (lv_value_2_0= ruleSource ) )
            // InternalPatternDsl.g:1319:4: (lv_value_2_0= ruleSource )
            {
            // InternalPatternDsl.g:1319:4: (lv_value_2_0= ruleSource )
            // InternalPatternDsl.g:1320:5: lv_value_2_0= ruleSource
            {

            					newCompositeNode(grammarAccess.getSourceOptionAccess().getValueSourceEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceOptionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Source");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceOption"


    // $ANTLR start "entryRuleLanguageOption"
    // InternalPatternDsl.g:1341:1: entryRuleLanguageOption returns [EObject current=null] : iv_ruleLanguageOption= ruleLanguageOption EOF ;
    public final EObject entryRuleLanguageOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageOption = null;


        try {
            // InternalPatternDsl.g:1341:55: (iv_ruleLanguageOption= ruleLanguageOption EOF )
            // InternalPatternDsl.g:1342:2: iv_ruleLanguageOption= ruleLanguageOption EOF
            {
             newCompositeNode(grammarAccess.getLanguageOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageOption=ruleLanguageOption();

            state._fsp--;

             current =iv_ruleLanguageOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageOption"


    // $ANTLR start "ruleLanguageOption"
    // InternalPatternDsl.g:1348:1: ruleLanguageOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleLanguageOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLanguage ) ) ) ;
    public final EObject ruleLanguageOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_key_0_0 = null;

        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1354:2: ( ( ( (lv_key_0_0= ruleLanguageOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLanguage ) ) ) )
            // InternalPatternDsl.g:1355:2: ( ( (lv_key_0_0= ruleLanguageOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLanguage ) ) )
            {
            // InternalPatternDsl.g:1355:2: ( ( (lv_key_0_0= ruleLanguageOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLanguage ) ) )
            // InternalPatternDsl.g:1356:3: ( (lv_key_0_0= ruleLanguageOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleLanguage ) )
            {
            // InternalPatternDsl.g:1356:3: ( (lv_key_0_0= ruleLanguageOptionKey ) )
            // InternalPatternDsl.g:1357:4: (lv_key_0_0= ruleLanguageOptionKey )
            {
            // InternalPatternDsl.g:1357:4: (lv_key_0_0= ruleLanguageOptionKey )
            // InternalPatternDsl.g:1358:5: lv_key_0_0= ruleLanguageOptionKey
            {

            					newCompositeNode(grammarAccess.getLanguageOptionAccess().getKeyLanguageOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_key_0_0=ruleLanguageOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.LanguageOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalPatternDsl.g:1379:3: ( (lv_value_2_0= ruleLanguage ) )
            // InternalPatternDsl.g:1380:4: (lv_value_2_0= ruleLanguage )
            {
            // InternalPatternDsl.g:1380:4: (lv_value_2_0= ruleLanguage )
            // InternalPatternDsl.g:1381:5: lv_value_2_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getLanguageOptionAccess().getValueLanguageEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageOptionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"eagledata.core.dsl.pattern.PatternDsl.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageOption"


    // $ANTLR start "entryRuleBooleanOption"
    // InternalPatternDsl.g:1402:1: entryRuleBooleanOption returns [EObject current=null] : iv_ruleBooleanOption= ruleBooleanOption EOF ;
    public final EObject entryRuleBooleanOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOption = null;


        try {
            // InternalPatternDsl.g:1402:54: (iv_ruleBooleanOption= ruleBooleanOption EOF )
            // InternalPatternDsl.g:1403:2: iv_ruleBooleanOption= ruleBooleanOption EOF
            {
             newCompositeNode(grammarAccess.getBooleanOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOption=ruleBooleanOption();

            state._fsp--;

             current =iv_ruleBooleanOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanOption"


    // $ANTLR start "ruleBooleanOption"
    // InternalPatternDsl.g:1409:1: ruleBooleanOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1415:2: ( ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalPatternDsl.g:1416:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalPatternDsl.g:1416:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalPatternDsl.g:1417:3: ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            // InternalPatternDsl.g:1417:3: ( (lv_key_0_0= ruleBooleanOptionKey ) )
            // InternalPatternDsl.g:1418:4: (lv_key_0_0= ruleBooleanOptionKey )
            {
            // InternalPatternDsl.g:1418:4: (lv_key_0_0= ruleBooleanOptionKey )
            // InternalPatternDsl.g:1419:5: lv_key_0_0= ruleBooleanOptionKey
            {

            					newCompositeNode(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_key_0_0=ruleBooleanOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.BooleanOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalPatternDsl.g:1440:3: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalPatternDsl.g:1441:4: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalPatternDsl.g:1441:4: (lv_value_2_0= RULE_BOOLEAN )
            // InternalPatternDsl.g:1442:5: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"eagledata.core.dsl.pattern.PatternDsl.BOOLEAN");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOption"


    // $ANTLR start "entryRuleIntOption"
    // InternalPatternDsl.g:1462:1: entryRuleIntOption returns [EObject current=null] : iv_ruleIntOption= ruleIntOption EOF ;
    public final EObject entryRuleIntOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOption = null;


        try {
            // InternalPatternDsl.g:1462:50: (iv_ruleIntOption= ruleIntOption EOF )
            // InternalPatternDsl.g:1463:2: iv_ruleIntOption= ruleIntOption EOF
            {
             newCompositeNode(grammarAccess.getIntOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOption=ruleIntOption();

            state._fsp--;

             current =iv_ruleIntOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntOption"


    // $ANTLR start "ruleIntOption"
    // InternalPatternDsl.g:1469:1: ruleIntOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalPatternDsl.g:1475:2: ( ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalPatternDsl.g:1476:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalPatternDsl.g:1476:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalPatternDsl.g:1477:3: ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalPatternDsl.g:1477:3: ( (lv_key_0_0= ruleIntOptionKey ) )
            // InternalPatternDsl.g:1478:4: (lv_key_0_0= ruleIntOptionKey )
            {
            // InternalPatternDsl.g:1478:4: (lv_key_0_0= ruleIntOptionKey )
            // InternalPatternDsl.g:1479:5: lv_key_0_0= ruleIntOptionKey
            {

            					newCompositeNode(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_key_0_0=ruleIntOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.pattern.PatternDsl.IntOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalPatternDsl.g:1500:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalPatternDsl.g:1501:4: (lv_value_2_0= RULE_INT )
            {
            // InternalPatternDsl.g:1501:4: (lv_value_2_0= RULE_INT )
            // InternalPatternDsl.g:1502:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntOption"


    // $ANTLR start "ruleGeoOptionKey"
    // InternalPatternDsl.g:1522:1: ruleGeoOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'in' ) ;
    public final Enumerator ruleGeoOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1528:2: ( (enumLiteral_0= 'in' ) )
            // InternalPatternDsl.g:1529:2: (enumLiteral_0= 'in' )
            {
            // InternalPatternDsl.g:1529:2: (enumLiteral_0= 'in' )
            // InternalPatternDsl.g:1530:3: enumLiteral_0= 'in'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

            			current = grammarAccess.getGeoOptionKeyAccess().getInEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getGeoOptionKeyAccess().getInEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeoOptionKey"


    // $ANTLR start "ruleSourceOptionKey"
    // InternalPatternDsl.g:1539:1: ruleSourceOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'source' ) ;
    public final Enumerator ruleSourceOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1545:2: ( (enumLiteral_0= 'source' ) )
            // InternalPatternDsl.g:1546:2: (enumLiteral_0= 'source' )
            {
            // InternalPatternDsl.g:1546:2: (enumLiteral_0= 'source' )
            // InternalPatternDsl.g:1547:3: enumLiteral_0= 'source'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

            			current = grammarAccess.getSourceOptionKeyAccess().getSourceEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSourceOptionKeyAccess().getSourceEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceOptionKey"


    // $ANTLR start "ruleLanguageOptionKey"
    // InternalPatternDsl.g:1556:1: ruleLanguageOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'language' ) ;
    public final Enumerator ruleLanguageOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1562:2: ( (enumLiteral_0= 'language' ) )
            // InternalPatternDsl.g:1563:2: (enumLiteral_0= 'language' )
            {
            // InternalPatternDsl.g:1563:2: (enumLiteral_0= 'language' )
            // InternalPatternDsl.g:1564:3: enumLiteral_0= 'language'
            {
            enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

            			current = grammarAccess.getLanguageOptionKeyAccess().getLangEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getLanguageOptionKeyAccess().getLangEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageOptionKey"


    // $ANTLR start "ruleIntOptionKey"
    // InternalPatternDsl.g:1573:1: ruleIntOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minretweet' ) | (enumLiteral_1= 'minfavorite' ) ) ;
    public final Enumerator ruleIntOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1579:2: ( ( (enumLiteral_0= 'minretweet' ) | (enumLiteral_1= 'minfavorite' ) ) )
            // InternalPatternDsl.g:1580:2: ( (enumLiteral_0= 'minretweet' ) | (enumLiteral_1= 'minfavorite' ) )
            {
            // InternalPatternDsl.g:1580:2: ( (enumLiteral_0= 'minretweet' ) | (enumLiteral_1= 'minfavorite' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPatternDsl.g:1581:3: (enumLiteral_0= 'minretweet' )
                    {
                    // InternalPatternDsl.g:1581:3: (enumLiteral_0= 'minretweet' )
                    // InternalPatternDsl.g:1582:4: enumLiteral_0= 'minretweet'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntOptionKeyAccess().getLangEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1589:3: (enumLiteral_1= 'minfavorite' )
                    {
                    // InternalPatternDsl.g:1589:3: (enumLiteral_1= 'minfavorite' )
                    // InternalPatternDsl.g:1590:4: enumLiteral_1= 'minfavorite'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntOptionKeyAccess().getSourceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntOptionKey"


    // $ANTLR start "ruleBooleanOptionKey"
    // InternalPatternDsl.g:1600:1: ruleBooleanOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'inreplyto' ) | (enumLiteral_1= 'retweet' ) | (enumLiteral_2= 'favorite' ) ) ;
    public final Enumerator ruleBooleanOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1606:2: ( ( (enumLiteral_0= 'inreplyto' ) | (enumLiteral_1= 'retweet' ) | (enumLiteral_2= 'favorite' ) ) )
            // InternalPatternDsl.g:1607:2: ( (enumLiteral_0= 'inreplyto' ) | (enumLiteral_1= 'retweet' ) | (enumLiteral_2= 'favorite' ) )
            {
            // InternalPatternDsl.g:1607:2: ( (enumLiteral_0= 'inreplyto' ) | (enumLiteral_1= 'retweet' ) | (enumLiteral_2= 'favorite' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPatternDsl.g:1608:3: (enumLiteral_0= 'inreplyto' )
                    {
                    // InternalPatternDsl.g:1608:3: (enumLiteral_0= 'inreplyto' )
                    // InternalPatternDsl.g:1609:4: enumLiteral_0= 'inreplyto'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOptionKeyAccess().getInreplytoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1616:3: (enumLiteral_1= 'retweet' )
                    {
                    // InternalPatternDsl.g:1616:3: (enumLiteral_1= 'retweet' )
                    // InternalPatternDsl.g:1617:4: enumLiteral_1= 'retweet'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOptionKeyAccess().getRetweetEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1624:3: (enumLiteral_2= 'favorite' )
                    {
                    // InternalPatternDsl.g:1624:3: (enumLiteral_2= 'favorite' )
                    // InternalPatternDsl.g:1625:4: enumLiteral_2= 'favorite'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOptionKeyAccess().getFavoriteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBooleanOptionKeyAccess().getFavoriteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOptionKey"


    // $ANTLR start "ruleWordListProperty"
    // InternalPatternDsl.g:1635:1: ruleWordListProperty returns [Enumerator current=null] : ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) ;
    public final Enumerator ruleWordListProperty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1641:2: ( ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) ) )
            // InternalPatternDsl.g:1642:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            {
            // InternalPatternDsl.g:1642:2: ( (enumLiteral_0= 'all' ) | (enumLiteral_1= 'any' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPatternDsl.g:1643:3: (enumLiteral_0= 'all' )
                    {
                    // InternalPatternDsl.g:1643:3: (enumLiteral_0= 'all' )
                    // InternalPatternDsl.g:1644:4: enumLiteral_0= 'all'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWordListPropertyAccess().getAllEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1651:3: (enumLiteral_1= 'any' )
                    {
                    // InternalPatternDsl.g:1651:3: (enumLiteral_1= 'any' )
                    // InternalPatternDsl.g:1652:4: enumLiteral_1= 'any'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getWordListPropertyAccess().getAnyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWordListPropertyAccess().getAnyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWordListProperty"


    // $ANTLR start "ruleSource"
    // InternalPatternDsl.g:1662:1: ruleSource returns [Enumerator current=null] : ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'ios' ) | (enumLiteral_2= 'web' ) | (enumLiteral_3= 'all' ) ) ;
    public final Enumerator ruleSource() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1668:2: ( ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'ios' ) | (enumLiteral_2= 'web' ) | (enumLiteral_3= 'all' ) ) )
            // InternalPatternDsl.g:1669:2: ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'ios' ) | (enumLiteral_2= 'web' ) | (enumLiteral_3= 'all' ) )
            {
            // InternalPatternDsl.g:1669:2: ( (enumLiteral_0= 'android' ) | (enumLiteral_1= 'ios' ) | (enumLiteral_2= 'web' ) | (enumLiteral_3= 'all' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPatternDsl.g:1670:3: (enumLiteral_0= 'android' )
                    {
                    // InternalPatternDsl.g:1670:3: (enumLiteral_0= 'android' )
                    // InternalPatternDsl.g:1671:4: enumLiteral_0= 'android'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSourceAccess().getAndroidEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1678:3: (enumLiteral_1= 'ios' )
                    {
                    // InternalPatternDsl.g:1678:3: (enumLiteral_1= 'ios' )
                    // InternalPatternDsl.g:1679:4: enumLiteral_1= 'ios'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSourceAccess().getIosEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1686:3: (enumLiteral_2= 'web' )
                    {
                    // InternalPatternDsl.g:1686:3: (enumLiteral_2= 'web' )
                    // InternalPatternDsl.g:1687:4: enumLiteral_2= 'web'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSourceAccess().getWebEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPatternDsl.g:1694:3: (enumLiteral_3= 'all' )
                    {
                    // InternalPatternDsl.g:1694:3: (enumLiteral_3= 'all' )
                    // InternalPatternDsl.g:1695:4: enumLiteral_3= 'all'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getSourceAccess().getAllEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSourceAccess().getAllEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "ruleDistanceMesurement"
    // InternalPatternDsl.g:1705:1: ruleDistanceMesurement returns [Enumerator current=null] : ( (enumLiteral_0= 'kms' ) | (enumLiteral_1= 'miles' ) | (enumLiteral_2= 'mts' ) ) ;
    public final Enumerator ruleDistanceMesurement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1711:2: ( ( (enumLiteral_0= 'kms' ) | (enumLiteral_1= 'miles' ) | (enumLiteral_2= 'mts' ) ) )
            // InternalPatternDsl.g:1712:2: ( (enumLiteral_0= 'kms' ) | (enumLiteral_1= 'miles' ) | (enumLiteral_2= 'mts' ) )
            {
            // InternalPatternDsl.g:1712:2: ( (enumLiteral_0= 'kms' ) | (enumLiteral_1= 'miles' ) | (enumLiteral_2= 'mts' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalPatternDsl.g:1713:3: (enumLiteral_0= 'kms' )
                    {
                    // InternalPatternDsl.g:1713:3: (enumLiteral_0= 'kms' )
                    // InternalPatternDsl.g:1714:4: enumLiteral_0= 'kms'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistanceMesurementAccess().getKmsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1721:3: (enumLiteral_1= 'miles' )
                    {
                    // InternalPatternDsl.g:1721:3: (enumLiteral_1= 'miles' )
                    // InternalPatternDsl.g:1722:4: enumLiteral_1= 'miles'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistanceMesurementAccess().getMilesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1729:3: (enumLiteral_2= 'mts' )
                    {
                    // InternalPatternDsl.g:1729:3: (enumLiteral_2= 'mts' )
                    // InternalPatternDsl.g:1730:4: enumLiteral_2= 'mts'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDistanceMesurementAccess().getMtsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistanceMesurementAccess().getMtsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceMesurement"


    // $ANTLR start "ruleLanguage"
    // InternalPatternDsl.g:1740:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'english' ) | (enumLiteral_1= 'spanish' ) | (enumLiteral_2= 'chinese' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPatternDsl.g:1746:2: ( ( (enumLiteral_0= 'english' ) | (enumLiteral_1= 'spanish' ) | (enumLiteral_2= 'chinese' ) ) )
            // InternalPatternDsl.g:1747:2: ( (enumLiteral_0= 'english' ) | (enumLiteral_1= 'spanish' ) | (enumLiteral_2= 'chinese' ) )
            {
            // InternalPatternDsl.g:1747:2: ( (enumLiteral_0= 'english' ) | (enumLiteral_1= 'spanish' ) | (enumLiteral_2= 'chinese' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt23=1;
                }
                break;
            case 47:
                {
                alt23=2;
                }
                break;
            case 48:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPatternDsl.g:1748:3: (enumLiteral_0= 'english' )
                    {
                    // InternalPatternDsl.g:1748:3: (enumLiteral_0= 'english' )
                    // InternalPatternDsl.g:1749:4: enumLiteral_0= 'english'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getEnEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPatternDsl.g:1756:3: (enumLiteral_1= 'spanish' )
                    {
                    // InternalPatternDsl.g:1756:3: (enumLiteral_1= 'spanish' )
                    // InternalPatternDsl.g:1757:4: enumLiteral_1= 'spanish'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getEsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPatternDsl.g:1764:3: (enumLiteral_2= 'chinese' )
                    {
                    // InternalPatternDsl.g:1764:3: (enumLiteral_2= 'chinese' )
                    // InternalPatternDsl.g:1765:4: enumLiteral_2= 'chinese'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getZhEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLanguageAccess().getZhEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000012812012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000012812010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003FC0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000074000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});

}