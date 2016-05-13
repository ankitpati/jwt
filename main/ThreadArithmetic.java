/* ThreadArithmetic.java */
/* Date  : 15 April 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

public class ThreadArithmetic extends Thread{
    static boolean locked = false;

    ThreadArithmetic(String operation)
    {
        setName(operation);
        start();
    }

    public void run()
    {
        try{
            while(locked) sleep(500);
        }
        catch(InterruptedException ie){
            System.exit(1);
        }

        locked = true;
        System.out.printf("%s: Lock Acquired\n", getName());

        double a, b;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter two numbers:\n");
        a = sc.nextDouble();
        b = sc.nextDouble();
        switch(getName()){
        case "addition":
            System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
            break;
        case "multiplication":
            System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
            break;
        }

        System.out.printf("%s: Releasing Lock\n\n", getName());
        locked = false;
    }

    public static void main(String args[])
    {
        new ThreadArithmetic("addition");
        new ThreadArithmetic("multiplication");

        return;
    }
};
/* end of ThreadArithmetic.java */

/* OUTPUT

addition: Lock Acquired
Enter two numbers:
45
2.43
45.00 + 2.43 = 47.43
addition: Releasing Lock

multiplication: Lock Acquired
Enter two numbers:
43
5
43.00 * 5.00 = 215.00
multiplication: Releasing Lock

*/
