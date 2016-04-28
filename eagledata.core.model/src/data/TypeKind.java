/**
 */
package data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see data.DataPackage#getTypeKind()
 * @model
 * @generated
 */
public enum TypeKind implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "string", "string"),

	/**
	 * The '<em><b>Numeral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERAL_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERAL(1, "numeral", "numeral"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(2, "date", "date"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(3, "time", "time"),

	/**
	 * The '<em><b>Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(4, "year", "year"),

	/**
	 * The '<em><b>Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(5, "month", "month"),

	/**
	 * The '<em><b>Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(6, "day", "day"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(7, "boolean", "boolean"),

	/**
	 * The '<em><b>Place</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE(8, "place", "place"),

	/**
	 * The '<em><b>Latitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	LATITUDE(9, "latitude", "latitude"),

	/**
	 * The '<em><b>Longitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	LONGITUDE(10, "longitude", "longitude"),

	/**
	 * The '<em><b>UT Me</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UT_ME_VALUE
	 * @generated
	 * @ordered
	 */
	UT_ME(11, "UTMe", "UTMe"),

	/**
	 * The '<em><b>UT Mn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UT_MN_VALUE
	 * @generated
	 * @ordered
	 */
	UT_MN(12, "UTMn", "UTMn"),

	/**
	 * The '<em><b>UT Mz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UT_MZ_VALUE
	 * @generated
	 * @ordered
	 */
	UT_MZ(13, "UTMz", "UTMz"),

	/**
	 * The '<em><b>UTM Hemi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTM_HEMI_VALUE
	 * @generated
	 * @ordered
	 */
	UTM_HEMI(14, "UTMHemi", "UTMHemi"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(15, "name", "name"),

	/**
	 * The '<em><b>Familyname</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILYNAME_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILYNAME(16, "familyname", "familyname"),

	/**
	 * The '<em><b>Personal ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ID_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_ID(17, "personalID", "personalID"),

	/**
	 * The '<em><b>Price</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRICE_VALUE
	 * @generated
	 * @ordered
	 */
	PRICE(18, "price", "price"),

	/**
	 * The '<em><b>Coin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIN_VALUE
	 * @generated
	 * @ordered
	 */
	COIN(19, "coin", "coin");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Numeral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERAL
	 * @model name="numeral"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERAL_VALUE = 1;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 2;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 3;

	/**
	 * The '<em><b>Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model name="year"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 4;

	/**
	 * The '<em><b>Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model name="month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 5;

	/**
	 * The '<em><b>Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model name="day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 6;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 7;

	/**
	 * The '<em><b>Place</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Place</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLACE
	 * @model name="place"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_VALUE = 8;

	/**
	 * The '<em><b>Latitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Latitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATITUDE
	 * @model name="latitude"
	 * @generated
	 * @ordered
	 */
	public static final int LATITUDE_VALUE = 9;

	/**
	 * The '<em><b>Longitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Longitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGITUDE
	 * @model name="longitude"
	 * @generated
	 * @ordered
	 */
	public static final int LONGITUDE_VALUE = 10;

	/**
	 * The '<em><b>UT Me</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UT Me</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UT_ME
	 * @model name="UTMe"
	 * @generated
	 * @ordered
	 */
	public static final int UT_ME_VALUE = 11;

	/**
	 * The '<em><b>UT Mn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UT Mn</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UT_MN
	 * @model name="UTMn"
	 * @generated
	 * @ordered
	 */
	public static final int UT_MN_VALUE = 12;

	/**
	 * The '<em><b>UT Mz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UT Mz</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UT_MZ
	 * @model name="UTMz"
	 * @generated
	 * @ordered
	 */
	public static final int UT_MZ_VALUE = 13;

	/**
	 * The '<em><b>UTM Hemi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTM Hemi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTM_HEMI
	 * @model name="UTMHemi"
	 * @generated
	 * @ordered
	 */
	public static final int UTM_HEMI_VALUE = 14;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="name"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 15;

	/**
	 * The '<em><b>Familyname</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Familyname</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILYNAME
	 * @model name="familyname"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILYNAME_VALUE = 16;

	/**
	 * The '<em><b>Personal ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Personal ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ID
	 * @model name="personalID"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_ID_VALUE = 17;

	/**
	 * The '<em><b>Price</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Price</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRICE
	 * @model name="price"
	 * @generated
	 * @ordered
	 */
	public static final int PRICE_VALUE = 18;

	/**
	 * The '<em><b>Coin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COIN
	 * @model name="coin"
	 * @generated
	 * @ordered
	 */
	public static final int COIN_VALUE = 19;

	/**
	 * An array of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeKind[] VALUES_ARRAY =
		new TypeKind[] {
			STRING,
			NUMERAL,
			DATE,
			TIME,
			YEAR,
			MONTH,
			DAY,
			BOOLEAN,
			PLACE,
			LATITUDE,
			LONGITUDE,
			UT_ME,
			UT_MN,
			UT_MZ,
			UTM_HEMI,
			NAME,
			FAMILYNAME,
			PERSONAL_ID,
			PRICE,
			COIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeKind get(int value) {
		switch (value) {
			case STRING_VALUE: return STRING;
			case NUMERAL_VALUE: return NUMERAL;
			case DATE_VALUE: return DATE;
			case TIME_VALUE: return TIME;
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case DAY_VALUE: return DAY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case PLACE_VALUE: return PLACE;
			case LATITUDE_VALUE: return LATITUDE;
			case LONGITUDE_VALUE: return LONGITUDE;
			case UT_ME_VALUE: return UT_ME;
			case UT_MN_VALUE: return UT_MN;
			case UT_MZ_VALUE: return UT_MZ;
			case UTM_HEMI_VALUE: return UTM_HEMI;
			case NAME_VALUE: return NAME;
			case FAMILYNAME_VALUE: return FAMILYNAME;
			case PERSONAL_ID_VALUE: return PERSONAL_ID;
			case PRICE_VALUE: return PRICE;
			case COIN_VALUE: return COIN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeKind
