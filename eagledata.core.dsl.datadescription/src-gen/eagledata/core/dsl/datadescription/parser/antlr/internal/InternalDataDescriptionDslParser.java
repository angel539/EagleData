package eagledata.core.dsl.datadescription.parser.antlr.internal;

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
import eagledata.core.dsl.datadescription.services.DataDescriptionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDescriptionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "','", "'{'", "'}'", "'description'", "'uses'", "'='", "'['", "']'", "'fragment'", "'>'", "'extends'", "'('", "')'", "'key'", "'unique'", "'#'", "'remove'", "'retype'", "'as'", "'rename'", "'ref:'", "'CSV'", "'JSON'", "'XML'", "'string'", "'numeral'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'place'", "'latitude'", "'longitude'", "'UTMe'", "'UTMn'", "'UTMz'", "'UTMHemi'", "'name'", "'familyname'", "'personalID'"
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


        public InternalDataDescriptionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDescriptionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDescriptionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataDescriptionDsl.g"; }



     	private DataDescriptionDslGrammarAccess grammarAccess;

        public InternalDataDescriptionDslParser(TokenStream input, DataDescriptionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected DataDescriptionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalDataDescriptionDsl.g:65:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalDataDescriptionDsl.g:65:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalDataDescriptionDsl.g:66:2: iv_ruleDataModel= ruleDataModel EOF
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
    // InternalDataDescriptionDsl.g:72:1: ruleDataModel returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )? otherlv_4= '{' ( (lv_descriptions_5_0= ruleDataDescription ) ) (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_importURI_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_descriptions_5_0 = null;

        EObject lv_descriptions_7_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:78:2: ( ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )? otherlv_4= '{' ( (lv_descriptions_5_0= ruleDataDescription ) ) (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )* otherlv_8= '}' ) )
            // InternalDataDescriptionDsl.g:79:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )? otherlv_4= '{' ( (lv_descriptions_5_0= ruleDataDescription ) ) (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )* otherlv_8= '}' )
            {
            // InternalDataDescriptionDsl.g:79:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )? otherlv_4= '{' ( (lv_descriptions_5_0= ruleDataDescription ) ) (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )* otherlv_8= '}' )
            // InternalDataDescriptionDsl.g:80:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )? otherlv_4= '{' ( (lv_descriptions_5_0= ruleDataDescription ) ) (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )* otherlv_8= '}'
            {
            // InternalDataDescriptionDsl.g:80:3: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDescriptionDsl.g:81:4: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )*
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getImportKeyword_0_0());
                    			
                    // InternalDataDescriptionDsl.g:85:4: ( (lv_importURI_1_0= RULE_STRING ) )
                    // InternalDataDescriptionDsl.g:86:5: (lv_importURI_1_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:86:5: (lv_importURI_1_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:87:6: lv_importURI_1_0= RULE_STRING
                    {
                    lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_importURI_1_0, grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataModelRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"importURI",
                    							lv_importURI_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:103:4: (otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:104:5: otherlv_2= ',' ( (lv_importURI_3_0= RULE_STRING ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:108:5: ( (lv_importURI_3_0= RULE_STRING ) )
                    	    // InternalDataDescriptionDsl.g:109:6: (lv_importURI_3_0= RULE_STRING )
                    	    {
                    	    // InternalDataDescriptionDsl.g:109:6: (lv_importURI_3_0= RULE_STRING )
                    	    // InternalDataDescriptionDsl.g:110:7: lv_importURI_3_0= RULE_STRING
                    	    {
                    	    lv_importURI_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    							newLeafNode(lv_importURI_3_0, grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataModelRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"importURI",
                    	    								lv_importURI_3_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

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

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDataDescriptionDsl.g:132:3: ( (lv_descriptions_5_0= ruleDataDescription ) )
            // InternalDataDescriptionDsl.g:133:4: (lv_descriptions_5_0= ruleDataDescription )
            {
            // InternalDataDescriptionDsl.g:133:4: (lv_descriptions_5_0= ruleDataDescription )
            // InternalDataDescriptionDsl.g:134:5: lv_descriptions_5_0= ruleDataDescription
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_descriptions_5_0=ruleDataDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_5_0,
            						"eagledata.core.dsl.datadescription.DataDescriptionDsl.DataDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDescriptionDsl.g:151:3: (otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:152:4: otherlv_6= ',' ( (lv_descriptions_7_0= ruleDataDescription ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDataDescriptionDsl.g:156:4: ( (lv_descriptions_7_0= ruleDataDescription ) )
            	    // InternalDataDescriptionDsl.g:157:5: (lv_descriptions_7_0= ruleDataDescription )
            	    {
            	    // InternalDataDescriptionDsl.g:157:5: (lv_descriptions_7_0= ruleDataDescription )
            	    // InternalDataDescriptionDsl.g:158:6: lv_descriptions_7_0= ruleDataDescription
            	    {

            	    						newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_descriptions_7_0=ruleDataDescription();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"descriptions",
            	    							lv_descriptions_7_0,
            	    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.DataDescription");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDataDescriptionDsl.g:184:1: entryRuleDataDescription returns [EObject current=null] : iv_ruleDataDescription= ruleDataDescription EOF ;
    public final EObject entryRuleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDescription = null;


        try {
            // InternalDataDescriptionDsl.g:184:56: (iv_ruleDataDescription= ruleDataDescription EOF )
            // InternalDataDescriptionDsl.g:185:2: iv_ruleDataDescription= ruleDataDescription EOF
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
    // InternalDataDescriptionDsl.g:191:1: ruleDataDescription returns [EObject current=null] : (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment ) ;
    public final EObject ruleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DataSource_0 = null;

        EObject this_DataFragment_1 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:197:2: ( (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment ) )
            // InternalDataDescriptionDsl.g:198:2: (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment )
            {
            // InternalDataDescriptionDsl.g:198:2: (this_DataSource_0= ruleDataSource | this_DataFragment_1= ruleDataFragment )
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
                    // InternalDataDescriptionDsl.g:199:3: this_DataSource_0= ruleDataSource
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
                    // InternalDataDescriptionDsl.g:208:3: this_DataFragment_1= ruleDataFragment
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
    // InternalDataDescriptionDsl.g:220:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalDataDescriptionDsl.g:220:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalDataDescriptionDsl.g:221:2: iv_ruleDataSource= ruleDataSource EOF
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
    // InternalDataDescriptionDsl.g:227:1: ruleDataSource returns [EObject current=null] : (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )? (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_link_3_0=null;
        Token otherlv_4=null;
        Token lv_link_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_format_1_0 = null;

        EObject lv_nodes_12_0 = null;

        EObject lv_nodes_14_0 = null;

        EObject lv_options_17_0 = null;

        EObject lv_options_19_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:233:2: ( (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )? (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? ) )
            // InternalDataDescriptionDsl.g:234:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )? (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? )
            {
            // InternalDataDescriptionDsl.g:234:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )? (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )? )
            // InternalDataDescriptionDsl.g:235:3: otherlv_0= 'description' ( (lv_format_1_0= ruleFormatSpecification ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )? (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? otherlv_10= '=' otherlv_11= '{' ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )? otherlv_15= '}' (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getDescriptionKeyword_0());
            		
            // InternalDataDescriptionDsl.g:239:3: ( (lv_format_1_0= ruleFormatSpecification ) )
            // InternalDataDescriptionDsl.g:240:4: (lv_format_1_0= ruleFormatSpecification )
            {
            // InternalDataDescriptionDsl.g:240:4: (lv_format_1_0= ruleFormatSpecification )
            // InternalDataDescriptionDsl.g:241:5: lv_format_1_0= ruleFormatSpecification
            {

            					newCompositeNode(grammarAccess.getDataSourceAccess().getFormatFormatSpecificationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_format_1_0=ruleFormatSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSourceRule());
            					}
            					set(
            						current,
            						"format",
            						lv_format_1_0,
            						"eagledata.core.dsl.datadescription.DataDescriptionDsl.FormatSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDescriptionDsl.g:258:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDataDescriptionDsl.g:259:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:259:4: (lv_name_2_0= RULE_ID )
            // InternalDataDescriptionDsl.g:260:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalDataDescriptionDsl.g:276:3: ( ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataDescriptionDsl.g:277:4: ( (lv_link_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )*
                    {
                    // InternalDataDescriptionDsl.g:277:4: ( (lv_link_3_0= RULE_STRING ) )
                    // InternalDataDescriptionDsl.g:278:5: (lv_link_3_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:278:5: (lv_link_3_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:279:6: lv_link_3_0= RULE_STRING
                    {
                    lv_link_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_link_3_0, grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"link",
                    							lv_link_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:295:4: (otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:296:5: otherlv_4= ',' ( (lv_link_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataSourceAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:300:5: ( (lv_link_5_0= RULE_STRING ) )
                    	    // InternalDataDescriptionDsl.g:301:6: (lv_link_5_0= RULE_STRING )
                    	    {
                    	    // InternalDataDescriptionDsl.g:301:6: (lv_link_5_0= RULE_STRING )
                    	    // InternalDataDescriptionDsl.g:302:7: lv_link_5_0= RULE_STRING
                    	    {
                    	    lv_link_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_link_5_0, grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"link",
                    	    								lv_link_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

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

            // InternalDataDescriptionDsl.g:320:3: (otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDescriptionDsl.g:321:4: otherlv_6= 'uses' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataSourceAccess().getUsesKeyword_4_0());
                    			
                    // InternalDataDescriptionDsl.g:325:4: ( (otherlv_7= RULE_ID ) )
                    // InternalDataDescriptionDsl.g:326:5: (otherlv_7= RULE_ID )
                    {
                    // InternalDataDescriptionDsl.g:326:5: (otherlv_7= RULE_ID )
                    // InternalDataDescriptionDsl.g:327:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_7, grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:338:4: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:339:5: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataSourceAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:343:5: ( (otherlv_9= RULE_STRING ) )
                    	    // InternalDataDescriptionDsl.g:344:6: (otherlv_9= RULE_STRING )
                    	    {
                    	    // InternalDataDescriptionDsl.g:344:6: (otherlv_9= RULE_STRING )
                    	    // InternalDataDescriptionDsl.g:345:7: otherlv_9= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataSourceRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_2_1_0());
                    	    						

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

            otherlv_10=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getDataSourceAccess().getEqualsSignKeyword_5());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDataDescriptionDsl.g:366:3: ( ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==21||(LA10_0>=25 && LA10_0<=26)||LA10_0==32||(LA10_0>=36 && LA10_0<=53)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDescriptionDsl.g:367:4: ( (lv_nodes_12_0= ruleNode ) ) (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )*
                    {
                    // InternalDataDescriptionDsl.g:367:4: ( (lv_nodes_12_0= ruleNode ) )
                    // InternalDataDescriptionDsl.g:368:5: (lv_nodes_12_0= ruleNode )
                    {
                    // InternalDataDescriptionDsl.g:368:5: (lv_nodes_12_0= ruleNode )
                    // InternalDataDescriptionDsl.g:369:6: lv_nodes_12_0= ruleNode
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
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:386:4: (otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:387:5: otherlv_13= ',' ( (lv_nodes_14_0= ruleNode ) )
                    	    {
                    	    otherlv_13=(Token)match(input,12,FOLLOW_14); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDataSourceAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:391:5: ( (lv_nodes_14_0= ruleNode ) )
                    	    // InternalDataDescriptionDsl.g:392:6: (lv_nodes_14_0= ruleNode )
                    	    {
                    	    // InternalDataDescriptionDsl.g:392:6: (lv_nodes_14_0= ruleNode )
                    	    // InternalDataDescriptionDsl.g:393:7: lv_nodes_14_0= ruleNode
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
                    	    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
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

            otherlv_15=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalDataDescriptionDsl.g:416:3: (otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDescriptionDsl.g:417:4: otherlv_16= '[' ( (lv_options_17_0= ruleOption ) ) (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )* otherlv_20= ']'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataSourceAccess().getLeftSquareBracketKeyword_9_0());
                    			
                    // InternalDataDescriptionDsl.g:421:4: ( (lv_options_17_0= ruleOption ) )
                    // InternalDataDescriptionDsl.g:422:5: (lv_options_17_0= ruleOption )
                    {
                    // InternalDataDescriptionDsl.g:422:5: (lv_options_17_0= ruleOption )
                    // InternalDataDescriptionDsl.g:423:6: lv_options_17_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_options_17_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_17_0,
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:440:4: (otherlv_18= ',' ( (lv_options_19_0= ruleOption ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==12) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:441:5: otherlv_18= ',' ( (lv_options_19_0= ruleOption ) )
                    	    {
                    	    otherlv_18=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getDataSourceAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:445:5: ( (lv_options_19_0= ruleOption ) )
                    	    // InternalDataDescriptionDsl.g:446:6: (lv_options_19_0= ruleOption )
                    	    {
                    	    // InternalDataDescriptionDsl.g:446:6: (lv_options_19_0= ruleOption )
                    	    // InternalDataDescriptionDsl.g:447:7: lv_options_19_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_options_19_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_19_0,
                    	    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
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
    // InternalDataDescriptionDsl.g:474:1: entryRuleDataFragment returns [EObject current=null] : iv_ruleDataFragment= ruleDataFragment EOF ;
    public final EObject entryRuleDataFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFragment = null;


        try {
            // InternalDataDescriptionDsl.g:474:53: (iv_ruleDataFragment= ruleDataFragment EOF )
            // InternalDataDescriptionDsl.g:475:2: iv_ruleDataFragment= ruleDataFragment EOF
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
    // InternalDataDescriptionDsl.g:481:1: ruleDataFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )? ) ;
    public final EObject ruleDataFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_nodes_6_0 = null;

        EObject lv_options_9_0 = null;

        EObject lv_options_11_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:487:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )? ) )
            // InternalDataDescriptionDsl.g:488:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )? )
            {
            // InternalDataDescriptionDsl.g:488:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )? )
            // InternalDataDescriptionDsl.g:489:3: otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )? otherlv_7= '}' (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFragmentAccess().getFragmentKeyword_0());
            		
            // InternalDataDescriptionDsl.g:493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDescriptionDsl.g:494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:494:4: (lv_name_1_0= RULE_ID )
            // InternalDataDescriptionDsl.g:495:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDataFragmentAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDescriptionDsl.g:519:3: ( ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||LA14_0==21||(LA14_0>=25 && LA14_0<=26)||LA14_0==32||(LA14_0>=36 && LA14_0<=53)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDescriptionDsl.g:520:4: ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )*
                    {
                    // InternalDataDescriptionDsl.g:520:4: ( (lv_nodes_4_0= ruleNode ) )
                    // InternalDataDescriptionDsl.g:521:5: (lv_nodes_4_0= ruleNode )
                    {
                    // InternalDataDescriptionDsl.g:521:5: (lv_nodes_4_0= ruleNode )
                    // InternalDataDescriptionDsl.g:522:6: lv_nodes_4_0= ruleNode
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
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:539:4: (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:540:5: otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_14); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:544:5: ( (lv_nodes_6_0= ruleNode ) )
                    	    // InternalDataDescriptionDsl.g:545:6: (lv_nodes_6_0= ruleNode )
                    	    {
                    	    // InternalDataDescriptionDsl.g:545:6: (lv_nodes_6_0= ruleNode )
                    	    // InternalDataDescriptionDsl.g:546:7: lv_nodes_6_0= ruleNode
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
                    	    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
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

            otherlv_7=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalDataDescriptionDsl.g:569:3: (otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDescriptionDsl.g:570:4: otherlv_8= '[' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataFragmentAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDataDescriptionDsl.g:574:4: ( (lv_options_9_0= ruleOption ) )
                    // InternalDataDescriptionDsl.g:575:5: (lv_options_9_0= ruleOption )
                    {
                    // InternalDataDescriptionDsl.g:575:5: (lv_options_9_0= ruleOption )
                    // InternalDataDescriptionDsl.g:576:6: lv_options_9_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_options_9_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_9_0,
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:593:4: (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==12) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:594:5: otherlv_10= ',' ( (lv_options_11_0= ruleOption ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDataFragmentAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:598:5: ( (lv_options_11_0= ruleOption ) )
                    	    // InternalDataDescriptionDsl.g:599:6: (lv_options_11_0= ruleOption )
                    	    {
                    	    // InternalDataDescriptionDsl.g:599:6: (lv_options_11_0= ruleOption )
                    	    // InternalDataDescriptionDsl.g:600:7: lv_options_11_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_options_11_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_11_0,
                    	    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDataFragmentAccess().getRightSquareBracketKeyword_6_3());
                    			

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
    // $ANTLR end "ruleDataFragment"


    // $ANTLR start "entryRuleFormatSpecification"
    // InternalDataDescriptionDsl.g:627:1: entryRuleFormatSpecification returns [EObject current=null] : iv_ruleFormatSpecification= ruleFormatSpecification EOF ;
    public final EObject entryRuleFormatSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatSpecification = null;


        try {
            // InternalDataDescriptionDsl.g:627:60: (iv_ruleFormatSpecification= ruleFormatSpecification EOF )
            // InternalDataDescriptionDsl.g:628:2: iv_ruleFormatSpecification= ruleFormatSpecification EOF
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
    // InternalDataDescriptionDsl.g:634:1: ruleFormatSpecification returns [EObject current=null] : ( ( (lv_specialFormat_0_0= RULE_STRING ) ) | ( (lv_format_1_0= ruleFormatKind ) ) ) ;
    public final EObject ruleFormatSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_specialFormat_0_0=null;
        Enumerator lv_format_1_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:640:2: ( ( ( (lv_specialFormat_0_0= RULE_STRING ) ) | ( (lv_format_1_0= ruleFormatKind ) ) ) )
            // InternalDataDescriptionDsl.g:641:2: ( ( (lv_specialFormat_0_0= RULE_STRING ) ) | ( (lv_format_1_0= ruleFormatKind ) ) )
            {
            // InternalDataDescriptionDsl.g:641:2: ( ( (lv_specialFormat_0_0= RULE_STRING ) ) | ( (lv_format_1_0= ruleFormatKind ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=33 && LA17_0<=35)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataDescriptionDsl.g:642:3: ( (lv_specialFormat_0_0= RULE_STRING ) )
                    {
                    // InternalDataDescriptionDsl.g:642:3: ( (lv_specialFormat_0_0= RULE_STRING ) )
                    // InternalDataDescriptionDsl.g:643:4: (lv_specialFormat_0_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:643:4: (lv_specialFormat_0_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:644:5: lv_specialFormat_0_0= RULE_STRING
                    {
                    lv_specialFormat_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_specialFormat_0_0, grammarAccess.getFormatSpecificationAccess().getSpecialFormatSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormatSpecificationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"specialFormat",
                    						lv_specialFormat_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:661:3: ( (lv_format_1_0= ruleFormatKind ) )
                    {
                    // InternalDataDescriptionDsl.g:661:3: ( (lv_format_1_0= ruleFormatKind ) )
                    // InternalDataDescriptionDsl.g:662:4: (lv_format_1_0= ruleFormatKind )
                    {
                    // InternalDataDescriptionDsl.g:662:4: (lv_format_1_0= ruleFormatKind )
                    // InternalDataDescriptionDsl.g:663:5: lv_format_1_0= ruleFormatKind
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
                    						"eagledata.core.dsl.datadescription.DataDescriptionDsl.FormatKind");
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
    // InternalDataDescriptionDsl.g:684:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDataDescriptionDsl.g:684:47: (iv_ruleOption= ruleOption EOF )
            // InternalDataDescriptionDsl.g:685:2: iv_ruleOption= ruleOption EOF
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
    // InternalDataDescriptionDsl.g:691:1: ruleOption returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:697:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalDataDescriptionDsl.g:698:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalDataDescriptionDsl.g:698:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalDataDescriptionDsl.g:699:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            // InternalDataDescriptionDsl.g:699:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalDataDescriptionDsl.g:700:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:700:4: (lv_key_0_0= RULE_STRING )
            // InternalDataDescriptionDsl.g:701:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_key_0_0, grammarAccess.getOptionAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDescriptionDsl.g:725:3: ( (lv_values_3_0= RULE_STRING ) )
            // InternalDataDescriptionDsl.g:726:4: (lv_values_3_0= RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:726:4: (lv_values_3_0= RULE_STRING )
            // InternalDataDescriptionDsl.g:727:5: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_values_3_0, grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataDescriptionDsl.g:743:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:744:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataDescriptionDsl.g:748:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalDataDescriptionDsl.g:749:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalDataDescriptionDsl.g:749:5: (lv_values_5_0= RULE_STRING )
            	    // InternalDataDescriptionDsl.g:750:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOptionRule());
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
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalDataDescriptionDsl.g:775:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalDataDescriptionDsl.g:775:45: (iv_ruleNode= ruleNode EOF )
            // InternalDataDescriptionDsl.g:776:2: iv_ruleNode= ruleNode EOF
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
    // InternalDataDescriptionDsl.g:782:1: ruleNode returns [EObject current=null] : (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeNode_0 = null;

        EObject this_LeafNode_1 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:788:2: ( (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode ) )
            // InternalDataDescriptionDsl.g:789:2: (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode )
            {
            // InternalDataDescriptionDsl.g:789:2: (this_CompositeNode_0= ruleCompositeNode | this_LeafNode_1= ruleLeafNode )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING||(LA19_0>=25 && LA19_0<=26)||LA19_0==32||(LA19_0>=36 && LA19_0<=53)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataDescriptionDsl.g:790:3: this_CompositeNode_0= ruleCompositeNode
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
                    // InternalDataDescriptionDsl.g:799:3: this_LeafNode_1= ruleLeafNode
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
    // InternalDataDescriptionDsl.g:811:1: entryRuleCompositeNode returns [EObject current=null] : iv_ruleCompositeNode= ruleCompositeNode EOF ;
    public final EObject entryRuleCompositeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeNode = null;


        try {
            // InternalDataDescriptionDsl.g:811:54: (iv_ruleCompositeNode= ruleCompositeNode EOF )
            // InternalDataDescriptionDsl.g:812:2: iv_ruleCompositeNode= ruleCompositeNode EOF
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
    // InternalDataDescriptionDsl.g:818:1: ruleCompositeNode returns [EObject current=null] : ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? ) otherlv_12= ')' (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )? ) ;
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
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_subnodes_9_0 = null;

        EObject lv_subnodes_11_0 = null;

        EObject lv_options_14_0 = null;

        EObject lv_options_16_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:824:2: ( ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? ) otherlv_12= ')' (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )? ) )
            // InternalDataDescriptionDsl.g:825:2: ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? ) otherlv_12= ')' (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )? )
            {
            // InternalDataDescriptionDsl.g:825:2: ( ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? ) otherlv_12= ')' (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )? )
            // InternalDataDescriptionDsl.g:826:3: ( (lv_environment_0_0= '>' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_representedAs_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? ) otherlv_12= ')' (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )?
            {
            // InternalDataDescriptionDsl.g:826:3: ( (lv_environment_0_0= '>' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDescriptionDsl.g:827:4: (lv_environment_0_0= '>' )
                    {
                    // InternalDataDescriptionDsl.g:827:4: (lv_environment_0_0= '>' )
                    // InternalDataDescriptionDsl.g:828:5: lv_environment_0_0= '>'
                    {
                    lv_environment_0_0=(Token)match(input,21,FOLLOW_8); 

                    					newLeafNode(lv_environment_0_0, grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeNodeRule());
                    					}
                    					setWithLastConsumed(current, "environment", true, ">");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDescriptionDsl.g:840:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDescriptionDsl.g:841:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:841:4: (lv_name_1_0= RULE_ID )
            // InternalDataDescriptionDsl.g:842:5: lv_name_1_0= RULE_ID
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

            // InternalDataDescriptionDsl.g:858:3: ( (lv_representedAs_2_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataDescriptionDsl.g:859:4: (lv_representedAs_2_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:859:4: (lv_representedAs_2_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:860:5: lv_representedAs_2_0= RULE_STRING
                    {
                    lv_representedAs_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalDataDescriptionDsl.g:876:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDescriptionDsl.g:877:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeNodeAccess().getExtendsKeyword_3_0());
                    			
                    // InternalDataDescriptionDsl.g:881:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataDescriptionDsl.g:882:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataDescriptionDsl.g:882:5: (otherlv_4= RULE_ID )
                    // InternalDataDescriptionDsl.g:883:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeNodeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:894:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==12) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:895:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCompositeNodeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:899:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalDataDescriptionDsl.g:900:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalDataDescriptionDsl.g:900:6: (otherlv_6= RULE_ID )
                    	    // InternalDataDescriptionDsl.g:901:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_2_1_0());
                    	    						

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

            // InternalDataDescriptionDsl.g:914:3: (otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )? )
            // InternalDataDescriptionDsl.g:915:4: otherlv_7= '=' otherlv_8= '(' ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )?
            {
            otherlv_7=(Token)match(input,17,FOLLOW_20); 

            				newLeafNode(otherlv_7, grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_4_0());
            			
            otherlv_8=(Token)match(input,23,FOLLOW_21); 

            				newLeafNode(otherlv_8, grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_1());
            			
            // InternalDataDescriptionDsl.g:923:4: ( ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||LA25_0==21||(LA25_0>=25 && LA25_0<=26)||LA25_0==32||(LA25_0>=36 && LA25_0<=53)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDescriptionDsl.g:924:5: ( (lv_subnodes_9_0= ruleNode ) ) (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )*
                    {
                    // InternalDataDescriptionDsl.g:924:5: ( (lv_subnodes_9_0= ruleNode ) )
                    // InternalDataDescriptionDsl.g:925:6: (lv_subnodes_9_0= ruleNode )
                    {
                    // InternalDataDescriptionDsl.g:925:6: (lv_subnodes_9_0= ruleNode )
                    // InternalDataDescriptionDsl.g:926:7: lv_subnodes_9_0= ruleNode
                    {

                    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_0_0());
                    						
                    pushFollow(FOLLOW_22);
                    lv_subnodes_9_0=ruleNode();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    							}
                    							add(
                    								current,
                    								"subnodes",
                    								lv_subnodes_9_0,
                    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalDataDescriptionDsl.g:943:5: (otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==12) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:944:6: otherlv_10= ',' ( (lv_subnodes_11_0= ruleNode ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_14); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalDataDescriptionDsl.g:948:6: ( (lv_subnodes_11_0= ruleNode ) )
                    	    // InternalDataDescriptionDsl.g:949:7: (lv_subnodes_11_0= ruleNode )
                    	    {
                    	    // InternalDataDescriptionDsl.g:949:7: (lv_subnodes_11_0= ruleNode )
                    	    // InternalDataDescriptionDsl.g:950:8: lv_subnodes_11_0= ruleNode
                    	    {

                    	    								newCompositeNode(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_22);
                    	    lv_subnodes_11_0=ruleNode();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"subnodes",
                    	    									lv_subnodes_11_0,
                    	    									"eagledata.core.dsl.datadescription.DataDescriptionDsl.Node");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_12=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_5());
            		
            // InternalDataDescriptionDsl.g:974:3: (otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDescriptionDsl.g:975:4: otherlv_13= '{' ( (lv_options_14_0= ruleOption ) ) (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalDataDescriptionDsl.g:979:4: ( (lv_options_14_0= ruleOption ) )
                    // InternalDataDescriptionDsl.g:980:5: (lv_options_14_0= ruleOption )
                    {
                    // InternalDataDescriptionDsl.g:980:5: (lv_options_14_0= ruleOption )
                    // InternalDataDescriptionDsl.g:981:6: lv_options_14_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_options_14_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_14_0,
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDescriptionDsl.g:998:4: (otherlv_15= ',' ( (lv_options_16_0= ruleOption ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==12) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDataDescriptionDsl.g:999:5: otherlv_15= ',' ( (lv_options_16_0= ruleOption ) )
                    	    {
                    	    otherlv_15=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCompositeNodeAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalDataDescriptionDsl.g:1003:5: ( (lv_options_16_0= ruleOption ) )
                    	    // InternalDataDescriptionDsl.g:1004:6: (lv_options_16_0= ruleOption )
                    	    {
                    	    // InternalDataDescriptionDsl.g:1004:6: (lv_options_16_0= ruleOption )
                    	    // InternalDataDescriptionDsl.g:1005:7: lv_options_16_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_options_16_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_16_0,
                    	    								"eagledata.core.dsl.datadescription.DataDescriptionDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6_3());
                    			

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
    // InternalDataDescriptionDsl.g:1032:1: entryRuleLeafNode returns [EObject current=null] : iv_ruleLeafNode= ruleLeafNode EOF ;
    public final EObject entryRuleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafNode = null;


        try {
            // InternalDataDescriptionDsl.g:1032:49: (iv_ruleLeafNode= ruleLeafNode EOF )
            // InternalDataDescriptionDsl.g:1033:2: iv_ruleLeafNode= ruleLeafNode EOF
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
    // InternalDataDescriptionDsl.g:1039:1: ruleLeafNode returns [EObject current=null] : ( ( (lv_key_0_0= 'key' ) )? ( (lv_unique_1_0= 'unique' ) )? ( (lv_type_2_0= ruleTypeSpecification ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleLeafNode() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_unique_1_0=null;
        Token lv_keyword_3_0=null;
        Token lv_name_4_0=null;
        Token lv_representedAs_5_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1045:2: ( ( ( (lv_key_0_0= 'key' ) )? ( (lv_unique_1_0= 'unique' ) )? ( (lv_type_2_0= ruleTypeSpecification ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? ) )
            // InternalDataDescriptionDsl.g:1046:2: ( ( (lv_key_0_0= 'key' ) )? ( (lv_unique_1_0= 'unique' ) )? ( (lv_type_2_0= ruleTypeSpecification ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? )
            {
            // InternalDataDescriptionDsl.g:1046:2: ( ( (lv_key_0_0= 'key' ) )? ( (lv_unique_1_0= 'unique' ) )? ( (lv_type_2_0= ruleTypeSpecification ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )? )
            // InternalDataDescriptionDsl.g:1047:3: ( (lv_key_0_0= 'key' ) )? ( (lv_unique_1_0= 'unique' ) )? ( (lv_type_2_0= ruleTypeSpecification ) ) ( (lv_keyword_3_0= '#' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_representedAs_5_0= RULE_STRING ) )?
            {
            // InternalDataDescriptionDsl.g:1047:3: ( (lv_key_0_0= 'key' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1048:4: (lv_key_0_0= 'key' )
                    {
                    // InternalDataDescriptionDsl.g:1048:4: (lv_key_0_0= 'key' )
                    // InternalDataDescriptionDsl.g:1049:5: lv_key_0_0= 'key'
                    {
                    lv_key_0_0=(Token)match(input,25,FOLLOW_14); 

                    					newLeafNode(lv_key_0_0, grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "key", true, "key");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDescriptionDsl.g:1061:3: ( (lv_unique_1_0= 'unique' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1062:4: (lv_unique_1_0= 'unique' )
                    {
                    // InternalDataDescriptionDsl.g:1062:4: (lv_unique_1_0= 'unique' )
                    // InternalDataDescriptionDsl.g:1063:5: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,26,FOLLOW_14); 

                    					newLeafNode(lv_unique_1_0, grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "unique", true, "unique");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDescriptionDsl.g:1075:3: ( (lv_type_2_0= ruleTypeSpecification ) )
            // InternalDataDescriptionDsl.g:1076:4: (lv_type_2_0= ruleTypeSpecification )
            {
            // InternalDataDescriptionDsl.g:1076:4: (lv_type_2_0= ruleTypeSpecification )
            // InternalDataDescriptionDsl.g:1077:5: lv_type_2_0= ruleTypeSpecification
            {

            					newCompositeNode(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_2_0=ruleTypeSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeafNodeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"eagledata.core.dsl.datadescription.DataDescriptionDsl.TypeSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDescriptionDsl.g:1094:3: ( (lv_keyword_3_0= '#' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1095:4: (lv_keyword_3_0= '#' )
                    {
                    // InternalDataDescriptionDsl.g:1095:4: (lv_keyword_3_0= '#' )
                    // InternalDataDescriptionDsl.g:1096:5: lv_keyword_3_0= '#'
                    {
                    lv_keyword_3_0=(Token)match(input,27,FOLLOW_8); 

                    					newLeafNode(lv_keyword_3_0, grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeafNodeRule());
                    					}
                    					setWithLastConsumed(current, "keyword", true, "#");
                    				

                    }


                    }
                    break;

            }

            // InternalDataDescriptionDsl.g:1108:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDataDescriptionDsl.g:1109:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:1109:4: (lv_name_4_0= RULE_ID )
            // InternalDataDescriptionDsl.g:1110:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_4_0());
            				

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

            // InternalDataDescriptionDsl.g:1126:3: ( (lv_representedAs_5_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1127:4: (lv_representedAs_5_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:1127:4: (lv_representedAs_5_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:1128:5: lv_representedAs_5_0= RULE_STRING
                    {
                    lv_representedAs_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_representedAs_5_0, grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_5_0());
                    				

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


    // $ANTLR start "entryRuleRemove"
    // InternalDataDescriptionDsl.g:1148:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalDataDescriptionDsl.g:1148:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalDataDescriptionDsl.g:1149:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalDataDescriptionDsl.g:1155:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1161:2: ( ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDataDescriptionDsl.g:1162:2: ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDataDescriptionDsl.g:1162:2: ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:1163:3: () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:1163:3: ()
            // InternalDataDescriptionDsl.g:1164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveAccess().getRemoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
            		
            // InternalDataDescriptionDsl.g:1174:3: ( (otherlv_2= RULE_ID ) )
            // InternalDataDescriptionDsl.g:1175:4: (otherlv_2= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:1175:4: (otherlv_2= RULE_ID )
            // InternalDataDescriptionDsl.g:1176:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getDeprecatedLeafNodeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleRetype"
    // InternalDataDescriptionDsl.g:1191:1: entryRuleRetype returns [EObject current=null] : iv_ruleRetype= ruleRetype EOF ;
    public final EObject entryRuleRetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetype = null;


        try {
            // InternalDataDescriptionDsl.g:1191:47: (iv_ruleRetype= ruleRetype EOF )
            // InternalDataDescriptionDsl.g:1192:2: iv_ruleRetype= ruleRetype EOF
            {
             newCompositeNode(grammarAccess.getRetypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetype=ruleRetype();

            state._fsp--;

             current =iv_ruleRetype; 
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
    // $ANTLR end "entryRuleRetype"


    // $ANTLR start "ruleRetype"
    // InternalDataDescriptionDsl.g:1198:1: ruleRetype returns [EObject current=null] : ( () otherlv_1= 'retype' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newType_4_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleRetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_newType_4_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1204:2: ( ( () otherlv_1= 'retype' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newType_4_0= ruleTypeSpecification ) ) ) )
            // InternalDataDescriptionDsl.g:1205:2: ( () otherlv_1= 'retype' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newType_4_0= ruleTypeSpecification ) ) )
            {
            // InternalDataDescriptionDsl.g:1205:2: ( () otherlv_1= 'retype' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newType_4_0= ruleTypeSpecification ) ) )
            // InternalDataDescriptionDsl.g:1206:3: () otherlv_1= 'retype' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newType_4_0= ruleTypeSpecification ) )
            {
            // InternalDataDescriptionDsl.g:1206:3: ()
            // InternalDataDescriptionDsl.g:1207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRetypeAccess().getRetypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRetypeAccess().getRetypeKeyword_1());
            		
            // InternalDataDescriptionDsl.g:1217:3: ( (otherlv_2= RULE_ID ) )
            // InternalDataDescriptionDsl.g:1218:4: (otherlv_2= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:1218:4: (otherlv_2= RULE_ID )
            // InternalDataDescriptionDsl.g:1219:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRetypeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getRetypeAccess().getDeprecatedLeafNodeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRetypeAccess().getAsKeyword_3());
            		
            // InternalDataDescriptionDsl.g:1234:3: ( (lv_newType_4_0= ruleTypeSpecification ) )
            // InternalDataDescriptionDsl.g:1235:4: (lv_newType_4_0= ruleTypeSpecification )
            {
            // InternalDataDescriptionDsl.g:1235:4: (lv_newType_4_0= ruleTypeSpecification )
            // InternalDataDescriptionDsl.g:1236:5: lv_newType_4_0= ruleTypeSpecification
            {

            					newCompositeNode(grammarAccess.getRetypeAccess().getNewTypeTypeSpecificationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_newType_4_0=ruleTypeSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetypeRule());
            					}
            					set(
            						current,
            						"newType",
            						lv_newType_4_0,
            						"eagledata.core.dsl.datadescription.DataDescriptionDsl.TypeSpecification");
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
    // $ANTLR end "ruleRetype"


    // $ANTLR start "entryRuleRename"
    // InternalDataDescriptionDsl.g:1257:1: entryRuleRename returns [EObject current=null] : iv_ruleRename= ruleRename EOF ;
    public final EObject entryRuleRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRename = null;


        try {
            // InternalDataDescriptionDsl.g:1257:47: (iv_ruleRename= ruleRename EOF )
            // InternalDataDescriptionDsl.g:1258:2: iv_ruleRename= ruleRename EOF
            {
             newCompositeNode(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRename=ruleRename();

            state._fsp--;

             current =iv_ruleRename; 
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
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalDataDescriptionDsl.g:1264:1: ruleRename returns [EObject current=null] : ( () otherlv_1= 'rename' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRepresentedAs_4_0= RULE_ID ) ) ) ;
    public final EObject ruleRename() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_newRepresentedAs_4_0=null;


        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1270:2: ( ( () otherlv_1= 'rename' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRepresentedAs_4_0= RULE_ID ) ) ) )
            // InternalDataDescriptionDsl.g:1271:2: ( () otherlv_1= 'rename' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRepresentedAs_4_0= RULE_ID ) ) )
            {
            // InternalDataDescriptionDsl.g:1271:2: ( () otherlv_1= 'rename' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRepresentedAs_4_0= RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:1272:3: () otherlv_1= 'rename' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'as' ( (lv_newRepresentedAs_4_0= RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:1272:3: ()
            // InternalDataDescriptionDsl.g:1273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRenameAccess().getRenameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRenameAccess().getRenameKeyword_1());
            		
            // InternalDataDescriptionDsl.g:1283:3: ( (otherlv_2= RULE_ID ) )
            // InternalDataDescriptionDsl.g:1284:4: (otherlv_2= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:1284:4: (otherlv_2= RULE_ID )
            // InternalDataDescriptionDsl.g:1285:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getRenameAccess().getDeprecatedLeafNodeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameAccess().getAsKeyword_3());
            		
            // InternalDataDescriptionDsl.g:1300:3: ( (lv_newRepresentedAs_4_0= RULE_ID ) )
            // InternalDataDescriptionDsl.g:1301:4: (lv_newRepresentedAs_4_0= RULE_ID )
            {
            // InternalDataDescriptionDsl.g:1301:4: (lv_newRepresentedAs_4_0= RULE_ID )
            // InternalDataDescriptionDsl.g:1302:5: lv_newRepresentedAs_4_0= RULE_ID
            {
            lv_newRepresentedAs_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_newRepresentedAs_4_0, grammarAccess.getRenameAccess().getNewRepresentedAsIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newRepresentedAs",
            						lv_newRepresentedAs_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDescriptionDsl.g:1322:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // InternalDataDescriptionDsl.g:1322:58: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // InternalDataDescriptionDsl.g:1323:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
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
    // InternalDataDescriptionDsl.g:1329:1: ruleTypeSpecification returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Reference_1= ruleReference ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Reference_1 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1335:2: ( (this_DataType_0= ruleDataType | this_Reference_1= ruleReference ) )
            // InternalDataDescriptionDsl.g:1336:2: (this_DataType_0= ruleDataType | this_Reference_1= ruleReference )
            {
            // InternalDataDescriptionDsl.g:1336:2: (this_DataType_0= ruleDataType | this_Reference_1= ruleReference )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING||(LA32_0>=36 && LA32_0<=53)) ) {
                alt32=1;
            }
            else if ( (LA32_0==32) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1337:3: this_DataType_0= ruleDataType
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
                    // InternalDataDescriptionDsl.g:1346:3: this_Reference_1= ruleReference
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
    // InternalDataDescriptionDsl.g:1358:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDataDescriptionDsl.g:1358:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDataDescriptionDsl.g:1359:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalDataDescriptionDsl.g:1365:1: ruleDataType returns [EObject current=null] : ( ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_specialType_0_0=null;
        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1371:2: ( ( ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? ) )
            // InternalDataDescriptionDsl.g:1372:2: ( ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? )
            {
            // InternalDataDescriptionDsl.g:1372:2: ( ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? )
            // InternalDataDescriptionDsl.g:1373:3: ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )?
            {
            // InternalDataDescriptionDsl.g:1373:3: ( ( (lv_specialType_0_0= RULE_STRING ) ) | ( (lv_type_1_0= ruleTypeKind ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=36 && LA33_0<=53)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1374:4: ( (lv_specialType_0_0= RULE_STRING ) )
                    {
                    // InternalDataDescriptionDsl.g:1374:4: ( (lv_specialType_0_0= RULE_STRING ) )
                    // InternalDataDescriptionDsl.g:1375:5: (lv_specialType_0_0= RULE_STRING )
                    {
                    // InternalDataDescriptionDsl.g:1375:5: (lv_specialType_0_0= RULE_STRING )
                    // InternalDataDescriptionDsl.g:1376:6: lv_specialType_0_0= RULE_STRING
                    {
                    lv_specialType_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_specialType_0_0, grammarAccess.getDataTypeAccess().getSpecialTypeSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"specialType",
                    							lv_specialType_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:1393:4: ( (lv_type_1_0= ruleTypeKind ) )
                    {
                    // InternalDataDescriptionDsl.g:1393:4: ( (lv_type_1_0= ruleTypeKind ) )
                    // InternalDataDescriptionDsl.g:1394:5: (lv_type_1_0= ruleTypeKind )
                    {
                    // InternalDataDescriptionDsl.g:1394:5: (lv_type_1_0= ruleTypeKind )
                    // InternalDataDescriptionDsl.g:1395:6: lv_type_1_0= ruleTypeKind
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_1_0=ruleTypeKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"eagledata.core.dsl.datadescription.DataDescriptionDsl.TypeKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDescriptionDsl.g:1413:3: (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1414:4: otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalDataDescriptionDsl.g:1418:4: ( (lv_min_3_0= RULE_INT ) )
                    // InternalDataDescriptionDsl.g:1419:5: (lv_min_3_0= RULE_INT )
                    {
                    // InternalDataDescriptionDsl.g:1419:5: (lv_min_3_0= RULE_INT )
                    // InternalDataDescriptionDsl.g:1420:6: lv_min_3_0= RULE_INT
                    {
                    lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_min_3_0, grammarAccess.getDataTypeAccess().getMinINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getCommaKeyword_1_2());
                    			
                    // InternalDataDescriptionDsl.g:1440:4: ( (lv_max_5_0= RULE_INT ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_INT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalDataDescriptionDsl.g:1441:5: (lv_max_5_0= RULE_INT )
                            {
                            // InternalDataDescriptionDsl.g:1441:5: (lv_max_5_0= RULE_INT )
                            // InternalDataDescriptionDsl.g:1442:6: lv_max_5_0= RULE_INT
                            {
                            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                            						newLeafNode(lv_max_5_0, grammarAccess.getDataTypeAccess().getMaxINTTerminalRuleCall_1_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDataTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"max",
                            							lv_max_5_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_1_4());
                    			

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
    // InternalDataDescriptionDsl.g:1467:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDataDescriptionDsl.g:1467:50: (iv_ruleReference= ruleReference EOF )
            // InternalDataDescriptionDsl.g:1468:2: iv_ruleReference= ruleReference EOF
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
    // InternalDataDescriptionDsl.g:1474:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1480:2: ( (otherlv_0= 'ref:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? ) )
            // InternalDataDescriptionDsl.g:1481:2: (otherlv_0= 'ref:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? )
            {
            // InternalDataDescriptionDsl.g:1481:2: (otherlv_0= 'ref:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )? )
            // InternalDataDescriptionDsl.g:1482:3: otherlv_0= 'ref:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalDataDescriptionDsl.g:1486:3: ( (otherlv_1= RULE_STRING ) )
            // InternalDataDescriptionDsl.g:1487:4: (otherlv_1= RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:1487:4: (otherlv_1= RULE_STRING )
            // InternalDataDescriptionDsl.g:1488:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_1_0());
            				

            }


            }

            // InternalDataDescriptionDsl.g:1499:3: (otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1500:4: otherlv_2= '[' ( (lv_min_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_max_5_0= RULE_INT ) )? otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalDataDescriptionDsl.g:1504:4: ( (lv_min_3_0= RULE_INT ) )
                    // InternalDataDescriptionDsl.g:1505:5: (lv_min_3_0= RULE_INT )
                    {
                    // InternalDataDescriptionDsl.g:1505:5: (lv_min_3_0= RULE_INT )
                    // InternalDataDescriptionDsl.g:1506:6: lv_min_3_0= RULE_INT
                    {
                    lv_min_3_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    						newLeafNode(lv_min_3_0, grammarAccess.getReferenceAccess().getMinINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min",
                    							lv_min_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getCommaKeyword_2_2());
                    			
                    // InternalDataDescriptionDsl.g:1526:4: ( (lv_max_5_0= RULE_INT ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_INT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalDataDescriptionDsl.g:1527:5: (lv_max_5_0= RULE_INT )
                            {
                            // InternalDataDescriptionDsl.g:1527:5: (lv_max_5_0= RULE_INT )
                            // InternalDataDescriptionDsl.g:1528:6: lv_max_5_0= RULE_INT
                            {
                            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                            						newLeafNode(lv_max_5_0, grammarAccess.getReferenceAccess().getMaxINTTerminalRuleCall_2_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getReferenceRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"max",
                            							lv_max_5_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_4());
                    			

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


    // $ANTLR start "ruleFormatKind"
    // InternalDataDescriptionDsl.g:1553:1: ruleFormatKind returns [Enumerator current=null] : ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) ;
    public final Enumerator ruleFormatKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataDescriptionDsl.g:1559:2: ( ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) )
            // InternalDataDescriptionDsl.g:1560:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            {
            // InternalDataDescriptionDsl.g:1560:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt38=1;
                }
                break;
            case 34:
                {
                alt38=2;
                }
                break;
            case 35:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1561:3: (enumLiteral_0= 'CSV' )
                    {
                    // InternalDataDescriptionDsl.g:1561:3: (enumLiteral_0= 'CSV' )
                    // InternalDataDescriptionDsl.g:1562:4: enumLiteral_0= 'CSV'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:1569:3: (enumLiteral_1= 'JSON' )
                    {
                    // InternalDataDescriptionDsl.g:1569:3: (enumLiteral_1= 'JSON' )
                    // InternalDataDescriptionDsl.g:1570:4: enumLiteral_1= 'JSON'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDescriptionDsl.g:1577:3: (enumLiteral_2= 'XML' )
                    {
                    // InternalDataDescriptionDsl.g:1577:3: (enumLiteral_2= 'XML' )
                    // InternalDataDescriptionDsl.g:1578:4: enumLiteral_2= 'XML'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

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
    // InternalDataDescriptionDsl.g:1588:1: ruleTypeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) ) ;
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
            // InternalDataDescriptionDsl.g:1594:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) ) )
            // InternalDataDescriptionDsl.g:1595:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) )
            {
            // InternalDataDescriptionDsl.g:1595:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'numeral' ) | (enumLiteral_2= 'date' ) | (enumLiteral_3= 'time' ) | (enumLiteral_4= 'year' ) | (enumLiteral_5= 'month' ) | (enumLiteral_6= 'day' ) | (enumLiteral_7= 'boolean' ) | (enumLiteral_8= 'place' ) | (enumLiteral_9= 'latitude' ) | (enumLiteral_10= 'longitude' ) | (enumLiteral_11= 'UTMe' ) | (enumLiteral_12= 'UTMn' ) | (enumLiteral_13= 'UTMz' ) | (enumLiteral_14= 'UTMHemi' ) | (enumLiteral_15= 'name' ) | (enumLiteral_16= 'familyname' ) | (enumLiteral_17= 'personalID' ) )
            int alt39=18;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt39=1;
                }
                break;
            case 37:
                {
                alt39=2;
                }
                break;
            case 38:
                {
                alt39=3;
                }
                break;
            case 39:
                {
                alt39=4;
                }
                break;
            case 40:
                {
                alt39=5;
                }
                break;
            case 41:
                {
                alt39=6;
                }
                break;
            case 42:
                {
                alt39=7;
                }
                break;
            case 43:
                {
                alt39=8;
                }
                break;
            case 44:
                {
                alt39=9;
                }
                break;
            case 45:
                {
                alt39=10;
                }
                break;
            case 46:
                {
                alt39=11;
                }
                break;
            case 47:
                {
                alt39=12;
                }
                break;
            case 48:
                {
                alt39=13;
                }
                break;
            case 49:
                {
                alt39=14;
                }
                break;
            case 50:
                {
                alt39=15;
                }
                break;
            case 51:
                {
                alt39=16;
                }
                break;
            case 52:
                {
                alt39=17;
                }
                break;
            case 53:
                {
                alt39=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1596:3: (enumLiteral_0= 'string' )
                    {
                    // InternalDataDescriptionDsl.g:1596:3: (enumLiteral_0= 'string' )
                    // InternalDataDescriptionDsl.g:1597:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:1604:3: (enumLiteral_1= 'numeral' )
                    {
                    // InternalDataDescriptionDsl.g:1604:3: (enumLiteral_1= 'numeral' )
                    // InternalDataDescriptionDsl.g:1605:4: enumLiteral_1= 'numeral'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDescriptionDsl.g:1612:3: (enumLiteral_2= 'date' )
                    {
                    // InternalDataDescriptionDsl.g:1612:3: (enumLiteral_2= 'date' )
                    // InternalDataDescriptionDsl.g:1613:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDescriptionDsl.g:1620:3: (enumLiteral_3= 'time' )
                    {
                    // InternalDataDescriptionDsl.g:1620:3: (enumLiteral_3= 'time' )
                    // InternalDataDescriptionDsl.g:1621:4: enumLiteral_3= 'time'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDescriptionDsl.g:1628:3: (enumLiteral_4= 'year' )
                    {
                    // InternalDataDescriptionDsl.g:1628:3: (enumLiteral_4= 'year' )
                    // InternalDataDescriptionDsl.g:1629:4: enumLiteral_4= 'year'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDescriptionDsl.g:1636:3: (enumLiteral_5= 'month' )
                    {
                    // InternalDataDescriptionDsl.g:1636:3: (enumLiteral_5= 'month' )
                    // InternalDataDescriptionDsl.g:1637:4: enumLiteral_5= 'month'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDescriptionDsl.g:1644:3: (enumLiteral_6= 'day' )
                    {
                    // InternalDataDescriptionDsl.g:1644:3: (enumLiteral_6= 'day' )
                    // InternalDataDescriptionDsl.g:1645:4: enumLiteral_6= 'day'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDescriptionDsl.g:1652:3: (enumLiteral_7= 'boolean' )
                    {
                    // InternalDataDescriptionDsl.g:1652:3: (enumLiteral_7= 'boolean' )
                    // InternalDataDescriptionDsl.g:1653:4: enumLiteral_7= 'boolean'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDescriptionDsl.g:1660:3: (enumLiteral_8= 'place' )
                    {
                    // InternalDataDescriptionDsl.g:1660:3: (enumLiteral_8= 'place' )
                    // InternalDataDescriptionDsl.g:1661:4: enumLiteral_8= 'place'
                    {
                    enumLiteral_8=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDescriptionDsl.g:1668:3: (enumLiteral_9= 'latitude' )
                    {
                    // InternalDataDescriptionDsl.g:1668:3: (enumLiteral_9= 'latitude' )
                    // InternalDataDescriptionDsl.g:1669:4: enumLiteral_9= 'latitude'
                    {
                    enumLiteral_9=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDescriptionDsl.g:1676:3: (enumLiteral_10= 'longitude' )
                    {
                    // InternalDataDescriptionDsl.g:1676:3: (enumLiteral_10= 'longitude' )
                    // InternalDataDescriptionDsl.g:1677:4: enumLiteral_10= 'longitude'
                    {
                    enumLiteral_10=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDescriptionDsl.g:1684:3: (enumLiteral_11= 'UTMe' )
                    {
                    // InternalDataDescriptionDsl.g:1684:3: (enumLiteral_11= 'UTMe' )
                    // InternalDataDescriptionDsl.g:1685:4: enumLiteral_11= 'UTMe'
                    {
                    enumLiteral_11=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDescriptionDsl.g:1692:3: (enumLiteral_12= 'UTMn' )
                    {
                    // InternalDataDescriptionDsl.g:1692:3: (enumLiteral_12= 'UTMn' )
                    // InternalDataDescriptionDsl.g:1693:4: enumLiteral_12= 'UTMn'
                    {
                    enumLiteral_12=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDescriptionDsl.g:1700:3: (enumLiteral_13= 'UTMz' )
                    {
                    // InternalDataDescriptionDsl.g:1700:3: (enumLiteral_13= 'UTMz' )
                    // InternalDataDescriptionDsl.g:1701:4: enumLiteral_13= 'UTMz'
                    {
                    enumLiteral_13=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDescriptionDsl.g:1708:3: (enumLiteral_14= 'UTMHemi' )
                    {
                    // InternalDataDescriptionDsl.g:1708:3: (enumLiteral_14= 'UTMHemi' )
                    // InternalDataDescriptionDsl.g:1709:4: enumLiteral_14= 'UTMHemi'
                    {
                    enumLiteral_14=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDescriptionDsl.g:1716:3: (enumLiteral_15= 'name' )
                    {
                    // InternalDataDescriptionDsl.g:1716:3: (enumLiteral_15= 'name' )
                    // InternalDataDescriptionDsl.g:1717:4: enumLiteral_15= 'name'
                    {
                    enumLiteral_15=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDescriptionDsl.g:1724:3: (enumLiteral_16= 'familyname' )
                    {
                    // InternalDataDescriptionDsl.g:1724:3: (enumLiteral_16= 'familyname' )
                    // InternalDataDescriptionDsl.g:1725:4: enumLiteral_16= 'familyname'
                    {
                    enumLiteral_16=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDescriptionDsl.g:1732:3: (enumLiteral_17= 'personalID' )
                    {
                    // InternalDataDescriptionDsl.g:1732:3: (enumLiteral_17= 'personalID' )
                    // InternalDataDescriptionDsl.g:1733:4: enumLiteral_17= 'personalID'
                    {
                    enumLiteral_17=(Token)match(input,53,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000E00000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000031000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x003FFFF106204030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x003FFFF106200030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000420010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x003FFFF107200030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});

}