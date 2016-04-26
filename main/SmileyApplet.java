/* SmileyApplet.java */
/* Date  : 29 March 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.applet.*;

public class SmileyApplet extends Applet{
    final static long serialVersionUID = 0l;

    public void paint(Graphics g)
    {
        smiley(g);
    }

    public void smiley(Graphics g)
    {
        int w, h;

        w = getWidth();
        h = getHeight();

        setBackground(Color.BLUE);

        g.setColor(Color.GREEN);
        g.fillOval(0, 0, w, h);

        g.setColor(Color.red);
        g.drawOval(10, 10, w - 20, h - 20);
        g.drawOval(w/5, h/5, w/20, h/20);
        g.drawOval(w - w/5 - w/20, h/5, w/20, h/20);
        g.drawArc(w/5, h - h/3, w - w/5 - w/5, h/5, 0, -180);
        g.drawLine(w/2, h/2 - h/20, w/2, h/2 + h/20);
    }
};
/*
    <object code="SmileyApplet" width="500" height="500"></object>
*/
/* end of SmileyApplet.java */
