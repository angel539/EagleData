package eagledata.core.dsl.datadesc.parser.antlr.internal;

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
import eagledata.core.dsl.datadesc.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FORMAT", "RULE_ID", "RULE_STRING", "RULE_UNIQUENESS", "RULE_INT", "RULE_DELETATION_MARK", "RULE_MODIFICATION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'description'", "':'", "'{'", "'}'", "'fragment'", "'datatype'", "'enumeration'", "'>'", "'#'", "'='", "'string'", "'int'", "'real'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'lat'", "'long'", "'minLength'", "'maxLength'", "'casesensitive'", "'min'", "'max'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'"
    };
    public static final int RULE_MODIFICATION_MARK=10;
    public static final int T__19=19;
    public static final int RULE_FORMAT=4;
    public static final int RULE_UNIQUENESS=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DELETATION_MARK=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataDsl.g"; }



     	private DataDslGrammarAccess grammarAccess;

        public InternalDataDslParser(TokenStream input, DataDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected DataDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalDataDsl.g:65:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalDataDsl.g:65:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalDataDsl.g:66:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDataDsl.g:72:1: ruleDataModel returns [EObject current=null] : ( ( (lv_descriptions_0_0= ruleDataDescription ) ) (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )* ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_descriptions_0_0 = null;

        EObject lv_descriptions_2_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:78:2: ( ( ( (lv_descriptions_0_0= ruleDataDescription ) ) (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )* ) )
            // InternalDataDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleDataDescription ) ) (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )* )
            {
            // InternalDataDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleDataDescription ) ) (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )* )
            // InternalDataDsl.g:80:3: ( (lv_descriptions_0_0= ruleDataDescription ) ) (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )*
            {
            // InternalDataDsl.g:80:3: ( (lv_descriptions_0_0= ruleDataDescription ) )
            // InternalDataDsl.g:81:4: (lv_descriptions_0_0= ruleDataDescription )
            {
            // InternalDataDsl.g:81:4: (lv_descriptions_0_0= ruleDataDescription )
            // InternalDataDsl.g:82:5: lv_descriptions_0_0= ruleDataDescription
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_descriptions_0_0=ruleDataDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DataDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:99:3: (otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataDsl.g:100:4: otherlv_1= ',' ( (lv_descriptions_2_0= ruleDataDescription ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalDataDsl.g:104:4: ( (lv_descriptions_2_0= ruleDataDescription ) )
            	    // InternalDataDsl.g:105:5: (lv_descriptions_2_0= ruleDataDescription )
            	    {
            	    // InternalDataDsl.g:105:5: (lv_descriptions_2_0= ruleDataDescription )
            	    // InternalDataDsl.g:106:6: lv_descriptions_2_0= ruleDataDescription
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_descriptions_2_0=ruleDataDescription();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"descriptions",
            	    							lv_descriptions_2_0,
            	    							"eagledata.core.dsl.datadesc.DataDsl.DataDescription");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleDataDescription"
    // InternalDataDsl.g:128:1: entryRuleDataDescription returns [EObject current=null] : iv_ruleDataDescription= ruleDataDescription EOF ;
    public final EObject entryRuleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDescription = null;


        try {
            // InternalDataDsl.g:128:56: (iv_ruleDataDescription= ruleDataDescription EOF )
            // InternalDataDsl.g:129:2: iv_ruleDataDescription= ruleDataDescription EOF
            {
             newCompositeNode(grammarAccess.getDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDescription=ruleDataDescription();

            state._fsp--;

             current =iv_ruleDataDescription; 
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
    // $ANTLR end "entryRuleDataDescription"


    // $ANTLR start "ruleDataDescription"
    // InternalDataDsl.g:135:1: ruleDataDescription returns [EObject current=null] : (this_TypeSpecification_0= ruleTypeSpecification | this_DataSource_1= ruleDataSource | this_DataFragment_2= ruleDataFragment ) ;
    public final EObject ruleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject this_TypeSpecification_0 = null;

        EObject this_DataSource_1 = null;

        EObject this_DataFragment_2 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:141:2: ( (this_TypeSpecification_0= ruleTypeSpecification | this_DataSource_1= ruleDataSource | this_DataFragment_2= ruleDataFragment ) )
            // InternalDataDsl.g:142:2: (this_TypeSpecification_0= ruleTypeSpecification | this_DataSource_1= ruleDataSource | this_DataFragment_2= ruleDataFragment )
            {
            // InternalDataDsl.g:142:2: (this_TypeSpecification_0= ruleTypeSpecification | this_DataSource_1= ruleDataSource | this_DataFragment_2= ruleDataFragment )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // InternalDataDsl.g:143:3: this_TypeSpecification_0= ruleTypeSpecification
                    {

                    			newCompositeNode(grammarAccess.getDataDescriptionAccess().getTypeSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSpecification_0=ruleTypeSpecification();

                    state._fsp--;


                    			current = this_TypeSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:152:3: this_DataSource_1= ruleDataSource
                    {

                    			newCompositeNode(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSource_1=ruleDataSource();

                    state._fsp--;


                    			current = this_DataSource_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:161:3: this_DataFragment_2= ruleDataFragment
                    {

                    			newCompositeNode(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFragment_2=ruleDataFragment();

                    state._fsp--;


                    			current = this_DataFragment_2;
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
    // $ANTLR end "ruleDataDescription"


    // $ANTLR start "entryRuleDataSource"
    // InternalDataDsl.g:173:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalDataDsl.g:173:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalDataDsl.g:174:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalDataDsl.g:180:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'description' ( (lv_format_1_0= RULE_FORMAT ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_format_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_nodes_8_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_options_13_0 = null;

        EObject lv_options_15_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:186:2: ( (otherlv_0= 'description' ( (lv_format_1_0= RULE_FORMAT ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? ) )
            // InternalDataDsl.g:187:2: (otherlv_0= 'description' ( (lv_format_1_0= RULE_FORMAT ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? )
            {
            // InternalDataDsl.g:187:2: (otherlv_0= 'description' ( (lv_format_1_0= RULE_FORMAT ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? )
            // InternalDataDsl.g:188:3: otherlv_0= 'description' ( (lv_format_1_0= RULE_FORMAT ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDescriptionKeyword_0());
            		
            // InternalDataDsl.g:192:3: ( (lv_format_1_0= RULE_FORMAT ) )
            // InternalDataDsl.g:193:4: (lv_format_1_0= RULE_FORMAT )
            {
            // InternalDataDsl.g:193:4: (lv_format_1_0= RULE_FORMAT )
            // InternalDataDsl.g:194:5: lv_format_1_0= RULE_FORMAT
            {
            lv_format_1_0=(Token)match(input,RULE_FORMAT,FOLLOW_6); 

            					newLeafNode(lv_format_1_0, grammarAccess.getDataSourceAccess().getFormatFORMATTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_1_0,
            						"eagledata.core.dsl.datadesc.DataDsl.FORMAT");
            				

            }


            }

            // InternalDataDsl.g:210:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDataDsl.g:211:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDataDsl.g:211:4: (lv_name_2_0= RULE_ID )
            // InternalDataDsl.g:212:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:228:3: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:229:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataSourceAccess().getColonKeyword_3_0());
                    			
                    // InternalDataDsl.g:233:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataDsl.g:234:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataDsl.g:234:5: (otherlv_4= RULE_ID )
                    // InternalDataDsl.g:235:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalDataDsl.g:246:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDataDsl.g:247:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataSourceAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDsl.g:251:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalDataDsl.g:252:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalDataDsl.g:252:6: (otherlv_6= RULE_ID )
                    	    // InternalDataDsl.g:253:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataSourceRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDataDsl.g:270:3: ( ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==RULE_UNIQUENESS||LA6_0==23||(LA6_0>=26 && LA6_0<=36)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:271:4: ( (lv_nodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )*
                    {
                    // InternalDataDsl.g:271:4: ( (lv_nodes_8_0= ruleNode ) )
                    // InternalDataDsl.g:272:5: (lv_nodes_8_0= ruleNode )
                    {
                    // InternalDataDsl.g:272:5: (lv_nodes_8_0= ruleNode )
                    // InternalDataDsl.g:273:6: lv_nodes_8_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_8_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_8_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:290:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDataDsl.g:291:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDataSourceAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalDataDsl.g:295:5: ( (lv_nodes_10_0= ruleNode ) )
                    	    // InternalDataDsl.g:296:6: (lv_nodes_10_0= ruleNode )
                    	    {
                    	    // InternalDataDsl.g:296:6: (lv_nodes_10_0= ruleNode )
                    	    // InternalDataDsl.g:297:7: lv_nodes_10_0= ruleNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_10_0=ruleNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_10_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Node");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalDataDsl.g:320:3: (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:321:4: otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalDataDsl.g:325:4: ( (lv_options_13_0= ruleOption ) )
                    // InternalDataDsl.g:326:5: (lv_options_13_0= ruleOption )
                    {
                    // InternalDataDsl.g:326:5: (lv_options_13_0= ruleOption )
                    // InternalDataDsl.g:327:6: lv_options_13_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_options_13_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_13_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:344:4: (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDsl.g:345:5: otherlv_14= ',' ( (lv_options_15_0= ruleOption ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDataSourceAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalDataDsl.g:349:5: ( (lv_options_15_0= ruleOption ) )
                    	    // InternalDataDsl.g:350:6: (lv_options_15_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:350:6: (lv_options_15_0= ruleOption )
                    	    // InternalDataDsl.g:351:7: lv_options_15_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_options_15_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_15_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleDataFragment"
    // InternalDataDsl.g:378:1: entryRuleDataFragment returns [EObject current=null] : iv_ruleDataFragment= ruleDataFragment EOF ;
    public final EObject entryRuleDataFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFragment = null;


        try {
            // InternalDataDsl.g:378:53: (iv_ruleDataFragment= ruleDataFragment EOF )
            // InternalDataDsl.g:379:2: iv_ruleDataFragment= ruleDataFragment EOF
            {
             newCompositeNode(grammarAccess.getDataFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFragment=ruleDataFragment();

            state._fsp--;

             current =iv_ruleDataFragment; 
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
    // $ANTLR end "entryRuleDataFragment"


    // $ANTLR start "ruleDataFragment"
    // InternalDataDsl.g:385:1: ruleDataFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleDataFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_nodes_7_0 = null;

        EObject lv_nodes_9_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:391:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )? otherlv_10= '}' ) )
            // InternalDataDsl.g:392:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )? otherlv_10= '}' )
            {
            // InternalDataDsl.g:392:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )? otherlv_10= '}' )
            // InternalDataDsl.g:393:3: otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFragmentAccess().getFragmentKeyword_0());
            		
            // InternalDataDsl.g:397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:398:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:415:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:416:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataFragmentAccess().getColonKeyword_2_0());
                    			
                    // InternalDataDsl.g:420:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDataDsl.g:421:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDataDsl.g:421:5: (otherlv_3= RULE_ID )
                    // InternalDataDsl.g:422:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataFragmentRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_3, grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalDataDsl.g:433:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDataDsl.g:434:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataFragmentAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDataDsl.g:438:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalDataDsl.g:439:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalDataDsl.g:439:6: (otherlv_5= RULE_ID )
                    	    // InternalDataDsl.g:440:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:457:3: ( ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==RULE_UNIQUENESS||LA12_0==23||(LA12_0>=26 && LA12_0<=36)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:458:4: ( (lv_nodes_7_0= ruleNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )*
                    {
                    // InternalDataDsl.g:458:4: ( (lv_nodes_7_0= ruleNode ) )
                    // InternalDataDsl.g:459:5: (lv_nodes_7_0= ruleNode )
                    {
                    // InternalDataDsl.g:459:5: (lv_nodes_7_0= ruleNode )
                    // InternalDataDsl.g:460:6: lv_nodes_7_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nodes_7_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_7_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:477:4: (otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDataDsl.g:478:5: otherlv_8= ',' ( (lv_nodes_9_0= ruleNode ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDataDsl.g:482:5: ( (lv_nodes_9_0= ruleNode ) )
                    	    // InternalDataDsl.g:483:6: (lv_nodes_9_0= ruleNode )
                    	    {
                    	    // InternalDataDsl.g:483:6: (lv_nodes_9_0= ruleNode )
                    	    // InternalDataDsl.g:484:7: lv_nodes_9_0= ruleNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nodes_9_0=ruleNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_9_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Node");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataFragment"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:511:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // InternalDataDsl.g:511:58: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // InternalDataDsl.g:512:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;

             current =iv_ruleTypeSpecification; 
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
    // $ANTLR end "entryRuleTypeSpecification"


    // $ANTLR start "ruleTypeSpecification"
    // InternalDataDsl.g:518:1: ruleTypeSpecification returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:524:2: ( (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration ) )
            // InternalDataDsl.g:525:2: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration )
            {
            // InternalDataDsl.g:525:2: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:526:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:535:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
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
    // $ANTLR end "ruleTypeSpecification"


    // $ANTLR start "entryRuleDataType"
    // InternalDataDsl.g:547:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDataDsl.g:547:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDataDsl.g:548:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDataDsl.g:554:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_refine_3_0 = null;

        EObject lv_options_5_0 = null;

        EObject lv_options_7_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:560:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? ) )
            // InternalDataDsl.g:561:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? )
            {
            // InternalDataDsl.g:561:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? )
            // InternalDataDsl.g:562:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDataDsl.g:566:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:567:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:567:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:568:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getColonKeyword_2());
            		
            // InternalDataDsl.g:588:3: ( (lv_refine_3_0= ruleBasicType ) )
            // InternalDataDsl.g:589:4: (lv_refine_3_0= ruleBasicType )
            {
            // InternalDataDsl.g:589:4: (lv_refine_3_0= ruleBasicType )
            // InternalDataDsl.g:590:5: lv_refine_3_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getRefineBasicTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_refine_3_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"refine",
            						lv_refine_3_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:607:3: (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:608:4: otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalDataDsl.g:612:4: ( (lv_options_5_0= ruleOption ) )
                    // InternalDataDsl.g:613:5: (lv_options_5_0= ruleOption )
                    {
                    // InternalDataDsl.g:613:5: (lv_options_5_0= ruleOption )
                    // InternalDataDsl.g:614:6: lv_options_5_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_options_5_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_5_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:631:4: (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDataDsl.g:632:5: otherlv_6= ',' ( (lv_options_7_0= ruleOption ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:636:5: ( (lv_options_7_0= ruleOption ) )
                    	    // InternalDataDsl.g:637:6: (lv_options_7_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:637:6: (lv_options_7_0= ruleOption )
                    	    // InternalDataDsl.g:638:7: lv_options_7_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_options_7_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_7_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:665:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalDataDsl.g:665:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalDataDsl.g:666:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalDataDsl.g:672:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDataDsl.g:678:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalDataDsl.g:679:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalDataDsl.g:679:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalDataDsl.g:680:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalDataDsl.g:684:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:685:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:685:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:686:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:706:3: ( (lv_values_3_0= RULE_STRING ) )
            // InternalDataDsl.g:707:4: (lv_values_3_0= RULE_STRING )
            {
            // InternalDataDsl.g:707:4: (lv_values_3_0= RULE_STRING )
            // InternalDataDsl.g:708:5: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_values_3_0, grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataDsl.g:724:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataDsl.g:725:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataDsl.g:729:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalDataDsl.g:730:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalDataDsl.g:730:5: (lv_values_5_0= RULE_STRING )
            	    // InternalDataDsl.g:731:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumerationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:756:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalDataDsl.g:756:45: (iv_ruleNode= ruleNode EOF )
            // InternalDataDsl.g:757:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalDataDsl.g:763:1: ruleNode returns [EObject current=null] : (this_LeafNode_0= ruleLeafNode | this_CompositeNode_1= ruleCompositeNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_LeafNode_0 = null;

        EObject this_CompositeNode_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:769:2: ( (this_LeafNode_0= ruleLeafNode | this_CompositeNode_1= ruleCompositeNode ) )
            // InternalDataDsl.g:770:2: (this_LeafNode_0= ruleLeafNode | this_CompositeNode_1= ruleCompositeNode )
            {
            // InternalDataDsl.g:770:2: (this_LeafNode_0= ruleLeafNode | this_CompositeNode_1= ruleCompositeNode )
            int alt17=2;
            switch ( input.LA(1) ) {
            case RULE_UNIQUENESS:
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
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==RULE_STRING||(LA17_2>=17 && LA17_2<=18)) ) {
                    alt17=2;
                }
                else if ( (LA17_2==RULE_ID||LA17_2==24) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDataDsl.g:771:3: this_LeafNode_0= ruleLeafNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeafNode_0=ruleLeafNode();

                    state._fsp--;


                    			current = this_LeafNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:780:3: this_CompositeNode_1= ruleCompositeNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeNode_1=ruleCompositeNode();

                    state._fsp--;


                    			current = this_CompositeNode_1;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleCompositeNode"
    // InternalDataDsl.g:792:1: entryRuleCompositeNode returns [EObject current=null] : iv_ruleCompositeNode= ruleCompositeNode EOF ;
    public final EObject entryRuleCompositeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeNode = null;


        try {
            // InternalDataDsl.g:792:54: (iv_ruleCompositeNode= ruleCompositeNode EOF )
            // InternalDataDsl.g:793:2: iv_ruleCompositeNode= ruleCompositeNode EOF
            {
             newCompositeNode(grammarAccess.getCompositeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeNode=ruleCompositeNode();

            state._fsp--;

             current =iv_ruleCompositeNode; 
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
    // $ANTLR end "entryRuleCompositeNode"


    // $ANTLR start "ruleCompositeNode"
    // InternalDataDsl.g:799:1: ruleCompositeNode returns [EObject current=null] : ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* ) otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleCompositeNode() throws RecognitionException {
        EObject current = null;

        Token lv_environment_0_0=null;
        Token lv_name_1_0=null;
        Token lv_representedAs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_subnodes_8_0 = null;

        EObject lv_subnodes_10_0 = null;

        EObject lv_options_13_0 = null;

        EObject lv_options_15_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:805:2: ( ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* ) otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? ) )
            // InternalDataDsl.g:806:2: ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* ) otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? )
            {
            // InternalDataDsl.g:806:2: ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* ) otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )? )
            // InternalDataDsl.g:807:3: ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* ) otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )?
            {
            // InternalDataDsl.g:807:3: ( (lv_environment_0_0= '>' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:808:4: (lv_environment_0_0= '>' )
                    {
                    // InternalDataDsl.g:808:4: (lv_environment_0_0= '>' )
                    // InternalDataDsl.g:809:5: lv_environment_0_0= '>'
                    {
                    lv_environment_0_0=(Token)match(input,23,FOLLOW_6); 

                    					newLeafNode(lv_environment_0_0, grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeNodeRule());
                    					}
                    					setWithLastConsumed(current, "environment", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:821:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:822:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:822:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:823:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:839:3: ( (lv_representedAs_2_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataDsl.g:840:4: (lv_representedAs_2_0= RULE_STRING )
                    {
                    // InternalDataDsl.g:840:4: (lv_representedAs_2_0= RULE_STRING )
                    // InternalDataDsl.g:841:5: lv_representedAs_2_0= RULE_STRING
                    {
                    lv_representedAs_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    					newLeafNode(lv_representedAs_2_0, grammarAccess.getCompositeNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeNodeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"representedAs",
                    						lv_representedAs_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:857:3: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataDsl.g:858:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeNodeAccess().getColonKeyword_3_0());
                    			
                    // InternalDataDsl.g:862:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataDsl.g:863:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataDsl.g:863:5: (otherlv_4= RULE_ID )
                    // InternalDataDsl.g:864:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeNodeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_4, grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalDataDsl.g:875:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDataDsl.g:876:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCompositeNodeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDsl.g:880:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalDataDsl.g:881:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalDataDsl.g:881:6: (otherlv_6= RULE_ID )
                    	    // InternalDataDsl.g:882:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDataDsl.g:899:3: ( ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )* )
            // InternalDataDsl.g:900:4: ( (lv_subnodes_8_0= ruleNode ) ) (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )*
            {
            // InternalDataDsl.g:900:4: ( (lv_subnodes_8_0= ruleNode ) )
            // InternalDataDsl.g:901:5: (lv_subnodes_8_0= ruleNode )
            {
            // InternalDataDsl.g:901:5: (lv_subnodes_8_0= ruleNode )
            // InternalDataDsl.g:902:6: lv_subnodes_8_0= ruleNode
            {

            						newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_0_0());
            					
            pushFollow(FOLLOW_10);
            lv_subnodes_8_0=ruleNode();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
            						}
            						add(
            							current,
            							"subnodes",
            							lv_subnodes_8_0,
            							"eagledata.core.dsl.datadesc.DataDsl.Node");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDataDsl.g:919:4: (otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataDsl.g:920:5: otherlv_9= ',' ( (lv_subnodes_10_0= ruleNode ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_11); 

            	    					newLeafNode(otherlv_9, grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_1_0());
            	    				
            	    // InternalDataDsl.g:924:5: ( (lv_subnodes_10_0= ruleNode ) )
            	    // InternalDataDsl.g:925:6: (lv_subnodes_10_0= ruleNode )
            	    {
            	    // InternalDataDsl.g:925:6: (lv_subnodes_10_0= ruleNode )
            	    // InternalDataDsl.g:926:7: lv_subnodes_10_0= ruleNode
            	    {

            	    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_subnodes_10_0=ruleNode();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"subnodes",
            	    								lv_subnodes_10_0,
            	    								"eagledata.core.dsl.datadesc.DataDsl.Node");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            otherlv_11=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalDataDsl.g:949:3: (otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:950:4: otherlv_12= '{' ( (lv_options_13_0= ruleOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalDataDsl.g:954:4: ( (lv_options_13_0= ruleOption ) )
                    // InternalDataDsl.g:955:5: (lv_options_13_0= ruleOption )
                    {
                    // InternalDataDsl.g:955:5: (lv_options_13_0= ruleOption )
                    // InternalDataDsl.g:956:6: lv_options_13_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_options_13_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_13_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:973:4: (otherlv_14= ',' ( (lv_options_15_0= ruleOption ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDataDsl.g:974:5: otherlv_14= ',' ( (lv_options_15_0= ruleOption ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCompositeNodeAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalDataDsl.g:978:5: ( (lv_options_15_0= ruleOption ) )
                    	    // InternalDataDsl.g:979:6: (lv_options_15_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:979:6: (lv_options_15_0= ruleOption )
                    	    // InternalDataDsl.g:980:7: lv_options_15_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_options_15_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_15_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleCompositeNode"


    // $ANTLR start "entryRuleLeafNode"
    // InternalDataDsl.g:1007:1: entryRuleLeafNode returns [EObject current=null] : iv_ruleLeafNode= ruleLeafNode EOF ;
    public final EObject entryRuleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafNode = null;


        try {
            // InternalDataDsl.g:1007:49: (iv_ruleLeafNode= ruleLeafNode EOF )
            // InternalDataDsl.g:1008:2: iv_ruleLeafNode= ruleLeafNode EOF
            {
             newCompositeNode(grammarAccess.getLeafNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeafNode=ruleLeafNode();

            state._fsp--;

             current =iv_ruleLeafNode; 
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
    // $ANTLR end "entryRuleLeafNode"


    // $ANTLR start "ruleLeafNode"
    // InternalDataDsl.g:1014:1: ruleLeafNode returns [EObject current=null] : ( ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )? ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleLeafNode() throws RecognitionException {
        EObject current = null;

        Token lv_uniqueness_0_0=null;
        Token otherlv_2=null;
        Token lv_keyword_3_0=null;
        Token lv_name_4_0=null;
        Token lv_representedAs_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_options_7_0 = null;

        EObject lv_options_9_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1020:2: ( ( ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )? ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? ) )
            // InternalDataDsl.g:1021:2: ( ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )? ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? )
            {
            // InternalDataDsl.g:1021:2: ( ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )? ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? )
            // InternalDataDsl.g:1022:3: ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )? ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )?
            {
            // InternalDataDsl.g:1022:3: ( (lv_uniqueness_0_0= RULE_UNIQUENESS ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_UNIQUENESS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:1023:4: (lv_uniqueness_0_0= RULE_UNIQUENESS )
                    {
                    // InternalDataDsl.g:1023:4: (lv_uniqueness_0_0= RULE_UNIQUENESS )
                    // InternalDataDsl.g:1024:5: lv_uniqueness_0_0= RULE_UNIQUENESS
                    {
                    lv_uniqueness_0_0=(Token)match(input,RULE_UNIQUENESS,FOLLOW_19); 

                    					newLeafNode(lv_uniqueness_0_0, grammarAccess.getLeafNodeAccess().getUniquenessUNIQUENESSTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"uniqueness",
                    						lv_uniqueness_0_0,
                    						"eagledata.core.dsl.datadesc.DataDsl.UNIQUENESS");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1040:3: ( ( (lv_type_1_0= ruleBasicType ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=26 && LA26_0<=36)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDsl.g:1041:4: ( (lv_type_1_0= ruleBasicType ) )
                    {
                    // InternalDataDsl.g:1041:4: ( (lv_type_1_0= ruleBasicType ) )
                    // InternalDataDsl.g:1042:5: (lv_type_1_0= ruleBasicType )
                    {
                    // InternalDataDsl.g:1042:5: (lv_type_1_0= ruleBasicType )
                    // InternalDataDsl.g:1043:6: lv_type_1_0= ruleBasicType
                    {

                    						newCompositeNode(grammarAccess.getLeafNodeAccess().getTypeBasicTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_type_1_0=ruleBasicType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.BasicType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1061:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalDataDsl.g:1061:4: ( (otherlv_2= RULE_ID ) )
                    // InternalDataDsl.g:1062:5: (otherlv_2= RULE_ID )
                    {
                    // InternalDataDsl.g:1062:5: (otherlv_2= RULE_ID )
                    // InternalDataDsl.g:1063:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafNodeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_2, grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1075:3: ( (lv_keyword_3_0= '#' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:1076:4: (lv_keyword_3_0= '#' )
                    {
                    // InternalDataDsl.g:1076:4: (lv_keyword_3_0= '#' )
                    // InternalDataDsl.g:1077:5: lv_keyword_3_0= '#'
                    {
                    lv_keyword_3_0=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(lv_keyword_3_0, grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "keyword", true, "#");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1089:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDataDsl.g:1090:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDataDsl.g:1090:4: (lv_name_4_0= RULE_ID )
            // InternalDataDsl.g:1091:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeafNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1107:3: ( (lv_representedAs_5_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:1108:4: (lv_representedAs_5_0= RULE_STRING )
                    {
                    // InternalDataDsl.g:1108:4: (lv_representedAs_5_0= RULE_STRING )
                    // InternalDataDsl.g:1109:5: lv_representedAs_5_0= RULE_STRING
                    {
                    lv_representedAs_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    					newLeafNode(lv_representedAs_5_0, grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"representedAs",
                    						lv_representedAs_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1125:3: (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDsl.g:1126:4: otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalDataDsl.g:1130:4: ( (lv_options_7_0= ruleOption ) )
                    // InternalDataDsl.g:1131:5: (lv_options_7_0= ruleOption )
                    {
                    // InternalDataDsl.g:1131:5: (lv_options_7_0= ruleOption )
                    // InternalDataDsl.g:1132:6: lv_options_7_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_options_7_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_7_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1149:4: (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDataDsl.g:1150:5: otherlv_8= ',' ( (lv_options_9_0= ruleOption ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLeafNodeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalDataDsl.g:1154:5: ( (lv_options_9_0= ruleOption ) )
                    	    // InternalDataDsl.g:1155:6: (lv_options_9_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1155:6: (lv_options_9_0= ruleOption )
                    	    // InternalDataDsl.g:1156:7: lv_options_9_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_options_9_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_9_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleLeafNode"


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:1183:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDataDsl.g:1183:47: (iv_ruleOption= ruleOption EOF )
            // InternalDataDsl.g:1184:2: iv_ruleOption= ruleOption EOF
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
    // InternalDataDsl.g:1190:1: ruleOption returns [EObject current=null] : ( ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) | this_INT_3= RULE_INT ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token this_INT_3=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1196:2: ( ( ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) | this_INT_3= RULE_INT ) )
            // InternalDataDsl.g:1197:2: ( ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) | this_INT_3= RULE_INT )
            {
            // InternalDataDsl.g:1197:2: ( ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) | this_INT_3= RULE_INT )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=37 && LA31_0<=49)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_INT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:1198:3: ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // InternalDataDsl.g:1198:3: ( ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
                    // InternalDataDsl.g:1199:4: ( (lv_key_0_0= ruleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // InternalDataDsl.g:1199:4: ( (lv_key_0_0= ruleOptionKey ) )
                    // InternalDataDsl.g:1200:5: (lv_key_0_0= ruleOptionKey )
                    {
                    // InternalDataDsl.g:1200:5: (lv_key_0_0= ruleOptionKey )
                    // InternalDataDsl.g:1201:6: lv_key_0_0= ruleOptionKey
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getKeyOptionKeyEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_key_0_0=ruleOptionKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_0_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.OptionKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalDataDsl.g:1222:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalDataDsl.g:1223:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalDataDsl.g:1223:5: (lv_value_2_0= RULE_STRING )
                    // InternalDataDsl.g:1224:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1242:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			newLeafNode(this_INT_3, grammarAccess.getOptionAccess().getINTTerminalRuleCall_1());
                    		

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


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:1250:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'year' ) | (enumLiteral_6= 'month' ) | (enumLiteral_7= 'day' ) | (enumLiteral_8= 'boolean' ) | (enumLiteral_9= 'lat' ) | (enumLiteral_10= 'long' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1256:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'year' ) | (enumLiteral_6= 'month' ) | (enumLiteral_7= 'day' ) | (enumLiteral_8= 'boolean' ) | (enumLiteral_9= 'lat' ) | (enumLiteral_10= 'long' ) ) )
            // InternalDataDsl.g:1257:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'year' ) | (enumLiteral_6= 'month' ) | (enumLiteral_7= 'day' ) | (enumLiteral_8= 'boolean' ) | (enumLiteral_9= 'lat' ) | (enumLiteral_10= 'long' ) )
            {
            // InternalDataDsl.g:1257:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'year' ) | (enumLiteral_6= 'month' ) | (enumLiteral_7= 'day' ) | (enumLiteral_8= 'boolean' ) | (enumLiteral_9= 'lat' ) | (enumLiteral_10= 'long' ) )
            int alt32=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt32=1;
                }
                break;
            case 27:
                {
                alt32=2;
                }
                break;
            case 28:
                {
                alt32=3;
                }
                break;
            case 29:
                {
                alt32=4;
                }
                break;
            case 30:
                {
                alt32=5;
                }
                break;
            case 31:
                {
                alt32=6;
                }
                break;
            case 32:
                {
                alt32=7;
                }
                break;
            case 33:
                {
                alt32=8;
                }
                break;
            case 34:
                {
                alt32=9;
                }
                break;
            case 35:
                {
                alt32=10;
                }
                break;
            case 36:
                {
                alt32=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:1258:3: (enumLiteral_0= 'string' )
                    {
                    // InternalDataDsl.g:1258:3: (enumLiteral_0= 'string' )
                    // InternalDataDsl.g:1259:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1266:3: (enumLiteral_1= 'int' )
                    {
                    // InternalDataDsl.g:1266:3: (enumLiteral_1= 'int' )
                    // InternalDataDsl.g:1267:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1274:3: (enumLiteral_2= 'real' )
                    {
                    // InternalDataDsl.g:1274:3: (enumLiteral_2= 'real' )
                    // InternalDataDsl.g:1275:4: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1282:3: (enumLiteral_3= 'date' )
                    {
                    // InternalDataDsl.g:1282:3: (enumLiteral_3= 'date' )
                    // InternalDataDsl.g:1283:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1290:3: (enumLiteral_4= 'time' )
                    {
                    // InternalDataDsl.g:1290:3: (enumLiteral_4= 'time' )
                    // InternalDataDsl.g:1291:4: enumLiteral_4= 'time'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1298:3: (enumLiteral_5= 'year' )
                    {
                    // InternalDataDsl.g:1298:3: (enumLiteral_5= 'year' )
                    // InternalDataDsl.g:1299:4: enumLiteral_5= 'year'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1306:3: (enumLiteral_6= 'month' )
                    {
                    // InternalDataDsl.g:1306:3: (enumLiteral_6= 'month' )
                    // InternalDataDsl.g:1307:4: enumLiteral_6= 'month'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1314:3: (enumLiteral_7= 'day' )
                    {
                    // InternalDataDsl.g:1314:3: (enumLiteral_7= 'day' )
                    // InternalDataDsl.g:1315:4: enumLiteral_7= 'day'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1322:3: (enumLiteral_8= 'boolean' )
                    {
                    // InternalDataDsl.g:1322:3: (enumLiteral_8= 'boolean' )
                    // InternalDataDsl.g:1323:4: enumLiteral_8= 'boolean'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1330:3: (enumLiteral_9= 'lat' )
                    {
                    // InternalDataDsl.g:1330:3: (enumLiteral_9= 'lat' )
                    // InternalDataDsl.g:1331:4: enumLiteral_9= 'lat'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1338:3: (enumLiteral_10= 'long' )
                    {
                    // InternalDataDsl.g:1338:3: (enumLiteral_10= 'long' )
                    // InternalDataDsl.g:1339:4: enumLiteral_10= 'long'
                    {
                    enumLiteral_10=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_10());
                    			

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "ruleOptionKey"
    // InternalDataDsl.g:1349:1: ruleOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'casesensitive' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'null' ) | (enumLiteral_6= 'separator' ) | (enumLiteral_7= 'default' ) | (enumLiteral_8= 'regex' ) | (enumLiteral_9= 'flags' ) | (enumLiteral_10= 'decimalchar' ) | (enumLiteral_11= 'pattern' ) | (enumLiteral_12= 'format' ) ) ;
    public final Enumerator ruleOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1355:2: ( ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'casesensitive' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'null' ) | (enumLiteral_6= 'separator' ) | (enumLiteral_7= 'default' ) | (enumLiteral_8= 'regex' ) | (enumLiteral_9= 'flags' ) | (enumLiteral_10= 'decimalchar' ) | (enumLiteral_11= 'pattern' ) | (enumLiteral_12= 'format' ) ) )
            // InternalDataDsl.g:1356:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'casesensitive' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'null' ) | (enumLiteral_6= 'separator' ) | (enumLiteral_7= 'default' ) | (enumLiteral_8= 'regex' ) | (enumLiteral_9= 'flags' ) | (enumLiteral_10= 'decimalchar' ) | (enumLiteral_11= 'pattern' ) | (enumLiteral_12= 'format' ) )
            {
            // InternalDataDsl.g:1356:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'casesensitive' ) | (enumLiteral_3= 'min' ) | (enumLiteral_4= 'max' ) | (enumLiteral_5= 'null' ) | (enumLiteral_6= 'separator' ) | (enumLiteral_7= 'default' ) | (enumLiteral_8= 'regex' ) | (enumLiteral_9= 'flags' ) | (enumLiteral_10= 'decimalchar' ) | (enumLiteral_11= 'pattern' ) | (enumLiteral_12= 'format' ) )
            int alt33=13;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 40:
                {
                alt33=4;
                }
                break;
            case 41:
                {
                alt33=5;
                }
                break;
            case 42:
                {
                alt33=6;
                }
                break;
            case 43:
                {
                alt33=7;
                }
                break;
            case 44:
                {
                alt33=8;
                }
                break;
            case 45:
                {
                alt33=9;
                }
                break;
            case 46:
                {
                alt33=10;
                }
                break;
            case 47:
                {
                alt33=11;
                }
                break;
            case 48:
                {
                alt33=12;
                }
                break;
            case 49:
                {
                alt33=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:1357:3: (enumLiteral_0= 'minLength' )
                    {
                    // InternalDataDsl.g:1357:3: (enumLiteral_0= 'minLength' )
                    // InternalDataDsl.g:1358:4: enumLiteral_0= 'minLength'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1365:3: (enumLiteral_1= 'maxLength' )
                    {
                    // InternalDataDsl.g:1365:3: (enumLiteral_1= 'maxLength' )
                    // InternalDataDsl.g:1366:4: enumLiteral_1= 'maxLength'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1373:3: (enumLiteral_2= 'casesensitive' )
                    {
                    // InternalDataDsl.g:1373:3: (enumLiteral_2= 'casesensitive' )
                    // InternalDataDsl.g:1374:4: enumLiteral_2= 'casesensitive'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1381:3: (enumLiteral_3= 'min' )
                    {
                    // InternalDataDsl.g:1381:3: (enumLiteral_3= 'min' )
                    // InternalDataDsl.g:1382:4: enumLiteral_3= 'min'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getMinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOptionKeyAccess().getMinEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1389:3: (enumLiteral_4= 'max' )
                    {
                    // InternalDataDsl.g:1389:3: (enumLiteral_4= 'max' )
                    // InternalDataDsl.g:1390:4: enumLiteral_4= 'max'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getMaxEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOptionKeyAccess().getMaxEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1397:3: (enumLiteral_5= 'null' )
                    {
                    // InternalDataDsl.g:1397:3: (enumLiteral_5= 'null' )
                    // InternalDataDsl.g:1398:4: enumLiteral_5= 'null'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getNullEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOptionKeyAccess().getNullEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1405:3: (enumLiteral_6= 'separator' )
                    {
                    // InternalDataDsl.g:1405:3: (enumLiteral_6= 'separator' )
                    // InternalDataDsl.g:1406:4: enumLiteral_6= 'separator'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getSeparatorEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOptionKeyAccess().getSeparatorEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1413:3: (enumLiteral_7= 'default' )
                    {
                    // InternalDataDsl.g:1413:3: (enumLiteral_7= 'default' )
                    // InternalDataDsl.g:1414:4: enumLiteral_7= 'default'
                    {
                    enumLiteral_7=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getDefaultEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOptionKeyAccess().getDefaultEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1421:3: (enumLiteral_8= 'regex' )
                    {
                    // InternalDataDsl.g:1421:3: (enumLiteral_8= 'regex' )
                    // InternalDataDsl.g:1422:4: enumLiteral_8= 'regex'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getRegexEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getOptionKeyAccess().getRegexEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1429:3: (enumLiteral_9= 'flags' )
                    {
                    // InternalDataDsl.g:1429:3: (enumLiteral_9= 'flags' )
                    // InternalDataDsl.g:1430:4: enumLiteral_9= 'flags'
                    {
                    enumLiteral_9=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getFlagsEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getOptionKeyAccess().getFlagsEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1437:3: (enumLiteral_10= 'decimalchar' )
                    {
                    // InternalDataDsl.g:1437:3: (enumLiteral_10= 'decimalchar' )
                    // InternalDataDsl.g:1438:4: enumLiteral_10= 'decimalchar'
                    {
                    enumLiteral_10=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:1445:3: (enumLiteral_11= 'pattern' )
                    {
                    // InternalDataDsl.g:1445:3: (enumLiteral_11= 'pattern' )
                    // InternalDataDsl.g:1446:4: enumLiteral_11= 'pattern'
                    {
                    enumLiteral_11=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getPatternEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getOptionKeyAccess().getPatternEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:1453:3: (enumLiteral_12= 'format' )
                    {
                    // InternalDataDsl.g:1453:3: (enumLiteral_12= 'format' )
                    // InternalDataDsl.g:1454:4: enumLiteral_12= 'format'
                    {
                    enumLiteral_12=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOptionKeyAccess().getFormatEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getOptionKeyAccess().getFormatEnumLiteralDeclaration_12());
                    			

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
    // $ANTLR end "ruleOptionKey"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001FFC8800A0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001FFC8000A0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0003FFE000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001FFC000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000060040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001FFC000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});

}