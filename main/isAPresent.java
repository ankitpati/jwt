/* isAPresent.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class ANotPresentException extends Exception{
    final static long serialVersionUID = 0;

    public ANotPresentException(String message)
    {
        super(message);
    }
};

class isAPresent{
    public static void main(String args[]) throws ANotPresentException
    {
        int i;
        String s;

        System.out.printf("Enter a string:\n");
        s = new Scanner(System.in).nextLine();

        for(i = 0; i < s.length() && s.charAt(i) != 'a'; ++i);

        if(i == s.length())
            throw new ANotPresentException("No 'a' found.");
        else
            System.out.printf("'a' found at position %d.\n", i);

        return;
    }
};
/* end of isAPresent.java */

/* OUTPUT

Enter a string:
Ankit Pati
'a' found at position 7.

Enter a string:
Tigress
Exception in thread "main" ANotPresentException: No 'a' found.
    at isAPresent.main(isAPresent.java:30)

*/
