/**
 */
package resourceset;

import eagledata.core.dsl.pattern.streamingDsl.Phrase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Based On Streaming Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.BasedOnStreamingDataResource#getDescription <em>Description</em>}</li>
 *   <li>{@link resourceset.BasedOnStreamingDataResource#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getBasedOnStreamingDataResource()
 * @model
 * @generated
 */
public interface BasedOnStreamingDataResource extends DataResource {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Phrase)
	 * @see resourceset.ResourcesetPackage#getBasedOnStreamingDataResource_Description()
	 * @model
	 * @generated
	 */
	Phrase getDescription();

	/**
	 * Sets the value of the '{@link resourceset.BasedOnStreamingDataResource#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Phrase value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(MessageSet)
	 * @see resourceset.ResourcesetPackage#getBasedOnStreamingDataResource_Content()
	 * @model containment="true"
	 * @generated
	 */
	MessageSet getContent();

	/**
	 * Sets the value of the '{@link resourceset.BasedOnStreamingDataResource#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(MessageSet value);

} // BasedOnStreamingDataResource
