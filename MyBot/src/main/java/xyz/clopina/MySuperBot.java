package xyz.clopina;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class MySuperBot extends TelegramLongPollingBot {
    private static final String TOKEN ="1363999060:AAETuTK_i_xonIfZnlviFh-dTAMuGYcI4Ak";
    private static final String UERNAME = "@klopinabot";

    public String getBotUsername() {
        return null;
    }

    public String getBotToken() {
        return null;
    }

    public void onUpdateReceived(Update update) {
            if (update.getMessage() != null && update.getMessage().hasText()){
                long chat_id = update.getMessage().getChatId();

                try {
                    execute(new SendMessage(chat_id, "Hi " + update.getMessage().getText()));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
    }
}
