/**
 */
package ecarules;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.PatternEvent#getConcepts <em>Concepts</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getPatternEvent()
 * @model
 * @generated
 */
public interface PatternEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getPatternEvent_Concepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getConcepts();

} // PatternEvent
