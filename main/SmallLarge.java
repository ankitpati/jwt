/* SmallLarge.java */
/* Date  : 12 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class SmallLarge extends Frame{
    final static long serialVersionUID = 0l;
    Button smallest, largest;
    TextField n1, n2, n3;
    Label l;

    SmallLarge(){
        smallest = new Button("Smallest");
        largest = new Button("Largest");
        n1 = new TextField(20);
        n2 = new TextField(20);
        n3 = new TextField(20);
        l = new Label();

        setSize(200, 200);
        setLayout(new GridLayout(6, 1, 5, 5));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        smallest.addActionListener((ActionEvent evt) -> {
            int a, b, c;
            a = Integer.parseInt(n1.getText());
            b = Integer.parseInt(n2.getText());
            c = Integer.parseInt(n3.getText());
            l.setText("" + (a < b && a < c ? a : b < a && b < c ? b : c < a &&
                                                                c < b ? c : a));
        });

        largest.addActionListener((ActionEvent evt) -> {
            int a, b, c;
            a = Integer.parseInt(n1.getText());
            b = Integer.parseInt(n2.getText());
            c = Integer.parseInt(n3.getText());
            l.setText("" + (a > b && a > c ? a : b > a && b > c ? b : c > a &&
                                                                c > b ? c : a));
        });

        add(n1);
        add(n2);
        add(n3);
        add(l);
        add(smallest);
        add(largest);

        setVisible(true);
    }

    public static void main(String args[])
    {
        new SmallLarge();
    }
};
/* end of SmallLarge.java */
