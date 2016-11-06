/**
 */
package resourceset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.MessageSet#getMessages <em>Messages</em>}</li>
 *   <li>{@link resourceset.MessageSet#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getMessageSet()
 * @model
 * @generated
 */
public interface MessageSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getMessageSet_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getMessageSet_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // MessageSet
