/**
 */
package ecarules;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Set Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecarules.EventSetManager#getEvents <em>Events</em>}</li>
 *   <li>{@link ecarules.EventSetManager#getDataconnections <em>Dataconnections</em>}</li>
 *   <li>{@link ecarules.EventSetManager#getActions <em>Actions</em>}</li>
 *   <li>{@link ecarules.EventSetManager#getGeos <em>Geos</em>}</li>
 * </ul>
 *
 * @see ecarules.EcarulesPackage#getEventSetManager()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface EventSetManager extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEventSetManager_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Dataconnections</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.DataConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataconnections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataconnections</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEventSetManager_Dataconnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConnection> getDataconnections();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link ecarules.ActionExecutableExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see ecarules.EcarulesPackage#getEventSetManager_Actions()
	 * @model
	 * @generated
	 */
	EList<ActionExecutableExtension> getActions();

	/**
	 * Returns the value of the '<em><b>Geos</b></em>' containment reference list.
	 * The list contents are of type {@link ecarules.GeographicalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geos</em>' containment reference list.
	 * @see ecarules.EcarulesPackage#getEventSetManager_Geos()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeographicalElement> getGeos();

} // EventSetManager
