package ecarules;

public interface ExtensibleDataConnection extends DataConnection {
	void connect();
	boolean matches(Event event);
}
