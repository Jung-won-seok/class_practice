package CannonGame_2;

import java.awt.Color;
import java.awt.Graphics;

public class PaintableBall extends Ball{
    private int x;
    private int y;
    private int radius;
    private Color color;


    public PaintableBall(int x, int y, int radius, Color color){
        super(x, y, radius, color);
        this.color = color;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(getX() - getRadius(), getY() - getRadius(), getRadius() * 2, getRadius() * 2);
    }

    public Object getColor() {
        return color;
    }
}
