package eagledata.core.discoverer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.validator.routines.CreditCardValidator;
import org.apache.commons.validator.routines.CurrencyValidator;
import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.DoubleValidator;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.FloatValidator;
import org.apache.commons.validator.routines.IBANValidator;
import org.apache.commons.validator.routines.ISBNValidator;
import org.apache.commons.validator.routines.ISSNValidator;
import org.apache.commons.validator.routines.InetAddressValidator;
import org.apache.commons.validator.routines.IntegerValidator;
import org.apache.commons.validator.routines.LongValidator;
import org.apache.commons.validator.routines.PercentValidator;
import org.apache.commons.validator.routines.TimeValidator;
import org.apache.commons.validator.routines.UrlValidator;

import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.DataDslFactory;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;

public class FormatDiscoverer {
	public static double VALIDATE_RATE_75 = 0.75;
	public static double VALIDATE_RATE_70 = 0.7;
	public static double VALIDATE_RATE_65 = 0.65;
	public static double VALIDATE_RATE_60 = 0.6;
	public static double VALIDATE_RATE_55 = 0.55;
	
	public static double ENUM_DISP = 0.3;
   
   public FormatDiscoverer(){
   }
   
   public BasicType[] discoverFor(List<String> list){
	   BasicType[] basicTypes = new BasicType[5];
	   basicTypes[0] = discoverFor(list, VALIDATE_RATE_75);
	   basicTypes[1] = discoverFor(list, VALIDATE_RATE_70);
	   basicTypes[2] = discoverFor(list, VALIDATE_RATE_65);
	   basicTypes[3] = discoverFor(list, VALIDATE_RATE_60);
	   basicTypes[4] = discoverFor(list, VALIDATE_RATE_55);
	   
	   int end = basicTypes.length;
	   Set<BasicType> set = new HashSet<BasicType>();
	   
	   for(int i = 0; i < end; i++){
	     set.add(basicTypes[i]);
	   }

	   return set.toArray(new BasicType[set.size()]);
   }
   
   public Enumeration discoverEnumerationFor(List<String> list){
	   List<String> copy = new ArrayList<String>(list);
	   
	   Set<String> hs = new HashSet<>();
	   hs.addAll(list);
	   list.clear();
	   list.addAll(hs);
	   
	   if(list.size() <= (copy.size()*ENUM_DISP)){
		   //System.out.println("los tamaños: " + list.size() + " " + copy.size());
		   Enumeration enumeration = DataDslFactory.eINSTANCE.createEnumeration();
		   enumeration.getValues().addAll(list);
		   return enumeration;
	   }
	   
	   return null;
   }
   
   private BasicType discoverFor(List<String> list, double validateRange){
	   if(list.stream().filter(s -> isBoolean(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.BOOLEAN;
	   if(list.stream().filter(s -> isUrl(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.URL;
	   if(list.stream().filter(s -> isEmail(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.EMAIL;
	   
	   if(list.stream().filter(s -> isDate(s)).count() >= (list.size()*validateRange))
		   return BasicType.DATE;
	   if(list.stream().filter(s -> isDateRegex(s)).count() >= (list.size()*validateRange))
		   return BasicType.DATE;
	   
	   if(list.stream().filter(s -> isTime(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.TIME;
	   if(list.stream().filter(s -> isCreditCardNumber(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.CREDITCARD;
	   if(list.stream().filter(s -> isIBAN(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.IBAN;
	   if(list.stream().filter(s -> isInetAddress(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.INET;
	   if(list.stream().filter(s -> isISBN(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.ISBN;
	   if(list.stream().filter(s -> isISSN(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.ISSN;
	   
	   if(list.stream().filter(s -> isLat(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.LAT;
	   if(list.stream().filter(s -> isLong(s)).count() >= (list.size()*validateRange)) 
		   return BasicType.LONG;
	   
	   //if(list.stream().filter(s -> isLongInteger(s)).count() >= (list.size()*validateRange)) 
	   //return BasicType.LONG_INT;
	   
	   boolean isInteger = false;
	   if(list.stream().filter(s -> isLongInteger(s)).count() >= (list.size()*validateRange)) 
		   isInteger = true;
	  
	   if(isInteger){
		   //if(list.stream().filter(s -> isYear(s)).count() >= (list.size()*validateRange)) 
		   //	   return BasicType.YEAR;
		  
		   if(list.stream().filter(s -> isMonth(s)).count() >= (list.size()*validateRange)) 
			   return BasicType.MONTH;
		   
		   if(list.stream().filter(s -> isDay(s)).count() >= (list.size()*validateRange)) 
			   return BasicType.DAY;
		   
		   return BasicType.INT;
	   }
	   else{
		   if(list.stream().filter(s -> isDouble(s)).count() >= (list.size()*validateRange)) 
			   return BasicType.REAL;
		   if(list.stream().filter(s -> isFloat(s)).count() >= (list.size()*validateRange)) 
			   return BasicType.REAL;
	   }
	   
	   return BasicType.STRING;
   }
   
   public boolean isReal(String s){
	   return s.matches("^[-+]?\\d+(\\.\\d+)?$");
   }
   
   public boolean isPositiveNumber(String s){
	   return s.matches("^\\d+(\\.\\d+)?$");
   }
   
   public boolean isNegativeNumber(String s){
	   return s.matches("^-\\d+(\\.\\d+)?$");
   }
   
   public boolean isPositiveInteger(String s){
	   return s.matches("^\\d+$");
   }
   
   public boolean isNegativeInteger(String s){
	   return s.matches("^-\\d+$");
   }
   
   public boolean isPercentage(String s){
	   return s.matches("^\\d+(\\.\\d+)?%$");
   }
   
   public boolean isDay(String s){
	   if(s.matches("^\\d$") && !s.matches("^0$")) return true;
	   else{
		   if(s.matches("^\\d\\d$")){
			   int aux = Integer.parseInt(s);
			   if(aux>9 && aux<32) return true;
		   }
	   }
	   
	   return false;
   }
   
   public boolean isBoolean(String s){
	   String pattern1 = "^([tT]rue|[fF]alse|[tT][rR][uU][eE]|[fF][aA][lL][sS][eE])$";
	   String pattern2 = "^([0-1])$";
	   String pattern3 = "^([yY][eE][sS]|[nN][oO]|[yY]|[nN])$";
	   
	   if(s.matches(pattern1)) return true;
	   if(s.matches(pattern2)) return true;
	   if(s.matches(pattern3)) return true;
	   
	   return false;
   }
   
   public boolean isMonth(String s){
	   if(s.matches("^\\d$") && !s.matches("^0$")) return true;
	   else{
		   if(s.matches("^\\d\\d$")){
			   int aux = Integer.parseInt(s);
			   if(aux>9 && aux<13) return true;
		   }
	   }
	   
	   return false;
   }
   
   public boolean isYear(String s){
	   if(s.matches("^\\d{2}$")) return true;
	   else{
		   if(s.matches("^\\d{4}$")){
			   int aux = Integer.parseInt(s);
			   if(aux < 2100) return true;
		   }
	   }
	   
	   return false;
   }
   
   public boolean isDateRegex(String s){
	   String pattern = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	   return s.matches(pattern);
   }
   
   /*public boolean isTime(String s){
	   String pattern = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
	   return s.matches(pattern);
   }*/
   
   public boolean isGeoPoint(String s){
	   String pattern = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
	   return s.matches(pattern);
   }
   
   public boolean isLat(String s){
	   String pattern = "^[-+]?([1-8]?\\d(\\.\\d+)|90(\\.0+))$";
	   return s.matches(pattern);
   }
   
   public boolean isLong(String s){
	   String pattern = "^\\s*[-+]?(180(\\.0+)|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+))$";
	   return s.matches(pattern);
   }
   
   public boolean isCreditCardNumber(String s){
	   CreditCardValidator creditCardValidator = new CreditCardValidator();
	   return creditCardValidator.isValid(s);
   }
   
   public boolean isCurrency(String s){
	   CurrencyValidator creditCardValidator = new CurrencyValidator(true, true);
	   return creditCardValidator.isValid(s);
   }
   
   public boolean isDate(String s){
	   DateValidator creditCardValidator = new DateValidator();
	   return creditCardValidator.isValid(s);
   }
   
   public boolean isDouble(String s){
	   DoubleValidator doubleValidator = new DoubleValidator();
	   return doubleValidator.isValid(s);
   }
   
   public boolean isEmail(String s){
	   EmailValidator emailValidator = EmailValidator.getInstance();
	   return emailValidator.isValid(s);
   }
   
   public boolean isFloat(String s){
	   FloatValidator floatValidator = new FloatValidator();
	   return floatValidator.isValid(s);
   }
   
   public boolean isIBAN(String s){
	   IBANValidator ibanValidator = new IBANValidator();
	   return ibanValidator.isValid(s);
   }
   
   public boolean isInetAddress(String s){
	   InetAddressValidator inetAddressValidator = new InetAddressValidator();
	   return inetAddressValidator.isValid(s);
   }
   
   public boolean isInteger(String s){
	   IntegerValidator integerValidator = new IntegerValidator();
	   return integerValidator.isValid(s);
   }
   
   public boolean isISBN(String s){
	   ISBNValidator isbnValidator = new ISBNValidator();
	   return isbnValidator.isValid(s);
   }
   
   public boolean isISSN(String s){
	   ISSNValidator issnValidator = new ISSNValidator();
	   return issnValidator.isValid(s);
   }
   
   public boolean isPercent(String s){
	   PercentValidator percentValidator = new PercentValidator();
	   return percentValidator.isValid(s);
   }
   
   public boolean isLongInteger(String s){
	   LongValidator percentValidator = new LongValidator();
	   return percentValidator.isValid(s);
   }
   	
   /*public boolean isRegex(String s){
	   RegexValidator regexValidator = new RegexValidator(s);
	   return regexValidator.isValid(s);
	   
	   //Se usa para una lista de cadenas comprobar si cumplen el regex --> se puede usar con las opciones de string
   }*/
   
   public boolean isTime(String s){
	   TimeValidator timeValidator = new TimeValidator();
	   return timeValidator.isValid(s);
   }
   
   public boolean isUrl(String s){
	   UrlValidator urlValidator = new UrlValidator();
	   return urlValidator.isValid(s);
   }
   
   public static void main(String [] args){
	   /*FormatDiscoverer discoverer = new FormatDiscoverer("5");
	   System.out.println("integer " + discoverer.isInteger());
	   System.out.println("real " + discoverer.isReal());
	   System.out.println("pos_number " + discoverer.isPositiveNumber());
	   System.out.println("percentage " + discoverer.isPercentage());
	   System.out.println("day " + discoverer.isDay());
	   System.out.println("month " + discoverer.isMonth());
	   System.out.println("year " + discoverer.isYear());
	   System.out.println("boolean " + discoverer.isBoolean());
	   System.out.println("date " + discoverer.isDate());
	   System.out.println("time " + discoverer.isTime());
	   System.out.println("geopoint " + discoverer.isGeoPoint());
	   System.out.println("lat " + discoverer.isLat());
	   System.out.println("long " + discoverer.isLong());
	   System.out.println("");*/
   }
}
