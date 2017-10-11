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
 *   <li>{@link ecarules.Event#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link ecarules.Event#getDataconnections <em>Dataconnections</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEvent_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getWhen();

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
	 * Returns the value of the '<em><b>Dataconnections</b></em>' reference list.
	 * The list contents are of type {@link ecarules.DataConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataconnections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataconnections</em>' reference list.
	 * @see ecarules.EcarulesPackage#getEvent_Dataconnections()
	 * @model
	 * @generated
	 */
	EList<DataConnection> getDataconnections();

} // Event
