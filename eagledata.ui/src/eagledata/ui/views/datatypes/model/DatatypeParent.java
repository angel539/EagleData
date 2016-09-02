package eagledata.ui.views.datatypes.model;

public class DatatypeParent extends TreeParent{
	public DatatypeParent(String name) {
		super(name);
	}
	
	/*public EntityParent(ISemanticClass semanticclass) {
		super(semanticclass);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IPropertySource.class)
			return new SemanticElementPropertySource(this);
		return null;
	}*/
}