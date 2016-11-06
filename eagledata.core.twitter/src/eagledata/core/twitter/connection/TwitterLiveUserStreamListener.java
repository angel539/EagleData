package eagledata.core.twitter.connection;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import eagledata.core.dsl.pattern.streamingDsl.Coordinate;
import eagledata.core.dsl.pattern.streamingDsl.Feature;
import eagledata.core.dsl.pattern.streamingDsl.KeyOption;
import eagledata.core.dsl.pattern.streamingDsl.KeyOptionArray;
import eagledata.core.dsl.pattern.streamingDsl.LatitudeLongitude;
import eagledata.core.dsl.pattern.streamingDsl.Option;
import eagledata.core.dsl.pattern.streamingDsl.PathOption;
import eagledata.core.dsl.pattern.streamingDsl.Region;
import eagledata.core.dsl.pattern.streamingDsl.TermKey;
import eagledata.core.dsl.pattern.streamingDsl.TermList;
import eagledata.core.dsl.pattern.streamingDsl.WordListProperty;
import resourceset.BasedOnStreamingDataResource;
import resourceset.Message;
import resourceset.MessagePart;
import resourceset.ResourcesetFactory;
import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.TwitterObjectFactory;
import twitter4j.User;
import twitter4j.UserList;
import twitter4j.UserStreamListener;

public class TwitterLiveUserStreamListener implements UserStreamListener {
	private List<Feature> concepts = null;
	private List<Option> options = null;
	private Region region = null;
	private BasedOnStreamingDataResource resource = null;
	
	public TwitterLiveUserStreamListener(BasedOnStreamingDataResource resource) {
		super();
		this.setResource(resource);
	}
	
	@Override
	public void onStatus(Status status) {
		boolean matchGeoposition = onGeo(region, status);
		
		if(matchGeoposition){
			boolean optionValid = matchesOptions(options, status);
			
			if(optionValid){
				matches(concepts, status);
			}
		}
	}
	
	private boolean matches(List<Feature> concepts, Status status) {
		if(concepts == null) return false;
		
		Message message = ResourcesetFactory.eINSTANCE.createMessage();
		message.setFullContent(status.toString());
		message.setText(status.getText());
		
		for(Feature concept : concepts){
			if(concept instanceof TermList){
				TermList termList = (TermList) concept;
				switch (termList.getProperty().getValue()) {
					case WordListProperty.ALL_VALUE: 
						for(String term : termList.getTerms()){
							if(!StringUtils.containsIgnoreCase(status.getText(), term)) return false;
						}
					break;
					case WordListProperty.ANY_VALUE:
						boolean contained = false;
						for(String term : termList.getTerms()){
							if(StringUtils.containsIgnoreCase(status.getText(), term)){
								contained = true;
								break;
							}
						}
						if(!contained) return false;
					break;
				default:
					break;
				}
			}
		}
		
		List<TermKey> termKeys = new ArrayList<TermKey>();
		for(Feature concept : concepts){
			if(concept instanceof TermKey){
				//System.out.println("concept:: " +  concept);
				termKeys.add((TermKey) concept);
			}
		}
		if(!matchConceptVar(message, status.getText(), termKeys)){
			return false;
		}
		
		resource.getContent().getMessages().add(message);
		
		return true;
	}
	
	private boolean matchConceptVar(Message message, String text, List<TermKey> termKeys){
		String patternString = "(.*)";
		for(TermKey termKey : termKeys){
			patternString += "(";
			patternString += "?<" + termKey.getName() + ">";
			patternString += "\\$";
			
			/*
			 * si uso JVMTYPE HABRIA QUE RESOLVER CUANDO ES UN PROXY...
			 * String qualifiedName = termKey.getType().getType().getQualifiedName();
			System.out.println("qualified name:: " + qualifiedName + "___" + termKey.getType().getType().eIsProxy() + "____" + termKey.getType().getType().getIdentifier());
			JvmType type = termKey.getType().getType();
			
			if(type.eIsProxy()){
				EObject resolve = EcoreUtil.resolv
			}
			else{
				
			}*/
			
			//String type = termKey.getType().getLiteral();
			String type = termKey.getType().getIdentifier();
			System.out.println(">>> " + type);
			
			switch (type) {
				case "Int":
					patternString += "\\d+";
					break;
					
				case "String":
					patternString += "[A-Za-z]+";
					break;
	
				default:
					break;
			}
			
			patternString += ")(.*)";
		}
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		
		if (matcher.find()){
			for(TermKey termKey : termKeys){
				String matchTermKey = matcher.group(termKey.getName()).substring(1);
				
				MessagePart messagePart = ResourcesetFactory.eINSTANCE.createMessagePart();
				messagePart.setTextPart(matchTermKey);
				messagePart.setConcept(termKey);
				
				message.getMessageParts().add(messagePart);
			}
			
			return true;
		}
		
		return false;
	}	
	
	private boolean matchesOptions(List<Option> options, Status status) {
		if(options == null) return true;
		
		for(Option option : options){
			if(option instanceof PathOption){
				try {
					String json = TwitterObjectFactory.getRawJSON(status);
					JSONObject jsonObject = new JSONObject(json);
					
					if(!processOption((PathOption) option, jsonObject)){
						return false;
					}
				} catch (Exception e) {
					return false;
				}
			}
			else{
				return true;
			}
		}
		return true;
	}
	
	private boolean processOption(PathOption option, JSONObject root) throws Exception{
		Iterator<KeyOption> iterator = option.getKey().iterator();
		List<String> valuesOption = new ArrayList<>();
		
		while(iterator.hasNext()){
			KeyOption keyOption = iterator.next();
			Object child = root.get(keyOption.getKey());
			
			if(keyOption instanceof KeyOptionArray && child instanceof JSONArray){
				JSONArray array = (JSONArray) child;
				Iterator<Object> iteratorArray = array.iterator();
				
				while(iteratorArray.hasNext()){
					Object iterObjectArray = iteratorArray.hasNext();
					
					if(iterObjectArray instanceof JSONObject){
						valuesOption.add(((JSONObject) iterObjectArray).getString(iterator.next().getKey()));
					}
				}
			}
		}
		
		if(option.getProperty().getValue() == WordListProperty.ANY_VALUE){
			for(String value : option.getValues()){
				if(ArrayUtils.contains(valuesOption.toArray(), value)) return true;
			}
		}
		else{
			boolean allContained = true;
			for(String value : option.getValues()){
				if(!ArrayUtils.contains(valuesOption.toArray(), value)){
					allContained = false;
					break;
				}
			}
			return allContained;
		}
		
		
		return true;
	}
	
	private boolean onGeo(Region region, Status status){
		if(region == null) return true;
		
		if((region != null) && (status.getGeoLocation() == null)) return false;
		
		Coordinate southwestCoordinate = region.getSouthWestBoundary().getCoordinates();
		Coordinate northeastCoordinate = region.getNorthEastBoundary().getCoordinates();
		
		if(southwestCoordinate instanceof LatitudeLongitude && northeastCoordinate instanceof LatitudeLongitude){
			LatitudeLongitude southwestLatLong = (LatitudeLongitude) southwestCoordinate;
			LatitudeLongitude northeastLatLong = (LatitudeLongitude) northeastCoordinate;
			
			double width = northeastLatLong.getLat() - southwestLatLong.getLat();
			double height = northeastLatLong.getLong() - southwestLatLong.getLong();
			Rectangle2D rectangle2D = new Rectangle2D.Double(southwestLatLong.getLat(), southwestLatLong.getLong(), width, height);
			
			double x = status.getGeoLocation().getLatitude();
			double y = status.getGeoLocation().getLongitude();
			return rectangle2D.contains(x, y);
		}
		
		return false;
	}
	
	/*public Message createMessage(MessageSet messageSet, JSONObject fullContent, User user){
		Message message = ResourcesetFactory.eINSTANCE.createMessage();
		String fullContentString = fullContent.toString();
		System.out.println("message: " + fullContentString);
		message.setFullContent(fullContentString);
		
		String textString = fullContent.getString("text");
		message.setText(textString);
		messageSet.getMessages().add(message);
		
		return message;
	}*/
	
	public resourceset.User searchUser(List<resourceset.User> users, long id){		
		for(resourceset.User user : users) 
			if(user.getId().equals(id)) 
				return user;
		
		resourceset.User user = ResourcesetFactory.eINSTANCE.createUser();
		user.setId(Long.toString(id));

		return user;
	}
	
	public List<Feature> getConcepts() {
		return concepts;
	}

	public void setConcepts(List<Feature> concepts) {
		this.concepts = concepts;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {}

	@Override
	public void onScrubGeo(long arg0, long arg1) {}

	@Override
	public void onStallWarning(StallWarning arg0) {}

	@Override
	public void onTrackLimitationNotice(int arg0) {}

	@Override
	public void onException(Exception arg0) {}

	@Override
	public void onBlock(User arg0, User arg1) {}

	@Override
	public void onDeletionNotice(long arg0, long arg1) {}

	@Override
	public void onDirectMessage(DirectMessage arg0) {}

	@Override
	public void onFavorite(User arg0, User arg1, Status arg2) {}

	@Override
	public void onFavoritedRetweet(User arg0, User arg1, Status arg2) {
	}

	@Override
	public void onFollow(User arg0, User arg1) {}

	@Override
	public void onFriendList(long[] arg0) {}

	@Override
	public void onQuotedTweet(User arg0, User arg1, Status arg2) {}

	@Override
	public void onRetweetedRetweet(User arg0, User arg1, Status arg2) {}

	@Override
	public void onUnblock(User arg0, User arg1) {}

		@Override
	public void onUnfavorite(User arg0, User arg1, Status arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnfollow(User arg0, User arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserDeletion(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListCreation(User arg0, UserList arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListDeletion(User arg0, UserList arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListMemberAddition(User arg0, User arg1, UserList arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListMemberDeletion(User arg0, User arg1, UserList arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListSubscription(User arg0, User arg1, UserList arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListUnsubscription(User arg0, User arg1, UserList arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserListUpdate(User arg0, UserList arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserProfileUpdate(User arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserSuspension(long arg0) {
		// TODO Auto-generated method stub
		
	}

	public BasedOnStreamingDataResource getResource() {
		return resource;
	}

	public void setResource(BasedOnStreamingDataResource resource) {
		this.resource = resource;
	}	
}