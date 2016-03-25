/* EmailValidation.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception{
    final static long serialVersionUID = 0;

    public InvalidEmailException(String message)
    {
        super(message);
    }
};

class EmailValidation{
    public static void main(String args[]) throws InvalidEmailException
    {
        System.out.printf("Enter an email address:\n");
        if(
            Pattern.matches(
                "[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z0-9_]+",
                new Scanner(System.in).nextLine()
            )
        )
            System.out.printf("Email is valid.\n");
        else
            throw new InvalidEmailException("Email is invalid.");

        return;
    }
};
/* end of EmailValidation.java */

/* OUTPUT

Enter an email address:
ankitpati@gmail.com
Email is valid.

Enter an email address:
ankit.pati@sitpune.edu.in
Email is valid.

Enter an email address:
ankitpati@gmail
Exception in thread "main" InvalidEmailException: Email is invalid.
    at EmailValidation.main(EmailValidation.java:31)

*/
