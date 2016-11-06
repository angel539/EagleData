/**
 */
package resourceset;

import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.PrimitiveColumn#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link resourceset.PrimitiveColumn#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getPrimitiveColumn()
 * @model
 * @generated
 */
public interface PrimitiveColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference.
	 * @see #setMetadata(PrimitiveNode)
	 * @see resourceset.ResourcesetPackage#getPrimitiveColumn_Metadata()
	 * @model
	 * @generated
	 */
	PrimitiveNode getMetadata();

	/**
	 * Sets the value of the '{@link resourceset.PrimitiveColumn#getMetadata <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(PrimitiveNode value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see resourceset.ResourcesetPackage#getPrimitiveColumn_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

} // PrimitiveColumn
