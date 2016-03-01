/**
 */
package data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link data.DataModel#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link data.DataModel#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see data.DataPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Import URI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import URI</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import URI</em>' attribute list.
	 * @see data.DataPackage#getDataModel_ImportURI()
	 * @model
	 * @generated
	 */
	EList<String> getImportURI();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link data.DataDescription}.
	 * It is bidirectional and its opposite is '{@link data.DataDescription#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see data.DataPackage#getDataModel_Descriptions()
	 * @see data.DataDescription#getDatasource
	 * @model opposite="datasource" containment="true"
	 *        extendedMetaData="namespace='' wildcards='' name=''"
	 * @generated
	 */
	EList<DataDescription> getDescriptions();

} // DataModel
