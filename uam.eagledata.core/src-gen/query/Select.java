/**
 */
package query;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

import semanticmanager.DataProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Select#getSelection <em>Selection</em>}</li>
 *   <li>{@link query.Select#getFrom <em>From</em>}</li>
 *   <li>{@link query.Select#isSelectAll <em>Select All</em>}</li>
 *   <li>{@link query.Select#getWhere <em>Where</em>}</li>
 *   <li>{@link query.Select#getName <em>Name</em>}</li>
 *   <li>{@link query.Select#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getSelect()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface Select extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference list.
	 * The list contents are of type {@link semanticmanager.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference list.
	 * @see query.QueryPackage#getSelect_Selection()
	 * @model keys="name"
	 * @generated
	 */
	EList<DataProperty> getSelection();

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference list.
	 * The list contents are of type {@link query.From}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference list.
	 * @see query.QueryPackage#getSelect_From()
	 * @model containment="true"
	 * @generated
	 */
	EList<From> getFrom();

	/**
	 * Returns the value of the '<em><b>Select All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select All</em>' attribute.
	 * @see #setSelectAll(boolean)
	 * @see query.QueryPackage#getSelect_SelectAll()
	 * @model
	 * @generated
	 */
	boolean isSelectAll();

	/**
	 * Sets the value of the '{@link query.Select#isSelectAll <em>Select All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select All</em>' attribute.
	 * @see #isSelectAll()
	 * @generated
	 */
	void setSelectAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Condition)
	 * @see query.QueryPackage#getSelect_Where()
	 * @model containment="true"
	 * @generated
	 */
	Condition getWhere();

	/**
	 * Sets the value of the '{@link query.Select#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Condition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see query.QueryPackage#getSelect_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link query.Select#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link query.QueryParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see query.QueryPackage#getSelect_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParam> getParams();

} // Select
