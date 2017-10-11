/**
 */
package ecarules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.Point#getLat <em>Lat</em>}</li>
 *   <li>{@link ecarules.Point#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends GeographicalElement {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see ecarules.EcarulesPackage#getPoint_Lat()
	 * @model
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link ecarules.Point#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(double)
	 * @see ecarules.EcarulesPackage#getPoint_Long()
	 * @model
	 * @generated
	 */
	double getLong();

	/**
	 * Sets the value of the '{@link ecarules.Point#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(double value);

} // Point
