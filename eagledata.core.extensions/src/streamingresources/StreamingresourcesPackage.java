/**
 */
package streamingresources;

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
 * @see streamingresources.StreamingresourcesFactory
 * @model kind="package"
 * @generated
 */
public interface StreamingresourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "streamingresources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.core.eagledata/streamingresources/StreamingResources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "streamingresources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamingresourcesPackage eINSTANCE = streamingresources.impl.StreamingresourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link streamingresources.impl.StreamingResourceImpl <em>Streaming Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see streamingresources.impl.StreamingResourceImpl
	 * @see streamingresources.impl.StreamingresourcesPackageImpl#getStreamingResource()
	 * @generated
	 */
	int STREAMING_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE__MESSAGES = 1;

	/**
	 * The number of structural features of the '<em>Streaming Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Streaming Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link streamingresources.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see streamingresources.impl.MessageImpl
	 * @see streamingresources.impl.StreamingresourcesPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

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
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link streamingresources.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see streamingresources.impl.UserImpl
	 * @see streamingresources.impl.StreamingresourcesPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

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
	 * The meta object id for the '{@link streamingresources.impl.StreamingResourceSetImpl <em>Streaming Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see streamingresources.impl.StreamingResourceSetImpl
	 * @see streamingresources.impl.StreamingresourcesPackageImpl#getStreamingResourceSet()
	 * @generated
	 */
	int STREAMING_RESOURCE_SET = 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_SET__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_SET__ASSISTANT = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_SET__USERS = 2;

	/**
	 * The number of structural features of the '<em>Streaming Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Streaming Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMING_RESOURCE_SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link streamingresources.StreamingResource <em>Streaming Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streaming Resource</em>'.
	 * @see streamingresources.StreamingResource
	 * @generated
	 */
	EClass getStreamingResource();

	/**
	 * Returns the meta object for the reference '{@link streamingresources.StreamingResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Description</em>'.
	 * @see streamingresources.StreamingResource#getDescription()
	 * @see #getStreamingResource()
	 * @generated
	 */
	EReference getStreamingResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link streamingresources.StreamingResource#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see streamingresources.StreamingResource#getMessages()
	 * @see #getStreamingResource()
	 * @generated
	 */
	EReference getStreamingResource_Messages();

	/**
	 * Returns the meta object for class '{@link streamingresources.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see streamingresources.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link streamingresources.Message#getFullContent <em>Full Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Content</em>'.
	 * @see streamingresources.Message#getFullContent()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_FullContent();

	/**
	 * Returns the meta object for the attribute '{@link streamingresources.Message#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see streamingresources.Message#getText()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Text();

	/**
	 * Returns the meta object for the reference '{@link streamingresources.Message#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see streamingresources.Message#getUser()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_User();

	/**
	 * Returns the meta object for class '{@link streamingresources.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see streamingresources.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link streamingresources.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see streamingresources.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for class '{@link streamingresources.StreamingResourceSet <em>Streaming Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streaming Resource Set</em>'.
	 * @see streamingresources.StreamingResourceSet
	 * @generated
	 */
	EClass getStreamingResourceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link streamingresources.StreamingResourceSet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see streamingresources.StreamingResourceSet#getResources()
	 * @see #getStreamingResourceSet()
	 * @generated
	 */
	EReference getStreamingResourceSet_Resources();

	/**
	 * Returns the meta object for the attribute '{@link streamingresources.StreamingResourceSet#getAssistant <em>Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assistant</em>'.
	 * @see streamingresources.StreamingResourceSet#getAssistant()
	 * @see #getStreamingResourceSet()
	 * @generated
	 */
	EAttribute getStreamingResourceSet_Assistant();

	/**
	 * Returns the meta object for the containment reference list '{@link streamingresources.StreamingResourceSet#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see streamingresources.StreamingResourceSet#getUsers()
	 * @see #getStreamingResourceSet()
	 * @generated
	 */
	EReference getStreamingResourceSet_Users();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamingresourcesFactory getStreamingresourcesFactory();

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
		 * The meta object literal for the '{@link streamingresources.impl.StreamingResourceImpl <em>Streaming Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see streamingresources.impl.StreamingResourceImpl
		 * @see streamingresources.impl.StreamingresourcesPackageImpl#getStreamingResource()
		 * @generated
		 */
		EClass STREAMING_RESOURCE = eINSTANCE.getStreamingResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_RESOURCE__DESCRIPTION = eINSTANCE.getStreamingResource_Description();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_RESOURCE__MESSAGES = eINSTANCE.getStreamingResource_Messages();

		/**
		 * The meta object literal for the '{@link streamingresources.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see streamingresources.impl.MessageImpl
		 * @see streamingresources.impl.StreamingresourcesPackageImpl#getMessage()
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
		 * The meta object literal for the '{@link streamingresources.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see streamingresources.impl.UserImpl
		 * @see streamingresources.impl.StreamingresourcesPackageImpl#getUser()
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
		 * The meta object literal for the '{@link streamingresources.impl.StreamingResourceSetImpl <em>Streaming Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see streamingresources.impl.StreamingResourceSetImpl
		 * @see streamingresources.impl.StreamingresourcesPackageImpl#getStreamingResourceSet()
		 * @generated
		 */
		EClass STREAMING_RESOURCE_SET = eINSTANCE.getStreamingResourceSet();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_RESOURCE_SET__RESOURCES = eINSTANCE.getStreamingResourceSet_Resources();

		/**
		 * The meta object literal for the '<em><b>Assistant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAMING_RESOURCE_SET__ASSISTANT = eINSTANCE.getStreamingResourceSet_Assistant();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMING_RESOURCE_SET__USERS = eINSTANCE.getStreamingResourceSet_Users();

	}

} //StreamingresourcesPackage
