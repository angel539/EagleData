/**
 */
package ecarules.impl;

import ecarules.ActionExecutableExtension;
import ecarules.DataConnection;
import ecarules.EcarulesPackage;
import ecarules.Event;
import ecarules.EventSetManager;
import ecarules.GeographicalElement;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Set Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.EventSetManagerImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link ecarules.impl.EventSetManagerImpl#getDataconnections <em>Dataconnections</em>}</li>
 *   <li>{@link ecarules.impl.EventSetManagerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ecarules.impl.EventSetManagerImpl#getGeos <em>Geos</em>}</li>
 *   <li>{@link ecarules.impl.EventSetManagerImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventSetManagerImpl extends DefaultPersistentEObject implements EventSetManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSetManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.EVENT_SET_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eGet(EcarulesPackage.Literals.EVENT_SET_MANAGER__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataConnection> getDataconnections() {
		return (EList<DataConnection>)eGet(EcarulesPackage.Literals.EVENT_SET_MANAGER__DATACONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActionExecutableExtension> getActions() {
		return (EList<ActionExecutableExtension>)eGet(EcarulesPackage.Literals.EVENT_SET_MANAGER__ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GeographicalElement> getGeos() {
		return (EList<GeographicalElement>)eGet(EcarulesPackage.Literals.EVENT_SET_MANAGER__GEOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getImportedNamespace() {
		return (EList<String>)eGet(EcarulesPackage.Literals.EVENT_SET_MANAGER__IMPORTED_NAMESPACE, true);
	}

} //EventSetManagerImpl
