package eagledata.core.extensions;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;

public interface IDataConnection {
 	boolean connect();
 	void buildClient(Phrase phrase);
 	void stopClient(String clientid);
 	void stopAllClients();

}
