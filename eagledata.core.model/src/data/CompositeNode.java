/**
 */
package data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.CompositeNode#getSubnodes <em>Subnodes</em>}</li>
 *   <li>{@link data.CompositeNode#getExtends <em>Extends</em>}</li>
 *   <li>{@link data.CompositeNode#getDeprecations <em>Deprecations</em>}</li>
 *   <li>{@link data.CompositeNode#isEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getCompositeNode()
 * @model
 * @generated
 */
public interface CompositeNode extends Node {
	/**
	 * Returns the value of the '<em><b>Subnodes</b></em>' containment reference list.
	 * The list contents are of type {@link data.Node}.
	 * It is bidirectional and its opposite is '{@link data.Node#getCompositenode <em>Compositenode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subnodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnodes</em>' containment reference list.
	 * @see data.DataPackage#getCompositeNode_Subnodes()
	 * @see data.Node#getCompositenode
	 * @model opposite="compositenode" containment="true"
	 * @generated
	 */
	EList<Node> getSubnodes();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link data.CompositeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see data.DataPackage#getCompositeNode_Extends()
	 * @model
	 * @generated
	 */
	EList<CompositeNode> getExtends();

	/**
	 * Returns the value of the '<em><b>Deprecations</b></em>' containment reference list.
	 * The list contents are of type {@link data.NodeDeprecation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecations</em>' containment reference list.
	 * @see data.DataPackage#getCompositeNode_Deprecations()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeDeprecation> getDeprecations();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(boolean)
	 * @see data.DataPackage#getCompositeNode_Environment()
	 * @model
	 * @generated
	 */
	boolean isEnvironment();

	/**
	 * Sets the value of the '{@link data.CompositeNode#isEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #isEnvironment()
	 * @generated
	 */
	void setEnvironment(boolean value);

} // CompositeNode
