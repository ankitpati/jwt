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

    public static void main(String[] args)
    {
        GridBagLayoutDemo m = new GridBagLayoutDemo();
    }

    public void prepareGUI()
    {
        Container pane = getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill=GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        JLabel uname = new JLabel("User Name");
        pane.add(uname, c);
        JTextField un = new JTextField();
        c.gridx = 1;
        pane.add(un, c);
        JLabel pass = new JLabel("Password");
        c.gridx = 0;
        c.gridy = 1;
        pane.add(pass, c);
        JPasswordField password = new JPasswordField();
        c.gridx = 1;
        c.gridy = 1;
        pane.add(password, c);
        JButton ok = new JButton("Login");
        c.gridx = 0;
        c.gridy = 2;
        pane.add(ok, c);
        JButton clr = new JButton("Reset");
        c.gridx = 1;
        c.gridy = 2;
        pane.add(clr, c);
    }
};
/* end of GridBagLayoutDemo.java */
