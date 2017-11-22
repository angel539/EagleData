/**
 */
package query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.CompositeCondition#getConnection <em>Connection</em>}</li>
 *   <li>{@link query.CompositeCondition#getOn <em>On</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * The literals are from the enumeration {@link query.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see query.ConnectionType
	 * @see #setConnection(ConnectionType)
	 * @see query.QueryPackage#getCompositeCondition_Connection()
	 * @model
	 * @generated
	 */
	ConnectionType getConnection();

	/**
	 * Sets the value of the '{@link query.CompositeCondition#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see query.ConnectionType
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(Condition)
	 * @see query.QueryPackage#getCompositeCondition_On()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getOn();

	/**
	 * Sets the value of the '{@link query.CompositeCondition#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(Condition value);

} // CompositeCondition
