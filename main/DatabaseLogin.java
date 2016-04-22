/* DatabaseLogin.java */
/* Date  : 12 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class ProtectedFrame extends Frame{
    final static long serialVersionUID = 0l;
    Label privileged;

    ProtectedFrame()
    {
        privileged = new Label("Privileged Access");

        setSize(500, 500);
        setLayout(new FlowLayout());

        add(privileged);
        setVisible(true);
    }
};

public class DatabaseLogin extends Frame{
    final static long serialVersionUID = 0l;
    Label name, pass, status1, status2;
    TextField username, password;
    Button submit, cancel;

    DatabaseLogin(){
        name = new Label("Name");
        pass = new Label("Pass");
        status1 = new Label("Username?");
        status2 = new Label("Password?");
        username = new TextField(40);
        password = new TextField(40);
        cancel = new Button("Cancel");
        submit = new Button("Submit");

        setSize(200, 100);
        setLayout(new GridLayout(4, 2));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        cancel.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    username.setText("");
                    password.setText("");
                    status1.setText("Username?");
                    status2.setText("Password?");
                }
            }
        );

        submit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    ResultSet rs;

                    try(
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/hotelmgmt?user=hotelmgmt&password=hotelmgmt");
                        PreparedStatement ps = c.prepareStatement("select username from users where password=?")
                    ){
                        ps.setString(1, password.getText());
                        rs = ps.executeQuery();
                        status1.setText(rs.next() ? "Valid" : "Invalid");
                        status2.setText("User");
                    }
                    catch(SQLException sqe){
                        System.err.println("Database Connection Failed!");
                        sqe.printStackTrace();
                    }
                    finally{
                        password.setText("");
                    }
                }
            }
        );

        add(name);
        add(username);
        add(pass);
        add(password);
        add(cancel);
        add(submit);
        add(status1);
        add(status2);

        setVisible(true);
    }

    public static void main(String args[])
    {
        DatabaseLogin bd;
        bd = new DatabaseLogin();
        return;
    }
};
/* end of DatabaseLogin.java */
