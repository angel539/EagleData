/**
 */
package data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.DataDescription#getNodes <em>Nodes</em>}</li>
 *   <li>{@link data.DataDescription#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getDataDescription()
 * @model abstract="true"
 * @generated
 */
public interface DataDescription extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link data.Node}.
	 * It is bidirectional and its opposite is '{@link data.Node#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see data.DataPackage#getDataDescription_Nodes()
	 * @see data.Node#getDatadescription
	 * @model opposite="datadescription" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link data.DataModel#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' container reference.
	 * @see #setDatasource(DataModel)
	 * @see data.DataPackage#getDataDescription_Datasource()
	 * @see data.DataModel#getDescriptions
	 * @model opposite="descriptions" transient="false"
	 * @generated
	 */
	DataModel getDatasource();

	/**
	 * Sets the value of the '{@link data.DataDescription#getDatasource <em>Datasource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' container reference.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(DataModel value);

} // DataDescription
