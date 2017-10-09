/**
 */
package ecarules.impl;

import ecarules.Condition;
import ecarules.EcarulesPackage;
import ecarules.Event;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.EventImpl#getWhen <em>When</em>}</li>
 *   <li>{@link ecarules.impl.EventImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventImpl extends NamedElementImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getWhen() {
		return (Condition)eGet(EcarulesPackage.Literals.EVENT__WHEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Condition newWhen) {
		eSet(EcarulesPackage.Literals.EVENT__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTriggers() {
		return (EList<String>)eGet(EcarulesPackage.Literals.EVENT__TRIGGERS, true);
	}

} //EventImpl
