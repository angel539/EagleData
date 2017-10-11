/**
 */
package ecarules.impl;

import ecarules.Concept;
import ecarules.Condition;
import ecarules.DataConnection;
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
 *   <li>{@link ecarules.impl.EventImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link ecarules.impl.EventImpl#getDataconnections <em>Dataconnections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NamedElementImpl implements Event {
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
	@SuppressWarnings("unchecked")
	public EList<Condition> getWhen() {
		return (EList<Condition>)eGet(EcarulesPackage.Literals.EVENT__WHEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Concept> getConcepts() {
		return (EList<Concept>)eGet(EcarulesPackage.Literals.EVENT__CONCEPTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataConnection> getDataconnections() {
		return (EList<DataConnection>)eGet(EcarulesPackage.Literals.EVENT__DATACONNECTIONS, true);
	}

} //EventImpl
