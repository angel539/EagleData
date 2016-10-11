package eagledata.core.twitter.connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.BasicClient;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import eagledata.core.dsl.pattern.streamingDsl.Concept;
import eagledata.core.dsl.pattern.streamingDsl.Phrase;
import eagledata.core.dsl.pattern.streamingDsl.TermList;
import eagledata.core.extensions.DataConnection;
import eagledata.core.extensions.IDataConnection;
import streamingresources.Message;
import streamingresources.StreamingResource;
import streamingresources.StreamingresourcesFactory;
import streamingresources.User;

public class TwitterDataConnection extends DataConnection implements IDataConnection {
	public static String CONSUMER_KEY = "GZEofhuvmlaPguehZsQMvSWBY";
	public static String CONSUMER_SECRET = "QlyuPpRV1rnmMwdCH8U0Z0ehu7tlSRlKo1Fj9hCYQXfH14MHnG";
	public static String ACCESS_TOKEN = "1885790382-AE4OBaZl0JYXiWYtRI5G3ctnh85l03z1fHWmeat";
	public static String ACCESS_SECRET = "S6ki2uZDwmoSpVVlHpSJ6GhJsOBU1WpDvCZ3gGHkKJCRn";
	
	Hosts hosebirdHosts;
	Authentication hosebirdAuth;
	StatusesFilterEndpoint hosebirdEndpoint;
	BlockingQueue<String> msgQueue;
	BlockingQueue<Event> eventQueue;
	
	Map<String, Client> clients = new HashMap<String, Client>();
	public TwitterDataConnection(){}
	
	@Override
	public boolean connect() {
		msgQueue = new LinkedBlockingQueue<String>(1000000);
		eventQueue = new LinkedBlockingQueue<Event>(10000);
		hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		hosebirdEndpoint = new StatusesFilterEndpoint();
		hosebirdAuth = new OAuth1(CONSUMER_KEY, CONSUMER_SECRET, ACCESS_TOKEN, ACCESS_SECRET);
		
		return true;
	}
	
	
	@Override
	public void buildClient(Phrase phrase){
		List<String> terms = getTerms(phrase);
		String clientid = phrase.getName();
		
		hosebirdEndpoint.trackTerms(terms);
		
		BasicClient client = new ClientBuilder()
	            .name("sampleExampleClient")
	            .hosts(Constants.STREAM_HOST)
	            .endpoint(hosebirdEndpoint)
	            .authentication(hosebirdAuth)
	            .processor(new StringDelimitedProcessor(msgQueue))
	            .build();

	    client.connect();
		clients.put(clientid, client);
	
		StreamingResource resource = StreamingresourcesFactory.eINSTANCE.createStreamingResource();
		resource.setDescription(phrase);
		getResourceSet().getResources().add(resource);
		
	    for (int msgRead = 0; msgRead < 100; msgRead++) {
	    	if (client.isDone()) {
	    		System.out.println("Client connection closed unexpectedly: " + client.getExitEvent().getMessage());
	    		break;
	    	}
	    	
	    	String msg;
			try {
				msg = msgQueue.poll(5, TimeUnit.SECONDS);
				if(msg != null){
					JSONObject obj = new JSONObject(msg);
					User user = createUser(obj);
					createMessage(resource, obj, user);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }

	    client.stop();
	}
	
	private List<String> getTerms(Phrase phrase) {
		List<String> terms = new ArrayList<String>();
		
		for(Concept concept : phrase.getConcepts()){
			if(concept instanceof TermList){
				terms = ((TermList) concept).getTerms();
			}
		}
		
		return terms;
	}

	public Message createMessage(StreamingResource resource, JSONObject fullContent, User user){
		Message message = StreamingresourcesFactory.eINSTANCE.createMessage();
		
		String fullContentString = fullContent.toString();
		message.setFullContent(fullContentString);
		
		String textString = fullContent.getString("text");
		message.setText(textString);
		message.setUser(user);
		resource.getMessages().add(message);
		
		return message;
	}
	
	public User createUser(JSONObject fullContent){
		JSONObject userJSONObject = fullContent.getJSONObject("user");
		long id = userJSONObject.getLong("id");
		
		User user = StreamingresourcesFactory.eINSTANCE.createUser();
		user.setId(Long.toString(id));
		getResourceSet().getUsers().add(user);
		
		return user;
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
	   
   public Object clone() throws CloneNotSupportedException {
	   throw new CloneNotSupportedException(); 
   }

	/*@Override
	public void setResource(StreamingResource streamingResource) {
		this.setStreamingResource(streamingResource);
		
	}
	
	@Override
	public StreamingResource getResource() {
		return this.getStreamingResource();
	}*/
   
	/*public static void main(String [ ] args){
		TwitterDataConnection twitter = new TwitterDataConnection();
		if(twitter.connect()){
			List<String> terms =  new ArrayList<String>();
			terms.add("iglesias");
			twitter.buildClient("test", terms);
		}
	}*/
}
