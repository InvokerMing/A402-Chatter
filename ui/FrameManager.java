package ui;
import java.awt.*;  
import java.awt.event.*;
import java.util.ArrayList;
import ui.*;
import javax.swing.*;

public class FrameManager {
    private static ArrayList<JFrame> frames;
    public static chatter c = new chatter();

    public FrameManager(){
        frames = new ArrayList<JFrame>();
        frames.add(c);
        c.setVisible(true);
    }

    public static ArrayList<JFrame> getFrames() {
        return frames;
    }

    public static void addFrame(JFrame frame){
        frames.add(frame);
    }

    public static void setFrameVisible(JFrame frame, boolean visible){
        if(frame instanceof main){
            main m = (main)frame;
            m.Chat.setVisible(true);
        }
        else
            frame.setVisible(visible);
    }

    public static boolean isMainExisted(String ChatTo){
        for(JFrame fm : frames){
            if(fm instanceof main){
                main m = (main)fm;
                if(m.getChatTo().equals(ChatTo)){
                    return true;
                }
            }
        }
        return false;
    }

    public static JFrame getFrame(String ChatTo){
        for(JFrame fm : frames){
            if(fm instanceof main){
                main m = (main)fm;
                if(m.getChatTo().equals(ChatTo)){
                    return m;
                }
            }
        }
        return null;
    }
}
