/**
 */
package data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.DataSource#getLink <em>Link</em>}</li>
 *   <li>{@link data.DataSource#getFormat <em>Format</em>}</li>
 *   <li>{@link data.DataSource#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends DataDescription {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute list.
	 * @see data.DataPackage#getDataSource_Link()
	 * @model
	 * @generated
	 */
	EList<String> getLink();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(FormatSpecification)
	 * @see data.DataPackage#getDataSource_Format()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormatSpecification getFormat();

	/**
	 * Sets the value of the '{@link data.DataSource#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatSpecification value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference list.
	 * The list contents are of type {@link data.DataFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference list.
	 * @see data.DataPackage#getDataSource_Fragments()
	 * @model
	 * @generated
	 */
	EList<DataFragment> getFragments();

} // DataSource
