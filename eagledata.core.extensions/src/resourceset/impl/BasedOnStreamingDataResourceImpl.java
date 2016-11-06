/**
 */
package resourceset.impl;

import eagledata.core.dsl.pattern.streamingDsl.Phrase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import resourceset.BasedOnStreamingDataResource;
import resourceset.MessageSet;
import resourceset.ResourcesetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Based On Streaming Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceset.impl.BasedOnStreamingDataResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link resourceset.impl.BasedOnStreamingDataResourceImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasedOnStreamingDataResourceImpl extends DataResourceImpl implements BasedOnStreamingDataResource {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Phrase description;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected MessageSet content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasedOnStreamingDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesetPackage.Literals.BASED_ON_STREAMING_DATA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phrase getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Phrase)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phrase basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Phrase newDescription) {
		Phrase oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSet getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(MessageSet newContent, NotificationChain msgs) {
		MessageSet oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(MessageSet newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT:
				return basicSetContent(null, msgs);
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
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT:
				return getContent();
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
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION:
				setDescription((Phrase)newValue);
				return;
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT:
				setContent((MessageSet)newValue);
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
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION:
				setDescription((Phrase)null);
				return;
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT:
				setContent((MessageSet)null);
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
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__DESCRIPTION:
				return description != null;
			case ResourcesetPackage.BASED_ON_STREAMING_DATA_RESOURCE__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

} //BasedOnStreamingDataResourceImpl
