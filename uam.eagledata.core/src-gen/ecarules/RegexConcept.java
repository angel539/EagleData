/**
 */
package ecarules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.RegexConcept#getRegex <em>Regex</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getRegexConcept()
 * @model
 * @generated
 */
public interface RegexConcept extends Concept {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see ecarules.EcarulesPackage#getRegexConcept_Regex()
	 * @model
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link ecarules.RegexConcept#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

} // RegexConcept
