/**
 */
package resourceset.impl;

import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;

import eagledata.core.dsl.pattern.streamingDsl.StreamingDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import resourceset.BasedOnDescriptionDataResource;
import resourceset.BasedOnStreamingDataResource;
import resourceset.Column;
import resourceset.DataResource;
import resourceset.DataResourceSet;
import resourceset.Message;
import resourceset.MessagePart;
import resourceset.MessageSet;
import resourceset.PrimitiveColumn;
import resourceset.ResourcesetFactory;
import resourceset.ResourcesetPackage;
import resourceset.Table;
import resourceset.TableColumn;
import resourceset.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesetPackageImpl extends EPackageImpl implements ResourcesetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basedOnStreamingDataResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basedOnDescriptionDataResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagePartEClass = null;

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
	 * @see resourceset.ResourcesetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourcesetPackageImpl() {
		super(eNS_URI, ResourcesetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourcesetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourcesetPackage init() {
		if (isInited) return (ResourcesetPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesetPackage.eNS_URI);

		// Obtain or create and register package
		ResourcesetPackageImpl theResourcesetPackage = (ResourcesetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourcesetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourcesetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DataDslPackage.eINSTANCE.eClass();
		StreamingDslPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResourcesetPackage.createPackageContents();

		// Initialize created meta-data
		theResourcesetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourcesetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourcesetPackage.eNS_URI, theResourcesetPackage);
		return theResourcesetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_FullContent() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Text() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_User() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_MessageParts() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableColumn() {
		return tableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableColumn_Columns() {
		return (EReference)tableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResourceSet() {
		return dataResourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataResourceSet_Resources() {
		return (EReference)dataResourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasedOnStreamingDataResource() {
		return basedOnStreamingDataResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasedOnStreamingDataResource_Description() {
		return (EReference)basedOnStreamingDataResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasedOnStreamingDataResource_Content() {
		return (EReference)basedOnStreamingDataResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasedOnDescriptionDataResource() {
		return basedOnDescriptionDataResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasedOnDescriptionDataResource_Description() {
		return (EReference)basedOnDescriptionDataResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasedOnDescriptionDataResource_Content() {
		return (EReference)basedOnDescriptionDataResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasedOnDescriptionDataResource_Path() {
		return (EAttribute)basedOnDescriptionDataResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataResource() {
		return dataResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataResource_Assistant() {
		return (EAttribute)dataResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSet() {
		return messageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSet_Messages() {
		return (EReference)messageSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageSet_Users() {
		return (EReference)messageSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveColumn() {
		return primitiveColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveColumn_Metadata() {
		return (EReference)primitiveColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveColumn_Values() {
		return (EAttribute)primitiveColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagePart() {
		return messagePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessagePart_TextPart() {
		return (EAttribute)messagePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePart_Concept() {
		return (EReference)messagePartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesetFactory getResourcesetFactory() {
		return (ResourcesetFactory)getEFactoryInstance();
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
		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__FULL_CONTENT);
		createEAttribute(messageEClass, MESSAGE__TEXT);
		createEReference(messageEClass, MESSAGE__USER);
		createEReference(messageEClass, MESSAGE__MESSAGE_PARTS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);

		tableColumnEClass = createEClass(TABLE_COLUMN);
		createEReference(tableColumnEClass, TABLE_COLUMN__COLUMNS);

		dataResourceSetEClass = createEClass(DATA_RESOURCE_SET);
		createEReference(dataResourceSetEClass, DATA_RESOURCE_SET__RESOURCES);

		basedOnStreamingDataResourceEClass = createEClass(BASED_ON_STREAMING_DATA_RESOURCE);
		createEReference(basedOnStreamingDataResourceEClass, BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION);
		createEReference(basedOnStreamingDataResourceEClass, BASED_ON_STREAMING_DATA_RESOURCE__CONTENT);

		basedOnDescriptionDataResourceEClass = createEClass(BASED_ON_DESCRIPTION_DATA_RESOURCE);
		createEReference(basedOnDescriptionDataResourceEClass, BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION);
		createEReference(basedOnDescriptionDataResourceEClass, BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT);
		createEAttribute(basedOnDescriptionDataResourceEClass, BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH);

		dataResourceEClass = createEClass(DATA_RESOURCE);
		createEAttribute(dataResourceEClass, DATA_RESOURCE__ASSISTANT);

		messageSetEClass = createEClass(MESSAGE_SET);
		createEReference(messageSetEClass, MESSAGE_SET__MESSAGES);
		createEReference(messageSetEClass, MESSAGE_SET__USERS);

		primitiveColumnEClass = createEClass(PRIMITIVE_COLUMN);
		createEReference(primitiveColumnEClass, PRIMITIVE_COLUMN__METADATA);
		createEAttribute(primitiveColumnEClass, PRIMITIVE_COLUMN__VALUES);

		columnEClass = createEClass(COLUMN);

		messagePartEClass = createEClass(MESSAGE_PART);
		createEAttribute(messagePartEClass, MESSAGE_PART__TEXT_PART);
		createEReference(messagePartEClass, MESSAGE_PART__CONCEPT);
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
		StreamingDslPackage theStreamingDslPackage = (StreamingDslPackage)EPackage.Registry.INSTANCE.getEPackage(StreamingDslPackage.eNS_URI);
		DataDslPackage theDataDslPackage = (DataDslPackage)EPackage.Registry.INSTANCE.getEPackage(DataDslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tableColumnEClass.getESuperTypes().add(this.getColumn());
		basedOnStreamingDataResourceEClass.getESuperTypes().add(this.getDataResource());
		basedOnDescriptionDataResourceEClass.getESuperTypes().add(this.getDataResource());
		primitiveColumnEClass.getESuperTypes().add(this.getColumn());

		// Initialize classes, features, and operations; add parameters
		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_FullContent(), ecorePackage.getEString(), "fullContent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Text(), ecorePackage.getEString(), "text", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_User(), this.getUser(), null, "user", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_MessageParts(), this.getMessagePart(), null, "messageParts", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), ecorePackage.getEString(), "id", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnEClass, TableColumn.class, "TableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableColumn_Columns(), this.getColumn(), null, "columns", null, 0, -1, TableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataResourceSetEClass, DataResourceSet.class, "DataResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataResourceSet_Resources(), this.getDataResource(), null, "resources", null, 0, -1, DataResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basedOnStreamingDataResourceEClass, BasedOnStreamingDataResource.class, "BasedOnStreamingDataResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasedOnStreamingDataResource_Description(), theStreamingDslPackage.getPhrase(), null, "description", null, 0, 1, BasedOnStreamingDataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasedOnStreamingDataResource_Content(), this.getMessageSet(), null, "content", null, 0, 1, BasedOnStreamingDataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basedOnDescriptionDataResourceEClass, BasedOnDescriptionDataResource.class, "BasedOnDescriptionDataResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasedOnDescriptionDataResource_Description(), theDataDslPackage.getDataDescription(), null, "description", null, 0, 1, BasedOnDescriptionDataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasedOnDescriptionDataResource_Content(), this.getTable(), null, "content", null, 0, 1, BasedOnDescriptionDataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasedOnDescriptionDataResource_Path(), ecorePackage.getEString(), "path", null, 0, 1, BasedOnDescriptionDataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataResourceEClass, DataResource.class, "DataResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataResource_Assistant(), ecorePackage.getEString(), "assistant", null, 0, 1, DataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSetEClass, MessageSet.class, "MessageSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageSet_Messages(), this.getMessage(), null, "messages", null, 0, -1, MessageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageSet_Users(), this.getUser(), null, "users", null, 0, -1, MessageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveColumnEClass, PrimitiveColumn.class, "PrimitiveColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveColumn_Metadata(), theDataDslPackage.getPrimitiveNode(), null, "metadata", null, 0, 1, PrimitiveColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveColumn_Values(), ecorePackage.getEString(), "values", null, 0, -1, PrimitiveColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messagePartEClass, MessagePart.class, "MessagePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessagePart_TextPart(), ecorePackage.getEString(), "textPart", null, 0, 1, MessagePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessagePart_Concept(), theStreamingDslPackage.getFeature(), null, "concept", null, 0, 1, MessagePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourcesetPackageImpl
