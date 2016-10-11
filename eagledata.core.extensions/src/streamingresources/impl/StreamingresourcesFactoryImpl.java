/**
 */
package streamingresources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import streamingresources.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamingresourcesFactoryImpl extends EFactoryImpl implements StreamingresourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreamingresourcesFactory init() {
		try {
			StreamingresourcesFactory theStreamingresourcesFactory = (StreamingresourcesFactory)EPackage.Registry.INSTANCE.getEFactory(StreamingresourcesPackage.eNS_URI);
			if (theStreamingresourcesFactory != null) {
				return theStreamingresourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StreamingresourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingresourcesFactoryImpl() {
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
			case StreamingresourcesPackage.STREAMING_RESOURCE: return createStreamingResource();
			case StreamingresourcesPackage.MESSAGE: return createMessage();
			case StreamingresourcesPackage.USER: return createUser();
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET: return createStreamingResourceSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingResource createStreamingResource() {
		StreamingResourceImpl streamingResource = new StreamingResourceImpl();
		return streamingResource;
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
	public StreamingResourceSet createStreamingResourceSet() {
		StreamingResourceSetImpl streamingResourceSet = new StreamingResourceSetImpl();
		return streamingResourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamingresourcesPackage getStreamingresourcesPackage() {
		return (StreamingresourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StreamingresourcesPackage getPackage() {
		return StreamingresourcesPackage.eINSTANCE;
	}

} //StreamingresourcesFactoryImpl
