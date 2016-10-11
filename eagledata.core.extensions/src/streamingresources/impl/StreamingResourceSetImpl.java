/**
 */
package streamingresources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import streamingresources.StreamingResource;
import streamingresources.StreamingResourceSet;
import streamingresources.StreamingresourcesPackage;
import streamingresources.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streaming Resource Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link streamingresources.impl.StreamingResourceSetImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link streamingresources.impl.StreamingResourceSetImpl#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link streamingresources.impl.StreamingResourceSetImpl#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamingResourceSetImpl extends MinimalEObjectImpl.Container implements StreamingResourceSet {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<StreamingResource> resources;

	/**
	 * The default value of the '{@link #getAssistant() <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSISTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssistant() <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssistant()
	 * @generated
	 * @ordered
	 */
	protected String assistant = ASSISTANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamingResourceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingresourcesPackage.Literals.STREAMING_RESOURCE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreamingResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<StreamingResource>(StreamingResource.class, this, StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssistant() {
		return assistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssistant(String newAssistant) {
		String oldAssistant = assistant;
		assistant = newAssistant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingresourcesPackage.STREAMING_RESOURCE_SET__ASSISTANT, oldAssistant, assistant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES:
				return getResources();
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__ASSISTANT:
				return getAssistant();
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS:
				return getUsers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends StreamingResource>)newValue);
				return;
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__ASSISTANT:
				setAssistant((String)newValue);
				return;
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES:
				getResources().clear();
				return;
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__ASSISTANT:
				setAssistant(ASSISTANT_EDEFAULT);
				return;
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS:
				getUsers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__RESOURCES:
				return resources != null && !resources.isEmpty();
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__ASSISTANT:
				return ASSISTANT_EDEFAULT == null ? assistant != null : !ASSISTANT_EDEFAULT.equals(assistant);
			case StreamingresourcesPackage.STREAMING_RESOURCE_SET__USERS:
				return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assistant: ");
		result.append(assistant);
		result.append(')');
		return result.toString();
	}

} //StreamingResourceSetImpl
