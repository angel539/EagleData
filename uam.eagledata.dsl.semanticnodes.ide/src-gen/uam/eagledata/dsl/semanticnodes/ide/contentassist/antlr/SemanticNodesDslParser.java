/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.semanticnodes.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uam.eagledata.dsl.semanticnodes.ide.contentassist.antlr.internal.InternalSemanticNodesDslParser;
import uam.eagledata.dsl.semanticnodes.services.SemanticNodesDslGrammarAccess;

public class SemanticNodesDslParser extends AbstractContentAssistParser {

	@Inject
	private SemanticNodesDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSemanticNodesDslParser createParser() {
		InternalSemanticNodesDslParser result = new InternalSemanticNodesDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getResourceElementAccess().getAlternatives(), "rule__ResourceElement__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getRepositoryManagerAccess().getGroup(), "rule__RepositoryManager__Group__0");
					put(grammarAccess.getRepositoryManagerAccess().getGroup_1(), "rule__RepositoryManager__Group_1__0");
					put(grammarAccess.getRepositoryManagerAccess().getGroup_1_2(), "rule__RepositoryManager__Group_1_2__0");
					put(grammarAccess.getRepositoryManagerAccess().getGroup_2(), "rule__RepositoryManager__Group_2__0");
					put(grammarAccess.getRepositoryAccess().getGroup(), "rule__Repository__Group__0");
					put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
					put(grammarAccess.getResourceAccess().getGroup_1(), "rule__Resource__Group_1__0");
					put(grammarAccess.getResourceAccess().getGroup_1_2(), "rule__Resource__Group_1_2__0");
					put(grammarAccess.getResourceAccess().getGroup_5(), "rule__Resource__Group_5__0");
					put(grammarAccess.getResourceAccess().getGroup_7(), "rule__Resource__Group_7__0");
					put(grammarAccess.getResourceAccess().getGroup_7_2(), "rule__Resource__Group_7_2__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_4(), "rule__Enumeration__Group_4__0");
					put(grammarAccess.getEnumerationLiteralAccess().getGroup(), "rule__EnumerationLiteral__Group__0");
					put(grammarAccess.getSemanticNodeAccess().getGroup(), "rule__SemanticNode__Group__0");
					put(grammarAccess.getSemanticNodeAccess().getGroup_5(), "rule__SemanticNode__Group_5__0");
					put(grammarAccess.getSemanticNodeAccess().getGroup_7(), "rule__SemanticNode__Group_7__0");
					put(grammarAccess.getSemanticNodeAccess().getGroup_7_2(), "rule__SemanticNode__Group_7_2__0");
					put(grammarAccess.getObjectPropertyAccess().getGroup(), "rule__ObjectProperty__Group__0");
					put(grammarAccess.getObjectPropertyAccess().getGroup_4(), "rule__ObjectProperty__Group_4__0");
					put(grammarAccess.getObjectPropertyAccess().getGroup_5(), "rule__ObjectProperty__Group_5__0");
					put(grammarAccess.getObjectPropertyAccess().getGroup_5_2(), "rule__ObjectProperty__Group_5_2__0");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup(), "rule__PrimitiveTypeDataProperty__Group__0");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_2(), "rule__PrimitiveTypeDataProperty__Group_2__0");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_3(), "rule__PrimitiveTypeDataProperty__Group_3__0");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4(), "rule__PrimitiveTypeDataProperty__Group_4__0");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4_2(), "rule__PrimitiveTypeDataProperty__Group_4_2__0");
					put(grammarAccess.getEnumerationDataPropertyAccess().getGroup(), "rule__EnumerationDataProperty__Group__0");
					put(grammarAccess.getEnumerationDataPropertyAccess().getGroup_2(), "rule__EnumerationDataProperty__Group_2__0");
					put(grammarAccess.getEnumerationDataPropertyAccess().getGroup_3(), "rule__EnumerationDataProperty__Group_3__0");
					put(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4(), "rule__EnumerationDataProperty__Group_4__0");
					put(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4_2(), "rule__EnumerationDataProperty__Group_4_2__0");
					put(grammarAccess.getMetaDataValueAccess().getGroup(), "rule__MetaDataValue__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_1(), "rule__RepositoryManager__ImportURIAssignment_1_1");
					put(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_2_1(), "rule__RepositoryManager__ImportURIAssignment_1_2_1");
					put(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_0(), "rule__RepositoryManager__RepositoriesAssignment_2_0");
					put(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_1(), "rule__RepositoryManager__RepositoriesAssignment_2_1");
					put(grammarAccess.getRepositoryAccess().getNameAssignment_2(), "rule__Repository__NameAssignment_2");
					put(grammarAccess.getRepositoryAccess().getResourcesAssignment_4(), "rule__Repository__ResourcesAssignment_4");
					put(grammarAccess.getRepositoryAccess().getResourcesAssignment_5(), "rule__Repository__ResourcesAssignment_5");
					put(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_1(), "rule__Resource__AnnotationsAssignment_1_1");
					put(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_2_1(), "rule__Resource__AnnotationsAssignment_1_2_1");
					put(grammarAccess.getResourceAccess().getAssistantAssignment_2(), "rule__Resource__AssistantAssignment_2");
					put(grammarAccess.getResourceAccess().getNameAssignment_3(), "rule__Resource__NameAssignment_3");
					put(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_0(), "rule__Resource__ResourceElementsAssignment_5_0");
					put(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_1(), "rule__Resource__ResourceElementsAssignment_5_1");
					put(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_1(), "rule__Resource__MetaDataValueAssignment_7_1");
					put(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_2_1(), "rule__Resource__MetaDataValueAssignment_7_2_1");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_2(), "rule__Enumeration__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_0(), "rule__Enumeration__LiteralsAssignment_4_0");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1(), "rule__Enumeration__LiteralsAssignment_4_1");
					put(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_1(), "rule__EnumerationLiteral__ValueAssignment_1");
					put(grammarAccess.getEnumerationLiteralAccess().getLiteralAssignment_3(), "rule__EnumerationLiteral__LiteralAssignment_3");
					put(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_1(), "rule__SemanticNode__AbstractAssignment_1");
					put(grammarAccess.getSemanticNodeAccess().getNameAssignment_3(), "rule__SemanticNode__NameAssignment_3");
					put(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_0(), "rule__SemanticNode__PropertiesAssignment_5_0");
					put(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_1(), "rule__SemanticNode__PropertiesAssignment_5_1");
					put(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_1(), "rule__SemanticNode__MetaDataValueAssignment_7_1");
					put(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_2_1(), "rule__SemanticNode__MetaDataValueAssignment_7_2_1");
					put(grammarAccess.getObjectPropertyAccess().getNameAssignment_1(), "rule__ObjectProperty__NameAssignment_1");
					put(grammarAccess.getObjectPropertyAccess().getRangeAssignment_3(), "rule__ObjectProperty__RangeAssignment_3");
					put(grammarAccess.getObjectPropertyAccess().getLowerBoundAssignment_4_1(), "rule__ObjectProperty__LowerBoundAssignment_4_1");
					put(grammarAccess.getObjectPropertyAccess().getUpperBoundAssignment_4_3(), "rule__ObjectProperty__UpperBoundAssignment_4_3");
					put(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_1(), "rule__ObjectProperty__MetaDataValueAssignment_5_1");
					put(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_2_1(), "rule__ObjectProperty__MetaDataValueAssignment_5_2_1");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameAssignment_1(), "rule__PrimitiveTypeDataProperty__NameAssignment_1");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeAssignment_2_1(), "rule__PrimitiveTypeDataProperty__TypeAssignment_2_1");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundAssignment_3_1(), "rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundAssignment_3_3(), "rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_1(), "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1");
					put(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_2_1(), "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1");
					put(grammarAccess.getEnumerationDataPropertyAccess().getNameAssignment_1(), "rule__EnumerationDataProperty__NameAssignment_1");
					put(grammarAccess.getEnumerationDataPropertyAccess().getTypeAssignment_2_1(), "rule__EnumerationDataProperty__TypeAssignment_2_1");
					put(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundAssignment_3_1(), "rule__EnumerationDataProperty__LowerBoundAssignment_3_1");
					put(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundAssignment_3_3(), "rule__EnumerationDataProperty__UpperBoundAssignment_3_3");
					put(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_1(), "rule__EnumerationDataProperty__MetaDataValueAssignment_4_1");
					put(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_2_1(), "rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1");
					put(grammarAccess.getMetaDataValueAccess().getKeyMetaDataAssignment_1(), "rule__MetaDataValue__KeyMetaDataAssignment_1");
					put(grammarAccess.getMetaDataValueAccess().getValueAssignment_3(), "rule__MetaDataValue__ValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSemanticNodesDslParser typedParser = (InternalSemanticNodesDslParser) parser;
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

	public SemanticNodesDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SemanticNodesDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
