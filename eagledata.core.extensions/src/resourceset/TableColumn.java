/**
 */
package resourceset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.TableColumn#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getTableColumn()
 * @model
 * @generated
 */
public interface TableColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getTableColumn_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // TableColumn
