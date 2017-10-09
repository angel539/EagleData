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
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getEvent()
 * @model abstract="true"
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
	 * Returns the value of the '<em><b>Triggers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' attribute list.
	 * @see ecarules.EcarulesPackage#getEvent_Triggers()
	 * @model
	 * @generated
	 */
	EList<String> getTriggers();

} // Event
