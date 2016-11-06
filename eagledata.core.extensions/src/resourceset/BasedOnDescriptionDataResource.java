/**
 */
package resourceset;

import eagledata.core.dsl.datadesc.dataDsl.DataDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Based On Description Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.BasedOnDescriptionDataResource#getDescription <em>Description</em>}</li>
 *   <li>{@link resourceset.BasedOnDescriptionDataResource#getContent <em>Content</em>}</li>
 *   <li>{@link resourceset.BasedOnDescriptionDataResource#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getBasedOnDescriptionDataResource()
 * @model
 * @generated
 */
public interface BasedOnDescriptionDataResource extends DataResource {
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
	 * @see resourceset.ResourcesetPackage#getBasedOnDescriptionDataResource_Description()
	 * @model
	 * @generated
	 */
	DataDescription getDescription();

	/**
	 * Sets the value of the '{@link resourceset.BasedOnDescriptionDataResource#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DataDescription value);

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
	 * @see resourceset.ResourcesetPackage#getBasedOnDescriptionDataResource_Content()
	 * @model containment="true"
	 * @generated
	 */
	Table getContent();

	/**
	 * Sets the value of the '{@link resourceset.BasedOnDescriptionDataResource#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Table value);

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
	 * @see resourceset.ResourcesetPackage#getBasedOnDescriptionDataResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link resourceset.BasedOnDescriptionDataResource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // BasedOnDescriptionDataResource
