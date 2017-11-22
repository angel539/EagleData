/**
 */
package query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparison Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see query.QueryPackage#getComparisonType()
 * @model
 * @generated
 */
public enum ComparisonType implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "equal"),

	/**
	 * The '<em><b>Notequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTEQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOTEQUAL(1, "notequal", "notequal"),

	/**
	 * The '<em><b>Lessthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHAN(2, "lessthan", "lessthan"),

	/**
	 * The '<em><b>Lessthanorequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESSTHANOREQUAL(3, "lessthanorequal", "lessthanorequal"),

	/**
	 * The '<em><b>Greaterthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(4, "greaterthan", "greaterthan"),

	/**
	 * The '<em><b>Greaterthanorequal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHANOREQUAL(5, "greaterthanorequal", "greaterthanorequal");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>Notequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notequal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTEQUAL
	 * @model name="notequal"
	 * @generated
	 * @ordered
	 */
	public static final int NOTEQUAL_VALUE = 1;

	/**
	 * The '<em><b>Lessthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lessthan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHAN
	 * @model name="lessthan"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHAN_VALUE = 2;

	/**
	 * The '<em><b>Lessthanorequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lessthanorequal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSTHANOREQUAL
	 * @model name="lessthanorequal"
	 * @generated
	 * @ordered
	 */
	public static final int LESSTHANOREQUAL_VALUE = 3;

	/**
	 * The '<em><b>Greaterthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greaterthan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model name="greaterthan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 4;

	/**
	 * The '<em><b>Greaterthanorequal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greaterthanorequal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATERTHANOREQUAL
	 * @model name="greaterthanorequal"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHANOREQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comparison Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparisonType[] VALUES_ARRAY =
		new ComparisonType[] {
			EQUAL,
			NOTEQUAL,
			LESSTHAN,
			LESSTHANOREQUAL,
			GREATERTHAN,
			GREATERTHANOREQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparison Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparisonType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparison Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparisonType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparison Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComparisonType get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case NOTEQUAL_VALUE: return NOTEQUAL;
			case LESSTHAN_VALUE: return LESSTHAN;
			case LESSTHANOREQUAL_VALUE: return LESSTHANOREQUAL;
			case GREATERTHAN_VALUE: return GREATERTHAN;
			case GREATERTHANOREQUAL_VALUE: return GREATERTHANOREQUAL;
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
	private ComparisonType(int value, String name, String literal) {
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
	
} //ComparisonType
