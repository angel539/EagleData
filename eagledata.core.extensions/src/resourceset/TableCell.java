/**
 */
package resourceset;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.TableCell#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getTableCell_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getContent();

} // TableCell
