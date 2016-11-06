/**
 */
package resourceset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see resourceset.ResourcesetFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resourceset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.core.eagledata/resourceset/DataResourceSet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesetPackage eINSTANCE = resourceset.impl.ResourcesetPackageImpl.init();

	/**
	 * The meta object id for the '{@link resourceset.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.MessageImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Full Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FULL_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TEXT = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__USER = 2;

	/**
	 * The feature id for the '<em><b>Message Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_PARTS = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.UserImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.TableImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.ColumnImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 10;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.TableColumnImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN__COLUMNS = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.DataResourceSetImpl <em>Data Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.DataResourceSetImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getDataResourceSet()
	 * @generated
	 */
	int DATA_RESOURCE_SET = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_SET__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Data Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.DataResourceImpl <em>Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.DataResourceImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getDataResource()
	 * @generated
	 */
	int DATA_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE__ASSISTANT = 0;

	/**
	 * The number of structural features of the '<em>Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.BasedOnStreamingDataResourceImpl <em>Based On Streaming Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.BasedOnStreamingDataResourceImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getBasedOnStreamingDataResource()
	 * @generated
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE__ASSISTANT = DATA_RESOURCE__ASSISTANT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE__CONTENT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Based On Streaming Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Based On Streaming Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_STREAMING_DATA_RESOURCE_OPERATION_COUNT = DATA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.BasedOnDescriptionDataResourceImpl <em>Based On Description Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.BasedOnDescriptionDataResourceImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getBasedOnDescriptionDataResource()
	 * @generated
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE__ASSISTANT = DATA_RESOURCE__ASSISTANT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION = DATA_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT = DATA_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH = DATA_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Based On Description Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE_FEATURE_COUNT = DATA_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Based On Description Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASED_ON_DESCRIPTION_DATA_RESOURCE_OPERATION_COUNT = DATA_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link resourceset.impl.MessageSetImpl <em>Message Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.MessageSetImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getMessageSet()
	 * @generated
	 */
	int MESSAGE_SET = 8;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__MESSAGES = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET__USERS = 1;

	/**
	 * The number of structural features of the '<em>Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_SET_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link resourceset.impl.PrimitiveColumnImpl <em>Primitive Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.PrimitiveColumnImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getPrimitiveColumn()
	 * @generated
	 */
	int PRIMITIVE_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COLUMN__METADATA = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COLUMN__VALUES = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link resourceset.impl.MessagePartImpl <em>Message Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see resourceset.impl.MessagePartImpl
	 * @see resourceset.impl.ResourcesetPackageImpl#getMessagePart()
	 * @generated
	 */
	int MESSAGE_PART = 11;

	/**
	 * The feature id for the '<em><b>Text Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART__TEXT_PART = 0;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART__CONCEPT = 1;

	/**
	 * The number of structural features of the '<em>Message Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Message Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PART_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link resourceset.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see resourceset.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.Message#getFullContent <em>Full Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Content</em>'.
	 * @see resourceset.Message#getFullContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_FullContent();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.Message#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see resourceset.Message#getText()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Text();

	/**
	 * Returns the meta object for the reference '{@link resourceset.Message#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see resourceset.Message#getUser()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_User();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.Message#getMessageParts <em>Message Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Parts</em>'.
	 * @see resourceset.Message#getMessageParts()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_MessageParts();

	/**
	 * Returns the meta object for class '{@link resourceset.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see resourceset.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see resourceset.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for class '{@link resourceset.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see resourceset.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see resourceset.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link resourceset.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see resourceset.TableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.TableColumn#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see resourceset.TableColumn#getColumns()
	 * @see #getTableColumn()
	 * @generated
	 */
	EReference getTableColumn_Columns();

	/**
	 * Returns the meta object for class '{@link resourceset.DataResourceSet <em>Data Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Resource Set</em>'.
	 * @see resourceset.DataResourceSet
	 * @generated
	 */
	EClass getDataResourceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.DataResourceSet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see resourceset.DataResourceSet#getResources()
	 * @see #getDataResourceSet()
	 * @generated
	 */
	EReference getDataResourceSet_Resources();

	/**
	 * Returns the meta object for class '{@link resourceset.BasedOnStreamingDataResource <em>Based On Streaming Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Based On Streaming Data Resource</em>'.
	 * @see resourceset.BasedOnStreamingDataResource
	 * @generated
	 */
	EClass getBasedOnStreamingDataResource();

	/**
	 * Returns the meta object for the reference '{@link resourceset.BasedOnStreamingDataResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see resourceset.BasedOnStreamingDataResource#getDescription()
	 * @see #getBasedOnStreamingDataResource()
	 * @generated
	 */
	EReference getBasedOnStreamingDataResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link resourceset.BasedOnStreamingDataResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see resourceset.BasedOnStreamingDataResource#getContent()
	 * @see #getBasedOnStreamingDataResource()
	 * @generated
	 */
	EReference getBasedOnStreamingDataResource_Content();

	/**
	 * Returns the meta object for class '{@link resourceset.BasedOnDescriptionDataResource <em>Based On Description Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Based On Description Data Resource</em>'.
	 * @see resourceset.BasedOnDescriptionDataResource
	 * @generated
	 */
	EClass getBasedOnDescriptionDataResource();

	/**
	 * Returns the meta object for the reference '{@link resourceset.BasedOnDescriptionDataResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see resourceset.BasedOnDescriptionDataResource#getDescription()
	 * @see #getBasedOnDescriptionDataResource()
	 * @generated
	 */
	EReference getBasedOnDescriptionDataResource_Description();

	/**
	 * Returns the meta object for the containment reference '{@link resourceset.BasedOnDescriptionDataResource#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see resourceset.BasedOnDescriptionDataResource#getContent()
	 * @see #getBasedOnDescriptionDataResource()
	 * @generated
	 */
	EReference getBasedOnDescriptionDataResource_Content();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.BasedOnDescriptionDataResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see resourceset.BasedOnDescriptionDataResource#getPath()
	 * @see #getBasedOnDescriptionDataResource()
	 * @generated
	 */
	EAttribute getBasedOnDescriptionDataResource_Path();

	/**
	 * Returns the meta object for class '{@link resourceset.DataResource <em>Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Resource</em>'.
	 * @see resourceset.DataResource
	 * @generated
	 */
	EClass getDataResource();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.DataResource#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assistant</em>'.
	 * @see resourceset.DataResource#getAssistant()
	 * @see #getDataResource()
	 * @generated
	 */
	EAttribute getDataResource_Assistant();

	/**
	 * Returns the meta object for class '{@link resourceset.MessageSet <em>Message Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Set</em>'.
	 * @see resourceset.MessageSet
	 * @generated
	 */
	EClass getMessageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.MessageSet#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see resourceset.MessageSet#getMessages()
	 * @see #getMessageSet()
	 * @generated
	 */
	EReference getMessageSet_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link resourceset.MessageSet#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see resourceset.MessageSet#getUsers()
	 * @see #getMessageSet()
	 * @generated
	 */
	EReference getMessageSet_Users();

	/**
	 * Returns the meta object for class '{@link resourceset.PrimitiveColumn <em>Primitive Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Column</em>'.
	 * @see resourceset.PrimitiveColumn
	 * @generated
	 */
	EClass getPrimitiveColumn();

	/**
	 * Returns the meta object for the reference '{@link resourceset.PrimitiveColumn#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metadata</em>'.
	 * @see resourceset.PrimitiveColumn#getMetadata()
	 * @see #getPrimitiveColumn()
	 * @generated
	 */
	EReference getPrimitiveColumn_Metadata();

	/**
	 * Returns the meta object for the attribute list '{@link resourceset.PrimitiveColumn#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see resourceset.PrimitiveColumn#getValues()
	 * @see #getPrimitiveColumn()
	 * @generated
	 */
	EAttribute getPrimitiveColumn_Values();

	/**
	 * Returns the meta object for class '{@link resourceset.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see resourceset.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link resourceset.MessagePart <em>Message Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Part</em>'.
	 * @see resourceset.MessagePart
	 * @generated
	 */
	EClass getMessagePart();

	/**
	 * Returns the meta object for the attribute '{@link resourceset.MessagePart#getTextPart <em>Text Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Part</em>'.
	 * @see resourceset.MessagePart#getTextPart()
	 * @see #getMessagePart()
	 * @generated
	 */
	EAttribute getMessagePart_TextPart();

	/**
	 * Returns the meta object for the reference '{@link resourceset.MessagePart#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see resourceset.MessagePart#getConcept()
	 * @see #getMessagePart()
	 * @generated
	 */
	EReference getMessagePart_Concept();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesetFactory getResourcesetFactory();

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
		 * The meta object literal for the '{@link resourceset.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.MessageImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Full Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FULL_CONTENT = eINSTANCE.getMessage_FullContent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TEXT = eINSTANCE.getMessage_Text();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__USER = eINSTANCE.getMessage_User();

		/**
		 * The meta object literal for the '<em><b>Message Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MESSAGE_PARTS = eINSTANCE.getMessage_MessageParts();

		/**
		 * The meta object literal for the '{@link resourceset.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.UserImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '{@link resourceset.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.TableImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link resourceset.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.TableColumnImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN__COLUMNS = eINSTANCE.getTableColumn_Columns();

		/**
		 * The meta object literal for the '{@link resourceset.impl.DataResourceSetImpl <em>Data Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.DataResourceSetImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getDataResourceSet()
		 * @generated
		 */
		EClass DATA_RESOURCE_SET = eINSTANCE.getDataResourceSet();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_RESOURCE_SET__RESOURCES = eINSTANCE.getDataResourceSet_Resources();

		/**
		 * The meta object literal for the '{@link resourceset.impl.BasedOnStreamingDataResourceImpl <em>Based On Streaming Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.BasedOnStreamingDataResourceImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getBasedOnStreamingDataResource()
		 * @generated
		 */
		EClass BASED_ON_STREAMING_DATA_RESOURCE = eINSTANCE.getBasedOnStreamingDataResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION = eINSTANCE.getBasedOnStreamingDataResource_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_STREAMING_DATA_RESOURCE__CONTENT = eINSTANCE.getBasedOnStreamingDataResource_Content();

		/**
		 * The meta object literal for the '{@link resourceset.impl.BasedOnDescriptionDataResourceImpl <em>Based On Description Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.BasedOnDescriptionDataResourceImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getBasedOnDescriptionDataResource()
		 * @generated
		 */
		EClass BASED_ON_DESCRIPTION_DATA_RESOURCE = eINSTANCE.getBasedOnDescriptionDataResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION = eINSTANCE.getBasedOnDescriptionDataResource_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT = eINSTANCE.getBasedOnDescriptionDataResource_Content();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH = eINSTANCE.getBasedOnDescriptionDataResource_Path();

		/**
		 * The meta object literal for the '{@link resourceset.impl.DataResourceImpl <em>Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.DataResourceImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getDataResource()
		 * @generated
		 */
		EClass DATA_RESOURCE = eINSTANCE.getDataResource();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESOURCE__ASSISTANT = eINSTANCE.getDataResource_Assistant();

		/**
		 * The meta object literal for the '{@link resourceset.impl.MessageSetImpl <em>Message Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.MessageSetImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getMessageSet()
		 * @generated
		 */
		EClass MESSAGE_SET = eINSTANCE.getMessageSet();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_SET__MESSAGES = eINSTANCE.getMessageSet_Messages();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_SET__USERS = eINSTANCE.getMessageSet_Users();

		/**
		 * The meta object literal for the '{@link resourceset.impl.PrimitiveColumnImpl <em>Primitive Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.PrimitiveColumnImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getPrimitiveColumn()
		 * @generated
		 */
		EClass PRIMITIVE_COLUMN = eINSTANCE.getPrimitiveColumn();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_COLUMN__METADATA = eINSTANCE.getPrimitiveColumn_Metadata();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_COLUMN__VALUES = eINSTANCE.getPrimitiveColumn_Values();

		/**
		 * The meta object literal for the '{@link resourceset.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.ColumnImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link resourceset.impl.MessagePartImpl <em>Message Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see resourceset.impl.MessagePartImpl
		 * @see resourceset.impl.ResourcesetPackageImpl#getMessagePart()
		 * @generated
		 */
		EClass MESSAGE_PART = eINSTANCE.getMessagePart();

		/**
		 * The meta object literal for the '<em><b>Text Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_PART__TEXT_PART = eINSTANCE.getMessagePart_TextPart();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PART__CONCEPT = eINSTANCE.getMessagePart_Concept();

	}

} //ResourcesetPackage
