package uam.eagledata.dsl.annotations.ide.contentassist.antlr.internal;

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
import uam.eagledata.dsl.annotations.services.AnnotationsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'<'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAnnotationsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnnotationsDsl.g"; }


    	private AnnotationsDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(AnnotationsDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRepositoryManager"
    // InternalAnnotationsDsl.g:53:1: entryRuleRepositoryManager : ruleRepositoryManager EOF ;
    public final void entryRuleRepositoryManager() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:54:1: ( ruleRepositoryManager EOF )
            // InternalAnnotationsDsl.g:55:1: ruleRepositoryManager EOF
            {
             before(grammarAccess.getRepositoryManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleRepositoryManager();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerRule()); 
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
    // $ANTLR end "entryRuleRepositoryManager"


    // $ANTLR start "ruleRepositoryManager"
    // InternalAnnotationsDsl.g:62:1: ruleRepositoryManager : ( ( rule__RepositoryManager__Group__0 ) ) ;
    public final void ruleRepositoryManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:66:2: ( ( ( rule__RepositoryManager__Group__0 ) ) )
            // InternalAnnotationsDsl.g:67:2: ( ( rule__RepositoryManager__Group__0 ) )
            {
            // InternalAnnotationsDsl.g:67:2: ( ( rule__RepositoryManager__Group__0 ) )
            // InternalAnnotationsDsl.g:68:3: ( rule__RepositoryManager__Group__0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup()); 
            // InternalAnnotationsDsl.g:69:3: ( rule__RepositoryManager__Group__0 )
            // InternalAnnotationsDsl.g:69:4: rule__RepositoryManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepositoryManager"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAnnotationsDsl.g:78:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:79:1: ( ruleAnnotation EOF )
            // InternalAnnotationsDsl.g:80:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalAnnotationsDsl.g:87:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:91:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // InternalAnnotationsDsl.g:92:2: ( ( rule__Annotation__Alternatives ) )
            {
            // InternalAnnotationsDsl.g:92:2: ( ( rule__Annotation__Alternatives ) )
            // InternalAnnotationsDsl.g:93:3: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // InternalAnnotationsDsl.g:94:3: ( rule__Annotation__Alternatives )
            // InternalAnnotationsDsl.g:94:4: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleSimpleAnnotation"
    // InternalAnnotationsDsl.g:103:1: entryRuleSimpleAnnotation : ruleSimpleAnnotation EOF ;
    public final void entryRuleSimpleAnnotation() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:104:1: ( ruleSimpleAnnotation EOF )
            // InternalAnnotationsDsl.g:105:1: ruleSimpleAnnotation EOF
            {
             before(grammarAccess.getSimpleAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleAnnotation();

            state._fsp--;

             after(grammarAccess.getSimpleAnnotationRule()); 
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
    // $ANTLR end "entryRuleSimpleAnnotation"


    // $ANTLR start "ruleSimpleAnnotation"
    // InternalAnnotationsDsl.g:112:1: ruleSimpleAnnotation : ( ( rule__SimpleAnnotation__Group__0 ) ) ;
    public final void ruleSimpleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:116:2: ( ( ( rule__SimpleAnnotation__Group__0 ) ) )
            // InternalAnnotationsDsl.g:117:2: ( ( rule__SimpleAnnotation__Group__0 ) )
            {
            // InternalAnnotationsDsl.g:117:2: ( ( rule__SimpleAnnotation__Group__0 ) )
            // InternalAnnotationsDsl.g:118:3: ( rule__SimpleAnnotation__Group__0 )
            {
             before(grammarAccess.getSimpleAnnotationAccess().getGroup()); 
            // InternalAnnotationsDsl.g:119:3: ( rule__SimpleAnnotation__Group__0 )
            // InternalAnnotationsDsl.g:119:4: rule__SimpleAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAnnotation"


    // $ANTLR start "entryRuleAnnotationHierarchy"
    // InternalAnnotationsDsl.g:128:1: entryRuleAnnotationHierarchy : ruleAnnotationHierarchy EOF ;
    public final void entryRuleAnnotationHierarchy() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:129:1: ( ruleAnnotationHierarchy EOF )
            // InternalAnnotationsDsl.g:130:1: ruleAnnotationHierarchy EOF
            {
             before(grammarAccess.getAnnotationHierarchyRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationHierarchy();

            state._fsp--;

             after(grammarAccess.getAnnotationHierarchyRule()); 
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
    // $ANTLR end "entryRuleAnnotationHierarchy"


    // $ANTLR start "ruleAnnotationHierarchy"
    // InternalAnnotationsDsl.g:137:1: ruleAnnotationHierarchy : ( ( rule__AnnotationHierarchy__Group__0 ) ) ;
    public final void ruleAnnotationHierarchy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:141:2: ( ( ( rule__AnnotationHierarchy__Group__0 ) ) )
            // InternalAnnotationsDsl.g:142:2: ( ( rule__AnnotationHierarchy__Group__0 ) )
            {
            // InternalAnnotationsDsl.g:142:2: ( ( rule__AnnotationHierarchy__Group__0 ) )
            // InternalAnnotationsDsl.g:143:3: ( rule__AnnotationHierarchy__Group__0 )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getGroup()); 
            // InternalAnnotationsDsl.g:144:3: ( rule__AnnotationHierarchy__Group__0 )
            // InternalAnnotationsDsl.g:144:4: rule__AnnotationHierarchy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationHierarchyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationHierarchy"


    // $ANTLR start "entryRuleAnnotationInstance"
    // InternalAnnotationsDsl.g:153:1: entryRuleAnnotationInstance : ruleAnnotationInstance EOF ;
    public final void entryRuleAnnotationInstance() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:154:1: ( ruleAnnotationInstance EOF )
            // InternalAnnotationsDsl.g:155:1: ruleAnnotationInstance EOF
            {
             before(grammarAccess.getAnnotationInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationInstance();

            state._fsp--;

             after(grammarAccess.getAnnotationInstanceRule()); 
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
    // $ANTLR end "entryRuleAnnotationInstance"


    // $ANTLR start "ruleAnnotationInstance"
    // InternalAnnotationsDsl.g:162:1: ruleAnnotationInstance : ( ( rule__AnnotationInstance__Group__0 ) ) ;
    public final void ruleAnnotationInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:166:2: ( ( ( rule__AnnotationInstance__Group__0 ) ) )
            // InternalAnnotationsDsl.g:167:2: ( ( rule__AnnotationInstance__Group__0 ) )
            {
            // InternalAnnotationsDsl.g:167:2: ( ( rule__AnnotationInstance__Group__0 ) )
            // InternalAnnotationsDsl.g:168:3: ( rule__AnnotationInstance__Group__0 )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getGroup()); 
            // InternalAnnotationsDsl.g:169:3: ( rule__AnnotationInstance__Group__0 )
            // InternalAnnotationsDsl.g:169:4: rule__AnnotationInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationInstance"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAnnotationsDsl.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAnnotationsDsl.g:179:1: ( ruleQualifiedName EOF )
            // InternalAnnotationsDsl.g:180:1: ruleQualifiedName EOF
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
    // InternalAnnotationsDsl.g:187:1: ruleQualifiedName : ( RULE_ID ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:191:2: ( ( RULE_ID ) )
            // InternalAnnotationsDsl.g:192:2: ( RULE_ID )
            {
            // InternalAnnotationsDsl.g:192:2: ( RULE_ID )
            // InternalAnnotationsDsl.g:193:3: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // InternalAnnotationsDsl.g:202:1: rule__Annotation__Alternatives : ( ( ruleSimpleAnnotation ) | ( ruleAnnotationHierarchy ) | ( ruleAnnotationInstance ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:206:1: ( ( ruleSimpleAnnotation ) | ( ruleAnnotationHierarchy ) | ( ruleAnnotationInstance ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 13:
                        {
                        alt1=3;
                        }
                        break;
                    case EOF:
                    case 11:
                        {
                        alt1=1;
                        }
                        break;
                    case 12:
                        {
                        alt1=2;
                        }
                        break;
                    default:
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
                    // InternalAnnotationsDsl.g:207:2: ( ruleSimpleAnnotation )
                    {
                    // InternalAnnotationsDsl.g:207:2: ( ruleSimpleAnnotation )
                    // InternalAnnotationsDsl.g:208:3: ruleSimpleAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getSimpleAnnotationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getSimpleAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotationsDsl.g:213:2: ( ruleAnnotationHierarchy )
                    {
                    // InternalAnnotationsDsl.g:213:2: ( ruleAnnotationHierarchy )
                    // InternalAnnotationsDsl.g:214:3: ruleAnnotationHierarchy
                    {
                     before(grammarAccess.getAnnotationAccess().getAnnotationHierarchyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnnotationHierarchy();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getAnnotationHierarchyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotationsDsl.g:219:2: ( ruleAnnotationInstance )
                    {
                    // InternalAnnotationsDsl.g:219:2: ( ruleAnnotationInstance )
                    // InternalAnnotationsDsl.g:220:3: ruleAnnotationInstance
                    {
                     before(grammarAccess.getAnnotationAccess().getAnnotationInstanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnnotationInstance();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getAnnotationInstanceParserRuleCall_2()); 

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
    // $ANTLR end "rule__Annotation__Alternatives"


    // $ANTLR start "rule__RepositoryManager__Group__0"
    // InternalAnnotationsDsl.g:229:1: rule__RepositoryManager__Group__0 : rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 ;
    public final void rule__RepositoryManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:233:1: ( rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 )
            // InternalAnnotationsDsl.g:234:2: rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__1();

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
    // $ANTLR end "rule__RepositoryManager__Group__0"


    // $ANTLR start "rule__RepositoryManager__Group__0__Impl"
    // InternalAnnotationsDsl.g:241:1: rule__RepositoryManager__Group__0__Impl : ( () ) ;
    public final void rule__RepositoryManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:245:1: ( ( () ) )
            // InternalAnnotationsDsl.g:246:1: ( () )
            {
            // InternalAnnotationsDsl.g:246:1: ( () )
            // InternalAnnotationsDsl.g:247:2: ()
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 
            // InternalAnnotationsDsl.g:248:2: ()
            // InternalAnnotationsDsl.g:248:3: 
            {
            }

             after(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group__1"
    // InternalAnnotationsDsl.g:256:1: rule__RepositoryManager__Group__1 : rule__RepositoryManager__Group__1__Impl ;
    public final void rule__RepositoryManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:260:1: ( rule__RepositoryManager__Group__1__Impl )
            // InternalAnnotationsDsl.g:261:2: rule__RepositoryManager__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__1__Impl();

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
    // $ANTLR end "rule__RepositoryManager__Group__1"


    // $ANTLR start "rule__RepositoryManager__Group__1__Impl"
    // InternalAnnotationsDsl.g:267:1: rule__RepositoryManager__Group__1__Impl : ( ( rule__RepositoryManager__Group_1__0 )? ) ;
    public final void rule__RepositoryManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:271:1: ( ( ( rule__RepositoryManager__Group_1__0 )? ) )
            // InternalAnnotationsDsl.g:272:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            {
            // InternalAnnotationsDsl.g:272:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            // InternalAnnotationsDsl.g:273:2: ( rule__RepositoryManager__Group_1__0 )?
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 
            // InternalAnnotationsDsl.g:274:2: ( rule__RepositoryManager__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAnnotationsDsl.g:274:3: rule__RepositoryManager__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepositoryManager__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__1__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1__0"
    // InternalAnnotationsDsl.g:283:1: rule__RepositoryManager__Group_1__0 : rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 ;
    public final void rule__RepositoryManager__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:287:1: ( rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 )
            // InternalAnnotationsDsl.g:288:2: rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryManager__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__1();

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
    // $ANTLR end "rule__RepositoryManager__Group_1__0"


    // $ANTLR start "rule__RepositoryManager__Group_1__0__Impl"
    // InternalAnnotationsDsl.g:295:1: rule__RepositoryManager__Group_1__0__Impl : ( ( rule__RepositoryManager__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__RepositoryManager__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:299:1: ( ( ( rule__RepositoryManager__AnnotationsAssignment_1_0 ) ) )
            // InternalAnnotationsDsl.g:300:1: ( ( rule__RepositoryManager__AnnotationsAssignment_1_0 ) )
            {
            // InternalAnnotationsDsl.g:300:1: ( ( rule__RepositoryManager__AnnotationsAssignment_1_0 ) )
            // InternalAnnotationsDsl.g:301:2: ( rule__RepositoryManager__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_0()); 
            // InternalAnnotationsDsl.g:302:2: ( rule__RepositoryManager__AnnotationsAssignment_1_0 )
            // InternalAnnotationsDsl.g:302:3: rule__RepositoryManager__AnnotationsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1__1"
    // InternalAnnotationsDsl.g:310:1: rule__RepositoryManager__Group_1__1 : rule__RepositoryManager__Group_1__1__Impl ;
    public final void rule__RepositoryManager__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:314:1: ( rule__RepositoryManager__Group_1__1__Impl )
            // InternalAnnotationsDsl.g:315:2: rule__RepositoryManager__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__1__Impl();

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
    // $ANTLR end "rule__RepositoryManager__Group_1__1"


    // $ANTLR start "rule__RepositoryManager__Group_1__1__Impl"
    // InternalAnnotationsDsl.g:321:1: rule__RepositoryManager__Group_1__1__Impl : ( ( rule__RepositoryManager__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__RepositoryManager__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:325:1: ( ( ( rule__RepositoryManager__AnnotationsAssignment_1_1 )* ) )
            // InternalAnnotationsDsl.g:326:1: ( ( rule__RepositoryManager__AnnotationsAssignment_1_1 )* )
            {
            // InternalAnnotationsDsl.g:326:1: ( ( rule__RepositoryManager__AnnotationsAssignment_1_1 )* )
            // InternalAnnotationsDsl.g:327:2: ( rule__RepositoryManager__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_1()); 
            // InternalAnnotationsDsl.g:328:2: ( rule__RepositoryManager__AnnotationsAssignment_1_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAnnotationsDsl.g:328:3: rule__RepositoryManager__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RepositoryManager__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleAnnotation__Group__0"
    // InternalAnnotationsDsl.g:337:1: rule__SimpleAnnotation__Group__0 : rule__SimpleAnnotation__Group__0__Impl rule__SimpleAnnotation__Group__1 ;
    public final void rule__SimpleAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:341:1: ( rule__SimpleAnnotation__Group__0__Impl rule__SimpleAnnotation__Group__1 )
            // InternalAnnotationsDsl.g:342:2: rule__SimpleAnnotation__Group__0__Impl rule__SimpleAnnotation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SimpleAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAnnotation__Group__1();

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
    // $ANTLR end "rule__SimpleAnnotation__Group__0"


    // $ANTLR start "rule__SimpleAnnotation__Group__0__Impl"
    // InternalAnnotationsDsl.g:349:1: rule__SimpleAnnotation__Group__0__Impl : ( () ) ;
    public final void rule__SimpleAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:353:1: ( ( () ) )
            // InternalAnnotationsDsl.g:354:1: ( () )
            {
            // InternalAnnotationsDsl.g:354:1: ( () )
            // InternalAnnotationsDsl.g:355:2: ()
            {
             before(grammarAccess.getSimpleAnnotationAccess().getAnnotationAction_0()); 
            // InternalAnnotationsDsl.g:356:2: ()
            // InternalAnnotationsDsl.g:356:3: 
            {
            }

             after(grammarAccess.getSimpleAnnotationAccess().getAnnotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnnotation__Group__0__Impl"


    // $ANTLR start "rule__SimpleAnnotation__Group__1"
    // InternalAnnotationsDsl.g:364:1: rule__SimpleAnnotation__Group__1 : rule__SimpleAnnotation__Group__1__Impl rule__SimpleAnnotation__Group__2 ;
    public final void rule__SimpleAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:368:1: ( rule__SimpleAnnotation__Group__1__Impl rule__SimpleAnnotation__Group__2 )
            // InternalAnnotationsDsl.g:369:2: rule__SimpleAnnotation__Group__1__Impl rule__SimpleAnnotation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SimpleAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAnnotation__Group__2();

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
    // $ANTLR end "rule__SimpleAnnotation__Group__1"


    // $ANTLR start "rule__SimpleAnnotation__Group__1__Impl"
    // InternalAnnotationsDsl.g:376:1: rule__SimpleAnnotation__Group__1__Impl : ( '@' ) ;
    public final void rule__SimpleAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:380:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:381:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:381:1: ( '@' )
            // InternalAnnotationsDsl.g:382:2: '@'
            {
             before(grammarAccess.getSimpleAnnotationAccess().getCommercialAtKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSimpleAnnotationAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnnotation__Group__1__Impl"


    // $ANTLR start "rule__SimpleAnnotation__Group__2"
    // InternalAnnotationsDsl.g:391:1: rule__SimpleAnnotation__Group__2 : rule__SimpleAnnotation__Group__2__Impl ;
    public final void rule__SimpleAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:395:1: ( rule__SimpleAnnotation__Group__2__Impl )
            // InternalAnnotationsDsl.g:396:2: rule__SimpleAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAnnotation__Group__2__Impl();

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
    // $ANTLR end "rule__SimpleAnnotation__Group__2"


    // $ANTLR start "rule__SimpleAnnotation__Group__2__Impl"
    // InternalAnnotationsDsl.g:402:1: rule__SimpleAnnotation__Group__2__Impl : ( ( rule__SimpleAnnotation__NameAssignment_2 ) ) ;
    public final void rule__SimpleAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:406:1: ( ( ( rule__SimpleAnnotation__NameAssignment_2 ) ) )
            // InternalAnnotationsDsl.g:407:1: ( ( rule__SimpleAnnotation__NameAssignment_2 ) )
            {
            // InternalAnnotationsDsl.g:407:1: ( ( rule__SimpleAnnotation__NameAssignment_2 ) )
            // InternalAnnotationsDsl.g:408:2: ( rule__SimpleAnnotation__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAnnotationAccess().getNameAssignment_2()); 
            // InternalAnnotationsDsl.g:409:2: ( rule__SimpleAnnotation__NameAssignment_2 )
            // InternalAnnotationsDsl.g:409:3: rule__SimpleAnnotation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAnnotation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnnotationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnnotation__Group__2__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group__0"
    // InternalAnnotationsDsl.g:418:1: rule__AnnotationHierarchy__Group__0 : rule__AnnotationHierarchy__Group__0__Impl rule__AnnotationHierarchy__Group__1 ;
    public final void rule__AnnotationHierarchy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:422:1: ( rule__AnnotationHierarchy__Group__0__Impl rule__AnnotationHierarchy__Group__1 )
            // InternalAnnotationsDsl.g:423:2: rule__AnnotationHierarchy__Group__0__Impl rule__AnnotationHierarchy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationHierarchy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group__1();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group__0"


    // $ANTLR start "rule__AnnotationHierarchy__Group__0__Impl"
    // InternalAnnotationsDsl.g:430:1: rule__AnnotationHierarchy__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationHierarchy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:434:1: ( ( () ) )
            // InternalAnnotationsDsl.g:435:1: ( () )
            {
            // InternalAnnotationsDsl.g:435:1: ( () )
            // InternalAnnotationsDsl.g:436:2: ()
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getAnnotationAction_0()); 
            // InternalAnnotationsDsl.g:437:2: ()
            // InternalAnnotationsDsl.g:437:3: 
            {
            }

             after(grammarAccess.getAnnotationHierarchyAccess().getAnnotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group__0__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group__1"
    // InternalAnnotationsDsl.g:445:1: rule__AnnotationHierarchy__Group__1 : rule__AnnotationHierarchy__Group__1__Impl rule__AnnotationHierarchy__Group__2 ;
    public final void rule__AnnotationHierarchy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:449:1: ( rule__AnnotationHierarchy__Group__1__Impl rule__AnnotationHierarchy__Group__2 )
            // InternalAnnotationsDsl.g:450:2: rule__AnnotationHierarchy__Group__1__Impl rule__AnnotationHierarchy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationHierarchy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group__2();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group__1"


    // $ANTLR start "rule__AnnotationHierarchy__Group__1__Impl"
    // InternalAnnotationsDsl.g:457:1: rule__AnnotationHierarchy__Group__1__Impl : ( '@' ) ;
    public final void rule__AnnotationHierarchy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:461:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:462:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:462:1: ( '@' )
            // InternalAnnotationsDsl.g:463:2: '@'
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group__1__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group__2"
    // InternalAnnotationsDsl.g:472:1: rule__AnnotationHierarchy__Group__2 : rule__AnnotationHierarchy__Group__2__Impl rule__AnnotationHierarchy__Group__3 ;
    public final void rule__AnnotationHierarchy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:476:1: ( rule__AnnotationHierarchy__Group__2__Impl rule__AnnotationHierarchy__Group__3 )
            // InternalAnnotationsDsl.g:477:2: rule__AnnotationHierarchy__Group__2__Impl rule__AnnotationHierarchy__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AnnotationHierarchy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group__3();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group__2"


    // $ANTLR start "rule__AnnotationHierarchy__Group__2__Impl"
    // InternalAnnotationsDsl.g:484:1: rule__AnnotationHierarchy__Group__2__Impl : ( ( rule__AnnotationHierarchy__NameAssignment_2 ) ) ;
    public final void rule__AnnotationHierarchy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:488:1: ( ( ( rule__AnnotationHierarchy__NameAssignment_2 ) ) )
            // InternalAnnotationsDsl.g:489:1: ( ( rule__AnnotationHierarchy__NameAssignment_2 ) )
            {
            // InternalAnnotationsDsl.g:489:1: ( ( rule__AnnotationHierarchy__NameAssignment_2 ) )
            // InternalAnnotationsDsl.g:490:2: ( rule__AnnotationHierarchy__NameAssignment_2 )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getNameAssignment_2()); 
            // InternalAnnotationsDsl.g:491:2: ( rule__AnnotationHierarchy__NameAssignment_2 )
            // InternalAnnotationsDsl.g:491:3: rule__AnnotationHierarchy__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationHierarchyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group__2__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group__3"
    // InternalAnnotationsDsl.g:499:1: rule__AnnotationHierarchy__Group__3 : rule__AnnotationHierarchy__Group__3__Impl ;
    public final void rule__AnnotationHierarchy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:503:1: ( rule__AnnotationHierarchy__Group__3__Impl )
            // InternalAnnotationsDsl.g:504:2: rule__AnnotationHierarchy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group__3__Impl();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group__3"


    // $ANTLR start "rule__AnnotationHierarchy__Group__3__Impl"
    // InternalAnnotationsDsl.g:510:1: rule__AnnotationHierarchy__Group__3__Impl : ( ( rule__AnnotationHierarchy__Group_3__0 ) ) ;
    public final void rule__AnnotationHierarchy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:514:1: ( ( ( rule__AnnotationHierarchy__Group_3__0 ) ) )
            // InternalAnnotationsDsl.g:515:1: ( ( rule__AnnotationHierarchy__Group_3__0 ) )
            {
            // InternalAnnotationsDsl.g:515:1: ( ( rule__AnnotationHierarchy__Group_3__0 ) )
            // InternalAnnotationsDsl.g:516:2: ( rule__AnnotationHierarchy__Group_3__0 )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getGroup_3()); 
            // InternalAnnotationsDsl.g:517:2: ( rule__AnnotationHierarchy__Group_3__0 )
            // InternalAnnotationsDsl.g:517:3: rule__AnnotationHierarchy__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationHierarchyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group__3__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__0"
    // InternalAnnotationsDsl.g:526:1: rule__AnnotationHierarchy__Group_3__0 : rule__AnnotationHierarchy__Group_3__0__Impl rule__AnnotationHierarchy__Group_3__1 ;
    public final void rule__AnnotationHierarchy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:530:1: ( rule__AnnotationHierarchy__Group_3__0__Impl rule__AnnotationHierarchy__Group_3__1 )
            // InternalAnnotationsDsl.g:531:2: rule__AnnotationHierarchy__Group_3__0__Impl rule__AnnotationHierarchy__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationHierarchy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3__1();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__0"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__0__Impl"
    // InternalAnnotationsDsl.g:538:1: rule__AnnotationHierarchy__Group_3__0__Impl : ( '<' ) ;
    public final void rule__AnnotationHierarchy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:542:1: ( ( '<' ) )
            // InternalAnnotationsDsl.g:543:1: ( '<' )
            {
            // InternalAnnotationsDsl.g:543:1: ( '<' )
            // InternalAnnotationsDsl.g:544:2: '<'
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__0__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__1"
    // InternalAnnotationsDsl.g:553:1: rule__AnnotationHierarchy__Group_3__1 : rule__AnnotationHierarchy__Group_3__1__Impl rule__AnnotationHierarchy__Group_3__2 ;
    public final void rule__AnnotationHierarchy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:557:1: ( rule__AnnotationHierarchy__Group_3__1__Impl rule__AnnotationHierarchy__Group_3__2 )
            // InternalAnnotationsDsl.g:558:2: rule__AnnotationHierarchy__Group_3__1__Impl rule__AnnotationHierarchy__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationHierarchy__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3__2();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__1"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__1__Impl"
    // InternalAnnotationsDsl.g:565:1: rule__AnnotationHierarchy__Group_3__1__Impl : ( '@' ) ;
    public final void rule__AnnotationHierarchy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:569:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:570:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:570:1: ( '@' )
            // InternalAnnotationsDsl.g:571:2: '@'
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__1__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__2"
    // InternalAnnotationsDsl.g:580:1: rule__AnnotationHierarchy__Group_3__2 : rule__AnnotationHierarchy__Group_3__2__Impl rule__AnnotationHierarchy__Group_3__3 ;
    public final void rule__AnnotationHierarchy__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:584:1: ( rule__AnnotationHierarchy__Group_3__2__Impl rule__AnnotationHierarchy__Group_3__3 )
            // InternalAnnotationsDsl.g:585:2: rule__AnnotationHierarchy__Group_3__2__Impl rule__AnnotationHierarchy__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__AnnotationHierarchy__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3__3();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__2"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__2__Impl"
    // InternalAnnotationsDsl.g:592:1: rule__AnnotationHierarchy__Group_3__2__Impl : ( ( rule__AnnotationHierarchy__SupersAssignment_3_2 ) ) ;
    public final void rule__AnnotationHierarchy__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:596:1: ( ( ( rule__AnnotationHierarchy__SupersAssignment_3_2 ) ) )
            // InternalAnnotationsDsl.g:597:1: ( ( rule__AnnotationHierarchy__SupersAssignment_3_2 ) )
            {
            // InternalAnnotationsDsl.g:597:1: ( ( rule__AnnotationHierarchy__SupersAssignment_3_2 ) )
            // InternalAnnotationsDsl.g:598:2: ( rule__AnnotationHierarchy__SupersAssignment_3_2 )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_2()); 
            // InternalAnnotationsDsl.g:599:2: ( rule__AnnotationHierarchy__SupersAssignment_3_2 )
            // InternalAnnotationsDsl.g:599:3: rule__AnnotationHierarchy__SupersAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__SupersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__2__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__3"
    // InternalAnnotationsDsl.g:607:1: rule__AnnotationHierarchy__Group_3__3 : rule__AnnotationHierarchy__Group_3__3__Impl ;
    public final void rule__AnnotationHierarchy__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:611:1: ( rule__AnnotationHierarchy__Group_3__3__Impl )
            // InternalAnnotationsDsl.g:612:2: rule__AnnotationHierarchy__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3__3__Impl();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__3"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3__3__Impl"
    // InternalAnnotationsDsl.g:618:1: rule__AnnotationHierarchy__Group_3__3__Impl : ( ( rule__AnnotationHierarchy__Group_3_3__0 )* ) ;
    public final void rule__AnnotationHierarchy__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:622:1: ( ( ( rule__AnnotationHierarchy__Group_3_3__0 )* ) )
            // InternalAnnotationsDsl.g:623:1: ( ( rule__AnnotationHierarchy__Group_3_3__0 )* )
            {
            // InternalAnnotationsDsl.g:623:1: ( ( rule__AnnotationHierarchy__Group_3_3__0 )* )
            // InternalAnnotationsDsl.g:624:2: ( rule__AnnotationHierarchy__Group_3_3__0 )*
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getGroup_3_3()); 
            // InternalAnnotationsDsl.g:625:2: ( rule__AnnotationHierarchy__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotationsDsl.g:625:3: rule__AnnotationHierarchy__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AnnotationHierarchy__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAnnotationHierarchyAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3__3__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__0"
    // InternalAnnotationsDsl.g:634:1: rule__AnnotationHierarchy__Group_3_3__0 : rule__AnnotationHierarchy__Group_3_3__0__Impl rule__AnnotationHierarchy__Group_3_3__1 ;
    public final void rule__AnnotationHierarchy__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:638:1: ( rule__AnnotationHierarchy__Group_3_3__0__Impl rule__AnnotationHierarchy__Group_3_3__1 )
            // InternalAnnotationsDsl.g:639:2: rule__AnnotationHierarchy__Group_3_3__0__Impl rule__AnnotationHierarchy__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationHierarchy__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3_3__1();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__0"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__0__Impl"
    // InternalAnnotationsDsl.g:646:1: rule__AnnotationHierarchy__Group_3_3__0__Impl : ( '<' ) ;
    public final void rule__AnnotationHierarchy__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:650:1: ( ( '<' ) )
            // InternalAnnotationsDsl.g:651:1: ( '<' )
            {
            // InternalAnnotationsDsl.g:651:1: ( '<' )
            // InternalAnnotationsDsl.g:652:2: '<'
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__0__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__1"
    // InternalAnnotationsDsl.g:661:1: rule__AnnotationHierarchy__Group_3_3__1 : rule__AnnotationHierarchy__Group_3_3__1__Impl rule__AnnotationHierarchy__Group_3_3__2 ;
    public final void rule__AnnotationHierarchy__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:665:1: ( rule__AnnotationHierarchy__Group_3_3__1__Impl rule__AnnotationHierarchy__Group_3_3__2 )
            // InternalAnnotationsDsl.g:666:2: rule__AnnotationHierarchy__Group_3_3__1__Impl rule__AnnotationHierarchy__Group_3_3__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationHierarchy__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3_3__2();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__1"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__1__Impl"
    // InternalAnnotationsDsl.g:673:1: rule__AnnotationHierarchy__Group_3_3__1__Impl : ( '@' ) ;
    public final void rule__AnnotationHierarchy__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:677:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:678:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:678:1: ( '@' )
            // InternalAnnotationsDsl.g:679:2: '@'
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__1__Impl"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__2"
    // InternalAnnotationsDsl.g:688:1: rule__AnnotationHierarchy__Group_3_3__2 : rule__AnnotationHierarchy__Group_3_3__2__Impl ;
    public final void rule__AnnotationHierarchy__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:692:1: ( rule__AnnotationHierarchy__Group_3_3__2__Impl )
            // InternalAnnotationsDsl.g:693:2: rule__AnnotationHierarchy__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__2"


    // $ANTLR start "rule__AnnotationHierarchy__Group_3_3__2__Impl"
    // InternalAnnotationsDsl.g:699:1: rule__AnnotationHierarchy__Group_3_3__2__Impl : ( ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 ) ) ;
    public final void rule__AnnotationHierarchy__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:703:1: ( ( ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 ) ) )
            // InternalAnnotationsDsl.g:704:1: ( ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 ) )
            {
            // InternalAnnotationsDsl.g:704:1: ( ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 ) )
            // InternalAnnotationsDsl.g:705:2: ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_3_2()); 
            // InternalAnnotationsDsl.g:706:2: ( rule__AnnotationHierarchy__SupersAssignment_3_3_2 )
            // InternalAnnotationsDsl.g:706:3: rule__AnnotationHierarchy__SupersAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationHierarchy__SupersAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__Group_3_3__2__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__0"
    // InternalAnnotationsDsl.g:715:1: rule__AnnotationInstance__Group__0 : rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1 ;
    public final void rule__AnnotationInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:719:1: ( rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1 )
            // InternalAnnotationsDsl.g:720:2: rule__AnnotationInstance__Group__0__Impl rule__AnnotationInstance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group__1();

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
    // $ANTLR end "rule__AnnotationInstance__Group__0"


    // $ANTLR start "rule__AnnotationInstance__Group__0__Impl"
    // InternalAnnotationsDsl.g:727:1: rule__AnnotationInstance__Group__0__Impl : ( () ) ;
    public final void rule__AnnotationInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:731:1: ( ( () ) )
            // InternalAnnotationsDsl.g:732:1: ( () )
            {
            // InternalAnnotationsDsl.g:732:1: ( () )
            // InternalAnnotationsDsl.g:733:2: ()
            {
             before(grammarAccess.getAnnotationInstanceAccess().getAnnotationAction_0()); 
            // InternalAnnotationsDsl.g:734:2: ()
            // InternalAnnotationsDsl.g:734:3: 
            {
            }

             after(grammarAccess.getAnnotationInstanceAccess().getAnnotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group__0__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__1"
    // InternalAnnotationsDsl.g:742:1: rule__AnnotationInstance__Group__1 : rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2 ;
    public final void rule__AnnotationInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:746:1: ( rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2 )
            // InternalAnnotationsDsl.g:747:2: rule__AnnotationInstance__Group__1__Impl rule__AnnotationInstance__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group__2();

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
    // $ANTLR end "rule__AnnotationInstance__Group__1"


    // $ANTLR start "rule__AnnotationInstance__Group__1__Impl"
    // InternalAnnotationsDsl.g:754:1: rule__AnnotationInstance__Group__1__Impl : ( '@' ) ;
    public final void rule__AnnotationInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:758:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:759:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:759:1: ( '@' )
            // InternalAnnotationsDsl.g:760:2: '@'
            {
             before(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group__1__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__2"
    // InternalAnnotationsDsl.g:769:1: rule__AnnotationInstance__Group__2 : rule__AnnotationInstance__Group__2__Impl rule__AnnotationInstance__Group__3 ;
    public final void rule__AnnotationInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:773:1: ( rule__AnnotationInstance__Group__2__Impl rule__AnnotationInstance__Group__3 )
            // InternalAnnotationsDsl.g:774:2: rule__AnnotationInstance__Group__2__Impl rule__AnnotationInstance__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__AnnotationInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group__3();

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
    // $ANTLR end "rule__AnnotationInstance__Group__2"


    // $ANTLR start "rule__AnnotationInstance__Group__2__Impl"
    // InternalAnnotationsDsl.g:781:1: rule__AnnotationInstance__Group__2__Impl : ( ( rule__AnnotationInstance__NameAssignment_2 ) ) ;
    public final void rule__AnnotationInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:785:1: ( ( ( rule__AnnotationInstance__NameAssignment_2 ) ) )
            // InternalAnnotationsDsl.g:786:1: ( ( rule__AnnotationInstance__NameAssignment_2 ) )
            {
            // InternalAnnotationsDsl.g:786:1: ( ( rule__AnnotationInstance__NameAssignment_2 ) )
            // InternalAnnotationsDsl.g:787:2: ( rule__AnnotationInstance__NameAssignment_2 )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getNameAssignment_2()); 
            // InternalAnnotationsDsl.g:788:2: ( rule__AnnotationInstance__NameAssignment_2 )
            // InternalAnnotationsDsl.g:788:3: rule__AnnotationInstance__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInstanceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group__2__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group__3"
    // InternalAnnotationsDsl.g:796:1: rule__AnnotationInstance__Group__3 : rule__AnnotationInstance__Group__3__Impl ;
    public final void rule__AnnotationInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:800:1: ( rule__AnnotationInstance__Group__3__Impl )
            // InternalAnnotationsDsl.g:801:2: rule__AnnotationInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group__3__Impl();

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
    // $ANTLR end "rule__AnnotationInstance__Group__3"


    // $ANTLR start "rule__AnnotationInstance__Group__3__Impl"
    // InternalAnnotationsDsl.g:807:1: rule__AnnotationInstance__Group__3__Impl : ( ( rule__AnnotationInstance__Group_3__0 ) ) ;
    public final void rule__AnnotationInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:811:1: ( ( ( rule__AnnotationInstance__Group_3__0 ) ) )
            // InternalAnnotationsDsl.g:812:1: ( ( rule__AnnotationInstance__Group_3__0 ) )
            {
            // InternalAnnotationsDsl.g:812:1: ( ( rule__AnnotationInstance__Group_3__0 ) )
            // InternalAnnotationsDsl.g:813:2: ( rule__AnnotationInstance__Group_3__0 )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getGroup_3()); 
            // InternalAnnotationsDsl.g:814:2: ( rule__AnnotationInstance__Group_3__0 )
            // InternalAnnotationsDsl.g:814:3: rule__AnnotationInstance__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInstanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group__3__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3__0"
    // InternalAnnotationsDsl.g:823:1: rule__AnnotationInstance__Group_3__0 : rule__AnnotationInstance__Group_3__0__Impl rule__AnnotationInstance__Group_3__1 ;
    public final void rule__AnnotationInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:827:1: ( rule__AnnotationInstance__Group_3__0__Impl rule__AnnotationInstance__Group_3__1 )
            // InternalAnnotationsDsl.g:828:2: rule__AnnotationInstance__Group_3__0__Impl rule__AnnotationInstance__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationInstance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3__1();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3__0"


    // $ANTLR start "rule__AnnotationInstance__Group_3__0__Impl"
    // InternalAnnotationsDsl.g:835:1: rule__AnnotationInstance__Group_3__0__Impl : ( ':' ) ;
    public final void rule__AnnotationInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:839:1: ( ( ':' ) )
            // InternalAnnotationsDsl.g:840:1: ( ':' )
            {
            // InternalAnnotationsDsl.g:840:1: ( ':' )
            // InternalAnnotationsDsl.g:841:2: ':'
            {
             before(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3__0__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3__1"
    // InternalAnnotationsDsl.g:850:1: rule__AnnotationInstance__Group_3__1 : rule__AnnotationInstance__Group_3__1__Impl rule__AnnotationInstance__Group_3__2 ;
    public final void rule__AnnotationInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:854:1: ( rule__AnnotationInstance__Group_3__1__Impl rule__AnnotationInstance__Group_3__2 )
            // InternalAnnotationsDsl.g:855:2: rule__AnnotationInstance__Group_3__1__Impl rule__AnnotationInstance__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationInstance__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3__2();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3__1"


    // $ANTLR start "rule__AnnotationInstance__Group_3__1__Impl"
    // InternalAnnotationsDsl.g:862:1: rule__AnnotationInstance__Group_3__1__Impl : ( '@' ) ;
    public final void rule__AnnotationInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:866:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:867:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:867:1: ( '@' )
            // InternalAnnotationsDsl.g:868:2: '@'
            {
             before(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3__1__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3__2"
    // InternalAnnotationsDsl.g:877:1: rule__AnnotationInstance__Group_3__2 : rule__AnnotationInstance__Group_3__2__Impl rule__AnnotationInstance__Group_3__3 ;
    public final void rule__AnnotationInstance__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:881:1: ( rule__AnnotationInstance__Group_3__2__Impl rule__AnnotationInstance__Group_3__3 )
            // InternalAnnotationsDsl.g:882:2: rule__AnnotationInstance__Group_3__2__Impl rule__AnnotationInstance__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__AnnotationInstance__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3__3();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3__2"


    // $ANTLR start "rule__AnnotationInstance__Group_3__2__Impl"
    // InternalAnnotationsDsl.g:889:1: rule__AnnotationInstance__Group_3__2__Impl : ( ( rule__AnnotationInstance__DescriptorsAssignment_3_2 ) ) ;
    public final void rule__AnnotationInstance__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:893:1: ( ( ( rule__AnnotationInstance__DescriptorsAssignment_3_2 ) ) )
            // InternalAnnotationsDsl.g:894:1: ( ( rule__AnnotationInstance__DescriptorsAssignment_3_2 ) )
            {
            // InternalAnnotationsDsl.g:894:1: ( ( rule__AnnotationInstance__DescriptorsAssignment_3_2 ) )
            // InternalAnnotationsDsl.g:895:2: ( rule__AnnotationInstance__DescriptorsAssignment_3_2 )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_2()); 
            // InternalAnnotationsDsl.g:896:2: ( rule__AnnotationInstance__DescriptorsAssignment_3_2 )
            // InternalAnnotationsDsl.g:896:3: rule__AnnotationInstance__DescriptorsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__DescriptorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3__2__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3__3"
    // InternalAnnotationsDsl.g:904:1: rule__AnnotationInstance__Group_3__3 : rule__AnnotationInstance__Group_3__3__Impl ;
    public final void rule__AnnotationInstance__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:908:1: ( rule__AnnotationInstance__Group_3__3__Impl )
            // InternalAnnotationsDsl.g:909:2: rule__AnnotationInstance__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3__3__Impl();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3__3"


    // $ANTLR start "rule__AnnotationInstance__Group_3__3__Impl"
    // InternalAnnotationsDsl.g:915:1: rule__AnnotationInstance__Group_3__3__Impl : ( ( rule__AnnotationInstance__Group_3_3__0 )* ) ;
    public final void rule__AnnotationInstance__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:919:1: ( ( ( rule__AnnotationInstance__Group_3_3__0 )* ) )
            // InternalAnnotationsDsl.g:920:1: ( ( rule__AnnotationInstance__Group_3_3__0 )* )
            {
            // InternalAnnotationsDsl.g:920:1: ( ( rule__AnnotationInstance__Group_3_3__0 )* )
            // InternalAnnotationsDsl.g:921:2: ( rule__AnnotationInstance__Group_3_3__0 )*
            {
             before(grammarAccess.getAnnotationInstanceAccess().getGroup_3_3()); 
            // InternalAnnotationsDsl.g:922:2: ( rule__AnnotationInstance__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotationsDsl.g:922:3: rule__AnnotationInstance__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__AnnotationInstance__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAnnotationInstanceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3__3__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__0"
    // InternalAnnotationsDsl.g:931:1: rule__AnnotationInstance__Group_3_3__0 : rule__AnnotationInstance__Group_3_3__0__Impl rule__AnnotationInstance__Group_3_3__1 ;
    public final void rule__AnnotationInstance__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:935:1: ( rule__AnnotationInstance__Group_3_3__0__Impl rule__AnnotationInstance__Group_3_3__1 )
            // InternalAnnotationsDsl.g:936:2: rule__AnnotationInstance__Group_3_3__0__Impl rule__AnnotationInstance__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AnnotationInstance__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3_3__1();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__0"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__0__Impl"
    // InternalAnnotationsDsl.g:943:1: rule__AnnotationInstance__Group_3_3__0__Impl : ( ':' ) ;
    public final void rule__AnnotationInstance__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:947:1: ( ( ':' ) )
            // InternalAnnotationsDsl.g:948:1: ( ':' )
            {
            // InternalAnnotationsDsl.g:948:1: ( ':' )
            // InternalAnnotationsDsl.g:949:2: ':'
            {
             before(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__0__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__1"
    // InternalAnnotationsDsl.g:958:1: rule__AnnotationInstance__Group_3_3__1 : rule__AnnotationInstance__Group_3_3__1__Impl rule__AnnotationInstance__Group_3_3__2 ;
    public final void rule__AnnotationInstance__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:962:1: ( rule__AnnotationInstance__Group_3_3__1__Impl rule__AnnotationInstance__Group_3_3__2 )
            // InternalAnnotationsDsl.g:963:2: rule__AnnotationInstance__Group_3_3__1__Impl rule__AnnotationInstance__Group_3_3__2
            {
            pushFollow(FOLLOW_5);
            rule__AnnotationInstance__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3_3__2();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__1"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__1__Impl"
    // InternalAnnotationsDsl.g:970:1: rule__AnnotationInstance__Group_3_3__1__Impl : ( '@' ) ;
    public final void rule__AnnotationInstance__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:974:1: ( ( '@' ) )
            // InternalAnnotationsDsl.g:975:1: ( '@' )
            {
            // InternalAnnotationsDsl.g:975:1: ( '@' )
            // InternalAnnotationsDsl.g:976:2: '@'
            {
             before(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_3_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__1__Impl"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__2"
    // InternalAnnotationsDsl.g:985:1: rule__AnnotationInstance__Group_3_3__2 : rule__AnnotationInstance__Group_3_3__2__Impl ;
    public final void rule__AnnotationInstance__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:989:1: ( rule__AnnotationInstance__Group_3_3__2__Impl )
            // InternalAnnotationsDsl.g:990:2: rule__AnnotationInstance__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__2"


    // $ANTLR start "rule__AnnotationInstance__Group_3_3__2__Impl"
    // InternalAnnotationsDsl.g:996:1: rule__AnnotationInstance__Group_3_3__2__Impl : ( ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 ) ) ;
    public final void rule__AnnotationInstance__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1000:1: ( ( ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 ) ) )
            // InternalAnnotationsDsl.g:1001:1: ( ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 ) )
            {
            // InternalAnnotationsDsl.g:1001:1: ( ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 ) )
            // InternalAnnotationsDsl.g:1002:2: ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_3_2()); 
            // InternalAnnotationsDsl.g:1003:2: ( rule__AnnotationInstance__DescriptorsAssignment_3_3_2 )
            // InternalAnnotationsDsl.g:1003:3: rule__AnnotationInstance__DescriptorsAssignment_3_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationInstance__DescriptorsAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__Group_3_3__2__Impl"


    // $ANTLR start "rule__RepositoryManager__AnnotationsAssignment_1_0"
    // InternalAnnotationsDsl.g:1012:1: rule__RepositoryManager__AnnotationsAssignment_1_0 : ( ruleAnnotation ) ;
    public final void rule__RepositoryManager__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1016:1: ( ( ruleAnnotation ) )
            // InternalAnnotationsDsl.g:1017:2: ( ruleAnnotation )
            {
            // InternalAnnotationsDsl.g:1017:2: ( ruleAnnotation )
            // InternalAnnotationsDsl.g:1018:3: ruleAnnotation
            {
             before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__RepositoryManager__AnnotationsAssignment_1_1"
    // InternalAnnotationsDsl.g:1027:1: rule__RepositoryManager__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__RepositoryManager__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1031:1: ( ( ruleAnnotation ) )
            // InternalAnnotationsDsl.g:1032:2: ( ruleAnnotation )
            {
            // InternalAnnotationsDsl.g:1032:2: ( ruleAnnotation )
            // InternalAnnotationsDsl.g:1033:3: ruleAnnotation
            {
             before(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__SimpleAnnotation__NameAssignment_2"
    // InternalAnnotationsDsl.g:1042:1: rule__SimpleAnnotation__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__SimpleAnnotation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1046:1: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1047:2: ( ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:1047:2: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1048:3: ruleQualifiedName
            {
             before(grammarAccess.getSimpleAnnotationAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleAnnotationAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnnotation__NameAssignment_2"


    // $ANTLR start "rule__AnnotationHierarchy__NameAssignment_2"
    // InternalAnnotationsDsl.g:1057:1: rule__AnnotationHierarchy__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__AnnotationHierarchy__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1061:1: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1062:2: ( ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:1062:2: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1063:3: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationHierarchyAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__NameAssignment_2"


    // $ANTLR start "rule__AnnotationHierarchy__SupersAssignment_3_2"
    // InternalAnnotationsDsl.g:1072:1: rule__AnnotationHierarchy__SupersAssignment_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AnnotationHierarchy__SupersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1076:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAnnotationsDsl.g:1077:2: ( ( ruleQualifiedName ) )
            {
            // InternalAnnotationsDsl.g:1077:2: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1078:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_2_0()); 
            // InternalAnnotationsDsl.g:1079:3: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1080:4: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__SupersAssignment_3_2"


    // $ANTLR start "rule__AnnotationHierarchy__SupersAssignment_3_3_2"
    // InternalAnnotationsDsl.g:1091:1: rule__AnnotationHierarchy__SupersAssignment_3_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AnnotationHierarchy__SupersAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1095:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAnnotationsDsl.g:1096:2: ( ( ruleQualifiedName ) )
            {
            // InternalAnnotationsDsl.g:1096:2: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1097:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_3_2_0()); 
            // InternalAnnotationsDsl.g:1098:3: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1099:4: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationQualifiedNameParserRuleCall_3_3_2_0_1()); 

            }

             after(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationHierarchy__SupersAssignment_3_3_2"


    // $ANTLR start "rule__AnnotationInstance__NameAssignment_2"
    // InternalAnnotationsDsl.g:1110:1: rule__AnnotationInstance__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__AnnotationInstance__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1114:1: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1115:2: ( ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:1115:2: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1116:3: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationInstanceAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationInstanceAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__NameAssignment_2"


    // $ANTLR start "rule__AnnotationInstance__DescriptorsAssignment_3_2"
    // InternalAnnotationsDsl.g:1125:1: rule__AnnotationInstance__DescriptorsAssignment_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AnnotationInstance__DescriptorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1129:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAnnotationsDsl.g:1130:2: ( ( ruleQualifiedName ) )
            {
            // InternalAnnotationsDsl.g:1130:2: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1131:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_2_0()); 
            // InternalAnnotationsDsl.g:1132:3: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1133:4: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__DescriptorsAssignment_3_2"


    // $ANTLR start "rule__AnnotationInstance__DescriptorsAssignment_3_3_2"
    // InternalAnnotationsDsl.g:1144:1: rule__AnnotationInstance__DescriptorsAssignment_3_3_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AnnotationInstance__DescriptorsAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotationsDsl.g:1148:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAnnotationsDsl.g:1149:2: ( ( ruleQualifiedName ) )
            {
            // InternalAnnotationsDsl.g:1149:2: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:1150:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_3_2_0()); 
            // InternalAnnotationsDsl.g:1151:3: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:1152:4: ruleQualifiedName
            {
             before(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationQualifiedNameParserRuleCall_3_3_2_0_1()); 

            }

             after(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationInstance__DescriptorsAssignment_3_3_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});

}