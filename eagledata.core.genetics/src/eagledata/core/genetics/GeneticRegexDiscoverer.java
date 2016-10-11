package eagledata.core.genetics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneticRegexDiscoverer {
	int initialIndividualsNumber = 2;
	float mutationFactor = 0.7f;
	float addIndividualFactor = 0.8f;
	float removeIndividualFactor = 0.4f;
	boolean selfMutationCapability = true;
	
	double success = 0.75;
	
	String[] components = new String[]{"[A-Z]", "[a-z]", "[0-9]", "\\s", "\\W"};
	long nEvolutions = 500000;
	long countEvolutions = 0;
	int maxLength = 0;
	
	class Individual{
		String fragment = "";
		int min = 0;
		int max = components.length - 1;
		
		Individual(){
			generateIndividualValue();
		}
		
		void generateIndividualValue(){
			Random rnd = new Random();
            int rndIndex = rnd.nextInt((this.max - this.min) + 1) + this.min;
            fragment = components[rndIndex];
		}
		
		@Override
		public String toString() {
			return fragment;
		}
		
		public void mutate(){
			Random rnd = new Random();
			double willMutate = rnd.nextDouble();
			
			if(willMutate < mutationFactor){
				generateIndividualValue();
			}
		}
	}
	
	class Population{
		List<Individual> individuals = new ArrayList<Individual>();
		double fitnessExact = 0;
		double fitnessAprox = 0;
		private String[] candidates;
		
		PopulationRegistry registry = new PopulationRegistry();

		void setCandidates(String[] candidates){
			this.candidates = candidates;
		}
		
		Population(int initialIndividual){
			for(int i = 0; i < initialIndividual; i++){
				Individual tmp = new Individual();
				individuals.add(tmp);
			}
		}
		
		@Override
		public String toString() { //REGEX
			/*int size = individuals.size();
			String s = "";
			
			for(int i=0; i < size; i++){
				int count = 1;
				String fragment = individuals.get(i).fragment;
				
				loop: 
					for(int j = i + 1; j < size; j++){
						if(fragment.equals(individuals.get(j).fragment)){
							count++;
						}else{
							i = i + count;
							break loop;
						}
					}
				
				s = s + "(" + fragment + "{" + count + "}" + ")";
			}*/
			
			String s = "";
			for(Individual ind : individuals){
				s = s + "(" + ind.toString() + ")";
			}
			return s;
		}
		
		private void mutationRemove() {
			int max = individuals.size(); // 2
			int removeIndividuals = max - 1; // 1
			
			Random rndInt = new Random();
			for(int i = 0; i < removeIndividuals; i++){ // 1
				if(individuals.size() <= 1)
					break;
				
				max = individuals.size();
				int rndIndex = rndInt.nextInt(max - 1);
				individuals.remove(rndIndex);
			}
		}

		private void mutationAdd() {
			Random rnd = new Random();
            int rndIndex = rnd.nextInt((10 - 1) + 1) + 1;
            
			for(int i = 0; i < rndIndex; i++){
				Individual ind = new Individual();
				this.individuals.add(ind);
			}
		}
		
		private void crossover() {
			Population pop = new Population(this.individuals.size());
			
			for(int i=0; i<individuals.size(); i++){
				Individual pivot = this.individuals.get(i);
				Individual partner = pop.individuals.get(i);
				
				Pattern p1 = Pattern.compile(pivot.fragment);
				Pattern p2 = Pattern.compile(partner.fragment);
				
				long pivotMARK = 0;
				for(String candidate : candidates){
					Matcher m1 = p1.matcher(candidate);
					if (m1.find()){
						pivotMARK++;
					}
				}
				
				long partnerMARK = 0;
				for(String candidate : candidates){
					Matcher m2 = p2.matcher(candidate);
					if (m2.find()){
						partnerMARK++;
					}
				}
				
				if(partnerMARK > pivotMARK){
					this.individuals.set(i, partner);
				}
			}
		}
		
		public void calculateFitness(){
			fitnessExact = 0;
			for(String candidate : candidates){
				Pattern p1 = Pattern.compile("^("+toString()+")$");
				Matcher m1 = p1.matcher(candidate);
				if (m1.find()){
					fitnessExact++;
				}
			}
		}
		
		public void calculateFitnessAprox(){
			fitnessAprox = 0;
			for(String candidate : candidates){
				Pattern p1 = Pattern.compile(toString());
				Matcher m1 = p1.matcher(candidate);
				if (m1.find()){
					fitnessAprox++;
				}
			}
		}
		
		public void addRegistryFitness(){
			registry.addRegistryRow(fitnessExact, fitnessAprox, toString());
		}
		
		public boolean evolve(){
			double lastMark = fitnessExact;
			
			List<Individual> lastIndividuals = new ArrayList<Individual>(individuals);

			/***/
			if(selfMutationCapability){
				for(Individual individual : individuals){
					individual.mutate();
				}
			}
			
			Random rnd = new Random();
			double addIndividualProb = rnd.nextDouble();
			if(addIndividualProb < addIndividualFactor){
				mutationAdd();
			}
			
			double removeIndividualProb = rnd.nextDouble();
			if(removeIndividualProb < removeIndividualFactor){
				mutationRemove();
			}
			
			crossover();
			calculateFitness();
			calculateFitnessAprox();
			addRegistryFitness();
			
			if(fitnessExact <= lastMark){
				fitnessExact = lastMark;
				individuals = lastIndividuals;
			}
			countEvolutions++;
			
			if(fitnessExact >= (success*(candidates.length))){
				return true;
			}
			
			return false;
		}
	}
	
	void createPopulation(int populationQu){		
		Population population = new Population(populationQu);
		//String[] candidates = new String[]{"65412398K", "12345678H", "48524852H", "A", "BC"};
		String[] candidates = new String[]{"65412398-K", "12345678H", "48524852H", "48524852-H", "48524852 H", "54112563-H"};
		//String[] candidates = new String[]{"1916-05-06", "2014-07-06", "2562-05-06", "2014-05-06"};
		
		for(String candidate : candidates){
			if(candidate.length() > maxLength) maxLength = candidate.length();
		}
		
		population.setCandidates(candidates);
		population.calculateFitness();
		
		boolean lastEvolveResult = false;
		
		for(long i = 0; i < nEvolutions && !lastEvolveResult; i++){
			lastEvolveResult = population.evolve();
		}
		
		System.out.println("exact " + population.registry.maxExactFitnessRow().toString());
		//System.out.println(Pattern.quote(population.registry.maxExactFitnessRow().regex));
		System.out.println("aprox " + population.registry.maxAproxFitnessRow().toString());
		//System.out.println(Pattern.quote(population.registry.maxAproxFitnessRow().regex));
	}
	
	public static void main(String[] args) {
		GeneticRegexDiscoverer gen = new GeneticRegexDiscoverer();
		gen.createPopulation(gen.initialIndividualsNumber);
	}
}
