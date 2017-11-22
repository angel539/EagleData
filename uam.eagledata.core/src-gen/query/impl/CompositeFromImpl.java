/**
 */
package query.impl;

import org.eclipse.emf.ecore.EClass;

import query.CompositeFrom;
import query.Condition;
import query.JoinType;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.CompositeFromImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link query.impl.CompositeFromImpl#getOn <em>On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeFromImpl extends FromImpl implements CompositeFrom {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.COMPOSITE_FROM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType getJoin() {
		return (JoinType)eGet(QueryPackage.Literals.COMPOSITE_FROM__JOIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(JoinType newJoin) {
		eSet(QueryPackage.Literals.COMPOSITE_FROM__JOIN, newJoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getOn() {
		return (Condition)eGet(QueryPackage.Literals.COMPOSITE_FROM__ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOn(Condition newOn) {
		eSet(QueryPackage.Literals.COMPOSITE_FROM__ON, newOn);
	}

} //CompositeFromImpl
