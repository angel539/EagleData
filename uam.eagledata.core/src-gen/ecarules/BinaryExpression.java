/**
 */
package ecarules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link ecarules.BinaryExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Condition {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Concept)
	 * @see ecarules.EcarulesPackage#getBinaryExpression_Left()
	 * @model
	 * @generated
	 */
	Concept getLeft();

	/**
	 * Sets the value of the '{@link ecarules.BinaryExpression#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Concept value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Literal)
	 * @see ecarules.EcarulesPackage#getBinaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	Literal getRight();

	/**
	 * Sets the value of the '{@link ecarules.BinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Literal value);

} // BinaryExpression
