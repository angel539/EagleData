package uam.eagledata.metadata;

import semanticmanager.DataProperty;
import semanticmanager.NamedElement;
import semanticmanager.PrimitiveTypeDataProperty;
import semanticmanager.Type;
import semanticmanager.impl.ExtensibleMetaDataImpl;

public class MetaDataInt extends ExtensibleMetaDataImpl {
	//Comprueba que se aplica a los enteros
	@Override
	public boolean select(NamedElement namedElement) {
		if(namedElement instanceof DataProperty 
				&& ((PrimitiveTypeDataProperty) namedElement).getType().equals(Type.INT)){
			return true;
		}

		return false;
	}
	
	//Valida que el valor asignado al metadata es un entero. 
	@Override
	public boolean validateValue(String value){
	    try { 
	        Integer.parseInt(value); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
