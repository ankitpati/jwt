/* BouncingBalls.java */
/* Date  : 01 April 2017
 * Author: Ankit Pati
 */

import java.applet.Applet;
import java.awt.*;

class Ball {
    int x, y, radius, dx, dy;
    Color color;

    public Ball(int x, int y, int radius, int dx, int dy, Color color) {
        this.x      = x     ;
        this.y      = y     ;
        this.radius = radius;
        this.dx     = dx    ;
        this.dy     = dy    ;
        this.color  = color ;
    }
};

public class BouncingBalls extends Applet implements Runnable {
    final static long serialVersionUID = 0l;

    boolean isRunning;
    Ball balls[];

    public void init() {
        balls = new Ball[3];

        balls[0] = new Ball(86, 82, 20, 2, 5, Color.RED  );
        balls[1] = new Ball(43, 50, 25, 2, 3, Color.GREEN);
        balls[2] = new Ball(24, 77, 20, 4, 3, Color.BLUE );

        new Thread(this).start();
    }

    public void start() {
        isRunning = true;
    }

    public void stop() {
        isRunning = false;
    }

    public void paint(Graphics g) {
        Rectangle r = g.getClipBounds();

        for (Ball b : balls) {
            if(b.x >= r.width  || b.x <= r.x) b.dx *= -1;
            if(b.y >= r.height || b.y <= r.y) b.dy *= -1;

            if(b.x > r.width ) b.x = r.width ;
            if(b.y > r.height) b.y = r.height;

            b.x = b.x - b.dx;
            b.y = b.y - b.dy;

            g.setColor(b.color);
            g.fillOval(b.x, b.y, b.radius, b.radius);
        }
    }

    public void run() {
        for(;;) {
            try {
                Thread.sleep(128);
            }
            catch(Exception e) {
                System.err.println("Error during sleep!");
            }

            if (isRunning) repaint();
        }
    }
};
/*
    <object code="BouncingBalls" width="200" height="200"></object>
*/
/* end of BouncingBalls.java */
