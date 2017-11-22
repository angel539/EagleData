/**
 */
package query.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import query.ComparisonPredicate;
import query.ComparisonType;
import query.CompositeCondition;
import query.CompositeFrom;
import query.Condition;
import query.ConnectionType;
import query.From;
import query.JoinType;
import query.ModelValueComparisonPredicate;
import query.ParamValueComparisonPredicate;
import query.PrimitiveValueComparisonPredicate;
import query.QueryFactory;
import query.QueryPackage;
import query.QueryParam;
import query.QuerySet;
import query.Select;
import query.SimpleCondition;
import query.SimpleFrom;

import semanticmanager.SemanticmanagerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPackageImpl extends EPackageImpl implements QueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass querySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelValueComparisonPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveValueComparisonPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramValueComparisonPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see query.QueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPackageImpl() {
		super(eNS_URI, QueryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryPackage init() {
		if (isInited) return (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Obtain or create and register package
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SemanticmanagerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryPackage.eNS_URI, theQueryPackage);
		return theQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuerySet() {
		return querySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuerySet_Queries() {
		return (EReference)querySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySet_ImportedNamespace() {
		return (EAttribute)querySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuerySet_Name() {
		return (EAttribute)querySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Selection() {
		return (EReference)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_From() {
		return (EReference)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_SelectAll() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Where() {
		return (EReference)selectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelect_Name() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Params() {
		return (EReference)selectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrom() {
		return fromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrom_Source() {
		return (EReference)fromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFrom() {
		return simpleFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFrom() {
		return compositeFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeFrom_Join() {
		return (EAttribute)compositeFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeFrom_On() {
		return (EReference)compositeFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Predicate() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleCondition() {
		return simpleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_Connection() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_On() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonPredicate() {
		return comparisonPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonPredicate_ComparisonType() {
		return (EAttribute)comparisonPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonPredicate_Left() {
		return (EReference)comparisonPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonPredicate_Not() {
		return (EAttribute)comparisonPredicateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelValueComparisonPredicate() {
		return modelValueComparisonPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelValueComparisonPredicate_Right() {
		return (EReference)modelValueComparisonPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveValueComparisonPredicate() {
		return primitiveValueComparisonPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveValueComparisonPredicate_Value() {
		return (EAttribute)primitiveValueComparisonPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Name() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Type() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamValueComparisonPredicate() {
		return paramValueComparisonPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValueComparisonPredicate_Right() {
		return (EReference)paramValueComparisonPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoinType() {
		return joinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonType() {
		return comparisonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactory getQueryFactory() {
		return (QueryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		querySetEClass = createEClass(QUERY_SET);
		createEReference(querySetEClass, QUERY_SET__QUERIES);
		createEAttribute(querySetEClass, QUERY_SET__IMPORTED_NAMESPACE);
		createEAttribute(querySetEClass, QUERY_SET__NAME);

		selectEClass = createEClass(SELECT);
		createEReference(selectEClass, SELECT__SELECTION);
		createEReference(selectEClass, SELECT__FROM);
		createEAttribute(selectEClass, SELECT__SELECT_ALL);
		createEReference(selectEClass, SELECT__WHERE);
		createEAttribute(selectEClass, SELECT__NAME);
		createEReference(selectEClass, SELECT__PARAMS);

		fromEClass = createEClass(FROM);
		createEReference(fromEClass, FROM__SOURCE);

		simpleFromEClass = createEClass(SIMPLE_FROM);

		compositeFromEClass = createEClass(COMPOSITE_FROM);
		createEAttribute(compositeFromEClass, COMPOSITE_FROM__JOIN);
		createEReference(compositeFromEClass, COMPOSITE_FROM__ON);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__PREDICATE);

		simpleConditionEClass = createEClass(SIMPLE_CONDITION);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__CONNECTION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__ON);

		comparisonPredicateEClass = createEClass(COMPARISON_PREDICATE);
		createEAttribute(comparisonPredicateEClass, COMPARISON_PREDICATE__COMPARISON_TYPE);
		createEReference(comparisonPredicateEClass, COMPARISON_PREDICATE__LEFT);
		createEAttribute(comparisonPredicateEClass, COMPARISON_PREDICATE__NOT);

		modelValueComparisonPredicateEClass = createEClass(MODEL_VALUE_COMPARISON_PREDICATE);
		createEReference(modelValueComparisonPredicateEClass, MODEL_VALUE_COMPARISON_PREDICATE__RIGHT);

		primitiveValueComparisonPredicateEClass = createEClass(PRIMITIVE_VALUE_COMPARISON_PREDICATE);
		createEAttribute(primitiveValueComparisonPredicateEClass, PRIMITIVE_VALUE_COMPARISON_PREDICATE__VALUE);

		queryParamEClass = createEClass(QUERY_PARAM);
		createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
		createEAttribute(queryParamEClass, QUERY_PARAM__TYPE);

		paramValueComparisonPredicateEClass = createEClass(PARAM_VALUE_COMPARISON_PREDICATE);
		createEReference(paramValueComparisonPredicateEClass, PARAM_VALUE_COMPARISON_PREDICATE__RIGHT);

		// Create enums
		joinTypeEEnum = createEEnum(JOIN_TYPE);
		comparisonTypeEEnum = createEEnum(COMPARISON_TYPE);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SemanticmanagerPackage theSemanticmanagerPackage = (SemanticmanagerPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticmanagerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleFromEClass.getESuperTypes().add(this.getFrom());
		compositeFromEClass.getESuperTypes().add(this.getFrom());
		simpleConditionEClass.getESuperTypes().add(this.getCondition());
		compositeConditionEClass.getESuperTypes().add(this.getCondition());
		modelValueComparisonPredicateEClass.getESuperTypes().add(this.getComparisonPredicate());
		primitiveValueComparisonPredicateEClass.getESuperTypes().add(this.getComparisonPredicate());
		paramValueComparisonPredicateEClass.getESuperTypes().add(this.getComparisonPredicate());

		// Initialize classes, features, and operations; add parameters
		initEClass(querySetEClass, QuerySet.class, "QuerySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuerySet_Queries(), this.getSelect(), null, "queries", null, 0, -1, QuerySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySet_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, -1, QuerySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuerySet_Name(), ecorePackage.getEString(), "name", null, 0, 1, QuerySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelect_Selection(), theSemanticmanagerPackage.getDataProperty(), null, "selection", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSelect_Selection().getEKeys().add(theSemanticmanagerPackage.getNamedElement_Name());
		initEReference(getSelect_From(), this.getFrom(), null, "from", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_SelectAll(), ecorePackage.getEBoolean(), "selectAll", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Where(), this.getCondition(), null, "where", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelect_Name(), ecorePackage.getEString(), "name", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Params(), this.getQueryParam(), null, "params", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromEClass, From.class, "From", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrom_Source(), theSemanticmanagerPackage.getSemanticNode(), null, "source", null, 1, 1, From.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFrom_Source().getEKeys().add(theSemanticmanagerPackage.getNamedElement_Name());

		initEClass(simpleFromEClass, SimpleFrom.class, "SimpleFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeFromEClass, CompositeFrom.class, "CompositeFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeFrom_Join(), this.getJoinType(), "join", null, 0, 1, CompositeFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeFrom_On(), this.getCondition(), null, "on", null, 1, 1, CompositeFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Predicate(), this.getComparisonPredicate(), null, "predicate", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleConditionEClass, SimpleCondition.class, "SimpleCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeCondition_Connection(), this.getConnectionType(), "connection", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_On(), this.getCondition(), null, "on", null, 1, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonPredicateEClass, ComparisonPredicate.class, "ComparisonPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonPredicate_ComparisonType(), this.getComparisonType(), "comparisonType", null, 1, 1, ComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonPredicate_Left(), theSemanticmanagerPackage.getDataProperty(), null, "left", null, 1, 1, ComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComparisonPredicate_Left().getEKeys().add(theSemanticmanagerPackage.getNamedElement_Name());
		initEAttribute(getComparisonPredicate_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, ComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelValueComparisonPredicateEClass, ModelValueComparisonPredicate.class, "ModelValueComparisonPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelValueComparisonPredicate_Right(), theSemanticmanagerPackage.getDataProperty(), null, "right", null, 0, 1, ModelValueComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveValueComparisonPredicateEClass, PrimitiveValueComparisonPredicate.class, "PrimitiveValueComparisonPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveValueComparisonPredicate_Value(), ecorePackage.getEString(), "value", null, 0, 1, PrimitiveValueComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_Type(), theSemanticmanagerPackage.getType(), "type", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramValueComparisonPredicateEClass, ParamValueComparisonPredicate.class, "ParamValueComparisonPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamValueComparisonPredicate_Right(), this.getQueryParam(), null, "right", null, 0, 1, ParamValueComparisonPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(joinTypeEEnum, JoinType.class, "JoinType");
		addEEnumLiteral(joinTypeEEnum, JoinType.INNER);
		addEEnumLiteral(joinTypeEEnum, JoinType.LEFT);
		addEEnumLiteral(joinTypeEEnum, JoinType.RIGHT);
		addEEnumLiteral(joinTypeEEnum, JoinType.OUTER);
		addEEnumLiteral(joinTypeEEnum, JoinType.LEFTOUTER);
		addEEnumLiteral(joinTypeEEnum, JoinType.RIGHTOUTER);

		initEEnum(comparisonTypeEEnum, ComparisonType.class, "ComparisonType");
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.EQUAL);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.NOTEQUAL);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.LESSTHAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.LESSTHANOREQUAL);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.GREATERTHAN);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.GREATERTHANOREQUAL);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.AND);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //QueryPackageImpl
