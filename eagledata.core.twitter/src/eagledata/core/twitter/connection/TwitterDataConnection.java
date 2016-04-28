package eagledata.core.twitter.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.json.JSONObject;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import eagledata.core.extensions.DataConnection;
import eagledata.core.extensions.IDataConnection;

public class TwitterDataConnection extends DataConnection implements IDataConnection {
	public static String CONSUMER_KEY = "0ITtNOgi1DihBdk29A7QIKHEH";
	public static String CONSUMER_SECRET = "XpTs8UsaWa1fsXH9cqfubjw3jrp8mbqKdKkrrKob7P5xLB4cWO";
	public static String ACCESS_TOKEN = "1037950970-oCPlgICg1gWHCkneZwDnwuI1zF3NXAxuYauW6jJ";
	public static String ACCESS_SECRET = "DPYknEcJ7TLGyg72AH5si1q8FitTLpSskokCZX0alVv9V";
	
	public Authentication hosebirdAuth = null;
	public Hosts hosebirdHosts = null;
	public List<StatusesFilterEndpoint> endPoints = null;
	public List<Client> clients = new ArrayList<Client>();
	
	public BlockingQueue<String> msgQueue = null;
	public BlockingQueue<Event> eventQueue = null;
	
	
	public TwitterDataConnection(){
		msgQueue = new LinkedBlockingQueue<String>(100000);
		eventQueue = new LinkedBlockingQueue<Event>(1000);
		hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		hosebirdAuth = new OAuth1(
				CONSUMER_KEY, 
				CONSUMER_SECRET, 
				ACCESS_TOKEN, 
				ACCESS_SECRET);
	}
	
	@Override
	public boolean connect() {
		
		return true;
	}
	
	public void addListenPoint(String id){
		Thread thread = new Thread(){
		    public void run(){
		    	if(endPoints == null) endPoints = new ArrayList<StatusesFilterEndpoint>();
				StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
				
				hosebirdEndpoint.trackTerms(getTermsToSearch());
				//Coordinate sw = new Coordinate(40.0587, -4.530240);
				//Coordinate ne = new Coordinate(41.109862, -3.243577);
				//Location location = new Location(sw, ne);
				
				//List<Location> locations = Lists.newArrayList(location);
				//hosebirdEndpoint.locations(locations);
				
				endPoints.add(hosebirdEndpoint);
				
				//new Thread(id){
					//public void run(){
						Client client = buildEndPoint(id, hosebirdEndpoint);
						clients.add(client);
					//}
				//}.start();
		    }
		};
		
		thread.start();
	}
	
	private Client buildEndPoint(String id, StatusesFilterEndpoint endPoint){	
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
				if(!obj.has("retweeted_status")){
					addObject(obj);
				}
				/*if((!obj.getBoolean("retweeted")) && (!obj.getBoolean("favorited"))){
					System.out.println(obj);
					addObject(obj);
				}*/
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return hosebirdClient;
	}
	   
   public Object clone() throws CloneNotSupportedException {
	   throw new CloneNotSupportedException(); 
   }

	@Override
	public List<JSONObject> getDataObjects() {
		return objects;
	}

	@Override
	public List<JSONObject> getTextId() {
		return null;
	}

	@Override
	public List<String> getSimpleMessages() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public String getConsumerKey() {
		// TODO Auto-generated method stub
		return CONSUMER_KEY;
	}

	@Override
	public String getConsumerSecret() {
		// TODO Auto-generated method stub
		return CONSUMER_SECRET;
	}

	@Override
	public String getAccessToken() {
		// TODO Auto-generated method stub
		return ACCESS_TOKEN;
	}

	@Override
	public String getAccessSecret() {
		// TODO Auto-generated method stub
		return ACCESS_SECRET;
	}

}
