/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl.impl;

import eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage;
import eagledata.core.dsl.datadescription.dataDescriptionDsl.FormatKind;
import eagledata.core.dsl.datadescription.dataDescriptionDsl.FormatSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.impl.FormatSpecificationImpl#getSpecialFormat <em>Special Format</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.impl.FormatSpecificationImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormatSpecificationImpl extends MinimalEObjectImpl.Container implements FormatSpecification
{
  /**
   * The default value of the '{@link #getSpecialFormat() <em>Special Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecialFormat()
   * @generated
   * @ordered
   */
  protected static final String SPECIAL_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpecialFormat() <em>Special Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecialFormat()
   * @generated
   * @ordered
   */
  protected String specialFormat = SPECIAL_FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final FormatKind FORMAT_EDEFAULT = FormatKind.CSV;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected FormatKind format = FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormatSpecificationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DataDescriptionDslPackage.Literals.FORMAT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSpecialFormat()
  {
    return specialFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecialFormat(String newSpecialFormat)
  {
    String oldSpecialFormat = specialFormat;
    specialFormat = newSpecialFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionDslPackage.FORMAT_SPECIFICATION__SPECIAL_FORMAT, oldSpecialFormat, specialFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatKind getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(FormatKind newFormat)
  {
    FormatKind oldFormat = format;
    format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataDescriptionDslPackage.FORMAT_SPECIFICATION__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__SPECIAL_FORMAT:
        return getSpecialFormat();
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__FORMAT:
        return getFormat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__SPECIAL_FORMAT:
        setSpecialFormat((String)newValue);
        return;
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__FORMAT:
        setFormat((FormatKind)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__SPECIAL_FORMAT:
        setSpecialFormat(SPECIAL_FORMAT_EDEFAULT);
        return;
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__SPECIAL_FORMAT:
        return SPECIAL_FORMAT_EDEFAULT == null ? specialFormat != null : !SPECIAL_FORMAT_EDEFAULT.equals(specialFormat);
      case DataDescriptionDslPackage.FORMAT_SPECIFICATION__FORMAT:
        return format != FORMAT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (specialFormat: ");
    result.append(specialFormat);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //FormatSpecificationImpl