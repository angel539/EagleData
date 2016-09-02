package eagledata.ui;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;

import eagledata.core.dsl.datadesc.dataDsl.BasicType;
import eagledata.core.dsl.datadesc.dataDsl.Cardinality;
import eagledata.core.dsl.datadesc.dataDsl.CompositeNode;
import eagledata.core.dsl.datadesc.dataDsl.DataDescription;
import eagledata.core.dsl.datadesc.dataDsl.DataDslFactory;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.PrimitiveNode;

public class DataDslModelUtils {
	public static DataDescription createDescription(String name, String format){
		DataDescription dataDescription = DataDslFactory.eINSTANCE.createDataDescription();
		dataDescription.setName(name);
		dataDescription.setFormat(format);
		
		return dataDescription;
	}
	
	public static Enumeration createEnumeration(String name, List<String> enumValues){
		Enumeration enumeration = DataDslFactory.eINSTANCE.createEnumeration();
		enumeration.setName(name);
		enumeration.getValues().addAll(enumValues);
		
		return enumeration;
	}
	
	public static PrimitiveNode createPrimitiveNode(String name, boolean key, boolean unique, String type, Cardinality cardinality){
		PrimitiveNode primitiveNode = DataDslFactory.eINSTANCE.createPrimitiveNode();	
		primitiveNode.setName(name);
		primitiveNode.setKey(key);
		primitiveNode.setUnique(unique);
		primitiveNode.setType(BasicType.get(type));
		primitiveNode.setCardinality(cardinality);
		
		return primitiveNode;
	}
}
