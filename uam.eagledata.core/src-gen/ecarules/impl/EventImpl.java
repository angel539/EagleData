/**
 */
package ecarules.impl;

import ecarules.Action;
import ecarules.Concept;
import ecarules.Condition;
import ecarules.EcarulesPackage;
import ecarules.Event;
import ecarules.GeographicalElement;
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
 *   <li>{@link ecarules.impl.EventImpl#getDataconnection <em>Dataconnection</em>}</li>
 *   <li>{@link ecarules.impl.EventImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link ecarules.impl.EventImpl#getGeo <em>Geo</em>}</li>
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
	public EList<Action> getTriggers() {
		return (EList<Action>)eGet(EcarulesPackage.Literals.EVENT__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDataconnection() {
		return (EList<String>)eGet(EcarulesPackage.Literals.EVENT__DATACONNECTION, true);
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
	public GeographicalElement getGeo() {
		return (GeographicalElement)eGet(EcarulesPackage.Literals.EVENT__GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeo(GeographicalElement newGeo) {
		eSet(EcarulesPackage.Literals.EVENT__GEO, newGeo);
	}

} //EventImpl
