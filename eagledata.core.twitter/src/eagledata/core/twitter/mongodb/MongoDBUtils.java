package eagledata.core.twitter.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.Document;

public class MongoDBUtils {
	public void connect(){
		MongoClient mongoClient = new MongoClient("macbook-air-de-angel.local", 27017);
		MongoDatabase database = mongoClient.getDatabase("twitter_users");
		MongoCollection<Document> collection = database.getCollection("auths");
		
		//Document document = collection.find().first();
		//System.out.println(document.toJson());
		
		MongoCursor<Document> cursor = collection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		    	Document document = cursor.next();
		    	document.getString("consumerkey");
		    	
		        System.out.println(cursor.next().toJson());
		    }
		} finally {
		    cursor.close();
		}
	}
	
	public static void main (String [ ] args) {
		MongoDBUtils mongoUtils = new MongoDBUtils();
		mongoUtils.connect();
	}
}
