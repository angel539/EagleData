/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.dataDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Basic Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eagledata.core.dsl.datadesc.dataDsl.DataDslPackage#getBasicType()
 * @model
 * @generated
 */
public enum BasicType implements Enumerator
{
  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "string", "String"),

  /**
   * The '<em><b>Url</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #URL_VALUE
   * @generated
   * @ordered
   */
  URL(1, "url", "Url"),

  /**
   * The '<em><b>Int</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT_VALUE
   * @generated
   * @ordered
   */
  INT(2, "int", "Int"),

  /**
   * The '<em><b>Long Int</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_INT_VALUE
   * @generated
   * @ordered
   */
  LONG_INT(3, "longInt", "LongInt"),

  /**
   * The '<em><b>Real</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REAL_VALUE
   * @generated
   * @ordered
   */
  REAL(4, "real", "Real"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(5, "date", "Date"),

  /**
   * The '<em><b>Time</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_VALUE
   * @generated
   * @ordered
   */
  TIME(6, "time", "Time"),

  /**
   * The '<em><b>Year</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YEAR_VALUE
   * @generated
   * @ordered
   */
  YEAR(7, "year", "Year"),

  /**
   * The '<em><b>Month</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MONTH_VALUE
   * @generated
   * @ordered
   */
  MONTH(8, "month", "Month"),

  /**
   * The '<em><b>Day</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAY_VALUE
   * @generated
   * @ordered
   */
  DAY(9, "day", "Day"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(10, "boolean", "Boolean"),

  /**
   * The '<em><b>Lat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAT_VALUE
   * @generated
   * @ordered
   */
  LAT(11, "lat", "Lat"),

  /**
   * The '<em><b>Long</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(12, "long", "Long"),

  /**
   * The '<em><b>Percent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERCENT_VALUE
   * @generated
   * @ordered
   */
  PERCENT(13, "percent", "Percent"),

  /**
   * The '<em><b>Email</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMAIL_VALUE
   * @generated
   * @ordered
   */
  EMAIL(14, "email", "Email"),

  /**
   * The '<em><b>Currency</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURRENCY_VALUE
   * @generated
   * @ordered
   */
  CURRENCY(15, "currency", "Currency"),

  /**
   * The '<em><b>Creditcard</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREDITCARD_VALUE
   * @generated
   * @ordered
   */
  CREDITCARD(16, "creditcard", "CreditCard"),

  /**
   * The '<em><b>IBAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IBAN_VALUE
   * @generated
   * @ordered
   */
  IBAN(17, "IBAN", "IBAN"),

  /**
   * The '<em><b>ISBN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ISBN_VALUE
   * @generated
   * @ordered
   */
  ISBN(18, "ISBN", "ISBN"),

  /**
   * The '<em><b>ISSN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ISSN_VALUE
   * @generated
   * @ordered
   */
  ISSN(19, "ISSN", "ISSN"),

  /**
   * The '<em><b>Inet</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INET_VALUE
   * @generated
   * @ordered
   */
  INET(20, "inet", "Inet");

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string" literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>Url</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Url</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #URL
   * @model name="url" literal="Url"
   * @generated
   * @ordered
   */
  public static final int URL_VALUE = 1;

  /**
   * The '<em><b>Int</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT
   * @model name="int" literal="Int"
   * @generated
   * @ordered
   */
  public static final int INT_VALUE = 2;

  /**
   * The '<em><b>Long Int</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Long Int</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG_INT
   * @model name="longInt" literal="LongInt"
   * @generated
   * @ordered
   */
  public static final int LONG_INT_VALUE = 3;

  /**
   * The '<em><b>Real</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Real</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REAL
   * @model name="real" literal="Real"
   * @generated
   * @ordered
   */
  public static final int REAL_VALUE = 4;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date" literal="Date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 5;

  /**
   * The '<em><b>Time</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME
   * @model name="time" literal="Time"
   * @generated
   * @ordered
   */
  public static final int TIME_VALUE = 6;

  /**
   * The '<em><b>Year</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Year</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YEAR
   * @model name="year" literal="Year"
   * @generated
   * @ordered
   */
  public static final int YEAR_VALUE = 7;

  /**
   * The '<em><b>Month</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Month</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MONTH
   * @model name="month" literal="Month"
   * @generated
   * @ordered
   */
  public static final int MONTH_VALUE = 8;

  /**
   * The '<em><b>Day</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Day</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAY
   * @model name="day" literal="Day"
   * @generated
   * @ordered
   */
  public static final int DAY_VALUE = 9;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="boolean" literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 10;

  /**
   * The '<em><b>Lat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lat</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAT
   * @model name="lat" literal="Lat"
   * @generated
   * @ordered
   */
  public static final int LAT_VALUE = 11;

  /**
   * The '<em><b>Long</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG
   * @model name="long" literal="Long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 12;

  /**
   * The '<em><b>Percent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Percent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERCENT
   * @model name="percent" literal="Percent"
   * @generated
   * @ordered
   */
  public static final int PERCENT_VALUE = 13;

  /**
   * The '<em><b>Email</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMAIL
   * @model name="email" literal="Email"
   * @generated
   * @ordered
   */
  public static final int EMAIL_VALUE = 14;

  /**
   * The '<em><b>Currency</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Currency</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURRENCY
   * @model name="currency" literal="Currency"
   * @generated
   * @ordered
   */
  public static final int CURRENCY_VALUE = 15;

  /**
   * The '<em><b>Creditcard</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Creditcard</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CREDITCARD
   * @model name="creditcard" literal="CreditCard"
   * @generated
   * @ordered
   */
  public static final int CREDITCARD_VALUE = 16;

  /**
   * The '<em><b>IBAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IBAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IBAN
   * @model
   * @generated
   * @ordered
   */
  public static final int IBAN_VALUE = 17;

  /**
   * The '<em><b>ISBN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ISBN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ISBN
   * @model
   * @generated
   * @ordered
   */
  public static final int ISBN_VALUE = 18;

  /**
   * The '<em><b>ISSN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ISSN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ISSN
   * @model
   * @generated
   * @ordered
   */
  public static final int ISSN_VALUE = 19;

  /**
   * The '<em><b>Inet</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inet</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INET
   * @model name="inet" literal="Inet"
   * @generated
   * @ordered
   */
  public static final int INET_VALUE = 20;

  /**
   * An array of all the '<em><b>Basic Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BasicType[] VALUES_ARRAY =
    new BasicType[]
    {
      STRING,
      URL,
      INT,
      LONG_INT,
      REAL,
      DATE,
      TIME,
      YEAR,
      MONTH,
      DAY,
      BOOLEAN,
      LAT,
      LONG,
      PERCENT,
      EMAIL,
      CURRENCY,
      CREDITCARD,
      IBAN,
      ISBN,
      ISSN,
      INET,
    };

  /**
   * A public read-only list of all the '<em><b>Basic Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BasicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Basic Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BasicType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BasicType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Basic Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BasicType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BasicType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Basic Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BasicType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case URL_VALUE: return URL;
      case INT_VALUE: return INT;
      case LONG_INT_VALUE: return LONG_INT;
      case REAL_VALUE: return REAL;
      case DATE_VALUE: return DATE;
      case TIME_VALUE: return TIME;
      case YEAR_VALUE: return YEAR;
      case MONTH_VALUE: return MONTH;
      case DAY_VALUE: return DAY;
      case BOOLEAN_VALUE: return BOOLEAN;
      case LAT_VALUE: return LAT;
      case LONG_VALUE: return LONG;
      case PERCENT_VALUE: return PERCENT;
      case EMAIL_VALUE: return EMAIL;
      case CURRENCY_VALUE: return CURRENCY;
      case CREDITCARD_VALUE: return CREDITCARD;
      case IBAN_VALUE: return IBAN;
      case ISBN_VALUE: return ISBN;
      case ISSN_VALUE: return ISSN;
      case INET_VALUE: return INET;
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
  private BasicType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BasicType
