/* GridBagLayoutDemo.java */
/* Date  : 22 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo extends JFrame{
    final static long serialVersionUID = 0l;

    GridBagLayoutDemo()
    {
        setSize(400, 400);
        setTitle("GridBagLayout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prepareGUI();
        setVisible(true);
    }

    public void prepareGUI()
    {
        Container pane;
        JLabel uname;
        JTextField un;
        JLabel pass;
        JPasswordField password;
        JButton ok;
        JButton clr;

        GridBagConstraints c;

        uname = new JLabel("User Name");
        un = new JTextField();
        pass = new JLabel("Password");
        password = new JPasswordField();
        ok = new JButton("Login");
        clr = new JButton("Reset");

        c = new GridBagConstraints();

        pane = getContentPane();

        pane.setLayout(new GridBagLayout());

        c.fill = GridBagConstraints.BOTH;

        pane.add(uname, c);

        c.gridx = 1;
        pane.add(un, c);

        c.gridx = 0;
        c.gridy = 1;
        pane.add(pass, c);

        c.gridx = 1;
        c.gridy = 1;
        pane.add(password, c);

        c.gridx = 0;
        c.gridy = 2;
        pane.add(ok, c);

        c.gridx = 1;
        c.gridy = 2;
        pane.add(clr, c);
    }

    public static void main(String[] args)
    {
        new GridBagLayoutDemo();
    }
};
/* end of GridBagLayoutDemo.java */
