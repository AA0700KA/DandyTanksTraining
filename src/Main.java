import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;

    final int OBJECT_SIZE = 64;

    final int UP = 1;
    final int DOWN = 2;
    final int LEFT = 3;
    final int RIGHT = 4;

    String[][] objects = {
            {"B", "B", "B", "G", "G", "W", "G", "W", "B"},
            {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
            {"B", "B", "B", "G", "G", "G", "G", "G", "B"},
            {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
            {"B", "B", "B", "G", "G", "G", "G", "B", "B"},
            {"G", "G", "G", "G", "G", "G", "G", "G", "B"},
            {"B", "G", "G", "G", "G", "W", "G", "W", "B"},
            {"G", "B", "B", "G", "G", "W", "G", "W", "B"},
            {"B", "B", "B", "G", "G", "W", "G", "W", "B"},
    };

    // 1 - Up, 2 - Down, 3 - Left, 4 - Right
    int direction = 3;

    int bulletX = -100;
    int bulletY = -100;

    int tankX = 256;
    int tankY = 256;

    void move(int direction) throws Exception {
        this.direction = direction;

        if (direction == 1) {
            tankY--;
        } else if (direction == 2) {
            tankY++;
        } else if (direction == 3) {
            tankX--;
        } else if (direction == 4) {
            tankX++;
        }

        Thread.sleep(33);
        repaint();
    }

    void fire() throws Exception {
        bulletX = tankX + 25;
        bulletY = tankY + 25;

        while (bulletX > 0 && bulletX < BF_WIDTH && bulletY > 0 && bulletY < BF_HEIGHT) {

            switch (direction) {
                case 1 :
                    bulletY -= 1;
                    break;
                case 2 :
                    bulletY += 1;
                    break;
                case 3 :
                    --bulletX;
                    break;
                case 4 :
                    bulletX++;
                    break;
            }

            Thread.sleep(10);
            repaint();
        }

        bulletX = -100;
        bulletY = -100;
        repaint();

    }

    void runTheGame() throws Exception {

        while (true) {
            fire();
        }

//        while (tankX != 0) {
//            move(LEFT);
//        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.runTheGame();
    }

    Main() {
        JFrame frame = new JFrame("Dendy Tanks");
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 44));
        frame.getContentPane().add(this);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                switch (objects[y][x]) {
                    case "B":
                        g.setColor(new Color(246, 20, 79));
                        break;
                    case "W":
                        g.setColor(new Color(21, 172, 246));
                        break;
                    case "G":
                        g.setColor(new Color(244, 233, 246));
                        break;
                }
                g.fillRect(x * OBJECT_SIZE, y * OBJECT_SIZE, OBJECT_SIZE, OBJECT_SIZE);
            }
        }



        g.setColor(Color.BLACK);
        // draw tank
        g.fillRect(tankX, tankY, OBJECT_SIZE, OBJECT_SIZE);

        g.setColor(Color.GREEN);
        if (direction == 1) {
            g.fillRect(tankX + 20, tankY, 24, 34);
        } else if (direction == 2) {
            g.fillRect(tankX + 20, tankY + 30, 24, 34);
        } else if (direction == 3) {
            g.fillRect(tankX, tankY + 20, 34, 24);
        } else if (direction == 4) {
            g.fillRect(tankX + 30, tankY + 20, 34, 24);
        }

        // draw bullet
        g.setColor(Color.YELLOW);
        g.fillRect(bulletX, bulletY, 14, 14);
    }



}
