/**
 */
package resourceset;

import eagledata.core.dsl.pattern.streamingDsl.Feature;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link resourceset.MessagePart#getTextPart <em>Text Part</em>}</li>
 *   <li>{@link resourceset.MessagePart#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see resourceset.ResourcesetPackage#getMessagePart()
 * @model
 * @generated
 */
public interface MessagePart extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Part</em>' attribute.
	 * @see #setTextPart(String)
	 * @see resourceset.ResourcesetPackage#getMessagePart_TextPart()
	 * @model
	 * @generated
	 */
	String getTextPart();

	/**
	 * Sets the value of the '{@link resourceset.MessagePart#getTextPart <em>Text Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Part</em>' attribute.
	 * @see #getTextPart()
	 * @generated
	 */
	void setTextPart(String value);

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(Feature)
	 * @see resourceset.ResourcesetPackage#getMessagePart_Concept()
	 * @model
	 * @generated
	 */
	Feature getConcept();

	/**
	 * Sets the value of the '{@link resourceset.MessagePart#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Feature value);

} // MessagePart
