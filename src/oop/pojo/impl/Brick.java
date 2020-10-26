package oop.pojo.impl;

import oop.pojo.abstracts.AbstractBFObject;

import java.awt.*;

/**
 * Created by Asus on 26.10.2020.
 */
public class Brick extends AbstractBFObject {
    public Brick(int x, int y) {
        super(x, y);
    }

    public Brick() {
        super();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(246, 20, 79));
        g.fillRect(getX(), getY(), 64, 64);
    }

}
