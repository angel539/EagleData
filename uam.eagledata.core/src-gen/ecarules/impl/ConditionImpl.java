/**
 */
package ecarules.impl;

import ecarules.Action;
import ecarules.Condition;
import ecarules.EcarulesPackage;
import ecarules.Expression;
import ecarules.GeographicalElement;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.ConditionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link ecarules.impl.ConditionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ecarules.impl.ConditionImpl#getGeo <em>Geo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends DefaultPersistentEObject implements Condition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression)eGet(EcarulesPackage.Literals.CONDITION__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eSet(EcarulesPackage.Literals.CONDITION__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> getTriggers() {
		return (EList<Action>)eGet(EcarulesPackage.Literals.CONDITION__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalElement getGeo() {
		return (GeographicalElement)eGet(EcarulesPackage.Literals.CONDITION__GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeo(GeographicalElement newGeo) {
		eSet(EcarulesPackage.Literals.CONDITION__GEO, newGeo);
	}

} //ConditionImpl
