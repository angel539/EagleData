package eagledata.core.extensions.streaming;
import java.util.List;

import eagledata.core.dsl.pattern.streamingDsl.Feature;
import eagledata.core.dsl.pattern.streamingDsl.Option;
import eagledata.core.dsl.pattern.streamingDsl.Region;
import eagledata.core.extensions.IDataResourceAssistant;
import resourceset.BasedOnStreamingDataResource;

public interface IBasedOnStreamingDataAssistant extends IDataResourceAssistant{
 	boolean connect();
 	void buildClient(String clientId);
 	void track(List<Feature> concepts);
 	void geolocate(Region geographicalElement);
 	void filter(List<Option> options);
 	void stopClient(String clientid);
 	void stopAllClients();
 	
 	BasedOnStreamingDataResource getResource();
	void setResource(BasedOnStreamingDataResource resource);
}
