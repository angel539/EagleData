package uam.eagledata.metadata;

import semanticmanager.NamedElement;
import semanticmanager.Resource;
import semanticmanager.impl.ExtensibleMetaDataImpl;

public class MetaDataDelimiter extends ExtensibleMetaDataImpl {
	@Override
	public boolean select(NamedElement namedElement) {
		if(namedElement instanceof Resource){
			return true;
		}

		return false;
	}
}
