/* exceptionOddEven.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class OddException extends Exception{
    final static long serialVersionUID = 0;

    public OddException(String message)
    {
        super(message);
    }
};

class EvenException extends Exception{
    final static long serialVersionUID = 0;

    public EvenException(String message)
    {
        super(message);
    }
};

class exceptionOddEven{
    public static void main(String args[]) throws OddException, EvenException
    {
        System.out.printf("Enter an integer:\n");
        if(new Scanner(System.in).nextInt() % 2 == 0)
            throw new EvenException("Number is Even.");
        else
            throw new OddException("Number is Odd.");
    }
};
/* end of exceptionOddEven.java */

/* OUTPUT

Enter an integer:
43
Exception in thread "main" OddException: Number is Odd.
    at exceptionOddEven.main(exceptionOddEven.java:34)

Enter an integer:
50
Exception in thread "main" EvenException: Number is Even.
    at exceptionOddEven.main(exceptionOddEven.java:32)

*/
