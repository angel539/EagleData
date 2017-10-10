/**
 */
package ecarules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.ConceptParam#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getConceptParam()
 * @model
 * @generated
 */
public interface ConceptParam extends ActionParam {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Concept)
	 * @see ecarules.EcarulesPackage#getConceptParam_Value()
	 * @model
	 * @generated
	 */
	Concept getValue();

	/**
	 * Sets the value of the '{@link ecarules.ConceptParam#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Concept value);

} // ConceptParam
