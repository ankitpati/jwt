/* ButtonApplet.java */
/* Date  : 05 April 2016
 * Author: Ankit Pati
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonApplet extends Applet implements ActionListener{
    final static long serialVersionUID = 0l;

    public void init()
    {
        Button r, g, b;

        add(r = new Button("Red"));
        add(g = new Button("Green"));
        add(b = new Button("Blue"));

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String str;

        str = e.getActionCommand();

        if(str.equals("Red"))
            setBackground(Color.red);
        else if(str.equals("Green"))
            setBackground(Color.green);
        else
            setBackground(Color.blue);
    }
};
/*
    <object code="ButtonApplet" width="200" height="200"></object>
*/
/* end of ButtonApplet.java */
