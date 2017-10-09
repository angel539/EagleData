package uam.eagledata.dataconnection.twitter;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import com.google.common.collect.Lists;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.httpclient.auth.Authentication;
import ecarules.Event;
import ecarules.impl.ExtensibleDataConnectionImpl;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterDataConnection extends ExtensibleDataConnectionImpl {
	// to the extension point
	public static String CONSUMER_KEY = "NwkzuOONMLf8d20K2JdKLFTmM";
	public static String CONSUMER_SECRET = "wDQGRMMuhfUdg3UCHKy70TPF4X1zO8LVFYERXw4znnXX78n1Y0";
	public static String TOKEN = "1037950970-c05xpiH3PAbSTzFs7hqDwnVZCt55SJi0iEBWK4w";
	public static String SECRET = "NfZw984ecC4tgOZOM2kCwRfMNiuPju4JPtfRiDXVxC1LW";
	
	Hosts hosebirdHosts;
	Authentication hosebirdAuth;
	StatusesFilterEndpoint hosebirdEndpoint;
	BlockingQueue<String> msgQueue;
	BlockingQueue<Event> eventQueue;
	
	String filter_track = null;
	
	@Override
	public void connect() {
		StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();

		List<Long> followings = Lists.newArrayList(1234L, 566788L);
		List<String> terms = Lists.newArrayList("twitter", "api");
		hosebirdEndpoint.followings(followings);
		hosebirdEndpoint.trackTerms(terms);
		
		ConfigurationBuilder confBuilder = new ConfigurationBuilder();
		confBuilder.setOAuthConsumerKey(CONSUMER_KEY);
		confBuilder.setOAuthConsumerSecret(CONSUMER_SECRET);
		
		Configuration configuration = confBuilder.build();
	    OAuthAuthorization auth=new OAuthAuthorization(configuration);
		
		AccessToken accessToken = new AccessToken(TOKEN, SECRET);
	    auth.setOAuthAccessToken(accessToken);
		
		TwitterStream twitterStream = new TwitterStreamFactory().getInstance(auth);
		TwitterLiveUserStreamListener listener = new TwitterLiveUserStreamListener();
	    
        twitterStream.addListener(listener);
        twitterStream.user();
	}
	
	@Override
	public boolean matches(Event event) {
		return true;
	}
	
	public static void main(String [] args){
		TwitterDataConnection twitterDataConnection = new TwitterDataConnection();
		twitterDataConnection.connect();
	}
}
