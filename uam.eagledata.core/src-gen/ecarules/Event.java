/**
 */
package ecarules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.Event#getWhen <em>When</em>}</li>
 *   <li>{@link ecarules.Event#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ecarules.Event#getDataconnection <em>Dataconnection</em>}</li>
 *   <li>{@link ecarules.Event#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link ecarules.Event#getGeo <em>Geo</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Condition)
	 * @see ecarules.EcarulesPackage#getEvent_When()
	 * @model containment="true"
	 * @generated
	 */
	Condition getWhen();

	/**
	 * Sets the value of the '{@link ecarules.Event#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Condition value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEvent_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getTriggers();

	/**
	 * Returns the value of the '<em><b>Dataconnection</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataconnection</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataconnection</em>' attribute list.
	 * @see ecarules.EcarulesPackage#getEvent_Dataconnection()
	 * @model
	 * @generated
	 */
	EList<String> getDataconnection();

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEvent_Concepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getConcepts();

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(GeographicalElement)
	 * @see ecarules.EcarulesPackage#getEvent_Geo()
	 * @model
	 * @generated
	 */
	GeographicalElement getGeo();

	/**
	 * Sets the value of the '{@link ecarules.Event#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(GeographicalElement value);

} // Event
