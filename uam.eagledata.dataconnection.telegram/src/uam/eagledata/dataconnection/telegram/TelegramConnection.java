package uam.eagledata.dataconnection.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import ecarules.Event;
import ecarules.impl.ExtensibleDataConnectionImpl;

public class TelegramConnection extends ExtensibleDataConnectionImpl {
	@Override
	public void connect() {
		ApiContextInitializer.init();
		TelegramBotsApi botsApi = new TelegramBotsApi();
		
		try {
            botsApi.registerBot(new TelegramConnectionBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public boolean matches(Event event) {
		return true;
	}
	
	public static void main(String [] args){
		TelegramConnection telegramConnection = new TelegramConnection();
		telegramConnection.connect();
	}
}
