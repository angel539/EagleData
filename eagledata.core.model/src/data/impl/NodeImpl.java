/**
 */
package data.impl;

import data.CompositeNode;
import data.DataDescription;
import data.DataPackage;
import data.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.NodeImpl#getRepresentedAs <em>Represented As</em>}</li>
 *   <li>{@link data.impl.NodeImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link data.impl.NodeImpl#getCompositenode <em>Compositenode</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends NamedParameterImpl implements Node {
	/**
	 * The default value of the '{@link #getRepresentedAs() <em>Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedAs()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTED_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentedAs() <em>Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedAs()
	 * @generated
	 * @ordered
	 */
	protected String representedAs = REPRESENTED_AS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentedAs() {
		return representedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedAs(String newRepresentedAs) {
		String oldRepresentedAs = representedAs;
		representedAs = newRepresentedAs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.NODE__REPRESENTED_AS, oldRepresentedAs, representedAs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDescription getDatadescription() {
		if (eContainerFeatureID() != DataPackage.NODE__DATADESCRIPTION) return null;
		return (DataDescription)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatadescription(DataDescription newDatadescription, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatadescription, DataPackage.NODE__DATADESCRIPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(DataDescription newDatadescription) {
		if (newDatadescription != eInternalContainer() || (eContainerFeatureID() != DataPackage.NODE__DATADESCRIPTION && newDatadescription != null)) {
			if (EcoreUtil.isAncestor(this, newDatadescription))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatadescription != null)
				msgs = ((InternalEObject)newDatadescription).eInverseAdd(this, DataPackage.DATA_DESCRIPTION__NODES, DataDescription.class, msgs);
			msgs = basicSetDatadescription(newDatadescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.NODE__DATADESCRIPTION, newDatadescription, newDatadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode getCompositenode() {
		if (eContainerFeatureID() != DataPackage.NODE__COMPOSITENODE) return null;
		return (CompositeNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositenode(CompositeNode newCompositenode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompositenode, DataPackage.NODE__COMPOSITENODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositenode(CompositeNode newCompositenode) {
		if (newCompositenode != eInternalContainer() || (eContainerFeatureID() != DataPackage.NODE__COMPOSITENODE && newCompositenode != null)) {
			if (EcoreUtil.isAncestor(this, newCompositenode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompositenode != null)
				msgs = ((InternalEObject)newCompositenode).eInverseAdd(this, DataPackage.COMPOSITE_NODE__SUBNODES, CompositeNode.class, msgs);
			msgs = basicSetCompositenode(newCompositenode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.NODE__COMPOSITENODE, newCompositenode, newCompositenode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.NODE__DATADESCRIPTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatadescription((DataDescription)otherEnd, msgs);
			case DataPackage.NODE__COMPOSITENODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompositenode((CompositeNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.NODE__DATADESCRIPTION:
				return basicSetDatadescription(null, msgs);
			case DataPackage.NODE__COMPOSITENODE:
				return basicSetCompositenode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataPackage.NODE__DATADESCRIPTION:
				return eInternalContainer().eInverseRemove(this, DataPackage.DATA_DESCRIPTION__NODES, DataDescription.class, msgs);
			case DataPackage.NODE__COMPOSITENODE:
				return eInternalContainer().eInverseRemove(this, DataPackage.COMPOSITE_NODE__SUBNODES, CompositeNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.NODE__REPRESENTED_AS:
				return getRepresentedAs();
			case DataPackage.NODE__DATADESCRIPTION:
				return getDatadescription();
			case DataPackage.NODE__COMPOSITENODE:
				return getCompositenode();
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
			case DataPackage.NODE__REPRESENTED_AS:
				setRepresentedAs((String)newValue);
				return;
			case DataPackage.NODE__DATADESCRIPTION:
				setDatadescription((DataDescription)newValue);
				return;
			case DataPackage.NODE__COMPOSITENODE:
				setCompositenode((CompositeNode)newValue);
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
			case DataPackage.NODE__REPRESENTED_AS:
				setRepresentedAs(REPRESENTED_AS_EDEFAULT);
				return;
			case DataPackage.NODE__DATADESCRIPTION:
				setDatadescription((DataDescription)null);
				return;
			case DataPackage.NODE__COMPOSITENODE:
				setCompositenode((CompositeNode)null);
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
			case DataPackage.NODE__REPRESENTED_AS:
				return REPRESENTED_AS_EDEFAULT == null ? representedAs != null : !REPRESENTED_AS_EDEFAULT.equals(representedAs);
			case DataPackage.NODE__DATADESCRIPTION:
				return getDatadescription() != null;
			case DataPackage.NODE__COMPOSITENODE:
				return getCompositenode() != null;
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
		result.append(" (representedAs: ");
		result.append(representedAs);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
