/**
 */
package resourceset.impl;

import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import resourceset.PrimitiveColumn;
import resourceset.ResourcesetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link resourceset.impl.PrimitiveColumnImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link resourceset.impl.PrimitiveColumnImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveColumnImpl extends ColumnImpl implements PrimitiveColumn {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveNode metadata;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesetPackage.Literals.PRIMITIVE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode getMetadata() {
		if (metadata != null && metadata.eIsProxy()) {
			InternalEObject oldMetadata = (InternalEObject)metadata;
			metadata = (PrimitiveNode)eResolveProxy(oldMetadata);
			if (metadata != oldMetadata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcesetPackage.PRIMITIVE_COLUMN__METADATA, oldMetadata, metadata));
			}
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveNode basicGetMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(PrimitiveNode newMetadata) {
		PrimitiveNode oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesetPackage.PRIMITIVE_COLUMN__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, ResourcesetPackage.PRIMITIVE_COLUMN__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesetPackage.PRIMITIVE_COLUMN__METADATA:
				if (resolve) return getMetadata();
				return basicGetMetadata();
			case ResourcesetPackage.PRIMITIVE_COLUMN__VALUES:
				return getValues();
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
			case ResourcesetPackage.PRIMITIVE_COLUMN__METADATA:
				setMetadata((PrimitiveNode)newValue);
				return;
			case ResourcesetPackage.PRIMITIVE_COLUMN__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
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
			case ResourcesetPackage.PRIMITIVE_COLUMN__METADATA:
				setMetadata((PrimitiveNode)null);
				return;
			case ResourcesetPackage.PRIMITIVE_COLUMN__VALUES:
				getValues().clear();
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
			case ResourcesetPackage.PRIMITIVE_COLUMN__METADATA:
				return metadata != null;
			case ResourcesetPackage.PRIMITIVE_COLUMN__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //PrimitiveColumnImpl
