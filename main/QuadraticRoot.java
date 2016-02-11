/* QuadraticRoot.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class QuadraticRoot{
    public static void main(String args[])
    {
        double a, b, c;
        boolean sig;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter a, b, c in ax^2 + bx + c = 0\n");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        c = b*b - 4*a*c;
        b = -b / (2.0*a);
        c = (sig = c < 0) ? Math.sqrt(-c) / (2*a) : Math.sqrt(c) / (2*a);
        if(sig) System.out.printf("x = %f + %fi, %f - %fi\n", b, c, b, c);
        else    System.out.printf("x = %f, %f\n", b + c, b - c);
    }
};
/* end of QuadraticRoot.java */

/* OUTPUT

Enter a, b, c in ax^2 + bx + c = 0
1 2 1
x = -1.000000, -1.000000

*/
