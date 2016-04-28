/**
 */
package data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Deprecation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.NodeDeprecation#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getNodeDeprecation()
 * @model abstract="true"
 * @generated
 */
public interface NodeDeprecation extends EObject {
	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' reference.
	 * @see #setDeprecated(LeafNode)
	 * @see data.DataPackage#getNodeDeprecation_Deprecated()
	 * @model required="true"
	 * @generated
	 */
	LeafNode getDeprecated();

	/**
	 * Sets the value of the '{@link data.NodeDeprecation#getDeprecated <em>Deprecated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' reference.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(LeafNode value);

} // NodeDeprecation
