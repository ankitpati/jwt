/* PasswordForm.java */
/* Date  : 12 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

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

public class PasswordForm extends Frame{
    final static long serialVersionUID = 0l;
    Label name, pass, status1, status2;
    TextField username, password;
    Button submit, cancel;
    Frame privileged;

    PasswordForm(){
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
                    status1.setText("Access");
                    if(
                        "syit".equals(username.getText()) &&
                        "syit".equals(password.getText())
                    ){
                        status2.setText("Granted!");
                        privileged = new ProtectedFrame();
                        privileged.addWindowListener(new WindowAdapter(){
                                public void windowClosing(WindowEvent evt)
                                {
                                    privileged.setVisible(false);
                                    setVisible(true);
                                    username.setText("");
                                    password.setText("");
                                    status1.setText("Username?");
                                    status2.setText("Password?");
                                }
                            }
                        );
                        setVisible(false);
                    }
                    else status2.setText("Denied!");
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
        new PasswordForm();
    }
};
/* end of PasswordForm.java */
