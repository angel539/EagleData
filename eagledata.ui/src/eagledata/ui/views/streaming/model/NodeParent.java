package eagledata.ui.views.streaming.model;

public class NodeParent extends TreeParent{
	public NodeParent(String name, String type) {
		super(name + " : " + type);
	}
}