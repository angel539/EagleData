/**
 */
package ecarules.impl;

import ecarules.EcarulesPackage;
import ecarules.Point;
import ecarules.Region;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.RegionImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends GeographicalElementImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Point> getPoints() {
		return (EList<Point>)eGet(EcarulesPackage.Literals.REGION__POINTS, true);
	}

} //RegionImpl
