/**
 */
package data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.FormatSpecification#getFormat <em>Format</em>}</li>
 *   <li>{@link data.FormatSpecification#getSpecialFormat <em>Special Format</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getFormatSpecification()
 * @model
 * @generated
 */
public interface FormatSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"CSV"</code>.
	 * The literals are from the enumeration {@link data.FormatKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see data.FormatKind
	 * @see #setFormat(FormatKind)
	 * @see data.DataPackage#getFormatSpecification_Format()
	 * @model default="CSV"
	 * @generated
	 */
	FormatKind getFormat();

	/**
	 * Sets the value of the '{@link data.FormatSpecification#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see data.FormatKind
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatKind value);

	/**
	 * Returns the value of the '<em><b>Special Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Format</em>' attribute.
	 * @see #setSpecialFormat(String)
	 * @see data.DataPackage#getFormatSpecification_SpecialFormat()
	 * @model id="true"
	 * @generated
	 */
	String getSpecialFormat();

	/**
	 * Sets the value of the '{@link data.FormatSpecification#getSpecialFormat <em>Special Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Format</em>' attribute.
	 * @see #getSpecialFormat()
	 * @generated
	 */
	void setSpecialFormat(String value);

} // FormatSpecification
