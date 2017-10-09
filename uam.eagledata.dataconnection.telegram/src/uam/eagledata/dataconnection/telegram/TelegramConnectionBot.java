package uam.eagledata.dataconnection.telegram;

import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramConnectionBot extends TelegramLongPollingBot {

	@Override
	public String getBotUsername() {
		return "EagleDataBot";
	}

	@Override
	public void onUpdateReceived(Update update) {
	    if (update.hasMessage() && update.getMessage().hasText()) {	
	    	KeyboardRow row1 = new KeyboardRow();
	    	row1.add("nuevo1");
	    	
	    	KeyboardRow row2 = new KeyboardRow();
	    	row2.add("nuevo2");
	    	
	    	KeyboardRow row3 = new KeyboardRow();
	    	row3.add("nuevo3");
	    	
	    	KeyboardRow row4 = new KeyboardRow();
	    	row4.add("nuevo4");
	    	
	    	KeyboardRow row5 = new KeyboardRow();
	    	row5.add("nuevo5");
	    	
	    	List<KeyboardRow> buttons = new ArrayList<KeyboardRow>();
	    	buttons.add(row1);
	    	buttons.add(row2);
	    	buttons.add(row3);
	    	buttons.add(row4);
	    	buttons.add(row5);
	    	
	    	ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
	    	keyboard.setKeyboard(buttons);
	    	
	        SendMessage message = new SendMessage()
	                .setChatId(update.getMessage().getChatId())
	                .setText("HELLO, HELLO... " + update.getMessage().getText())
	                .setReplyMarkup(keyboard)
	                ;
	        try {
	            execute(message);
	        } catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
	    }
	}

	@Override
	public String getBotToken() {
		return "464186305:AAEWJYh9yMI9sOY_zgi3qlUun7qcq3Lpb6w";
	}
}
