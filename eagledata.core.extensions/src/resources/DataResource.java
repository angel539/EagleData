/**
 */
package resources;

import eagledata.core.dsl.datadesc.dataDsl.DataDescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resources.DataResource#getPath <em>Path</em>}</li>
 *   <li>{@link resources.DataResource#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link resources.DataResource#getContent <em>Content</em>}</li>
 *   <li>{@link resources.DataResource#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see resources.ResourcesPackage#getDataResource()
 * @model
 * @generated
 */
public interface DataResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see resources.ResourcesPackage#getDataResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link resources.DataResource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Assistant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assistant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assistant</em>' attribute.
	 * @see #setAssistant(String)
	 * @see resources.ResourcesPackage#getDataResource_Assistant()
	 * @model
	 * @generated
	 */
	String getAssistant();

	/**
	 * Sets the value of the '{@link resources.DataResource#getAssistant <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' attribute.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Table)
	 * @see resources.ResourcesPackage#getDataResource_Content()
	 * @model containment="true"
	 * @generated
	 */
	Table getContent();

	/**
	 * Sets the value of the '{@link resources.DataResource#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Table value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(DataDescription)
	 * @see resources.ResourcesPackage#getDataResource_Description()
	 * @model
	 * @generated
	 */
	DataDescription getDescription();

	/**
	 * Sets the value of the '{@link resources.DataResource#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DataDescription value);

} // DataResource
