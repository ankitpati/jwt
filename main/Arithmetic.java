/* Arithmetic.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

interface ArithOps{
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
};

class Arithmetic implements ArithOps{
    public double add(double a, double b) { return a + b; }
    public double sub(double a, double b) { return a - b; }
    public double mul(double a, double b) { return a * b; }
    public double div(double a, double b) { return a / b; }

    public static void main(String args[])
    {
        int ch;
        double a, b;
        Scanner sc;
        ArithOps ar;

        sc = new Scanner(System.in);
        ar = new Arithmetic();

        System.out.printf("Which operation would you like?\n");
        System.out.printf(" ( 1) Addition\n");
        System.out.printf(" ( 2) Subtraction\n");
        System.out.printf(" ( 3) Multiplication\n");
        System.out.printf(" ( 4) Division\n");

        ch = sc.nextInt();

        System.out.printf("Two numbers?\n");
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.printf("Result = %f\n",
            ch == 1 ? ar.add(a, b) : ch == 2 ? ar.sub(a, b) :
                ch == 3 ? ar.mul(a, b) : ch == 4 ? ar.div(a, b) : 'x'
        );
    }
};
/* end of Arithmetic.java */

/* OUTPUT

Which operation would you like?
 ( 1) Addition
 ( 2) Subtraction
 ( 3) Multiplication
 ( 4) Division

1
Two numbers?
43 5
Result = 48.000000

2
Two numbers?
5 43
Result = -38.000000

3
Two numbers?
43.5 5.43
Result = 236.205000

4
Two numbers?
5.43 43.5
Result = 0.124828

*/
