package uam.eagledata.core.discovering.dbscan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import uam.eagledata.core.discovering.utils.dbscan.DBSCANClusterer;
import uam.eagledata.core.discovering.utils.dbscan.DBSCANClusteringException;
import uam.eagledata.core.discovering.utils.dbscan.DistanceMetricStrings;

public class TypesDiscoverer {
	public boolean isEnum(List<String> values) {
		/*Random random = new Random(4522);
		ArrayList<Number> numbers = new ArrayList<Number>();
		
		int i = 0;
		while (i < 1000) {
			numbers.add(random.nextInt(1000));
			i++;
		}*/
		
		/*
		ArrayList<String> strings = new ArrayList<String>();
		for(int n : numbers){
			if((n % 10) == 0) strings.add("coche");
			if((n % 10) == 1) strings.add("bici");
			if((n % 10) == 2) strings.add("moto");
			if((n % 10) == 3) strings.add("tren");
			if((n % 10) == 4) strings.add("patinete");
			if((n % 10) == 5) strings.add("tractor");
			if((n % 10) == 6) strings.add("avion");
			if((n % 10) == 7) strings.add("barco");
			if((n % 10) == 8) strings.add("burro");
			if((n % 10) == 9) strings.add("patines");
		}
		
		strings.add("patin");
		System.out.println(">>>" + strings.size());
		*/
		int minCluster = 2;
		double maxDistance = 1;
		
		DBSCANClusterer<String> clusterer = null;
		try {
			clusterer = new DBSCANClusterer<String>(values, minCluster, maxDistance, new DistanceMetricStrings());
		}
		catch (DBSCANClusteringException e1) {
			System.out.println("problem 1!!");
		}
		
		ArrayList<ArrayList<String>> result = null;
		
		try {
			result = clusterer.performClustering();
		} catch (DBSCANClusteringException e) {
			System.out.println("problem 2!!");
		}
		
		/*for(ArrayList<Number> subarray : result){
			System.out.println(subarray);
		}*/
		
		if(result.size() > 5) return true;
		else return false;	
	}
	
	public boolean isDouble(String value){
		final String Digits     = "(\\p{Digit}+)";
		final String HexDigits  = "(\\p{XDigit}+)";
		// an exponent is 'e' or 'E' followed by an optionally 
		// signed decimal integer.
		final String Exp        = "[eE][+-]?"+Digits;
		final String fpRegex    =
		    ("[\\x00-\\x20]*"+ // Optional leading "whitespace"
		    "[+-]?(" +         // Optional sign character
		    "NaN|" +           // "NaN" string
		    "Infinity|" +      // "Infinity" string

		    // A decimal floating-point string representing a finite positive
		    // number without a leading sign has at most five basic pieces:
		    // Digits . Digits ExponentPart FloatTypeSuffix
		    // 
		    // Since this method allows integer-only strings as input
		    // in addition to strings of floating-point literals, the
		    // two sub-patterns below are simplifications of the grammar
		    // productions from the Java Language Specification, 2nd 
		    // edition, section 3.10.2.

		    // Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
		    "((("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|"+

		    // . Digits ExponentPart_opt FloatTypeSuffix_opt
		    "(\\.("+Digits+")("+Exp+")?)|"+

		    // Hexadecimal strings
		    "((" +
		    // 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
		    "(0[xX]" + HexDigits + "(\\.)?)|" +

		    // 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
		    "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +

		    ")[pP][+-]?" + Digits + "))" +
		    "[fFdD]?))" +
		    "[\\x00-\\x20]*");// Optional trailing "whitespace"
		if (Pattern.matches(fpRegex, value)){
		    //Double.valueOf(value);
			return true;
		}
		else {
		    return false;
		}
	}
	
	public boolean isInteger(String s) {
	    return isInteger(s,10);
	}

	private static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
	public boolean isFloat(String value){
		float temp = 0 ;
	    try {
	    	temp = Float.parseFloat(value);
	    	return true;
	    } catch (NumberFormatException ex) {
	    	return false;
	    }
	}
	
	public boolean numberIsFloat(double number){
		return number == Math.ceil(number);
	}
}
