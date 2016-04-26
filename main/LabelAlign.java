/* LabelAlign.java */
/* Date  : 13 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class LabelAlign extends Frame{
    final static long serialVersionUID = 0l;
    Label l[];

    LabelAlign(){
        l = new Label[7];
        l[0] = new Label("A simple label.");
        l[1] = new Label("A label with left alignment.", Label.LEFT);
        l[2] = new Label("A label with center alignment.", Label.CENTER);
        l[3] = new Label("A label with right alignment.", Label.RIGHT);
        l[4] = new Label("A label with yellow background.");
        l[5] = new Label("A label with red text.");
        l[6] = new Label("Text not added with setText().");

        setSize(500, 500);
        setLayout(new GridLayout(7, 1));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        for(Label tl : l) add(tl);

        l[4].setBackground(Color.YELLOW);
        l[5].setForeground(Color.RED);
        l[6].setText("Text added with setText().");

        setVisible(true);
    }

    public static void main(String args[])
    {
        new LabelAlign();
        return;
    }
};
/* end of LabelAlign.java */
