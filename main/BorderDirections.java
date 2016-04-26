/* BorderDirections.java */
/* Date  : 12 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class BorderDirections extends Frame{
    final static long serialVersionUID = 0l;
    Button b1, b2, b3, b4, b5; /* maximum of five components in BorderLayout */

    BorderDirections(){
        b1 = new Button("North Button" );
        b2 = new Button("South Button" );
        b3 = new Button("East Button"  );
        b4 = new Button("West Button"  );
        b5 = new Button("Centre Button");

        setSize(500, 500);
        setLayout(new BorderLayout());
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        add(b1, BorderLayout.NORTH );
        add(b2, BorderLayout.SOUTH );
        add(b3, BorderLayout.EAST  );
        add(b4, BorderLayout.WEST  );
        add(b5, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String args[])
    {
        new BorderDirections();
        return;
    }
};
/* end of BorderDirections.java */
