package CannonGame_2;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final int FRAME_WIDTH = 950;
    static final int FRAME_HEIGHT = 600;
    static final int DT = 10;
    static final int BALL_MIN_RADIUS = 5;
    static final int BALL_MAX_RADIUS = 30;
    static final int BALL_MIN_SPEED = 1;
    static final int BALL_MAX_SPEED = 5;

    public static void main(String[] args) {
        Logger log = LogManager.getLogger("main");

        Random random = new Random();

        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        BoundedWorld world = new BoundedWorld();
        frame.add(world);
        frame.setVisible(true);

        world.setDT(DT);
        world.setMaxMoveCount(0);

        // 고정된 상자 추가
        // 고정된 상자의 크기와 위치를 랜덤하게 설정하고 BoundedWorld에 추가합니다.
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 150;
            int y = 70;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 350;
            int y = 70;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 550;
            int y = 70;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 750;
            int y = 70;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 150;
            int y = 140;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 350;
            int y = 140;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 550;
            int y = 140;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 150;
            int height = 50;
            int x = 750;
            int y = 140;
            world.add(new PaintableBox(x, y, width, height, Color.RED));
            x+=300;
        }
        for (int i = 0; i < 1; i++) {
            int width = 300;
            int height = 20;
            int x = 450;
            int y = 500;
            world.add(new PaintableBox(x, y, width, height, Color.gray));
            x+=300;
        }

        while (world.getCount() < 11) {
            int radius = 28;
            int x = radius + random.nextInt(world.getWidth() - 2 * radius);
            int y = radius + random.nextInt(world.getHeight() - 2 * radius);

            MovableBall ball = new MovableBall(x, y, radius, Color.lightGray);

            boolean collision = false;
            for (int i = 0; !collision && i < world.getCount(); i++) {
                Regionable regionable = world.get(i);
                collision = ball.intersects(regionable);
            }

            if (!collision) {
                int dx = (random.nextInt() % 2 == 0 ? -1 : 1)
                        * (BALL_MIN_SPEED + random.nextInt(BALL_MAX_SPEED - BALL_MIN_SPEED));
                int dy = (random.nextInt() % 2 == 0 ? -1 : 1)
                        * (BALL_MIN_SPEED + random.nextInt(BALL_MAX_SPEED - BALL_MIN_SPEED));
                ball.setMotion(new PositionalVector(dx, dy));
                world.add(ball);
            }
        }

        world.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();

                log.debug("Clicked : {}", point);

                int radius = BALL_MIN_RADIUS + random.nextInt(BALL_MAX_RADIUS - BALL_MIN_RADIUS);

                Region region = new Region((int) point.getX(), (int) point.getY(), 2 * radius, 2 * radius);

                boolean collision = false;
                for (int i = 0; !collision && i < world.getCount(); i++) {
                    collision = world.get(i).getRegion().intersects(region);
                    if (collision) {
                        log.debug("Clicked : {} ", world.get(i));
                        world.remove(i);
                    }
                }

                if (!collision) {
                    MovableBall ball = new MovableBall((int) point.getX(), (int) point.getY(), radius, Color.GREEN);
                    int dx = (random.nextInt() % 2 == 0 ? 1 : -1)
                            * (BALL_MIN_SPEED + random.nextInt(BALL_MAX_SPEED - BALL_MIN_SPEED));
                    int dy = (random.nextInt() % 2 == 0 ? 1 : -1)
                            * (BALL_MIN_SPEED + random.nextInt(BALL_MAX_SPEED - BALL_MIN_SPEED));

                    ball.setMotion(new PositionalVector(dx, dy));
                    world.add(ball);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // unused
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // not used
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // unused
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // unused
            }

        });
        world.run();
    }
}