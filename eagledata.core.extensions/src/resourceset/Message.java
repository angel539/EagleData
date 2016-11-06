/**
 */
package resourceset;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.Message#getFullContent <em>Full Content</em>}</li>
 *   <li>{@link resourceset.Message#getText <em>Text</em>}</li>
 *   <li>{@link resourceset.Message#getUser <em>User</em>}</li>
 *   <li>{@link resourceset.Message#getMessageParts <em>Message Parts</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Content</em>' attribute.
	 * @see #setFullContent(String)
	 * @see resourceset.ResourcesetPackage#getMessage_FullContent()
	 * @model
	 * @generated
	 */
	String getFullContent();

	/**
	 * Sets the value of the '{@link resourceset.Message#getFullContent <em>Full Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Content</em>' attribute.
	 * @see #getFullContent()
	 * @generated
	 */
	void setFullContent(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see resourceset.ResourcesetPackage#getMessage_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link resourceset.Message#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see resourceset.ResourcesetPackage#getMessage_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link resourceset.Message#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Message Parts</b></em>' containment reference list.
	 * The list contents are of type {@link resourceset.MessagePart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Parts</em>' containment reference list.
	 * @see resourceset.ResourcesetPackage#getMessage_MessageParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessagePart> getMessageParts();

} // Message
