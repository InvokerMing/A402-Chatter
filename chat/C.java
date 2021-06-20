package chat;
import com.formdev.flatlaf.FlatLightLaf;
import ui.*;


public class C {
    public static void main(String[] args){
        FlatLightLaf.setup();
        FrameManager fm = new FrameManager();
        FrameManager.setFrameVisible(FrameManager.c, true);
    }
}
