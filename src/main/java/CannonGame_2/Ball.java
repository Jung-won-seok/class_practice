package CannonGame_2;

import java.awt.Color;

public class Ball {
    int x;
    int y;
    int radius;
    Color color;
    public Ball(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }

}