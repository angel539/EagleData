/**
 */
package streamingresources.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import streamingresources.Message;
import streamingresources.StreamingresourcesPackage;
import streamingresources.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link streamingresources.impl.MessageImpl#getFullContent <em>Full Content</em>}</li>
 *   <li>{@link streamingresources.impl.MessageImpl#getText <em>Text</em>}</li>
 *   <li>{@link streamingresources.impl.MessageImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getFullContent() <em>Full Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullContent()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullContent() <em>Full Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullContent()
	 * @generated
	 * @ordered
	 */
	protected String fullContent = FULL_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamingresourcesPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullContent() {
		return fullContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullContent(String newFullContent) {
		String oldFullContent = fullContent;
		fullContent = newFullContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingresourcesPackage.MESSAGE__FULL_CONTENT, oldFullContent, fullContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingresourcesPackage.MESSAGE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StreamingresourcesPackage.MESSAGE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamingresourcesPackage.MESSAGE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamingresourcesPackage.MESSAGE__FULL_CONTENT:
				return getFullContent();
			case StreamingresourcesPackage.MESSAGE__TEXT:
				return getText();
			case StreamingresourcesPackage.MESSAGE__USER:
				if (resolve) return getUser();
				return basicGetUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamingresourcesPackage.MESSAGE__FULL_CONTENT:
				setFullContent((String)newValue);
				return;
			case StreamingresourcesPackage.MESSAGE__TEXT:
				setText((String)newValue);
				return;
			case StreamingresourcesPackage.MESSAGE__USER:
				setUser((User)newValue);
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
			case StreamingresourcesPackage.MESSAGE__FULL_CONTENT:
				setFullContent(FULL_CONTENT_EDEFAULT);
				return;
			case StreamingresourcesPackage.MESSAGE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case StreamingresourcesPackage.MESSAGE__USER:
				setUser((User)null);
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
			case StreamingresourcesPackage.MESSAGE__FULL_CONTENT:
				return FULL_CONTENT_EDEFAULT == null ? fullContent != null : !FULL_CONTENT_EDEFAULT.equals(fullContent);
			case StreamingresourcesPackage.MESSAGE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case StreamingresourcesPackage.MESSAGE__USER:
				return user != null;
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
		result.append(" (fullContent: ");
		result.append(fullContent);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
