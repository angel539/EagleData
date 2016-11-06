package eagledata.core.twitter.connection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;

import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.httpclient.auth.Authentication;

import eagledata.core.dsl.pattern.streamingDsl.Feature;
import eagledata.core.dsl.pattern.streamingDsl.Option;
import eagledata.core.dsl.pattern.streamingDsl.Region;
import eagledata.core.extensions.streaming.BasedOnStreamingDataAssistant;
import eagledata.core.extensions.streaming.IBasedOnStreamingDataAssistant;
import resourceset.BasedOnStreamingDataResource;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterDataConnection extends BasedOnStreamingDataAssistant implements IBasedOnStreamingDataAssistant {
	public static String CONSUMER_KEY = "GZEofhuvmlaPguehZsQMvSWBY";
	public static String CONSUMER_SECRET = "QlyuPpRV1rnmMwdCH8U0Z0ehu7tlSRlKo1Fj9hCYQXfH14MHnG";
	public static String TOKEN = "1885790382-AE4OBaZl0JYXiWYtRI5G3ctnh85l03z1fHWmeat";
	public static String SECRET = "S6ki2uZDwmoSpVVlHpSJ6GhJsOBU1WpDvCZ3gGHkKJCRn";
	
	Hosts hosebirdHosts;
	Authentication hosebirdAuth;
	StatusesFilterEndpoint hosebirdEndpoint;
	BlockingQueue<String> msgQueue;
	BlockingQueue<Event> eventQueue;
	
	String filter_track = null;
	TwitterLiveUserStreamListener listener = null;
	
	BasedOnStreamingDataResource resource;
	
	Map<String, Client> clients = new HashMap<String, Client>();
	
	public TwitterDataConnection() {
		super();
	}

	@Override
	public boolean connect() {
		return true;
	}
	
	@Override
	public void buildClient(String clientId){
		ConfigurationBuilder confBuilder = new ConfigurationBuilder();
		confBuilder.setOAuthConsumerKey(CONSUMER_KEY);
		confBuilder.setOAuthConsumerSecret(CONSUMER_SECRET);
		
		Configuration configuration = confBuilder.build();
	    OAuthAuthorization auth=new OAuthAuthorization(configuration);
	    
	    AccessToken accessToken = new AccessToken(TOKEN, SECRET);
	    auth.setOAuthAccessToken(accessToken);
	    
	    TwitterStream twitterStream = new TwitterStreamFactory().getInstance(auth);
	    listener = new TwitterLiveUserStreamListener(resource);
	    
        twitterStream.addListener(listener);
        twitterStream.user();
	}
	
	public Object clone() throws CloneNotSupportedException {
		   throw new CloneNotSupportedException(); 
	}

	@Override
	public void geolocate(Region geographicalElement) {
		listener.setRegion(geographicalElement);
	}

	@Override
	public void filter(List<Option> options) {
		listener.setOptions(options);
	}
	
	
	@Override
	public void track(List<Feature> concepts) {
		listener.setConcepts(concepts);
	}
	
	@Override
	public void stopClient(String id){
		Client client = clients.get(id);
		client.stop();
	}
	
	@Override
	public void stopAllClients(){
		for(Entry<String, Client> entry : clients.entrySet()) entry.getValue().stop();
	}

	@Override
	public BasedOnStreamingDataResource getResource() {
		return resource;
	}

	@Override
	public void setResource(BasedOnStreamingDataResource resource) {
		this.resource = resource;
	}

	//msgQueue = new LinkedBlockingQueue<String>(1000000);
	//eventQueue = new LinkedBlockingQueue<Event>(10000);
	//hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
	//hosebirdEndpoint = new StatusesFilterEndpoint();
	//hosebirdAuth = new OAuth1(CONSUMER_KEY, CONSUMER_SECRET, TOKEN, SECRET);
	
	
	/*@Override
	public void buildClient(Phrase phrase){
		String clientid = phrase.getName();
		filterTrack(phrase);
		
		List<Long> userFollowings = new ArrayList<Long>();
	    long follow = 1037950970;
	    userFollowings.add(follow);
	    hosebirdEndpoint.followings(userFollowings);
		
		
		ClientBuilder builder = new ClientBuilder()
	            .name(clientid)
	            .hosts(Constants.STREAM_HOST)
	            .authentication(hosebirdAuth)
	            .endpoint(hosebirdEndpoint) 
	            .processor(new StringDelimitedProcessor(msgQueue))
	            .eventMessageQueue(eventQueue);
		
		Client client = builder.build();
	    client.connect();
	    
		clients.put(clientid, client);
	
		dataresource = ResourcesetFactory.eINSTANCE.createBasedOnStreamingDataResource();
		dataresource.setDescription(phrase);
		MessageSet messageSet = ResourcesetFactory.eINSTANCE.createMessageSet();
		dataresource.setContent(messageSet);
		
	    for (int msgRead = 0; msgRead < 100; msgRead++) {
	    	if (client.isDone()) {
	    		System.out.println("Client connection closed unexpectedly");
	    		break;
	    	}
	    	
	    	String msg;
			try {
				msg = msgQueue.take();
				if(msg != null){
					JSONObject obj = new JSONObject(msg);
					
					if(validMessage(phrase.getOptions(), obj)){
						User user = createUser(messageSet, obj);
						createMessage(messageSet, obj, user);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    
	    client.stop();
	}*/
	
	/*public void addListenPoint(String id, List<String> terms){
		Thread thread = new Thread(){
		    public void run(){
		    	if(endPoints == null) endPoints = new ArrayList<StatusesFilterEndpoint>();
				StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
				
				hosebirdEndpoint.trackTerms(terms);
				
				if(getNe_latitude() != 0 && getNe_longitude() != 0 && getSw_latitude() != 0 && getSw_longitude() != 0){
					Coordinate sw = new Coordinate(getSw_latitude(), getSw_longitude());
					Coordinate ne = new Coordinate(getNe_latitude(), getNe_longitude());
					Location location = new Location(sw, ne);
					List<Location> locations = Lists.newArrayList(location);
					hosebirdEndpoint.locations(locations);
				}
				
				endPoints.add(hosebirdEndpoint);
				
				Client client = buildEndPoint(id, hosebirdEndpoint);
				clients.add(client);
		    }
		};
		
		thread.start();
	}*/
	
	/*private Client buildEndPoint(String id, StatusesFilterEndpoint endPoint){	
		ClientBuilder builder = new ClientBuilder()
				  .name(id)
				  .hosts(hosebirdHosts)
				  .authentication(hosebirdAuth)
				  .endpoint(endPoint)
				  .processor(new StringDelimitedProcessor(msgQueue))
				  .eventMessageQueue(eventQueue);
		
		Client hosebirdClient = builder.build();
		hosebirdClient.connect();
		
		
		while (!hosebirdClient.isDone()) {
			String msg;
			try {
				msg = msgQueue.take();
				JSONObject obj = new JSONObject(msg);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return hosebirdClient;
	}*/
}
