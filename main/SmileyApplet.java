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
        g.drawOval(200, 200, 100, 100);
        g.drawOval(220, 220, 10, 10);
        g.drawOval(270, 220, 10, 10);
        g.drawArc(220, 250, 60, 30, 0, -180);
        g.drawLine(250, 240, 250, 260);
    }
};
/*
    <object code="SmileyApplet" width="500" height="500"></object>
*/
/* end of SmileyApplet.java */
