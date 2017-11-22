/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.CompositeFrom#getJoin <em>Join</em>}</li>
 *   <li>{@link query.CompositeFrom#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getCompositeFrom()
 * @model
 * @generated
 */
public interface CompositeFrom extends From {
	/**
	 * Returns the value of the '<em><b>Join</b></em>' attribute.
	 * The literals are from the enumeration {@link query.JoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' attribute.
	 * @see query.JoinType
	 * @see #setJoin(JoinType)
	 * @see query.QueryPackage#getCompositeFrom_Join()
	 * @model
	 * @generated
	 */
	JoinType getJoin();

	/**
	 * Sets the value of the '{@link query.CompositeFrom#getJoin <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' attribute.
	 * @see query.JoinType
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(JoinType value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(Condition)
	 * @see query.QueryPackage#getCompositeFrom_On()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getOn();

	/**
	 * Sets the value of the '{@link query.CompositeFrom#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Condition value);

} // CompositeFrom
