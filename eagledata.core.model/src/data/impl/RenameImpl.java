/**
 */
package data.impl;

import data.DataPackage;
import data.Rename;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.RenameImpl#getNewRepresentedAs <em>New Represented As</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameImpl extends NodeDeprecationImpl implements Rename {
	/**
	 * The default value of the '{@link #getNewRepresentedAs() <em>New Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRepresentedAs()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_REPRESENTED_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewRepresentedAs() <em>New Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRepresentedAs()
	 * @generated
	 * @ordered
	 */
	protected String newRepresentedAs = NEW_REPRESENTED_AS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.RENAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewRepresentedAs() {
		return newRepresentedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRepresentedAs(String newNewRepresentedAs) {
		String oldNewRepresentedAs = newRepresentedAs;
		newRepresentedAs = newNewRepresentedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RENAME__NEW_REPRESENTED_AS, oldNewRepresentedAs, newRepresentedAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.RENAME__NEW_REPRESENTED_AS:
				return getNewRepresentedAs();
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
			case DataPackage.RENAME__NEW_REPRESENTED_AS:
				setNewRepresentedAs((String)newValue);
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
			case DataPackage.RENAME__NEW_REPRESENTED_AS:
				setNewRepresentedAs(NEW_REPRESENTED_AS_EDEFAULT);
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
			case DataPackage.RENAME__NEW_REPRESENTED_AS:
				return NEW_REPRESENTED_AS_EDEFAULT == null ? newRepresentedAs != null : !NEW_REPRESENTED_AS_EDEFAULT.equals(newRepresentedAs);
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
		result.append(" (newRepresentedAs: ");
		result.append(newRepresentedAs);
		result.append(')');
		return result.toString();
	}

} //RenameImpl
