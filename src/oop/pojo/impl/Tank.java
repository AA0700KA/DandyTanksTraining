package oop.pojo.impl;

import oop.enums.Direction;
import oop.pojo.abstracts.AbstractMovableObject;

import java.awt.*;

/**
 * Created by Asus on 26.10.2020.
 */
public class Tank extends AbstractMovableObject {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {

    }

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

}
