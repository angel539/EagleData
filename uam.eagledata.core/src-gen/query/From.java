/**
 */
package query;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import semanticmanager.SemanticNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.From#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getFrom()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface From extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SemanticNode)
	 * @see query.QueryPackage#getFrom_Source()
	 * @model keys="name" required="true"
	 * @generated
	 */
	SemanticNode getSource();

	/**
	 * Sets the value of the '{@link query.From#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SemanticNode value);

} // From
