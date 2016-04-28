package eagledata.core.discoverer;

import java.util.List;

public class FormatDiscoverer {
	public static double VALIDATE_RATE = 0.8;
	
   public FormatDiscoverer(){
	   //this.s = s;
   }
   
   public Type discoverFor(List<String> list){
	  
	   boolean real = false;
	   if(list.stream().filter(s -> isReal(s)).count() > (list.size()*VALIDATE_RATE)) 
		   real = true;
	   
	   if(real){
		   boolean integer = false;
		   if(list.stream().filter(s -> isInteger(s)).count() > (list.size()*VALIDATE_RATE)) 
			   integer = true;

		   if(integer){
			   //boolean year = list.stream().allMatch(s -> isYear(s));
			   boolean day = false;
			   if(list.stream().filter(s -> isDay(s)).count() > (list.size()*VALIDATE_RATE)){
				   return Type.DAY;
			   }

			   if(!day){
				   //boolean month = list.stream().allMatch(s -> isMonth(s));
				   boolean month = false;
				   if(list.stream().filter(s -> isMonth(s)).count() > (list.size()*VALIDATE_RATE)) 
					   return Type.MONTH;
				   
				   if(!month){
					   if(list.stream().filter(s -> isYear(s)).count() > (list.size()*VALIDATE_RATE)) 
						   return Type.YEAR;
				   }
			   }
			   
			   return Type.INTEGER;
		   }else{
			   //boolean longitude = list.stream().allMatch(s -> isLong(s));
			   //boolean longitude = false;
			   if(list.stream().filter(s -> isLong(s)).count() > (list.size()*VALIDATE_RATE)) 
				   return Type.LONG;
			   
			   //if(longitude) return Type.LONG;
			   //boolean lat = list.stream().allMatch(s -> isLat(s));
			   //if(lat) return Type.LAT;
			   if(list.stream().filter(s -> isLat(s)).count() > (list.size()*VALIDATE_RATE)) 
				   return Type.LAT;
		   }
		   
		   return Type.REAL;
		   
	   }else{
		   //boolean percentage = list.stream().allMatch(s -> isPercentage(s));
		   //if(percentage) return Type.PERCENTAGE;
		   
		   if(list.stream().filter(s -> isPercentage(s)).count() > (list.size()*VALIDATE_RATE)) 
			   return Type.PERCENTAGE;
		   if(list.stream().filter(s -> isDate(s)).count() > (list.size()*VALIDATE_RATE)) 
			   return Type.DATE;
		   if(list.stream().filter(s -> isTime(s)).count() > (list.size()*VALIDATE_RATE)) 
			   return Type.TIME;
	   }
	   
	   return Type.STRING;
   }
   
   public boolean isInteger(String s){
	   try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
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
	   if(s.matches("^\\d$")) return true;
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
	   String pattern2 = "^(0|1)$";
	   String pattern3 = "^([yY][eE][sS]|[nN][oO]|[yY]|[nN])$";
	   
	   if(s.matches(pattern1)) return true;
	   if(s.matches(pattern2)) return true;
	   if(s.matches(pattern3)) return true;
	   
	   return false;
   }
   
   public boolean isMonth(String s){
	   if(s.matches("^\\d$")) return true;
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
   
   public boolean isDate(String s){
	   String pattern = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
	   return s.matches(pattern);
   }
   
   public boolean isTime(String s){
	   String pattern = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
	   return s.matches(pattern);
   }
   
   public boolean isGeoPoint(String s){
	   String pattern = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
	   return s.matches(pattern);
   }
   
   public boolean isLat(String s){
	   String pattern = "^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)$";
	   return s.matches(pattern);
   }
   
   public boolean isLong(String s){
	   String pattern = "^\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$";
	   return s.matches(pattern);
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
