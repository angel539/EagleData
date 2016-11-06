/**
 */
package resourceset.impl;

import eagledata.core.dsl.datadesc.dataDsl.DataDescription;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import resourceset.BasedOnDescriptionDataResource;
import resourceset.ResourcesetPackage;
import resourceset.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Based On Description Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceset.impl.BasedOnDescriptionDataResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link resourceset.impl.BasedOnDescriptionDataResourceImpl#getContent <em>Content</em>}</li>
 *   <li>{@link resourceset.impl.BasedOnDescriptionDataResourceImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasedOnDescriptionDataResourceImpl extends DataResourceImpl implements BasedOnDescriptionDataResource {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DataDescription description;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Table content;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasedOnDescriptionDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesetPackage.Literals.BASED_ON_DESCRIPTION_DATA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescription getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (DataDescription)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescription basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DataDescription newDescription) {
		DataDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Table newContent, NotificationChain msgs) {
		Table oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Table newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT:
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
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT:
				return getContent();
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH:
				return getPath();
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
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION:
				setDescription((DataDescription)newValue);
				return;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT:
				setContent((Table)newValue);
				return;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH:
				setPath((String)newValue);
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
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION:
				setDescription((DataDescription)null);
				return;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT:
				setContent((Table)null);
				return;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH:
				setPath(PATH_EDEFAULT);
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
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__DESCRIPTION:
				return description != null;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__CONTENT:
				return content != null;
			case ResourcesetPackage.BASED_ON_DESCRIPTION_DATA_RESOURCE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //BasedOnDescriptionDataResourceImpl
