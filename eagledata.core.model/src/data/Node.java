/**
 */
package data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.Node#getRepresentedAs <em>Represented As</em>}</li>
 *   <li>{@link data.Node#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link data.Node#getCompositenode <em>Compositenode</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedParameter {
	/**
	 * Returns the value of the '<em><b>Represented As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented As</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented As</em>' attribute.
	 * @see #setRepresentedAs(String)
	 * @see data.DataPackage#getNode_RepresentedAs()
	 * @model
	 * @generated
	 */
	String getRepresentedAs();

	/**
	 * Sets the value of the '{@link data.Node#getRepresentedAs <em>Represented As</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented As</em>' attribute.
	 * @see #getRepresentedAs()
	 * @generated
	 */
	void setRepresentedAs(String value);

	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link data.DataDescription#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' container reference.
	 * @see #setDatadescription(DataDescription)
	 * @see data.DataPackage#getNode_Datadescription()
	 * @see data.DataDescription#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	DataDescription getDatadescription();

	/**
	 * Sets the value of the '{@link data.Node#getDatadescription <em>Datadescription</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' container reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(DataDescription value);

	/**
	 * Returns the value of the '<em><b>Compositenode</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link data.CompositeNode#getSubnodes <em>Subnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositenode</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositenode</em>' container reference.
	 * @see #setCompositenode(CompositeNode)
	 * @see data.DataPackage#getNode_Compositenode()
	 * @see data.CompositeNode#getSubnodes
	 * @model opposite="subnodes" transient="false"
	 * @generated
	 */
	CompositeNode getCompositenode();

	/**
	 * Sets the value of the '{@link data.Node#getCompositenode <em>Compositenode</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositenode</em>' container reference.
	 * @see #getCompositenode()
	 * @generated
	 */
	void setCompositenode(CompositeNode value);

} // Node
