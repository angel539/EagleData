/**
 */
package ecarules.impl;

import ecarules.EcarulesPackage;
import ecarules.Point;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecarules.impl.PointImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link ecarules.impl.PointImpl#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends GeographicalElementImpl implements Point {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcarulesPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return (Double)eGet(EcarulesPackage.Literals.POINT__LAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		eSet(EcarulesPackage.Literals.POINT__LAT, newLat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLong() {
		return (Double)eGet(EcarulesPackage.Literals.POINT__LONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(double newLong) {
		eSet(EcarulesPackage.Literals.POINT__LONG, newLong);
	}

} //PointImpl
