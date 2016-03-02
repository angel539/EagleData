/**
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadescription.dataDescriptionDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataSource#getFormat <em>Format</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataSource#getLink <em>Link</em>}</li>
 *   <li>{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataSource#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends DataDescription
{
  /**
   * Returns the value of the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' containment reference.
   * @see #setFormat(FormatSpecification)
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataSource_Format()
   * @model containment="true"
   * @generated
   */
  FormatSpecification getFormat();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataSource#getFormat <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' containment reference.
   * @see #getFormat()
   * @generated
   */
  void setFormat(FormatSpecification value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' attribute list.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataSource_Link()
   * @model unique="false"
   * @generated
   */
  EList<String> getLink();

  /**
   * Returns the value of the '<em><b>Fragments</b></em>' reference list.
   * The list contents are of type {@link eagledata.core.dsl.datadescription.dataDescriptionDsl.DataFragment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragments</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragments</em>' reference list.
   * @see eagledata.core.dsl.datadescription.dataDescriptionDsl.DataDescriptionDslPackage#getDataSource_Fragments()
   * @model
   * @generated
   */
  EList<DataFragment> getFragments();

} // DataSource