package Swing;
import java.awt.*;

public class GraphicsDemo03 {
    public static void main(String[] args) {
        Frame frame = new Frame("GrahpicsDemo03");
        int width = 300;
        int height = 300;
        frame.setSize(width,height);
        frame.setVisible(true);
        Insets insets = frame.getInsets();
        for(int i=0 ; i<10 ; i++){
            frame.getGraphics().drawRect(100, 100, 100, 100);
            width+=10;
            height+=10;
        }
    }
}
