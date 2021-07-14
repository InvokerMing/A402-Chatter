package ui;

import java.util.ArrayList;

public class FormManager {
    public static FormFriends FF = new FormFriends();
    public static FormChat FC = new FormChat();
    public static FormChatRecord FCR = new FormChatRecord();
    public static FormDetail FD = new FormDetail();
    public static FormLogin FL = new FormLogin();
    public static FormTheme FT = new FormTheme();
    public static FormRegister FR = new FormRegister();
    private static ArrayList<Form> allForms = new ArrayList<>();

    public static void hideAllForms() {
        if (allForms.isEmpty()) {
            initAllForms();
        }

        for (Form form : allForms) {
            form.show(false);
        }
    }

    private static void initAllForms() {
        allForms.add(FC);
        allForms.add(FF);
        allForms.add(FL);
        allForms.add(FD);
        allForms.add(FT);
        allForms.add(FCR);
        allForms.add(FR);
    }
}
