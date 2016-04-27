/* Access.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class AccessDeniedException extends Exception{
    final static long serialVersionUID = 0;

    public AccessDeniedException(String message)
    {
        super(message);
    }
};

class Access{
    public static void main(String args[]) throws AccessDeniedException
    {
        int i;
        String username, password;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Username: "); username = sc.nextLine();
        System.out.printf("Password: "); password = sc.nextLine();

        if(username.equals("SYIT") && password.equals("SYIT"))
            System.out.printf("Access Granted.\n");
        else throw new AccessDeniedException("Access Denied.");

        return;
    }
};
/* end of Access.java */

/* OUTPUT

Username: SYIT
Password: SYIT
Access Granted.

Username: Ankit Pati
Password: hello, world
Exception in thread "main" AccessDeniedException: Access Denied.
    at Access.main(Access.java:32)

*/
