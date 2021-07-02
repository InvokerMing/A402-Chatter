package chat;
import DAO.User;
import com.formdev.flatlaf.*;
import ui.FormManager;


public class Chatter {
    public static User me;

    public static void main(String[] args){
        FlatIntelliJLaf.setup();
        FormManager.FL.setShowing(true);
    }
}
