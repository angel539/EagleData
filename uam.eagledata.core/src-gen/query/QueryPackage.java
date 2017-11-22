/**
 */
package query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.core.eagledata/Query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link query.impl.QuerySetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.QuerySetImpl
	 * @see query.impl.QueryPackageImpl#getQuerySet()
	 * @generated
	 */
	int QUERY_SET = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SET__QUERIES = 0;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SET__IMPORTED_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.SelectImpl
	 * @see query.impl.QueryPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SELECTION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__FROM = 1;

	/**
	 * The feature id for the '<em><b>Select All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SELECT_ALL = 2;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__WHERE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__PARAMS = 5;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FromImpl
	 * @see query.impl.QueryPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__SOURCE = 0;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.SimpleFromImpl <em>Simple From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.SimpleFromImpl
	 * @see query.impl.QueryPackageImpl#getSimpleFrom()
	 * @generated
	 */
	int SIMPLE_FROM = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FROM__SOURCE = FROM__SOURCE;

	/**
	 * The number of structural features of the '<em>Simple From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FROM_FEATURE_COUNT = FROM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FROM_OPERATION_COUNT = FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.CompositeFromImpl <em>Composite From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.CompositeFromImpl
	 * @see query.impl.QueryPackageImpl#getCompositeFrom()
	 * @generated
	 */
	int COMPOSITE_FROM = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FROM__SOURCE = FROM__SOURCE;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FROM__JOIN = FROM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FROM__ON = FROM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FROM_FEATURE_COUNT = FROM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FROM_OPERATION_COUNT = FROM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ConditionImpl
	 * @see query.impl.QueryPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PREDICATE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.SimpleConditionImpl <em>Simple Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.SimpleConditionImpl
	 * @see query.impl.QueryPackageImpl#getSimpleCondition()
	 * @generated
	 */
	int SIMPLE_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION__PREDICATE = CONDITION__PREDICATE;

	/**
	 * The number of structural features of the '<em>Simple Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.CompositeConditionImpl
	 * @see query.impl.QueryPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__PREDICATE = CONDITION__PREDICATE;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONNECTION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__ON = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.ComparisonPredicateImpl <em>Comparison Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ComparisonPredicateImpl
	 * @see query.impl.QueryPackageImpl#getComparisonPredicate()
	 * @generated
	 */
	int COMPARISON_PREDICATE = 8;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PREDICATE__COMPARISON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PREDICATE__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PREDICATE__NOT = 2;

	/**
	 * The number of structural features of the '<em>Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PREDICATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.ModelValueComparisonPredicateImpl <em>Model Value Comparison Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ModelValueComparisonPredicateImpl
	 * @see query.impl.QueryPackageImpl#getModelValueComparisonPredicate()
	 * @generated
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE = 9;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE__COMPARISON_TYPE = COMPARISON_PREDICATE__COMPARISON_TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE__LEFT = COMPARISON_PREDICATE__LEFT;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE__NOT = COMPARISON_PREDICATE__NOT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE__RIGHT = COMPARISON_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE_FEATURE_COUNT = COMPARISON_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_VALUE_COMPARISON_PREDICATE_OPERATION_COUNT = COMPARISON_PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.PrimitiveValueComparisonPredicateImpl <em>Primitive Value Comparison Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.PrimitiveValueComparisonPredicateImpl
	 * @see query.impl.QueryPackageImpl#getPrimitiveValueComparisonPredicate()
	 * @generated
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE = 10;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE__COMPARISON_TYPE = COMPARISON_PREDICATE__COMPARISON_TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE__LEFT = COMPARISON_PREDICATE__LEFT;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE__NOT = COMPARISON_PREDICATE__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE__VALUE = COMPARISON_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE_FEATURE_COUNT = COMPARISON_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_VALUE_COMPARISON_PREDICATE_OPERATION_COUNT = COMPARISON_PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.QueryParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.QueryParamImpl
	 * @see query.impl.QueryPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.ParamValueComparisonPredicateImpl <em>Param Value Comparison Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ParamValueComparisonPredicateImpl
	 * @see query.impl.QueryPackageImpl#getParamValueComparisonPredicate()
	 * @generated
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE = 12;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE__COMPARISON_TYPE = COMPARISON_PREDICATE__COMPARISON_TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE__LEFT = COMPARISON_PREDICATE__LEFT;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE__NOT = COMPARISON_PREDICATE__NOT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE__RIGHT = COMPARISON_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE_FEATURE_COUNT = COMPARISON_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param Value Comparison Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALUE_COMPARISON_PREDICATE_OPERATION_COUNT = COMPARISON_PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.JoinType <em>Join Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.JoinType
	 * @see query.impl.QueryPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 13;

	/**
	 * The meta object id for the '{@link query.ComparisonType <em>Comparison Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.ComparisonType
	 * @see query.impl.QueryPackageImpl#getComparisonType()
	 * @generated
	 */
	int COMPARISON_TYPE = 14;

	/**
	 * The meta object id for the '{@link query.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.ConnectionType
	 * @see query.impl.QueryPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link query.QuerySet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see query.QuerySet
	 * @generated
	 */
	EClass getQuerySet();

	/**
	 * Returns the meta object for the containment reference list '{@link query.QuerySet#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see query.QuerySet#getQueries()
	 * @see #getQuerySet()
	 * @generated
	 */
	EReference getQuerySet_Queries();

	/**
	 * Returns the meta object for the attribute list '{@link query.QuerySet#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imported Namespace</em>'.
	 * @see query.QuerySet#getImportedNamespace()
	 * @see #getQuerySet()
	 * @generated
	 */
	EAttribute getQuerySet_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link query.QuerySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.QuerySet#getName()
	 * @see #getQuerySet()
	 * @generated
	 */
	EAttribute getQuerySet_Name();

	/**
	 * Returns the meta object for class '{@link query.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see query.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the reference list '{@link query.Select#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selection</em>'.
	 * @see query.Select#getSelection()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Selection();

	/**
	 * Returns the meta object for the containment reference list '{@link query.Select#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From</em>'.
	 * @see query.Select#getFrom()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_From();

	/**
	 * Returns the meta object for the attribute '{@link query.Select#isSelectAll <em>Select All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select All</em>'.
	 * @see query.Select#isSelectAll()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_SelectAll();

	/**
	 * Returns the meta object for the containment reference '{@link query.Select#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see query.Select#getWhere()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Where();

	/**
	 * Returns the meta object for the attribute '{@link query.Select#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.Select#getName()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query.Select#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see query.Select#getParams()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Params();

	/**
	 * Returns the meta object for class '{@link query.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see query.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the reference '{@link query.From#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see query.From#getSource()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Source();

	/**
	 * Returns the meta object for class '{@link query.SimpleFrom <em>Simple From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple From</em>'.
	 * @see query.SimpleFrom
	 * @generated
	 */
	EClass getSimpleFrom();

	/**
	 * Returns the meta object for class '{@link query.CompositeFrom <em>Composite From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite From</em>'.
	 * @see query.CompositeFrom
	 * @generated
	 */
	EClass getCompositeFrom();

	/**
	 * Returns the meta object for the attribute '{@link query.CompositeFrom#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join</em>'.
	 * @see query.CompositeFrom#getJoin()
	 * @see #getCompositeFrom()
	 * @generated
	 */
	EAttribute getCompositeFrom_Join();

	/**
	 * Returns the meta object for the containment reference '{@link query.CompositeFrom#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On</em>'.
	 * @see query.CompositeFrom#getOn()
	 * @see #getCompositeFrom()
	 * @generated
	 */
	EReference getCompositeFrom_On();

	/**
	 * Returns the meta object for class '{@link query.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see query.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link query.Condition#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see query.Condition#getPredicate()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Predicate();

	/**
	 * Returns the meta object for class '{@link query.SimpleCondition <em>Simple Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Condition</em>'.
	 * @see query.SimpleCondition
	 * @generated
	 */
	EClass getSimpleCondition();

	/**
	 * Returns the meta object for class '{@link query.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see query.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link query.CompositeCondition#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see query.CompositeCondition#getConnection()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link query.CompositeCondition#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On</em>'.
	 * @see query.CompositeCondition#getOn()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_On();

	/**
	 * Returns the meta object for class '{@link query.ComparisonPredicate <em>Comparison Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Predicate</em>'.
	 * @see query.ComparisonPredicate
	 * @generated
	 */
	EClass getComparisonPredicate();

	/**
	 * Returns the meta object for the attribute '{@link query.ComparisonPredicate#getComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Type</em>'.
	 * @see query.ComparisonPredicate#getComparisonType()
	 * @see #getComparisonPredicate()
	 * @generated
	 */
	EAttribute getComparisonPredicate_ComparisonType();

	/**
	 * Returns the meta object for the reference '{@link query.ComparisonPredicate#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see query.ComparisonPredicate#getLeft()
	 * @see #getComparisonPredicate()
	 * @generated
	 */
	EReference getComparisonPredicate_Left();

	/**
	 * Returns the meta object for the attribute '{@link query.ComparisonPredicate#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see query.ComparisonPredicate#isNot()
	 * @see #getComparisonPredicate()
	 * @generated
	 */
	EAttribute getComparisonPredicate_Not();

	/**
	 * Returns the meta object for class '{@link query.ModelValueComparisonPredicate <em>Model Value Comparison Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Value Comparison Predicate</em>'.
	 * @see query.ModelValueComparisonPredicate
	 * @generated
	 */
	EClass getModelValueComparisonPredicate();

	/**
	 * Returns the meta object for the reference '{@link query.ModelValueComparisonPredicate#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see query.ModelValueComparisonPredicate#getRight()
	 * @see #getModelValueComparisonPredicate()
	 * @generated
	 */
	EReference getModelValueComparisonPredicate_Right();

	/**
	 * Returns the meta object for class '{@link query.PrimitiveValueComparisonPredicate <em>Primitive Value Comparison Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Value Comparison Predicate</em>'.
	 * @see query.PrimitiveValueComparisonPredicate
	 * @generated
	 */
	EClass getPrimitiveValueComparisonPredicate();

	/**
	 * Returns the meta object for the attribute '{@link query.PrimitiveValueComparisonPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see query.PrimitiveValueComparisonPredicate#getValue()
	 * @see #getPrimitiveValueComparisonPredicate()
	 * @generated
	 */
	EAttribute getPrimitiveValueComparisonPredicate_Value();

	/**
	 * Returns the meta object for class '{@link query.QueryParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see query.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link query.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link query.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see query.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for class '{@link query.ParamValueComparisonPredicate <em>Param Value Comparison Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Value Comparison Predicate</em>'.
	 * @see query.ParamValueComparisonPredicate
	 * @generated
	 */
	EClass getParamValueComparisonPredicate();

	/**
	 * Returns the meta object for the reference '{@link query.ParamValueComparisonPredicate#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see query.ParamValueComparisonPredicate#getRight()
	 * @see #getParamValueComparisonPredicate()
	 * @generated
	 */
	EReference getParamValueComparisonPredicate_Right();

	/**
	 * Returns the meta object for enum '{@link query.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Type</em>'.
	 * @see query.JoinType
	 * @generated
	 */
	EEnum getJoinType();

	/**
	 * Returns the meta object for enum '{@link query.ComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Type</em>'.
	 * @see query.ComparisonType
	 * @generated
	 */
	EEnum getComparisonType();

	/**
	 * Returns the meta object for enum '{@link query.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see query.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

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
		 * The meta object literal for the '{@link query.impl.QuerySetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.QuerySetImpl
		 * @see query.impl.QueryPackageImpl#getQuerySet()
		 * @generated
		 */
		EClass QUERY_SET = eINSTANCE.getQuerySet();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_SET__QUERIES = eINSTANCE.getQuerySet_Queries();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SET__IMPORTED_NAMESPACE = eINSTANCE.getQuerySet_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_SET__NAME = eINSTANCE.getQuerySet_Name();

		/**
		 * The meta object literal for the '{@link query.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.SelectImpl
		 * @see query.impl.QueryPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__SELECTION = eINSTANCE.getSelect_Selection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__FROM = eINSTANCE.getSelect_From();

		/**
		 * The meta object literal for the '<em><b>Select All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__SELECT_ALL = eINSTANCE.getSelect_SelectAll();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__WHERE = eINSTANCE.getSelect_Where();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__NAME = eINSTANCE.getSelect_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__PARAMS = eINSTANCE.getSelect_Params();

		/**
		 * The meta object literal for the '{@link query.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FromImpl
		 * @see query.impl.QueryPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__SOURCE = eINSTANCE.getFrom_Source();

		/**
		 * The meta object literal for the '{@link query.impl.SimpleFromImpl <em>Simple From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.SimpleFromImpl
		 * @see query.impl.QueryPackageImpl#getSimpleFrom()
		 * @generated
		 */
		EClass SIMPLE_FROM = eINSTANCE.getSimpleFrom();

		/**
		 * The meta object literal for the '{@link query.impl.CompositeFromImpl <em>Composite From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.CompositeFromImpl
		 * @see query.impl.QueryPackageImpl#getCompositeFrom()
		 * @generated
		 */
		EClass COMPOSITE_FROM = eINSTANCE.getCompositeFrom();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_FROM__JOIN = eINSTANCE.getCompositeFrom_Join();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FROM__ON = eINSTANCE.getCompositeFrom_On();

		/**
		 * The meta object literal for the '{@link query.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ConditionImpl
		 * @see query.impl.QueryPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PREDICATE = eINSTANCE.getCondition_Predicate();

		/**
		 * The meta object literal for the '{@link query.impl.SimpleConditionImpl <em>Simple Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.SimpleConditionImpl
		 * @see query.impl.QueryPackageImpl#getSimpleCondition()
		 * @generated
		 */
		EClass SIMPLE_CONDITION = eINSTANCE.getSimpleCondition();

		/**
		 * The meta object literal for the '{@link query.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.CompositeConditionImpl
		 * @see query.impl.QueryPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__CONNECTION = eINSTANCE.getCompositeCondition_Connection();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__ON = eINSTANCE.getCompositeCondition_On();

		/**
		 * The meta object literal for the '{@link query.impl.ComparisonPredicateImpl <em>Comparison Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ComparisonPredicateImpl
		 * @see query.impl.QueryPackageImpl#getComparisonPredicate()
		 * @generated
		 */
		EClass COMPARISON_PREDICATE = eINSTANCE.getComparisonPredicate();

		/**
		 * The meta object literal for the '<em><b>Comparison Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_PREDICATE__COMPARISON_TYPE = eINSTANCE.getComparisonPredicate_ComparisonType();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_PREDICATE__LEFT = eINSTANCE.getComparisonPredicate_Left();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_PREDICATE__NOT = eINSTANCE.getComparisonPredicate_Not();

		/**
		 * The meta object literal for the '{@link query.impl.ModelValueComparisonPredicateImpl <em>Model Value Comparison Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ModelValueComparisonPredicateImpl
		 * @see query.impl.QueryPackageImpl#getModelValueComparisonPredicate()
		 * @generated
		 */
		EClass MODEL_VALUE_COMPARISON_PREDICATE = eINSTANCE.getModelValueComparisonPredicate();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_VALUE_COMPARISON_PREDICATE__RIGHT = eINSTANCE.getModelValueComparisonPredicate_Right();

		/**
		 * The meta object literal for the '{@link query.impl.PrimitiveValueComparisonPredicateImpl <em>Primitive Value Comparison Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.PrimitiveValueComparisonPredicateImpl
		 * @see query.impl.QueryPackageImpl#getPrimitiveValueComparisonPredicate()
		 * @generated
		 */
		EClass PRIMITIVE_VALUE_COMPARISON_PREDICATE = eINSTANCE.getPrimitiveValueComparisonPredicate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_VALUE_COMPARISON_PREDICATE__VALUE = eINSTANCE.getPrimitiveValueComparisonPredicate_Value();

		/**
		 * The meta object literal for the '{@link query.impl.QueryParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.QueryParamImpl
		 * @see query.impl.QueryPackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__NAME = eINSTANCE.getQueryParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__TYPE = eINSTANCE.getQueryParam_Type();

		/**
		 * The meta object literal for the '{@link query.impl.ParamValueComparisonPredicateImpl <em>Param Value Comparison Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ParamValueComparisonPredicateImpl
		 * @see query.impl.QueryPackageImpl#getParamValueComparisonPredicate()
		 * @generated
		 */
		EClass PARAM_VALUE_COMPARISON_PREDICATE = eINSTANCE.getParamValueComparisonPredicate();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALUE_COMPARISON_PREDICATE__RIGHT = eINSTANCE.getParamValueComparisonPredicate_Right();

		/**
		 * The meta object literal for the '{@link query.JoinType <em>Join Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.JoinType
		 * @see query.impl.QueryPackageImpl#getJoinType()
		 * @generated
		 */
		EEnum JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '{@link query.ComparisonType <em>Comparison Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.ComparisonType
		 * @see query.impl.QueryPackageImpl#getComparisonType()
		 * @generated
		 */
		EEnum COMPARISON_TYPE = eINSTANCE.getComparisonType();

		/**
		 * The meta object literal for the '{@link query.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.ConnectionType
		 * @see query.impl.QueryPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

	}

} //QueryPackage
