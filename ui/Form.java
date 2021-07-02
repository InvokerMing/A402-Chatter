package ui;

public class Form {
    public boolean Existing;
    public boolean Showing;


    public Form() {
        Existing = true;
        Showing = false;
    }

    public void setShowing(boolean status) {
        Showing = status;
        Form t = this;
        if (this instanceof FormChat) {
            ((FormChat) t).Chat.setVisible(status);
        }
        else if (this instanceof FormChatRecord) {
            ((FormChatRecord) t).ChatRecord.setVisible(status);
        }
        else if (this instanceof FormDetail) {
            ((FormDetail) t).Detail.setVisible(status);
        }
        else if (this instanceof FormFriends) {
            ((FormFriends) t).Friends.setVisible(status);
        }
        else if (this instanceof FormLogin) {
            ((FormLogin) t).Login.setVisible(status);
        }
        else if (this instanceof FormTheme) {
            ((FormTheme) t).Theme.setVisible(status);
        }
    }
}
