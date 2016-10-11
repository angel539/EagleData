/**
 */
package streamingresources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streaming Resource Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link streamingresources.StreamingResourceSet#getResources <em>Resources</em>}</li>
 *   <li>{@link streamingresources.StreamingResourceSet#getAssistant <em>Assistant</em>}</li>
 *   <li>{@link streamingresources.StreamingResourceSet#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see streamingresources.StreamingresourcesPackage#getStreamingResourceSet()
 * @model
 * @generated
 */
public interface StreamingResourceSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link streamingresources.StreamingResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see streamingresources.StreamingresourcesPackage#getStreamingResourceSet_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<StreamingResource> getResources();

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
	 * @see streamingresources.StreamingresourcesPackage#getStreamingResourceSet_Assistant()
	 * @model
	 * @generated
	 */
	String getAssistant();

	/**
	 * Sets the value of the '{@link streamingresources.StreamingResourceSet#getAssistant <em>Assistant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assistant</em>' attribute.
	 * @see #getAssistant()
	 * @generated
	 */
	void setAssistant(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link streamingresources.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see streamingresources.StreamingresourcesPackage#getStreamingResourceSet_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // StreamingResourceSet
