package oop;

import oop.enums.Direction;
import oop.pojo.abstracts.AbstractBFObject;
import oop.pojo.impl.Brick;
import oop.pojo.impl.Bullet;
import oop.pojo.impl.Tank;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BattleField extends JPanel {

//    final int BF_WIDTH = 576;
//    final int BF_HEIGHT = 576;
//
//    final int QUADRANT_SIZE = 64;
//
//    final int UP = 1;
//    final int DOWN = 2;
//    final int LEFT = 3;
//    final int RIGHT = 4;
//
//    final int TOP_Y = BF_HEIGHT - QUADRANT_SIZE;
//    final int TOP_X = BF_WIDTH - QUADRANT_SIZE;
//
//    AbstractBFObject[][] objects = {
//            {new Brick(), new Brick(), "B", "G", "G", "W", "G", "W", "B"},
//            {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
//            {"B", "B", "B", "G", "G", "G", "G", "G", "B"},
//            {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
//            {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
//            {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
//            {"B", "G", "G", "G", "G", "W", "G", "W", "B"},
//            {"G", "B", "B", "G", "G", "W", "G", "W", "B"},
//            {"B", "B", "B", "G", "G", "W", "G", "W", "B"},
//    };
//
//    // 1 - Up, 2 - Down, 3 - Left, 4 - Right
//    Direction direction = Direction.LEFT;
//
//   private Bullet bullet;
//
//
//    private Tank tank;
//
//    void move(Direction direction) throws Exception {
//        this.direction = direction;
//
//        if (dontCanMove()) {
//            System.out.println("Can't move!!!!!!!");
//            fire();
//            return;
//        }
//
//        for (int i = 0; i < QUADRANT_SIZE; i++) {
//
//            if (direction == Direction.UP) {
//                tankY--;
//            } else if (direction == 2) {
//                tankY++;
//            } else if (direction == 3) {
//                tankX--;
//            } else if (direction == 4) {
//                tankX++;
//            }
//            Thread.sleep(33);
//            repaint();
//        }
//
//    }
//
//    void moveToQuadrant(int y, int x) {
//
//    }
//
//    void moveRandom() throws Exception {
//        Random random = new Random();
//        int direction = random.nextInt(4) + 1;
//        move(direction);
//    }
//
//    boolean dontCanMove() {
//        return (direction == UP && tankY == 0) || (direction == DOWN && tankY == TOP_Y)
//                || (direction == LEFT && tankX == 0) || (direction == RIGHT && tankX == TOP_X)
//                || nextObject(direction).equals("B");
//
//    }
//
//    String nextObject(int direction) {
//        int y = tankY;
//        int x = tankX;
//
//        switch (direction) {
//            case UP :
//                y-=64;
//                break;
//            case DOWN :
//                y+=64;
//                break;
//            case LEFT :
//                x-=64;
//                break;
//            case RIGHT :
//                x+=64;
//                break;
//        }
//
//        return objects[y/ QUADRANT_SIZE][x/ QUADRANT_SIZE];
//    }
//
//    boolean processInterception() {
//        int y = bulletY/64;
//        int x = bulletX/64;
//
//        if (objects[y][x].equals("B") && y >= 0 && y <= 8 && x >= 0 && x <= 8) {
//            objects[y][x] = "G";
//            return true;
//        }
//
//        return false;
//    }
//
//    void fire() throws Exception {
//        bulletX = tankX + 25;
//        bulletY = tankY + 25;
//
//        while (bulletX > 0 && bulletX < BF_WIDTH && bulletY > 0 && bulletY < BF_HEIGHT) {
//
//            switch (direction) {
//                case 1 :
//                    bulletY -= 1;
//                    break;
//                case 2 :
//                    bulletY += 1;
//                    break;
//                case 3 :
//                    --bulletX;
//                    break;
//                case 4 :
//                    bulletX++;
//                    break;
//            }
//
//            if (processInterception()) {
//                destoyBullet();
//            }
//
//            Thread.sleep(10);
//            repaint();
//        }
//
//        destoyBullet();
//    }
//
//    void destoyBullet() {
//        bulletX = -100;
//        bulletY = -100;
//        repaint();
//    }
//
//    void runTheGame() throws Exception {
//
//        while (true) {
//            moveRandom();
//        }
//
////        while (tankX != 0) {
////            move(LEFT);
////        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BattleField main = new BattleField();
//        main.runTheGame();
//    }
//
//    BattleField() {
//        JFrame frame = new JFrame("Dendy Tanks");
//        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 44));
//        frame.getContentPane().add(this);
//        frame.setLocation(0, 0);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//
//        for (AbstractBFObject[] abstractBFObjects : objects) {
//            for (AbstractBFObject bfObject : abstractBFObjects) {
//                bfObject.draw(g);
//            }
//        }
//
//
//
//        tank.draw(g);
//
//        // draw bullet
//       bullet.draw(g);
//    }



}
