/**
 */
package streamingresources;

import eagledata.core.dsl.pattern.streamingDsl.Phrase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streaming Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link streamingresources.StreamingResource#getDescription <em>Description</em>}</li>
 *   <li>{@link streamingresources.StreamingResource#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see streamingresources.StreamingresourcesPackage#getStreamingResource()
 * @model
 * @generated
 */
public interface StreamingResource extends EObject {
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
	 * @see streamingresources.StreamingresourcesPackage#getStreamingResource_Description()
	 * @model
	 * @generated
	 */
	Phrase getDescription();

	/**
	 * Sets the value of the '{@link streamingresources.StreamingResource#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Phrase value);

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link streamingresources.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see streamingresources.StreamingresourcesPackage#getStreamingResource_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // StreamingResource
