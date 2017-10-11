/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.events.serializer;

import com.google.inject.Inject;
import ecarules.BinaryExpression;
import ecarules.BooleanExpression;
import ecarules.ConceptParam;
import ecarules.EcarulesPackage;
import ecarules.Event;
import ecarules.EventSetManager;
import ecarules.KeyConcept;
import ecarules.Literal;
import ecarules.Point;
import ecarules.RegexConcept;
import ecarules.Region;
import ecarules.StringParam;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uam.eagledata.dsl.events.services.EventSetManagerDslGrammarAccess;

@SuppressWarnings("all")
public class EventSetManagerDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EventSetManagerDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcarulesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcarulesPackage.ACTION:
				sequence_Action(context, (ecarules.Action) semanticObject); 
				return; 
			case EcarulesPackage.BINARY_EXPRESSION:
				sequence_BinaryExpression(context, (BinaryExpression) semanticObject); 
				return; 
			case EcarulesPackage.BOOLEAN_EXPRESSION:
				sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
				return; 
			case EcarulesPackage.CONCEPT_PARAM:
				sequence_ConceptParam(context, (ConceptParam) semanticObject); 
				return; 
			case EcarulesPackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case EcarulesPackage.EVENT_SET_MANAGER:
				sequence_EventSetManager(context, (EventSetManager) semanticObject); 
				return; 
			case EcarulesPackage.KEY_CONCEPT:
				sequence_KeyConcept(context, (KeyConcept) semanticObject); 
				return; 
			case EcarulesPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case EcarulesPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			case EcarulesPackage.REGEX_CONCEPT:
				sequence_RegexConcept(context, (RegexConcept) semanticObject); 
				return; 
			case EcarulesPackage.REGION:
				sequence_Region(context, (Region) semanticObject); 
				return; 
			case EcarulesPackage.STRING_PARAM:
				sequence_StringParam(context, (StringParam) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (calls=EString (params+=ActionParam params+=ActionParam*)?)
	 */
	protected void sequence_Action(ISerializationContext context, ecarules.Action semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns BinaryExpression
	 *     BinaryExpression returns BinaryExpression
	 *
	 * Constraint:
	 *     (left=[Concept|EString] right=Literal)
	 */
	protected void sequence_BinaryExpression(ISerializationContext context, BinaryExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.BINARY_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.BINARY_EXPRESSION__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.BINARY_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.BINARY_EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getLeftConceptEStringParserRuleCall_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBinaryExpressionAccess().getRightLiteralParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns BooleanExpression
	 *     BooleanExpression returns BooleanExpression
	 *
	 * Constraint:
	 *     expression=BOOLEAN
	 */
	protected void sequence_BooleanExpression(ISerializationContext context, BooleanExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.BOOLEAN_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.BOOLEAN_EXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getExpressionBOOLEANTerminalRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActionParam returns ConceptParam
	 *     ConceptParam returns ConceptParam
	 *
	 * Constraint:
	 *     (key=EString value=[Concept|ID])
	 */
	protected void sequence_ConceptParam(ISerializationContext context, ConceptParam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.ACTION_PARAM__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.ACTION_PARAM__KEY));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT_PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT_PARAM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConceptParamAccess().getKeyEStringParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getConceptParamAccess().getValueConceptIDTerminalRuleCall_3_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventSetManager returns EventSetManager
	 *
	 * Constraint:
	 *     (geos+=GeographicalElement geos+=GeographicalElement* events+=Event events+=Event*)
	 */
	protected void sequence_EventSetManager(ISerializationContext context, EventSetManager semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (
	 *         (dataconnection+=EString dataconnection+=EString*)? 
	 *         name=EString 
	 *         geo=[GeographicalElement|ID]? 
	 *         concepts+=Concept 
	 *         concepts+=Concept* 
	 *         when=Condition? 
	 *         triggers+=Action 
	 *         triggers+=Action*
	 *     )
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Concept returns KeyConcept
	 *     KeyConcept returns KeyConcept
	 *
	 * Constraint:
	 *     (type=Type name=EString)
	 */
	protected void sequence_KeyConcept(ISerializationContext context, KeyConcept semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__TYPE));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getKeyConceptAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GeographicalElement returns Point
	 *     Point returns Point
	 *
	 * Constraint:
	 *     (name=EString lat=DOUBLE long=DOUBLE)
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.GEOGRAPHICAL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.GEOGRAPHICAL_ELEMENT__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.POINT__LAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.POINT__LAT));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.POINT__LONG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.POINT__LONG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getPointAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPointAccess().getLatDOUBLETerminalRuleCall_3_0(), semanticObject.getLat());
		feeder.accept(grammarAccess.getPointAccess().getLongDOUBLETerminalRuleCall_5_0(), semanticObject.getLong());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Concept returns RegexConcept
	 *     RegexConcept returns RegexConcept
	 *
	 * Constraint:
	 *     (type=Type name=EString regex=EString)
	 */
	protected void sequence_RegexConcept(ISerializationContext context, RegexConcept semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__TYPE));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.CONCEPT__NAME));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.REGEX_CONCEPT__REGEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.REGEX_CONCEPT__REGEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegexConceptAccess().getRegexEStringParserRuleCall_4_0(), semanticObject.getRegex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GeographicalElement returns Region
	 *     Region returns Region
	 *
	 * Constraint:
	 *     (name=EString points+=Point points+=Point*)
	 */
	protected void sequence_Region(ISerializationContext context, Region semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionParam returns StringParam
	 *     StringParam returns StringParam
	 *
	 * Constraint:
	 *     (key=EString value=EString)
	 */
	protected void sequence_StringParam(ISerializationContext context, StringParam semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.ACTION_PARAM__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.ACTION_PARAM__KEY));
			if (transientValues.isValueTransient((EObject) semanticObject, EcarulesPackage.Literals.STRING_PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, EcarulesPackage.Literals.STRING_PARAM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStringParamAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}