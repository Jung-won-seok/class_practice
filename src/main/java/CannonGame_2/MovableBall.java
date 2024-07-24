package CannonGame_2;

import java.awt.Color;

public class MovableBall extends PaintableBall {

    public MovableBall(int x, int y, int radius, Color color) {
        super(x, y, radius, color);
    }


    int dx;
    int dy;

    public int getDX() {
        return dx;
    }

    public void setDX(int dx) {
        this.dx = dx;
    }

    public int getDY() {
        return dy;
    }

    public void setDY(int dy) {
        this.dy = dy;
    }

    void move() {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    void moveTo(int x, int y) {
        setX(x);
        setY(y);
    }
}
