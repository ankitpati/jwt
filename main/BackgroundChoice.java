/* BackgroundChoice.java */
/* Date  : 13 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class BackgroundChoice extends Frame{
    final static long serialVersionUID = 0l;
    String clor[] = {"Red", "Yellow", "Green", "Black", "Orange"};
    Choice background;

    BackgroundChoice(){
        background = new Choice();

        for(String c : clor) background.add(c);

        setTitle("Choose Background");
        setSize(225, 175);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        background.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent evt)
                {
                    switch(background.getSelectedIndex()){
                    case 0:
                        setBackground(Color.RED);
                        setForeground(Color.BLACK);
                        break;
                    case 1:
                        setBackground(Color.YELLOW);
                        setForeground(Color.BLACK);
                        break;
                    case 2:
                        setBackground(Color.GREEN);
                        setForeground(Color.BLACK);
                        break;
                    case 3:
                        setBackground(Color.BLACK);
                        setForeground(Color.WHITE);
                        break;
                    case 4:
                        setBackground(Color.ORANGE);
                        setForeground(Color.BLACK);
                        break;
                    }
                }
            }
        );

        add(background);

        setVisible(true);
    }

    public static void main(String args[])
    {
        new BackgroundChoice();
        return;
    }
};
/* end of BackgroundChoice.java */
