package CannonGame_2;

import java.awt.Rectangle;

public interface Bounded {
    Rectangle getBounds();

    void setBounds(Rectangle bounds);

    boolean isOutOfBounds(Rectangle bounds);
}
