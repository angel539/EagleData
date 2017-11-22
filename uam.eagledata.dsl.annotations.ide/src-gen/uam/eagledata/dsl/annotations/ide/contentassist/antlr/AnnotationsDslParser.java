/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.annotations.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uam.eagledata.dsl.annotations.ide.contentassist.antlr.internal.InternalAnnotationsDslParser;
import uam.eagledata.dsl.annotations.services.AnnotationsDslGrammarAccess;

public class AnnotationsDslParser extends AbstractContentAssistParser {

	@Inject
	private AnnotationsDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAnnotationsDslParser createParser() {
		InternalAnnotationsDslParser result = new InternalAnnotationsDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAnnotationAccess().getAlternatives(), "rule__Annotation__Alternatives");
					put(grammarAccess.getRepositoryManagerAccess().getGroup(), "rule__RepositoryManager__Group__0");
					put(grammarAccess.getRepositoryManagerAccess().getGroup_1(), "rule__RepositoryManager__Group_1__0");
					put(grammarAccess.getSimpleAnnotationAccess().getGroup(), "rule__SimpleAnnotation__Group__0");
					put(grammarAccess.getAnnotationHierarchyAccess().getGroup(), "rule__AnnotationHierarchy__Group__0");
					put(grammarAccess.getAnnotationHierarchyAccess().getGroup_3(), "rule__AnnotationHierarchy__Group_3__0");
					put(grammarAccess.getAnnotationHierarchyAccess().getGroup_3_3(), "rule__AnnotationHierarchy__Group_3_3__0");
					put(grammarAccess.getAnnotationInstanceAccess().getGroup(), "rule__AnnotationInstance__Group__0");
					put(grammarAccess.getAnnotationInstanceAccess().getGroup_3(), "rule__AnnotationInstance__Group_3__0");
					put(grammarAccess.getAnnotationInstanceAccess().getGroup_3_3(), "rule__AnnotationInstance__Group_3_3__0");
					put(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_0(), "rule__RepositoryManager__AnnotationsAssignment_1_0");
					put(grammarAccess.getRepositoryManagerAccess().getAnnotationsAssignment_1_1(), "rule__RepositoryManager__AnnotationsAssignment_1_1");
					put(grammarAccess.getSimpleAnnotationAccess().getNameAssignment_2(), "rule__SimpleAnnotation__NameAssignment_2");
					put(grammarAccess.getAnnotationHierarchyAccess().getNameAssignment_2(), "rule__AnnotationHierarchy__NameAssignment_2");
					put(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_2(), "rule__AnnotationHierarchy__SupersAssignment_3_2");
					put(grammarAccess.getAnnotationHierarchyAccess().getSupersAssignment_3_3_2(), "rule__AnnotationHierarchy__SupersAssignment_3_3_2");
					put(grammarAccess.getAnnotationInstanceAccess().getNameAssignment_2(), "rule__AnnotationInstance__NameAssignment_2");
					put(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_2(), "rule__AnnotationInstance__DescriptorsAssignment_3_2");
					put(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAssignment_3_3_2(), "rule__AnnotationInstance__DescriptorsAssignment_3_3_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAnnotationsDslParser typedParser = (InternalAnnotationsDslParser) parser;
			typedParser.entryRuleRepositoryManager();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AnnotationsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnnotationsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}