/**
 */
package query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Value Comparison Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.ParamValueComparisonPredicate#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getParamValueComparisonPredicate()
 * @model
 * @generated
 */
public interface ParamValueComparisonPredicate extends ComparisonPredicate {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(QueryParam)
	 * @see query.QueryPackage#getParamValueComparisonPredicate_Right()
	 * @model
	 * @generated
	 */
	QueryParam getRight();

	/**
	 * Sets the value of the '{@link query.ParamValueComparisonPredicate#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(QueryParam value);

} // ParamValueComparisonPredicate
