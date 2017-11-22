/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;

import query.CompositeCondition;
import query.Condition;
import query.ConnectionType;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.CompositeConditionImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link query.impl.CompositeConditionImpl#getOn <em>On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionImpl implements CompositeCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getConnection() {
		return (ConnectionType)eGet(QueryPackage.Literals.COMPOSITE_CONDITION__CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(ConnectionType newConnection) {
		eSet(QueryPackage.Literals.COMPOSITE_CONDITION__CONNECTION, newConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Condition getOn() {
		return (Condition)eGet(QueryPackage.Literals.COMPOSITE_CONDITION__ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(Condition newOn) {
		eSet(QueryPackage.Literals.COMPOSITE_CONDITION__ON, newOn);
	}

} //CompositeConditionImpl
