/**
 */
package resourceset.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import resourceset.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesetFactoryImpl extends EFactoryImpl implements ResourcesetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourcesetFactory init() {
		try {
			ResourcesetFactory theResourcesetFactory = (ResourcesetFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcesetPackage.eNS_URI);
			if (theResourcesetFactory != null) {
				return theResourcesetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourcesetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourcesetPackage.MESSAGE: return createMessage();
			case ResourcesetPackage.USER: return createUser();
			case ResourcesetPackage.TABLE: return createTable();
			case ResourcesetPackage.TABLE_COLUMN: return createTableColumn();
			case ResourcesetPackage.DATA_RESOURCE_SET: return createDataResourceSet();
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE: return createBasedOnStreamingDataResource();
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE: return createBasedOnDescriptionDataResource();
			case ResourcesetPackage.MESSAGE_SET: return createMessageSet();
			case ResourcesetPackage.PRIMITIVE_COLUMN: return createPrimitiveColumn();
			case ResourcesetPackage.MESSAGE_PART: return createMessagePart();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumn createTableColumn() {
		TableColumnImpl tableColumn = new TableColumnImpl();
		return tableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResourceSet createDataResourceSet() {
		DataResourceSetImpl dataResourceSet = new DataResourceSetImpl();
		return dataResourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOnStreamingDataResource createBasedOnStreamingDataResource() {
		BasedOnStreamingDataResourceImpl basedOnStreamingDataResource = new BasedOnStreamingDataResourceImpl();
		return basedOnStreamingDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedOnDescriptionDataResource createBasedOnDescriptionDataResource() {
		BasedOnDescriptionDataResourceImpl basedOnDescriptionDataResource = new BasedOnDescriptionDataResourceImpl();
		return basedOnDescriptionDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSet createMessageSet() {
		MessageSetImpl messageSet = new MessageSetImpl();
		return messageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveColumn createPrimitiveColumn() {
		PrimitiveColumnImpl primitiveColumn = new PrimitiveColumnImpl();
		return primitiveColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePart createMessagePart() {
		MessagePartImpl messagePart = new MessagePartImpl();
		return messagePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesetPackage getResourcesetPackage() {
		return (ResourcesetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourcesetPackage getPackage() {
		return ResourcesetPackage.eINSTANCE;
	}

} //ResourcesetFactoryImpl
