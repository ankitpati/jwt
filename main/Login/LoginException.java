/* LoginException.java */
/* Date  : 19 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.login;

import java.lang.*;

public class LoginException extends Exception{
    final static long serialVersionUID = 0l;

    public LoginException(String message)
    {
        super(message);
    }
};
/* end of LoginException.java */

/* OUTPUT

$ javac -d . LoginException.java

./in/edu/sitpune/ankitpati/login/LoginException.class

*/
