/**
 */
package ecarules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.Region#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends GeographicalElement {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getRegion_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Region
