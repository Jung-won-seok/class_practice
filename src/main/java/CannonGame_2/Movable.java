package CannonGame_2;
public interface Movable extends Regionable {
    void setMotion(Vector motion);

    Vector getMotion();

    void move();
}
