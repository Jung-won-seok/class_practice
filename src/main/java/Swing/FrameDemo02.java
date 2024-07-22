package Swing;

import java.awt.*;

public class FrameDemo02 {
    public static void main(String[] args) throws Exception {
        Frame frame = new Frame("FrameDemo02");

        frame.setSize(400,300 );
        frame.setVisible(true);

        frame.getGraphics().drawRect(0, 100, 100, 100);
    }
}
