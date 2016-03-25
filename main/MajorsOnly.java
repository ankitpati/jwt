/* MajorsOnly.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;

class MinorException extends Exception{
    final static long serialVersionUID = 0;

    public MinorException(String message)
    {
        super(message);
    }
};

class MajorsOnly{
    public static void main(String args[]) throws MinorException
    {
        if(args.length == 0)
            System.out.printf("Usage:\n\tjava MajorsOnly <age in years>\n");
        else if(Integer.parseInt(args[0]) < 18)
            throw new MinorException("Minors not allowed.");
        else
            System.out.printf("Majors are allowed.\n");

        return;
    }
};
/* end of MajorsOnly.java */

/* OUTPUT

$ java MajorsOnly
Usage:
    java MajorsOnly <age in years>

$ java MajorsOnly 43
Majors are allowed.

$ java MajorsOnly 13
Exception in thread "main" MinorException: Minors not allowed.
    at MajorsOnly.main(MajorsOnly.java:23)

*/
