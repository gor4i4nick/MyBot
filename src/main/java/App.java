import org.apache.log4j.Logger;
import org.telegram.telegrambots.ApiContextInitializer;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ApiContextInitializer.init();
//        Bot test_my_gor4i4nick_bot = new Bot("test_my_gor4i4nick_bot", "1574453505:AAF5WUoI_P7mfnsE77ZFLr8bbxRc2gVhgFI");
        Bot klopinabot = new Bot("klopinabot", "1363999060:AAETuTK_i_xonIfZnlviFh-dTAMuGYcI4Ak");
        klopinabot.botConnect();
    }
}
