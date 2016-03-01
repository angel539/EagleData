package eagledata.core.dsl.datadsl.parser.antlr.internal;

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
import eagledata.core.dsl.datadsl.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "','", "'{'", "'}'", "'description'", "'uses'", "'='", "'['", "']'", "'fragment'", "'>'", "'extends'", "'('", "')'", "'key'", "'unique'", "'#'", "'ref:'", "'-'", "'CSV'", "'JSON'", "'XML'", "'string'", "'numeral'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'place'", "'latitude'", "'longitude'", "'UTMe'", "'UTMn'", "'UTMz'", "'UTMHemi'", "'name'", "'familyname'", "'personalID'"
    };
    public static final int T__50=50;
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
    // InternalDataDsl.g:72:1: ruleDataModel returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )? otherlv_5= '{' ( (lv_descriptions_6_0= ruleDataDescription ) ) (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_importURI_2_0 = null;

        AntlrDatatypeRuleToken lv_importURI_4_0 = null;

        EObject lv_descriptions_6_0 = null;

        EObject lv_descriptions_8_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:78:2: ( ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )? otherlv_5= '{' ( (lv_descriptions_6_0= ruleDataDescription ) ) (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )* otherlv_9= '}' ) )
            // InternalDataDsl.g:79:2: ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )? otherlv_5= '{' ( (lv_descriptions_6_0= ruleDataDescription ) ) (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )* otherlv_9= '}' )
            {
            // InternalDataDsl.g:79:2: ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )? otherlv_5= '{' ( (lv_descriptions_6_0= ruleDataDescription ) ) (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )* otherlv_9= '}' )
            // InternalDataDsl.g:80:3: () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )? otherlv_5= '{' ( (lv_descriptions_6_0= ruleDataDescription ) ) (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )* otherlv_9= '}'
            {
            // InternalDataDsl.g:80:3: ()
            // InternalDataDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataModelAccess().getDataModelAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:87:3: (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:88:4: otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )*
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataModelAccess().getImportKeyword_1_0());
                    			
                    // InternalDataDsl.g:92:4: ( (lv_importURI_2_0= ruleEString ) )
                    // InternalDataDsl.g:93:5: (lv_importURI_2_0= ruleEString )
                    {
                    // InternalDataDsl.g:93:5: (lv_importURI_2_0= ruleEString )
                    // InternalDataDsl.g:94:6: lv_importURI_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_importURI_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataModelRule());
                    						}
                    						add(
                    							current,
                    							"importURI",
                    							lv_importURI_2_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:111:4: (otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDataDsl.g:112:5: otherlv_3= ',' ( (lv_importURI_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDataDsl.g:116:5: ( (lv_importURI_4_0= ruleEString ) )
                    	    // InternalDataDsl.g:117:6: (lv_importURI_4_0= ruleEString )
                    	    {
                    	    // InternalDataDsl.g:117:6: (lv_importURI_4_0= ruleEString )
                    	    // InternalDataDsl.g:118:7: lv_importURI_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_importURI_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"importURI",
                    	    								lv_importURI_4_0,
                    	    								"eagledata.core.dsl.datadsl.DataDsl.EString");
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
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:141:3: ( (lv_descriptions_6_0= ruleDataDescription ) )
            // InternalDataDsl.g:142:4: (lv_descriptions_6_0= ruleDataDescription )
            {
            // InternalDataDsl.g:142:4: (lv_descriptions_6_0= ruleDataDescription )
            // InternalDataDsl.g:143:5: lv_descriptions_6_0= ruleDataDescription
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_descriptions_6_0=ruleDataDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_6_0,
            						"eagledata.core.dsl.datadsl.DataDsl.DataDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:160:3: (otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataDsl.g:161:4: otherlv_7= ',' ( (lv_descriptions_8_0= ruleDataDescription ) )
            	    {
            	    otherlv_7=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDataModelAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataDsl.g:165:4: ( (lv_descriptions_8_0= ruleDataDescription ) )
            	    // InternalDataDsl.g:166:5: (lv_descriptions_8_0= ruleDataDescription )
            	    {
            	    // InternalDataDsl.g:166:5: (lv_descriptions_8_0= ruleDataDescription )
            	    // InternalDataDsl.g:167:6: lv_descriptions_8_0= ruleDataDescription
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_descriptions_8_0=ruleDataDescription();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"descriptions",
            	    							lv_descriptions_8_0,
            	    							"eagledata.core.dsl.datadsl.DataDsl.DataDescription");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDataDsl.g:193:1: entryRuleDataDescription returns [EObject current=null] : iv_ruleDataDescription= ruleDataDescription EOF ;
    public final EObject entryRuleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDescription = null;


        try {
            // InternalDataDsl.g:193:56: (iv_ruleDataDescription= ruleDataDescription EOF )
            // InternalDataDsl.g:194:2: iv_ruleDataDescription= ruleDataDescription EOF
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
    // InternalDataDsl.g:200:1: ruleDataDescription returns [EObject current=null] : (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment ) ;
    public final EObject ruleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DataSource_0 = null;

        EObject this_DataFragment_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:206:2: ( (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment ) )
            // InternalDataDsl.g:207:2: (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment )
            {
            // InternalDataDsl.g:207:2: (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:208:3: this_DataSource_0= ruleDataSource
                    {

                    			newCompositeNode(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSource_0=ruleDataSource();

                    state._fsp--;


                    			current = this_DataSource_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:217:3: this_DataFragment_1= ruleDataFragment
                    {

                    			newCompositeNode(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFragment_1=ruleDataFragment();

                    state._fsp--;


                    			current = this_DataFragment_1;
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
    // InternalDataDsl.g:229:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalDataDsl.g:229:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalDataDsl.g:230:2: iv_ruleDataSource= ruleDataSource EOF
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
    // InternalDataDsl.g:236:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= ruleEString ) ) ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )? (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_format_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_link_3_0 = null;

        AntlrDatatypeRuleToken lv_link_5_0 = null;

        EObject lv_nodes_12_0 = null;

        EObject lv_nodes_14_0 = null;

        EObject lv_options_17_0 = null;

        EObject lv_options_19_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:242:2: ( (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= ruleEString ) ) ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )? (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? ) )
            // InternalDataDsl.g:243:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= ruleEString ) ) ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )? (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? )
            {
            // InternalDataDsl.g:243:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= ruleEString ) ) ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )? (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? )
            // InternalDataDsl.g:244:3: otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= ruleEString ) ) ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )? (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDescriptionKeyword_0());
            		
            // InternalDataDsl.g:248:3: ( (lv_format_1_0= ruleFormatSpecification ) )
            // InternalDataDsl.g:249:4: (lv_format_1_0= ruleFormatSpecification )
            {
            // InternalDataDsl.g:249:4: (lv_format_1_0= ruleFormatSpecification )
            // InternalDataDsl.g:250:5: lv_format_1_0= ruleFormatSpecification
            {

            					newCompositeNode(grammarAccess.getDataSourceAccess().getFormatFormatSpecificationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_format_1_0=ruleFormatSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSourceRule());
            					}
            					set(
            						current,
            						"format",
            						lv_format_1_0,
            						"eagledata.core.dsl.datadsl.DataDsl.FormatSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:267:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDataDsl.g:268:4: (lv_name_2_0= ruleEString )
            {
            // InternalDataDsl.g:268:4: (lv_name_2_0= ruleEString )
            // InternalDataDsl.g:269:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataSourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:286:3: ( ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:287:4: ( (lv_link_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )*
                    {
                    // InternalDataDsl.g:287:4: ( (lv_link_3_0= ruleEString ) )
                    // InternalDataDsl.g:288:5: (lv_link_3_0= ruleEString )
                    {
                    // InternalDataDsl.g:288:5: (lv_link_3_0= ruleEString )
                    // InternalDataDsl.g:289:6: lv_link_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_link_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"link",
                    							lv_link_3_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:306:4: (otherlv_4= ',' ( (lv_link_5_0= ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDataDsl.g:307:5: otherlv_4= ',' ( (lv_link_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDataDsl.g:311:5: ( (lv_link_5_0= ruleEString ) )
                    	    // InternalDataDsl.g:312:6: (lv_link_5_0= ruleEString )
                    	    {
                    	    // InternalDataDsl.g:312:6: (lv_link_5_0= ruleEString )
                    	    // InternalDataDsl.g:313:7: lv_link_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_link_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"link",
                    	    								lv_link_5_0,
                    	    								"eagledata.core.dsl.datadsl.DataDsl.EString");
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

            // InternalDataDsl.g:332:3: (otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:333:4: otherlv_6= 'uses' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getUsesKeyword_4_0());
                    			
                    // InternalDataDsl.g:337:4: ( ( ruleEString ) )
                    // InternalDataDsl.g:338:5: ( ruleEString )
                    {
                    // InternalDataDsl.g:338:5: ( ruleEString )
                    // InternalDataDsl.g:339:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:353:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDsl.g:354:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:358:5: ( ( ruleEString ) )
                    	    // InternalDataDsl.g:359:6: ( ruleEString )
                    	    {
                    	    // InternalDataDsl.g:359:6: ( ruleEString )
                    	    // InternalDataDsl.g:360:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataSourceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getDataSourceAccess().getEqualsSignKeyword_5());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDataDsl.g:384:3: ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==21||(LA10_0>=25 && LA10_0<=26)||LA10_0==28||(LA10_0>=33 && LA10_0<=50)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:385:4: ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )*
                    {
                    // InternalDataDsl.g:385:4: ( (lv_nodes_12_0= ruleNode ) )
                    // InternalDataDsl.g:386:5: (lv_nodes_12_0= ruleNode )
                    {
                    // InternalDataDsl.g:386:5: (lv_nodes_12_0= ruleNode )
                    // InternalDataDsl.g:387:6: lv_nodes_12_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nodes_12_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_12_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:404:4: (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDataDsl.g:405:5: otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) )
                    	    {
                    	    otherlv_13=(Token)match(input,12,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDataSourceAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalDataDsl.g:409:5: ( (lv_nodes_14_0= ruleNode ) )
                    	    // InternalDataDsl.g:410:6: (lv_nodes_14_0= ruleNode )
                    	    {
                    	    // InternalDataDsl.g:410:6: (lv_nodes_14_0= ruleNode )
                    	    // InternalDataDsl.g:411:7: lv_nodes_14_0= ruleNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_nodes_14_0=ruleNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_14_0,
                    	    								"eagledata.core.dsl.datadsl.DataDsl.Node");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            otherlv_15=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalDataDsl.g:434:3: (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:435:4: otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataSourceAccess().getLeftSquareBracketKeyword_9_0());
                    			
                    // InternalDataDsl.g:439:4: ( (lv_options_17_0= ruleOption ) )
                    // InternalDataDsl.g:440:5: (lv_options_17_0= ruleOption )
                    {
                    // InternalDataDsl.g:440:5: (lv_options_17_0= ruleOption )
                    // InternalDataDsl.g:441:6: lv_options_17_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_options_17_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_17_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:458:4: (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==12) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDataDsl.g:459:5: otherlv_18= ',' ( (lv_options_19_0= ruleOption ) )
                    	    {
                    	    otherlv_18=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDataSourceAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalDataDsl.g:463:5: ( (lv_options_19_0= ruleOption ) )
                    	    // InternalDataDsl.g:464:6: (lv_options_19_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:464:6: (lv_options_19_0= ruleOption )
                    	    // InternalDataDsl.g:465:7: lv_options_19_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_options_19_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_19_0,
                    	    								"eagledata.core.dsl.datadsl.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getDataSourceAccess().getRightSquareBracketKeyword_9_3());
                    			

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
    // InternalDataDsl.g:492:1: entryRuleDataFragment returns [EObject current=null] : iv_ruleDataFragment= ruleDataFragment EOF ;
    public final EObject entryRuleDataFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFragment = null;


        try {
            // InternalDataDsl.g:492:53: (iv_ruleDataFragment= ruleDataFragment EOF )
            // InternalDataDsl.g:493:2: iv_ruleDataFragment= ruleDataFragment EOF
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
    // InternalDataDsl.g:499:1: ruleDataFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleDataFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_nodes_4_0 = null;

        EObject lv_nodes_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:505:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' ) )
            // InternalDataDsl.g:506:2: (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' )
            {
            // InternalDataDsl.g:506:2: (otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' )
            // InternalDataDsl.g:507:3: otherlv_0= 'fragment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFragmentAccess().getFragmentKeyword_0());
            		
            // InternalDataDsl.g:511:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDataDsl.g:512:4: (lv_name_1_0= ruleEString )
            {
            // InternalDataDsl.g:512:4: (lv_name_1_0= ruleEString )
            // InternalDataDsl.g:513:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataFragmentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataFragmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDataFragmentAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:538:3: ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==21||(LA14_0>=25 && LA14_0<=26)||LA14_0==28||(LA14_0>=33 && LA14_0<=50)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:539:4: ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )*
                    {
                    // InternalDataDsl.g:539:4: ( (lv_nodes_4_0= ruleNode ) )
                    // InternalDataDsl.g:540:5: (lv_nodes_4_0= ruleNode )
                    {
                    // InternalDataDsl.g:540:5: (lv_nodes_4_0= ruleNode )
                    // InternalDataDsl.g:541:6: lv_nodes_4_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nodes_4_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_4_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:558:4: (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDataDsl.g:559:5: otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDataDsl.g:563:5: ( (lv_nodes_6_0= ruleNode ) )
                    	    // InternalDataDsl.g:564:6: (lv_nodes_6_0= ruleNode )
                    	    {
                    	    // InternalDataDsl.g:564:6: (lv_nodes_6_0= ruleNode )
                    	    // InternalDataDsl.g:565:7: lv_nodes_6_0= ruleNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_nodes_6_0=ruleNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_6_0,
                    	    								"eagledata.core.dsl.datadsl.DataDsl.Node");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleFormatSpecification"
    // InternalDataDsl.g:592:1: entryRuleFormatSpecification returns [EObject current=null] : iv_ruleFormatSpecification= ruleFormatSpecification EOF ;
    public final EObject entryRuleFormatSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatSpecification = null;


        try {
            // InternalDataDsl.g:592:60: (iv_ruleFormatSpecification= ruleFormatSpecification EOF )
            // InternalDataDsl.g:593:2: iv_ruleFormatSpecification= ruleFormatSpecification EOF
            {
             newCompositeNode(grammarAccess.getFormatSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormatSpecification=ruleFormatSpecification();

            state._fsp--;

             current =iv_ruleFormatSpecification; 
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
    // $ANTLR end "entryRuleFormatSpecification"


    // $ANTLR start "ruleFormatSpecification"
    // InternalDataDsl.g:599:1: ruleFormatSpecification returns [EObject current=null] : ( ( (lv_specialFormat_0_0= ruleEString ) ) | ( (lv_format_1_0= ruleFormatKind ) ) ) ;
    public final EObject ruleFormatSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_specialFormat_0_0 = null;

        Enumerator lv_format_1_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:605:2: ( ( ( (lv_specialFormat_0_0= ruleEString ) ) | ( (lv_format_1_0= ruleFormatKind ) ) ) )
            // InternalDataDsl.g:606:2: ( ( (lv_specialFormat_0_0= ruleEString ) ) | ( (lv_format_1_0= ruleFormatKind ) ) )
            {
            // InternalDataDsl.g:606:2: ( ( (lv_specialFormat_0_0= ruleEString ) ) | ( (lv_format_1_0= ruleFormatKind ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=30 && LA15_0<=32)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:607:3: ( (lv_specialFormat_0_0= ruleEString ) )
                    {
                    // InternalDataDsl.g:607:3: ( (lv_specialFormat_0_0= ruleEString ) )
                    // InternalDataDsl.g:608:4: (lv_specialFormat_0_0= ruleEString )
                    {
                    // InternalDataDsl.g:608:4: (lv_specialFormat_0_0= ruleEString )
                    // InternalDataDsl.g:609:5: lv_specialFormat_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getFormatSpecificationAccess().getSpecialFormatEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_specialFormat_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormatSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"specialFormat",
                    						lv_specialFormat_0_0,
                    						"eagledata.core.dsl.datadsl.DataDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:627:3: ( (lv_format_1_0= ruleFormatKind ) )
                    {
                    // InternalDataDsl.g:627:3: ( (lv_format_1_0= ruleFormatKind ) )
                    // InternalDataDsl.g:628:4: (lv_format_1_0= ruleFormatKind )
                    {
                    // InternalDataDsl.g:628:4: (lv_format_1_0= ruleFormatKind )
                    // InternalDataDsl.g:629:5: lv_format_1_0= ruleFormatKind
                    {

                    					newCompositeNode(grammarAccess.getFormatSpecificationAccess().getFormatFormatKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_format_1_0=ruleFormatKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormatSpecificationRule());
                    					}
                    					set(
                    						current,
                    						"format",
                    						lv_format_1_0,
                    						"eagledata.core.dsl.datadsl.DataDsl.FormatKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleFormatSpecification"


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:650:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDataDsl.g:650:47: (iv_ruleOption= ruleOption EOF )
            // InternalDataDsl.g:651:2: iv_ruleOption= ruleOption EOF
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
    // InternalDataDsl.g:657:1: ruleOption returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_values_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;

        AntlrDatatypeRuleToken lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:663:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_values_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= '}' ) )
            // InternalDataDsl.g:664:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_values_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= '}' )
            {
            // InternalDataDsl.g:664:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_values_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= '}' )
            // InternalDataDsl.g:665:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= '{' ( (lv_values_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )* otherlv_7= '}'
            {
            // InternalDataDsl.g:665:3: ()
            // InternalDataDsl.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionAccess().getOptionAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:672:3: ( (lv_key_1_0= ruleEString ) )
            // InternalDataDsl.g:673:4: (lv_key_1_0= ruleEString )
            {
            // InternalDataDsl.g:673:4: (lv_key_1_0= ruleEString )
            // InternalDataDsl.g:674:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:699:3: ( (lv_values_4_0= ruleEString ) )
            // InternalDataDsl.g:700:4: (lv_values_4_0= ruleEString )
            {
            // InternalDataDsl.g:700:4: (lv_values_4_0= ruleEString )
            // InternalDataDsl.g:701:5: lv_values_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_values_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_4_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:718:3: (otherlv_5= ',' ( (lv_values_6_0= ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataDsl.g:719:4: otherlv_5= ',' ( (lv_values_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOptionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDataDsl.g:723:4: ( (lv_values_6_0= ruleEString ) )
            	    // InternalDataDsl.g:724:5: (lv_values_6_0= ruleEString )
            	    {
            	    // InternalDataDsl.g:724:5: (lv_values_6_0= ruleEString )
            	    // InternalDataDsl.g:725:6: lv_values_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_values_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_6_0,
            	    							"eagledata.core.dsl.datadsl.DataDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:751:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalDataDsl.g:751:45: (iv_ruleNode= ruleNode EOF )
            // InternalDataDsl.g:752:2: iv_ruleNode= ruleNode EOF
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
    // InternalDataDsl.g:758:1: ruleNode returns [EObject current=null] : (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeNode_0 = null;

        EObject this_LeafNode_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:764:2: ( (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode ) )
            // InternalDataDsl.g:765:2: (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode )
            {
            // InternalDataDsl.g:765:2: (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==EOF||(LA17_5>=RULE_STRING && LA17_5<=RULE_ID)||LA17_5==12||LA17_5==14||LA17_5==24) ) {
                        alt17=2;
                    }
                    else if ( (LA17_5==17||LA17_5==22) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA17_6 = input.LA(3);

                    if ( (LA17_6==17||LA17_6==22) ) {
                        alt17=1;
                    }
                    else if ( (LA17_6==EOF||(LA17_6>=RULE_STRING && LA17_6<=RULE_ID)||LA17_6==12||LA17_6==14||LA17_6==24) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                case 22:
                    {
                    alt17=1;
                    }
                    break;
                case 18:
                case 27:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5==EOF||(LA17_5>=RULE_STRING && LA17_5<=RULE_ID)||LA17_5==12||LA17_5==14||LA17_5==24) ) {
                        alt17=2;
                    }
                    else if ( (LA17_5==17||LA17_5==22) ) {
                        alt17=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA17_6 = input.LA(3);

                    if ( (LA17_6==17||LA17_6==22) ) {
                        alt17=1;
                    }
                    else if ( (LA17_6==EOF||(LA17_6>=RULE_STRING && LA17_6<=RULE_ID)||LA17_6==12||LA17_6==14||LA17_6==24) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                case 22:
                    {
                    alt17=1;
                    }
                    break;
                case 18:
                case 27:
                    {
                    alt17=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }

                }
                break;
            case 25:
            case 26:
            case 28:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
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
                    // InternalDataDsl.g:766:3: this_CompositeNode_0= ruleCompositeNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeNode_0=ruleCompositeNode();

                    state._fsp--;


                    			current = this_CompositeNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:775:3: this_LeafNode_1= ruleLeafNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeafNode_1=ruleLeafNode();

                    state._fsp--;


                    			current = this_LeafNode_1;
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
    // InternalDataDsl.g:787:1: entryRuleCompositeNode returns [EObject current=null] : iv_ruleCompositeNode= ruleCompositeNode EOF ;
    public final EObject entryRuleCompositeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeNode = null;


        try {
            // InternalDataDsl.g:787:54: (iv_ruleCompositeNode= ruleCompositeNode EOF )
            // InternalDataDsl.g:788:2: iv_ruleCompositeNode= ruleCompositeNode EOF
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
    // InternalDataDsl.g:794:1: ruleCompositeNode returns [EObject current=null] : ( () ( (lv_environment_1_0= '>' ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_representedAs_3_0= ruleEString ) )? (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? ) otherlv_13= ')' ) ;
    public final EObject ruleCompositeNode() throws RecognitionException {
        EObject current = null;

        Token lv_environment_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_representedAs_3_0 = null;

        EObject lv_subnodes_10_0 = null;

        EObject lv_subnodes_12_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:800:2: ( ( () ( (lv_environment_1_0= '>' ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_representedAs_3_0= ruleEString ) )? (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? ) otherlv_13= ')' ) )
            // InternalDataDsl.g:801:2: ( () ( (lv_environment_1_0= '>' ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_representedAs_3_0= ruleEString ) )? (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? ) otherlv_13= ')' )
            {
            // InternalDataDsl.g:801:2: ( () ( (lv_environment_1_0= '>' ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_representedAs_3_0= ruleEString ) )? (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? ) otherlv_13= ')' )
            // InternalDataDsl.g:802:3: () ( (lv_environment_1_0= '>' ) )? ( (lv_name_2_0= ruleEString ) ) ( (lv_representedAs_3_0= ruleEString ) )? (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )? (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? ) otherlv_13= ')'
            {
            // InternalDataDsl.g:802:3: ()
            // InternalDataDsl.g:803:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeNodeAccess().getCompositeNodeAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:809:3: ( (lv_environment_1_0= '>' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:810:4: (lv_environment_1_0= '>' )
                    {
                    // InternalDataDsl.g:810:4: (lv_environment_1_0= '>' )
                    // InternalDataDsl.g:811:5: lv_environment_1_0= '>'
                    {
                    lv_environment_1_0=(Token)match(input,21,FOLLOW_3); 

                    					newLeafNode(lv_environment_1_0, grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeNodeRule());
                    					}
                    					setWithLastConsumed(current, "environment", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:823:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDataDsl.g:824:4: (lv_name_2_0= ruleEString )
            {
            // InternalDataDsl.g:824:4: (lv_name_2_0= ruleEString )
            // InternalDataDsl.g:825:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:842:3: ( (lv_representedAs_3_0= ruleEString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataDsl.g:843:4: (lv_representedAs_3_0= ruleEString )
                    {
                    // InternalDataDsl.g:843:4: (lv_representedAs_3_0= ruleEString )
                    // InternalDataDsl.g:844:5: lv_representedAs_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getCompositeNodeAccess().getRepresentedAsEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_representedAs_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    					}
                    					set(
                    						current,
                    						"representedAs",
                    						lv_representedAs_3_0,
                    						"eagledata.core.dsl.datadsl.DataDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:861:3: (otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataDsl.g:862:4: otherlv_4= 'extends' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeNodeAccess().getExtendsKeyword_4_0());
                    			
                    // InternalDataDsl.g:866:4: ( ( ruleEString ) )
                    // InternalDataDsl.g:867:5: ( ruleEString )
                    {
                    // InternalDataDsl.g:867:5: ( ruleEString )
                    // InternalDataDsl.g:868:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeNodeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:882:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==12) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDataDsl.g:883:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:887:5: ( ( ruleEString ) )
                    	    // InternalDataDsl.g:888:6: ( ruleEString )
                    	    {
                    	    // InternalDataDsl.g:888:6: ( ruleEString )
                    	    // InternalDataDsl.g:889:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalDataDsl.g:905:3: (otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )? )
            // InternalDataDsl.g:906:4: otherlv_8= '=' otherlv_9= '(' ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )?
            {
            otherlv_8=(Token)match(input,17,FOLLOW_19); 

            				newLeafNode(otherlv_8, grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_5_0());
            			
            otherlv_9=(Token)match(input,23,FOLLOW_20); 

            				newLeafNode(otherlv_9, grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_5_1());
            			
            // InternalDataDsl.g:914:4: ( ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||LA23_0==21||(LA23_0>=25 && LA23_0<=26)||LA23_0==28||(LA23_0>=33 && LA23_0<=50)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:915:5: ( (lv_subnodes_10_0= ruleNode ) ) (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )*
                    {
                    // InternalDataDsl.g:915:5: ( (lv_subnodes_10_0= ruleNode ) )
                    // InternalDataDsl.g:916:6: (lv_subnodes_10_0= ruleNode )
                    {
                    // InternalDataDsl.g:916:6: (lv_subnodes_10_0= ruleNode )
                    // InternalDataDsl.g:917:7: lv_subnodes_10_0= ruleNode
                    {

                    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_subnodes_10_0=ruleNode();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    							}
                    							add(
                    								current,
                    								"subnodes",
                    								lv_subnodes_10_0,
                    								"eagledata.core.dsl.datadsl.DataDsl.Node");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDataDsl.g:934:5: (otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==12) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDataDsl.g:935:6: otherlv_11= ',' ( (lv_subnodes_12_0= ruleNode ) )
                    	    {
                    	    otherlv_11=(Token)match(input,12,FOLLOW_13); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_2_1_0());
                    	    					
                    	    // InternalDataDsl.g:939:6: ( (lv_subnodes_12_0= ruleNode ) )
                    	    // InternalDataDsl.g:940:7: (lv_subnodes_12_0= ruleNode )
                    	    {
                    	    // InternalDataDsl.g:940:7: (lv_subnodes_12_0= ruleNode )
                    	    // InternalDataDsl.g:941:8: lv_subnodes_12_0= ruleNode
                    	    {

                    	    								newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_21);
                    	    lv_subnodes_12_0=ruleNode();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"subnodes",
                    	    									lv_subnodes_12_0,
                    	    									"eagledata.core.dsl.datadsl.DataDsl.Node");
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
                    break;

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalDataDsl.g:969:1: entryRuleLeafNode returns [EObject current=null] : iv_ruleLeafNode= ruleLeafNode EOF ;
    public final EObject entryRuleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafNode = null;


        try {
            // InternalDataDsl.g:969:49: (iv_ruleLeafNode= ruleLeafNode EOF )
            // InternalDataDsl.g:970:2: iv_ruleLeafNode= ruleLeafNode EOF
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
    // InternalDataDsl.g:976:1: ruleLeafNode returns [EObject current=null] : ( () ( (lv_key_1_0= 'key' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleTypeSpecification ) ) ( (lv_keyword_4_0= '#' ) )? ( (lv_name_5_0= ruleEString ) ) ( (lv_representedAs_6_0= ruleEString ) )? ) ;
    public final EObject ruleLeafNode() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token lv_unique_2_0=null;
        Token lv_keyword_4_0=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_representedAs_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:982:2: ( ( () ( (lv_key_1_0= 'key' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleTypeSpecification ) ) ( (lv_keyword_4_0= '#' ) )? ( (lv_name_5_0= ruleEString ) ) ( (lv_representedAs_6_0= ruleEString ) )? ) )
            // InternalDataDsl.g:983:2: ( () ( (lv_key_1_0= 'key' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleTypeSpecification ) ) ( (lv_keyword_4_0= '#' ) )? ( (lv_name_5_0= ruleEString ) ) ( (lv_representedAs_6_0= ruleEString ) )? )
            {
            // InternalDataDsl.g:983:2: ( () ( (lv_key_1_0= 'key' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleTypeSpecification ) ) ( (lv_keyword_4_0= '#' ) )? ( (lv_name_5_0= ruleEString ) ) ( (lv_representedAs_6_0= ruleEString ) )? )
            // InternalDataDsl.g:984:3: () ( (lv_key_1_0= 'key' ) )? ( (lv_unique_2_0= 'unique' ) )? ( (lv_type_3_0= ruleTypeSpecification ) ) ( (lv_keyword_4_0= '#' ) )? ( (lv_name_5_0= ruleEString ) ) ( (lv_representedAs_6_0= ruleEString ) )?
            {
            // InternalDataDsl.g:984:3: ()
            // InternalDataDsl.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeafNodeAccess().getLeafNodeAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:991:3: ( (lv_key_1_0= 'key' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:992:4: (lv_key_1_0= 'key' )
                    {
                    // InternalDataDsl.g:992:4: (lv_key_1_0= 'key' )
                    // InternalDataDsl.g:993:5: lv_key_1_0= 'key'
                    {
                    lv_key_1_0=(Token)match(input,25,FOLLOW_13); 

                    					newLeafNode(lv_key_1_0, grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "key", true, "key");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1005:3: ( (lv_unique_2_0= 'unique' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:1006:4: (lv_unique_2_0= 'unique' )
                    {
                    // InternalDataDsl.g:1006:4: (lv_unique_2_0= 'unique' )
                    // InternalDataDsl.g:1007:5: lv_unique_2_0= 'unique'
                    {
                    lv_unique_2_0=(Token)match(input,26,FOLLOW_13); 

                    					newLeafNode(lv_unique_2_0, grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1019:3: ( (lv_type_3_0= ruleTypeSpecification ) )
            // InternalDataDsl.g:1020:4: (lv_type_3_0= ruleTypeSpecification )
            {
            // InternalDataDsl.g:1020:4: (lv_type_3_0= ruleTypeSpecification )
            // InternalDataDsl.g:1021:5: lv_type_3_0= ruleTypeSpecification
            {

            					newCompositeNode(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_3_0=ruleTypeSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeafNodeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"eagledata.core.dsl.datadsl.DataDsl.TypeSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1038:3: ( (lv_keyword_4_0= '#' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDsl.g:1039:4: (lv_keyword_4_0= '#' )
                    {
                    // InternalDataDsl.g:1039:4: (lv_keyword_4_0= '#' )
                    // InternalDataDsl.g:1040:5: lv_keyword_4_0= '#'
                    {
                    lv_keyword_4_0=(Token)match(input,27,FOLLOW_3); 

                    					newLeafNode(lv_keyword_4_0, grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "keyword", true, "#");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1052:3: ( (lv_name_5_0= ruleEString ) )
            // InternalDataDsl.g:1053:4: (lv_name_5_0= ruleEString )
            {
            // InternalDataDsl.g:1053:4: (lv_name_5_0= ruleEString )
            // InternalDataDsl.g:1054:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeafNodeAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeafNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"eagledata.core.dsl.datadsl.DataDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1071:3: ( (lv_representedAs_6_0= ruleEString ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:1072:4: (lv_representedAs_6_0= ruleEString )
                    {
                    // InternalDataDsl.g:1072:4: (lv_representedAs_6_0= ruleEString )
                    // InternalDataDsl.g:1073:5: lv_representedAs_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getLeafNodeAccess().getRepresentedAsEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_representedAs_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    					}
                    					set(
                    						current,
                    						"representedAs",
                    						lv_representedAs_6_0,
                    						"eagledata.core.dsl.datadsl.DataDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:1094:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // InternalDataDsl.g:1094:58: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // InternalDataDsl.g:1095:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
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
    // InternalDataDsl.g:1101:1: ruleTypeSpecification returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Reference_1= ruleReference ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1107:2: ( (this_DataType_0= ruleDataType | this_Reference_1= ruleReference ) )
            // InternalDataDsl.g:1108:2: (this_DataType_0= ruleDataType | this_Reference_1= ruleReference )
            {
            // InternalDataDsl.g:1108:2: (this_DataType_0= ruleDataType | this_Reference_1= ruleReference )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=33 && LA28_0<=50)) ) {
                alt28=1;
            }
            else if ( (LA28_0==28) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:1109:3: this_DataType_0= ruleDataType
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
                    // InternalDataDsl.g:1118:3: this_Reference_1= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_1=ruleReference();

                    state._fsp--;


                    			current = this_Reference_1;
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
    // InternalDataDsl.g:1130:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDataDsl.g:1130:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDataDsl.g:1131:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalDataDsl.g:1137:1: ruleDataType returns [EObject current=null] : ( () ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_specialType_1_0 = null;

        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1143:2: ( ( () ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? ) )
            // InternalDataDsl.g:1144:2: ( () ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? )
            {
            // InternalDataDsl.g:1144:2: ( () ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? )
            // InternalDataDsl.g:1145:3: () ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )?
            {
            // InternalDataDsl.g:1145:3: ()
            // InternalDataDsl.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:1152:3: ( ( (lv_specialType_1_0= ruleEString ) ) | ( (lv_type_2_0= ruleTypeKind ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=33 && LA29_0<=50)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:1153:4: ( (lv_specialType_1_0= ruleEString ) )
                    {
                    // InternalDataDsl.g:1153:4: ( (lv_specialType_1_0= ruleEString ) )
                    // InternalDataDsl.g:1154:5: (lv_specialType_1_0= ruleEString )
                    {
                    // InternalDataDsl.g:1154:5: (lv_specialType_1_0= ruleEString )
                    // InternalDataDsl.g:1155:6: lv_specialType_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getSpecialTypeEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_specialType_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"specialType",
                    							lv_specialType_1_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1173:4: ( (lv_type_2_0= ruleTypeKind ) )
                    {
                    // InternalDataDsl.g:1173:4: ( (lv_type_2_0= ruleTypeKind ) )
                    // InternalDataDsl.g:1174:5: (lv_type_2_0= ruleTypeKind )
                    {
                    // InternalDataDsl.g:1174:5: (lv_type_2_0= ruleTypeKind )
                    // InternalDataDsl.g:1175:6: lv_type_2_0= ruleTypeKind
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_2_0=ruleTypeKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.TypeKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1193:3: (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:1194:4: otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalDataDsl.g:1198:4: ( (lv_min_4_0= ruleEInt ) )
                    // InternalDataDsl.g:1199:5: (lv_min_4_0= ruleEInt )
                    {
                    // InternalDataDsl.g:1199:5: (lv_min_4_0= ruleEInt )
                    // InternalDataDsl.g:1200:6: lv_min_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getMinEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_min_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_4_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getCommaKeyword_2_2());
                    			
                    // InternalDataDsl.g:1221:4: ( (lv_max_6_0= ruleEInt ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_INT||LA30_0==29) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalDataDsl.g:1222:5: (lv_max_6_0= ruleEInt )
                            {
                            // InternalDataDsl.g:1222:5: (lv_max_6_0= ruleEInt )
                            // InternalDataDsl.g:1223:6: lv_max_6_0= ruleEInt
                            {

                            						newCompositeNode(grammarAccess.getDataTypeAccess().getMaxEIntParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_max_6_0=ruleEInt();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                            						}
                            						set(
                            							current,
                            							"max",
                            							lv_max_6_0,
                            							"eagledata.core.dsl.datadsl.DataDsl.EInt");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4());
                    			

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


    // $ANTLR start "entryRuleReference"
    // InternalDataDsl.g:1249:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDataDsl.g:1249:50: (iv_ruleReference= ruleReference EOF )
            // InternalDataDsl.g:1250:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDataDsl.g:1256:1: ruleReference returns [EObject current=null] : ( () otherlv_1= 'ref:' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1262:2: ( ( () otherlv_1= 'ref:' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? ) )
            // InternalDataDsl.g:1263:2: ( () otherlv_1= 'ref:' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? )
            {
            // InternalDataDsl.g:1263:2: ( () otherlv_1= 'ref:' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )? )
            // InternalDataDsl.g:1264:3: () otherlv_1= 'ref:' ( ( ruleEString ) ) (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )?
            {
            // InternalDataDsl.g:1264:3: ()
            // InternalDataDsl.g:1265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefKeyword_1());
            		
            // InternalDataDsl.g:1275:3: ( ( ruleEString ) )
            // InternalDataDsl.g:1276:4: ( ruleEString )
            {
            // InternalDataDsl.g:1276:4: ( ruleEString )
            // InternalDataDsl.g:1277:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1291:3: (otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:1292:4: otherlv_3= '[' ( (lv_min_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_max_6_0= ruleEInt ) )? otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDataDsl.g:1296:4: ( (lv_min_4_0= ruleEInt ) )
                    // InternalDataDsl.g:1297:5: (lv_min_4_0= ruleEInt )
                    {
                    // InternalDataDsl.g:1297:5: (lv_min_4_0= ruleEInt )
                    // InternalDataDsl.g:1298:6: lv_min_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_min_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_4_0,
                    							"eagledata.core.dsl.datadsl.DataDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getCommaKeyword_3_2());
                    			
                    // InternalDataDsl.g:1319:4: ( (lv_max_6_0= ruleEInt ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_INT||LA32_0==29) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalDataDsl.g:1320:5: (lv_max_6_0= ruleEInt )
                            {
                            // InternalDataDsl.g:1320:5: (lv_max_6_0= ruleEInt )
                            // InternalDataDsl.g:1321:6: lv_max_6_0= ruleEInt
                            {

                            						newCompositeNode(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_3_3_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_max_6_0=ruleEInt();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getReferenceRule());
                            						}
                            						set(
                            							current,
                            							"max",
                            							lv_max_6_0,
                            							"eagledata.core.dsl.datadsl.DataDsl.EInt");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEString"
    // InternalDataDsl.g:1347:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDataDsl.g:1347:47: (iv_ruleEString= ruleEString EOF )
            // InternalDataDsl.g:1348:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDataDsl.g:1354:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1360:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDataDsl.g:1361:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDataDsl.g:1361:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataDsl.g:1362:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1370:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDataDsl.g:1381:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDataDsl.g:1381:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDataDsl.g:1382:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataDsl.g:1388:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1394:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDataDsl.g:1395:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDataDsl.g:1395:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDataDsl.g:1396:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDataDsl.g:1396:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:1397:4: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFormatKind"
    // InternalDataDsl.g:1414:1: ruleFormatKind returns [Enumerator current=null] : ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) ;
    public final Enumerator ruleFormatKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1420:2: ( ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) )
            // InternalDataDsl.g:1421:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            {
            // InternalDataDsl.g:1421:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt36=1;
                }
                break;
            case 31:
                {
                alt36=2;
                }
                break;
            case 32:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:1422:3: (enumLiteral_0= 'CSV' )
                    {
                    // InternalDataDsl.g:1422:3: (enumLiteral_0= 'CSV' )
                    // InternalDataDsl.g:1423:4: enumLiteral_0= 'CSV'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1430:3: (enumLiteral_1= 'JSON' )
                    {
                    // InternalDataDsl.g:1430:3: (enumLiteral_1= 'JSON' )
                    // InternalDataDsl.g:1431:4: enumLiteral_1= 'JSON'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1438:3: (enumLiteral_2= 'XML' )
                    {
                    // InternalDataDsl.g:1438:3: (enumLiteral_2= 'XML' )
                    // InternalDataDsl.g:1439:4: enumLiteral_2= 'XML'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFormatKindAccess().getXMLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatKindAccess().getXMLEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleFormatKind"


    // $ANTLR start "ruleTypeKind"
    // InternalDataDsl.g:1449:1: ruleTypeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) ) ;
    public final Enumerator ruleTypeKind() throws RecognitionException {
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
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1455:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) ) )
            // InternalDataDsl.g:1456:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) )
            {
            // InternalDataDsl.g:1456:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) )
            int alt37=18;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt37=1;
                }
                break;
            case 34:
                {
                alt37=2;
                }
                break;
            case 35:
                {
                alt37=3;
                }
                break;
            case 36:
                {
                alt37=4;
                }
                break;
            case 37:
                {
                alt37=5;
                }
                break;
            case 38:
                {
                alt37=6;
                }
                break;
            case 39:
                {
                alt37=7;
                }
                break;
            case 40:
                {
                alt37=8;
                }
                break;
            case 41:
                {
                alt37=9;
                }
                break;
            case 42:
                {
                alt37=10;
                }
                break;
            case 43:
                {
                alt37=11;
                }
                break;
            case 44:
                {
                alt37=12;
                }
                break;
            case 45:
                {
                alt37=13;
                }
                break;
            case 46:
                {
                alt37=14;
                }
                break;
            case 47:
                {
                alt37=15;
                }
                break;
            case 48:
                {
                alt37=16;
                }
                break;
            case 49:
                {
                alt37=17;
                }
                break;
            case 50:
                {
                alt37=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalDataDsl.g:1457:3: (enumLiteral_0= 'string' )
                    {
                    // InternalDataDsl.g:1457:3: (enumLiteral_0= 'string' )
                    // InternalDataDsl.g:1458:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1465:3: (enumLiteral_1= 'numeral' )
                    {
                    // InternalDataDsl.g:1465:3: (enumLiteral_1= 'numeral' )
                    // InternalDataDsl.g:1466:4: enumLiteral_1= 'numeral'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1473:3: (enumLiteral_2= 'date' )
                    {
                    // InternalDataDsl.g:1473:3: (enumLiteral_2= 'date' )
                    // InternalDataDsl.g:1474:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1481:3: (enumLiteral_3= 'time' )
                    {
                    // InternalDataDsl.g:1481:3: (enumLiteral_3= 'time' )
                    // InternalDataDsl.g:1482:4: enumLiteral_3= 'time'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1489:3: (enumLiteral_4= 'year' )
                    {
                    // InternalDataDsl.g:1489:3: (enumLiteral_4= 'year' )
                    // InternalDataDsl.g:1490:4: enumLiteral_4= 'year'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1497:3: (enumLiteral_5= 'month' )
                    {
                    // InternalDataDsl.g:1497:3: (enumLiteral_5= 'month' )
                    // InternalDataDsl.g:1498:4: enumLiteral_5= 'month'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1505:3: (enumLiteral_6= 'day' )
                    {
                    // InternalDataDsl.g:1505:3: (enumLiteral_6= 'day' )
                    // InternalDataDsl.g:1506:4: enumLiteral_6= 'day'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1513:3: (enumLiteral_7= 'boolean' )
                    {
                    // InternalDataDsl.g:1513:3: (enumLiteral_7= 'boolean' )
                    // InternalDataDsl.g:1514:4: enumLiteral_7= 'boolean'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1521:3: (enumLiteral_8= 'place' )
                    {
                    // InternalDataDsl.g:1521:3: (enumLiteral_8= 'place' )
                    // InternalDataDsl.g:1522:4: enumLiteral_8= 'place'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1529:3: (enumLiteral_9= 'latitude' )
                    {
                    // InternalDataDsl.g:1529:3: (enumLiteral_9= 'latitude' )
                    // InternalDataDsl.g:1530:4: enumLiteral_9= 'latitude'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1537:3: (enumLiteral_10= 'longitude' )
                    {
                    // InternalDataDsl.g:1537:3: (enumLiteral_10= 'longitude' )
                    // InternalDataDsl.g:1538:4: enumLiteral_10= 'longitude'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:1545:3: (enumLiteral_11= 'UTMe' )
                    {
                    // InternalDataDsl.g:1545:3: (enumLiteral_11= 'UTMe' )
                    // InternalDataDsl.g:1546:4: enumLiteral_11= 'UTMe'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:1553:3: (enumLiteral_12= 'UTMn' )
                    {
                    // InternalDataDsl.g:1553:3: (enumLiteral_12= 'UTMn' )
                    // InternalDataDsl.g:1554:4: enumLiteral_12= 'UTMn'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDsl.g:1561:3: (enumLiteral_13= 'UTMz' )
                    {
                    // InternalDataDsl.g:1561:3: (enumLiteral_13= 'UTMz' )
                    // InternalDataDsl.g:1562:4: enumLiteral_13= 'UTMz'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDsl.g:1569:3: (enumLiteral_14= 'UTMHemi' )
                    {
                    // InternalDataDsl.g:1569:3: (enumLiteral_14= 'UTMHemi' )
                    // InternalDataDsl.g:1570:4: enumLiteral_14= 'UTMHemi'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDsl.g:1577:3: (enumLiteral_15= 'name' )
                    {
                    // InternalDataDsl.g:1577:3: (enumLiteral_15= 'name' )
                    // InternalDataDsl.g:1578:4: enumLiteral_15= 'name'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDsl.g:1585:3: (enumLiteral_16= 'familyname' )
                    {
                    // InternalDataDsl.g:1585:3: (enumLiteral_16= 'familyname' )
                    // InternalDataDsl.g:1586:4: enumLiteral_16= 'familyname'
                    {
                    enumLiteral_16=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDsl.g:1593:3: (enumLiteral_17= 'personalID' )
                    {
                    // InternalDataDsl.g:1593:3: (enumLiteral_17= 'personalID' )
                    // InternalDataDsl.g:1594:4: enumLiteral_17= 'personalID'
                    {
                    enumLiteral_17=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getPersonalIDEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getTypeKindAccess().getPersonalIDEnumLiteralDeclaration_17());
                    			

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
    // $ANTLR end "ruleTypeKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001C0000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000031000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0007FFFE16204030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0007FFFE16200030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000420030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0007FFFE17200030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020080040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});

}