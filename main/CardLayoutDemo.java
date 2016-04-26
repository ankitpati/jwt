/* CardLayoutDemo.java */
/* Date  : 25 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame implements ActionListener{
    final static long serialVersionUID = 0l;
    CardLayout cards;
    Button b1, b2, b3, b4;

    CardLayoutDemo()
    {
        b1 = new Button("Card 1");
        b2 = new Button("Card 2");
        b3 = new Button("Card 3");
        b4 = new Button("Card 4");

        setSize(400, 400);
        setLayout(cards = new CardLayout(40, 30));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        cards.next(this);
    }

    public static void main(String[] args)
    {
        new CardLayoutDemo();
    }
};
/* end of CardLayoutDemo.java */
