/**
 */
package ecarules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecarules.EcarulesFactory
 * @model kind="package"
 * @generated
 */
public interface EcarulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecarules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.core.eagledata/ECARules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecarules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcarulesPackage eINSTANCE = ecarules.impl.EcarulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecarules.impl.EventSetManagerImpl <em>Event Set Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.EventSetManagerImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getEventSetManager()
	 * @generated
	 */
	int EVENT_SET_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Dataconnections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER__DATACONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Geos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER__GEOS = 3;

	/**
	 * The number of structural features of the '<em>Event Set Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event Set Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.NamedElementImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.EventImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTIONS = NAMED_ELEMENT__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTOR = NAMED_ELEMENT__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALUE = NAMED_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONCEPTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dataconnections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATACONNECTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ecarules.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ConceptImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.KeyConceptImpl <em>Key Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.KeyConceptImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getKeyConcept()
	 * @generated
	 */
	int KEY_CONCEPT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CONCEPT__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CONCEPT__TYPE = CONCEPT__TYPE;

	/**
	 * The number of structural features of the '<em>Key Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CONCEPT_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_CONCEPT_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.RegexConceptImpl <em>Regex Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.RegexConceptImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getRegexConcept()
	 * @generated
	 */
	int REGEX_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_CONCEPT__NAME = CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_CONCEPT__TYPE = CONCEPT__TYPE;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_CONCEPT__REGEX = CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regex Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_CONCEPT_FEATURE_COUNT = CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regex Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEX_CONCEPT_OPERATION_COUNT = CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.DataConnectionImpl <em>Data Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.DataConnectionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getDataConnection()
	 * @generated
	 */
	int DATA_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Data Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION___CONNECT = 0;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION___MATCHES__EVENT = 1;

	/**
	 * The number of operations of the '<em>Data Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ecarules.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ConditionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GEO = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ExpressionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.LiteralImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.ActionExecutableExtensionImpl <em>Action Executable Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ActionExecutableExtensionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getActionExecutableExtension()
	 * @generated
	 */
	int ACTION_EXECUTABLE_EXTENSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTABLE_EXTENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTABLE_EXTENSION__ID = 1;

	/**
	 * The number of structural features of the '<em>Action Executable Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTABLE_EXTENSION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTABLE_EXTENSION___EXECUTE__ELIST = 0;

	/**
	 * The number of operations of the '<em>Action Executable Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTABLE_EXTENSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ecarules.impl.ActionParamImpl <em>Action Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ActionParamImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getActionParam()
	 * @generated
	 */
	int ACTION_PARAM = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAM__KEY = 0;

	/**
	 * The number of structural features of the '<em>Action Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.ConceptParamImpl <em>Concept Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ConceptParamImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getConceptParam()
	 * @generated
	 */
	int CONCEPT_PARAM = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAM__KEY = ACTION_PARAM__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAM__VALUE = ACTION_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAM_FEATURE_COUNT = ACTION_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_PARAM_OPERATION_COUNT = ACTION_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.StringParamImpl <em>String Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.StringParamImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getStringParam()
	 * @generated
	 */
	int STRING_PARAM = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__KEY = ACTION_PARAM__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM__VALUE = ACTION_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_FEATURE_COUNT = ACTION_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PARAM_OPERATION_COUNT = ACTION_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.ActionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMS = 0;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CALLS = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.GeographicalElementImpl <em>Geographical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.GeographicalElementImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getGeographicalElement()
	 * @generated
	 */
	int GEOGRAPHICAL_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Geographical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geographical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHICAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.PointImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = GEOGRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LAT = GEOGRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LONG = GEOGRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GEOGRAPHICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = GEOGRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.impl.RegionImpl
	 * @see ecarules.impl.EcarulesPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = GEOGRAPHICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__POINTS = GEOGRAPHICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = GEOGRAPHICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = GEOGRAPHICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecarules.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecarules.Type
	 * @see ecarules.impl.EcarulesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 18;


	/**
	 * Returns the meta object for class '{@link ecarules.EventSetManager <em>Event Set Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Set Manager</em>'.
	 * @see ecarules.EventSetManager
	 * @generated
	 */
	EClass getEventSetManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.EventSetManager#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see ecarules.EventSetManager#getEvents()
	 * @see #getEventSetManager()
	 * @generated
	 */
	EReference getEventSetManager_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.EventSetManager#getDataconnections <em>Dataconnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataconnections</em>'.
	 * @see ecarules.EventSetManager#getDataconnections()
	 * @see #getEventSetManager()
	 * @generated
	 */
	EReference getEventSetManager_Dataconnections();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.EventSetManager#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ecarules.EventSetManager#getActions()
	 * @see #getEventSetManager()
	 * @generated
	 */
	EReference getEventSetManager_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.EventSetManager#getGeos <em>Geos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geos</em>'.
	 * @see ecarules.EventSetManager#getGeos()
	 * @see #getEventSetManager()
	 * @generated
	 */
	EReference getEventSetManager_Geos();

	/**
	 * Returns the meta object for class '{@link ecarules.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ecarules.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.Event#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see ecarules.Event#getWhen()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_When();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.Event#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concepts</em>'.
	 * @see ecarules.Event#getConcepts()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Concepts();

	/**
	 * Returns the meta object for the reference list '{@link ecarules.Event#getDataconnections <em>Dataconnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataconnections</em>'.
	 * @see ecarules.Event#getDataconnections()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Dataconnections();

	/**
	 * Returns the meta object for class '{@link ecarules.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see ecarules.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.Concept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecarules.Concept#getName()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.Concept#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ecarules.Concept#getType()
	 * @see #getConcept()
	 * @generated
	 */
	EAttribute getConcept_Type();

	/**
	 * Returns the meta object for class '{@link ecarules.KeyConcept <em>Key Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Concept</em>'.
	 * @see ecarules.KeyConcept
	 * @generated
	 */
	EClass getKeyConcept();

	/**
	 * Returns the meta object for class '{@link ecarules.RegexConcept <em>Regex Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regex Concept</em>'.
	 * @see ecarules.RegexConcept
	 * @generated
	 */
	EClass getRegexConcept();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.RegexConcept#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see ecarules.RegexConcept#getRegex()
	 * @see #getRegexConcept()
	 * @generated
	 */
	EAttribute getRegexConcept_Regex();

	/**
	 * Returns the meta object for class '{@link ecarules.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ecarules.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecarules.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link ecarules.NamedElement#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptions</em>'.
	 * @see ecarules.NamedElement#getDescriptions()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Descriptions();

	/**
	 * Returns the meta object for the reference '{@link ecarules.NamedElement#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see ecarules.NamedElement#getDescriptor()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.NamedElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecarules.NamedElement#getValue()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Value();

	/**
	 * Returns the meta object for class '{@link ecarules.DataConnection <em>Data Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Connection</em>'.
	 * @see ecarules.DataConnection
	 * @generated
	 */
	EClass getDataConnection();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.DataConnection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecarules.DataConnection#getId()
	 * @see #getDataConnection()
	 * @generated
	 */
	EAttribute getDataConnection_Id();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.DataConnection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecarules.DataConnection#getName()
	 * @see #getDataConnection()
	 * @generated
	 */
	EAttribute getDataConnection_Name();

	/**
	 * Returns the meta object for the '{@link ecarules.DataConnection#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see ecarules.DataConnection#connect()
	 * @generated
	 */
	EOperation getDataConnection__Connect();

	/**
	 * Returns the meta object for the '{@link ecarules.DataConnection#matches(ecarules.Event) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see ecarules.DataConnection#matches(ecarules.Event)
	 * @generated
	 */
	EOperation getDataConnection__Matches__Event();

	/**
	 * Returns the meta object for class '{@link ecarules.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ecarules.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link ecarules.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see ecarules.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.Condition#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see ecarules.Condition#getTriggers()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Triggers();

	/**
	 * Returns the meta object for the reference '{@link ecarules.Condition#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see ecarules.Condition#getGeo()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Geo();

	/**
	 * Returns the meta object for class '{@link ecarules.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see ecarules.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link ecarules.Expression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see ecarules.Expression#getLeft()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link ecarules.Expression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see ecarules.Expression#getRight()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Right();

	/**
	 * Returns the meta object for class '{@link ecarules.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see ecarules.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecarules.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link ecarules.ActionExecutableExtension <em>Action Executable Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Executable Extension</em>'.
	 * @see ecarules.ActionExecutableExtension
	 * @generated
	 */
	EClass getActionExecutableExtension();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.ActionExecutableExtension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecarules.ActionExecutableExtension#getName()
	 * @see #getActionExecutableExtension()
	 * @generated
	 */
	EAttribute getActionExecutableExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.ActionExecutableExtension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ecarules.ActionExecutableExtension#getId()
	 * @see #getActionExecutableExtension()
	 * @generated
	 */
	EAttribute getActionExecutableExtension_Id();

	/**
	 * Returns the meta object for the '{@link ecarules.ActionExecutableExtension#execute(org.eclipse.emf.common.util.EList) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see ecarules.ActionExecutableExtension#execute(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getActionExecutableExtension__Execute__EList();

	/**
	 * Returns the meta object for class '{@link ecarules.ActionParam <em>Action Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Param</em>'.
	 * @see ecarules.ActionParam
	 * @generated
	 */
	EClass getActionParam();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.ActionParam#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ecarules.ActionParam#getKey()
	 * @see #getActionParam()
	 * @generated
	 */
	EAttribute getActionParam_Key();

	/**
	 * Returns the meta object for class '{@link ecarules.ConceptParam <em>Concept Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Param</em>'.
	 * @see ecarules.ConceptParam
	 * @generated
	 */
	EClass getConceptParam();

	/**
	 * Returns the meta object for the reference '{@link ecarules.ConceptParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see ecarules.ConceptParam#getValue()
	 * @see #getConceptParam()
	 * @generated
	 */
	EReference getConceptParam_Value();

	/**
	 * Returns the meta object for class '{@link ecarules.StringParam <em>String Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Param</em>'.
	 * @see ecarules.StringParam
	 * @generated
	 */
	EClass getStringParam();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.StringParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ecarules.StringParam#getValue()
	 * @see #getStringParam()
	 * @generated
	 */
	EAttribute getStringParam_Value();

	/**
	 * Returns the meta object for class '{@link ecarules.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ecarules.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.Action#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see ecarules.Action#getParams()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Params();

	/**
	 * Returns the meta object for the reference '{@link ecarules.Action#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calls</em>'.
	 * @see ecarules.Action#getCalls()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Calls();

	/**
	 * Returns the meta object for class '{@link ecarules.GeographicalElement <em>Geographical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographical Element</em>'.
	 * @see ecarules.GeographicalElement
	 * @generated
	 */
	EClass getGeographicalElement();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.GeographicalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecarules.GeographicalElement#getName()
	 * @see #getGeographicalElement()
	 * @generated
	 */
	EAttribute getGeographicalElement_Name();

	/**
	 * Returns the meta object for class '{@link ecarules.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see ecarules.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.Point#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see ecarules.Point#getLat()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Lat();

	/**
	 * Returns the meta object for the attribute '{@link ecarules.Point#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see ecarules.Point#getLong()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Long();

	/**
	 * Returns the meta object for class '{@link ecarules.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ecarules.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link ecarules.Region#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see ecarules.Region#getPoints()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Points();

	/**
	 * Returns the meta object for enum '{@link ecarules.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see ecarules.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcarulesFactory getEcarulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecarules.impl.EventSetManagerImpl <em>Event Set Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.EventSetManagerImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getEventSetManager()
		 * @generated
		 */
		EClass EVENT_SET_MANAGER = eINSTANCE.getEventSetManager();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SET_MANAGER__EVENTS = eINSTANCE.getEventSetManager_Events();

		/**
		 * The meta object literal for the '<em><b>Dataconnections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SET_MANAGER__DATACONNECTIONS = eINSTANCE.getEventSetManager_Dataconnections();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SET_MANAGER__ACTIONS = eINSTANCE.getEventSetManager_Actions();

		/**
		 * The meta object literal for the '<em><b>Geos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_SET_MANAGER__GEOS = eINSTANCE.getEventSetManager_Geos();

		/**
		 * The meta object literal for the '{@link ecarules.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.EventImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__WHEN = eINSTANCE.getEvent_When();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONCEPTS = eINSTANCE.getEvent_Concepts();

		/**
		 * The meta object literal for the '<em><b>Dataconnections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__DATACONNECTIONS = eINSTANCE.getEvent_Dataconnections();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ConceptImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__NAME = eINSTANCE.getConcept_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT__TYPE = eINSTANCE.getConcept_Type();

		/**
		 * The meta object literal for the '{@link ecarules.impl.KeyConceptImpl <em>Key Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.KeyConceptImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getKeyConcept()
		 * @generated
		 */
		EClass KEY_CONCEPT = eINSTANCE.getKeyConcept();

		/**
		 * The meta object literal for the '{@link ecarules.impl.RegexConceptImpl <em>Regex Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.RegexConceptImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getRegexConcept()
		 * @generated
		 */
		EClass REGEX_CONCEPT = eINSTANCE.getRegexConcept();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEX_CONCEPT__REGEX = eINSTANCE.getRegexConcept_Regex();

		/**
		 * The meta object literal for the '{@link ecarules.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.NamedElementImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__DESCRIPTIONS = eINSTANCE.getNamedElement_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__DESCRIPTOR = eINSTANCE.getNamedElement_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VALUE = eINSTANCE.getNamedElement_Value();

		/**
		 * The meta object literal for the '{@link ecarules.impl.DataConnectionImpl <em>Data Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.DataConnectionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getDataConnection()
		 * @generated
		 */
		EClass DATA_CONNECTION = eINSTANCE.getDataConnection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONNECTION__ID = eINSTANCE.getDataConnection_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONNECTION__NAME = eINSTANCE.getDataConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CONNECTION___CONNECT = eINSTANCE.getDataConnection__Connect();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CONNECTION___MATCHES__EVENT = eINSTANCE.getDataConnection__Matches__Event();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ConditionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__TRIGGERS = eINSTANCE.getCondition_Triggers();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__GEO = eINSTANCE.getCondition_Geo();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ExpressionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

		/**
		 * The meta object literal for the '{@link ecarules.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.LiteralImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ActionExecutableExtensionImpl <em>Action Executable Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ActionExecutableExtensionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getActionExecutableExtension()
		 * @generated
		 */
		EClass ACTION_EXECUTABLE_EXTENSION = eINSTANCE.getActionExecutableExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_EXECUTABLE_EXTENSION__NAME = eINSTANCE.getActionExecutableExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_EXECUTABLE_EXTENSION__ID = eINSTANCE.getActionExecutableExtension_Id();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_EXECUTABLE_EXTENSION___EXECUTE__ELIST = eINSTANCE.getActionExecutableExtension__Execute__EList();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ActionParamImpl <em>Action Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ActionParamImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getActionParam()
		 * @generated
		 */
		EClass ACTION_PARAM = eINSTANCE.getActionParam();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_PARAM__KEY = eINSTANCE.getActionParam_Key();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ConceptParamImpl <em>Concept Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ConceptParamImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getConceptParam()
		 * @generated
		 */
		EClass CONCEPT_PARAM = eINSTANCE.getConceptParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_PARAM__VALUE = eINSTANCE.getConceptParam_Value();

		/**
		 * The meta object literal for the '{@link ecarules.impl.StringParamImpl <em>String Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.StringParamImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getStringParam()
		 * @generated
		 */
		EClass STRING_PARAM = eINSTANCE.getStringParam();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_PARAM__VALUE = eINSTANCE.getStringParam_Value();

		/**
		 * The meta object literal for the '{@link ecarules.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.ActionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARAMS = eINSTANCE.getAction_Params();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CALLS = eINSTANCE.getAction_Calls();

		/**
		 * The meta object literal for the '{@link ecarules.impl.GeographicalElementImpl <em>Geographical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.GeographicalElementImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getGeographicalElement()
		 * @generated
		 */
		EClass GEOGRAPHICAL_ELEMENT = eINSTANCE.getGeographicalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHICAL_ELEMENT__NAME = eINSTANCE.getGeographicalElement_Name();

		/**
		 * The meta object literal for the '{@link ecarules.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.PointImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__LAT = eINSTANCE.getPoint_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__LONG = eINSTANCE.getPoint_Long();

		/**
		 * The meta object literal for the '{@link ecarules.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.impl.RegionImpl
		 * @see ecarules.impl.EcarulesPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__POINTS = eINSTANCE.getRegion_Points();

		/**
		 * The meta object literal for the '{@link ecarules.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecarules.Type
		 * @see ecarules.impl.EcarulesPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EcarulesPackage
