/* LoginDemo.java */
/* Date  : 19 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;
import in.edu.sitpune.ankitpati.login.LoginException;

class Login{
    void login() throws LoginException
    {
        String username, password;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Username: "); username = sc.nextLine();
        System.out.printf("Password: "); password = sc.nextLine();

        if(
            !username.toUpperCase().equals("SYIT") ||
            !password.toUpperCase().equals("SYIT")
        ) throw new LoginException("Incorrect Credentials!");

        System.out.printf("Welcome to Second Year IT Batch of 2014-18\n");
    }
};

class LoginDemo{
    public static void main(String args[])
    {
        Login l;

        l = new Login();

        try{
            l.login();
        }
        catch(LoginException le){
            System.err.printf(le.getMessage());
        }

        return;
    }
};
/* end of LoginDemo.java */

/* OUTPUT

Username: Ankit Pati
Password: 14070121506
Incorrect Credentials!

Username: SYIT
Password: syit
Welcome to Second Year IT Batch of 2014-18

*/
