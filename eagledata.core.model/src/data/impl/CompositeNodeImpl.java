/**
 */
package data.impl;

import data.CompositeNode;
import data.DataPackage;
import data.Node;
import data.NodeDeprecation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data.impl.CompositeNodeImpl#getSubnodes <em>Subnodes</em>}</li>
 *   <li>{@link data.impl.CompositeNodeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link data.impl.CompositeNodeImpl#getDeprecations <em>Deprecations</em>}</li>
 *   <li>{@link data.impl.CompositeNodeImpl#isEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeNodeImpl extends NodeImpl implements CompositeNode {
	/**
	 * The cached value of the '{@link #getSubnodes() <em>Subnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> subnodes;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeNode> extends_;

	/**
	 * The cached value of the '{@link #getDeprecations() <em>Deprecations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecations()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeDeprecation> deprecations;

	/**
	 * The default value of the '{@link #isEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENVIRONMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnvironment() <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnvironment()
	 * @generated
	 * @ordered
	 */
	protected boolean environment = ENVIRONMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.COMPOSITE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSubnodes() {
		if (subnodes == null) {
			subnodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, DataPackage.COMPOSITE_NODE__SUBNODES, DataPackage.NODE__COMPOSITENODE);
		}
		return subnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeNode> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<CompositeNode>(CompositeNode.class, this, DataPackage.COMPOSITE_NODE__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeDeprecation> getDeprecations() {
		if (deprecations == null) {
			deprecations = new EObjectContainmentEList<NodeDeprecation>(NodeDeprecation.class, this, DataPackage.COMPOSITE_NODE__DEPRECATIONS);
		}
		return deprecations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(boolean newEnvironment) {
		boolean oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.COMPOSITE_NODE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubnodes()).basicAdd(otherEnd, msgs);
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
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				return ((InternalEList<?>)getSubnodes()).basicRemove(otherEnd, msgs);
			case DataPackage.COMPOSITE_NODE__DEPRECATIONS:
				return ((InternalEList<?>)getDeprecations()).basicRemove(otherEnd, msgs);
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
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				return getSubnodes();
			case DataPackage.COMPOSITE_NODE__EXTENDS:
				return getExtends();
			case DataPackage.COMPOSITE_NODE__DEPRECATIONS:
				return getDeprecations();
			case DataPackage.COMPOSITE_NODE__ENVIRONMENT:
				return isEnvironment();
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
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				getSubnodes().clear();
				getSubnodes().addAll((Collection<? extends Node>)newValue);
				return;
			case DataPackage.COMPOSITE_NODE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends CompositeNode>)newValue);
				return;
			case DataPackage.COMPOSITE_NODE__DEPRECATIONS:
				getDeprecations().clear();
				getDeprecations().addAll((Collection<? extends NodeDeprecation>)newValue);
				return;
			case DataPackage.COMPOSITE_NODE__ENVIRONMENT:
				setEnvironment((Boolean)newValue);
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
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				getSubnodes().clear();
				return;
			case DataPackage.COMPOSITE_NODE__EXTENDS:
				getExtends().clear();
				return;
			case DataPackage.COMPOSITE_NODE__DEPRECATIONS:
				getDeprecations().clear();
				return;
			case DataPackage.COMPOSITE_NODE__ENVIRONMENT:
				setEnvironment(ENVIRONMENT_EDEFAULT);
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
			case DataPackage.COMPOSITE_NODE__SUBNODES:
				return subnodes != null && !subnodes.isEmpty();
			case DataPackage.COMPOSITE_NODE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case DataPackage.COMPOSITE_NODE__DEPRECATIONS:
				return deprecations != null && !deprecations.isEmpty();
			case DataPackage.COMPOSITE_NODE__ENVIRONMENT:
				return environment != ENVIRONMENT_EDEFAULT;
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
		result.append(" (environment: ");
		result.append(environment);
		result.append(')');
		return result.toString();
	}

} //CompositeNodeImpl
