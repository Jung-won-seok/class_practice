package Swing;
import java.awt.*;
public class GraphicsDemo06 {
    public static class Mycanvas extends Canvas{
        @Override
        public void paint(Graphics g){
            super.paint(g);
            g.drawRect(100, 100, 100, 100);
        }
    }
    public static void main(String[] args) {
        Frame frame = new Frame("GraphicsDemo05");
        frame.setSize(300,200);
        Mycanvas canvas = new Mycanvas();
        frame.add(canvas);
        frame.setVisible(true);
    }

}
