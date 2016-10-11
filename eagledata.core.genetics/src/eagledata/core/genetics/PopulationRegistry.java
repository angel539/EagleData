package eagledata.core.genetics;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationRegistry {
	List<RegistryRow> registry = new ArrayList<RegistryRow>();
	
	public List<RegistryRow> getRegistry() {
		return registry;
	}

	public void setRegistry(List<RegistryRow> registry) {
		this.registry = registry;
	}
	
	public void addRegistryRow(double exactFitness, double aproxFitness, String regex){
		RegistryRow registryRow = new RegistryRow(exactFitness, aproxFitness, regex);
		registry.add(registryRow);
	}
	
	public RegistryRow maxAproxFitnessRow(){
		return registry.stream().max(RegistryRow.Comparators.APROXFITNESS).get();
	}
	
	public RegistryRow maxExactFitnessRow(){
		return registry.stream().max(RegistryRow.Comparators.EXACTFITNESS).get();
	}
	
	void saveRegistryInFile(){
		List<String> lines = new ArrayList<String>();
		registry.forEach(r -> lines.add(r.toString()));
		
		Path file = Paths.get("C:\\Users\\Usuario\\Desktop\\miregistro.txt");
		try {
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			System.out.println("error a la hora de crear el archivo");
		}
	}
}
