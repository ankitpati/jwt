/* FactorialDemo.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;
import in.edu.sitpune.factorial.Factorial;

class FactorialDemo{
    public static void main(String args[])
    {
        System.out.printf("Positive Integer?\n");
        System.out.printf(
            "Factorial = %d\n",
            Factorial.factorial(new Scanner(System.in).nextInt())
        );
        return;
    }
};
/* end of FactorialDemo.java */

/* OUTPUT

Positive Integer?
5
Factorial = 120

*/
