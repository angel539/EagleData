package eagledata.core.genetics;

import java.util.Comparator;

public class RegistryRow implements Comparable<RegistryRow>{
	double exactFitness;
	double aproxFitness;
	String regex;
	
	RegistryRow(double exactFitness, double aproxFitness, String regex){
		this.exactFitness = exactFitness;
		this.aproxFitness = aproxFitness;
		this.regex = regex;
	}

	@Override
    public int compareTo(RegistryRow o) {
        return Comparators.EXACTFITNESS.compare(this, o);
    }
	
	public int compare(RegistryRow r1, RegistryRow r2) {
	   int aproxComp = Double.compare(r1.aproxFitness, r2.aproxFitness);
	   return ((aproxComp == 0) ? Double.compare(r1.exactFitness, r2.exactFitness) : aproxComp);
	}
	
	public static class Comparators {
	    public static final Comparator<RegistryRow> EXACTFITNESS = (RegistryRow o1, RegistryRow o2) -> Double.compare(o1.exactFitness, o2.exactFitness);
	    public static final Comparator<RegistryRow> APROXFITNESS = (RegistryRow o1, RegistryRow o2) -> Double.compare(o1.aproxFitness, o2.aproxFitness);  
	}
	
	@Override
	public String toString() {
		return exactFitness + ">" + aproxFitness + ">" + regex;
	}
}
