/* GridButtons.java */
/* Date  : 12 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class GridButtons extends Frame{
    final static long serialVersionUID = 0l;
    Button b1, b2, b3, b4, b5;

    GridButtons(){
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");

        setSize(500, 500);
        setLayout(new GridLayout(3, 2, 50, 50));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setVisible(true);
    }

    public static void main(String args[])
    {
        new GridButtons();
    }
};
/* end of GridButtons.java */
