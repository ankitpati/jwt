/* numberOperations.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class numberOperations{
    static int factorial(int n)
    {
        int ret;
        for(ret = 1; n != 0; --n) ret *= n;
        return ret;
    }

    static boolean isPrime(int n)
    {
        int i;
        if(n == 1) return false;
        if(n == 2) return true;
        for(i = 2; i < n/2 && n%i != 0; ++i);
        return n%i != 0;
    }

    static boolean isEven(int n)
    {
        return n%2 == 0;
    }

    static void printFibonacciSeries(int numberOfTerms)
    {
        int i, x, y, t;
        x = 0;
        y = 1;
        for(i = 0; i < numberOfTerms; ++i){
            System.out.printf("%d ", x);
            t  = x;
            x  = y;
            y += t;
        }
        System.out.printf("\n");
    }

    static int reverseNumber(int n)
    {
        int rev;
        rev = 0;
        do{
            rev *= 10;
            rev += n%10;
        } while((n /= 10) != 0);
        return rev;
    }

    static int addDigits(int n)
    {
        int sum;
        sum = 0;
        do sum += n%10;
        while((n /= 10) != 0);
        return sum;
    }

    public static void main(String args[])
    {
        int choice, n;
        Scanner sc;

        sc = new Scanner(System.in);

        for(;;){
            System.out.printf(
                "What would you like to do?\n" +
                "( 0) Exit\n" +
                "( 1) Factorial\n" +
                "( 2) Prime or Composite\n" +
                "( 3) Even  or Odd\n" +
                "( 4) Fibonacci Series\n" +
                "( 5) Reverse Number\n" +
                "( 6) Sum of Digits\n"
            );

            choice = sc.nextInt(); sc.nextLine();
            if(choice == 0) System.exit(0);
            System.out.printf("Enter number:\n");
            n = sc.nextInt(); sc.nextLine();

            switch(choice){
            case 1:
                System.out.printf("%d! = %d\n", n, factorial(n));
                break;
            case 2:
                System.out.printf("%s\n", isPrime(n) ? "Prime" : "Composite");
                break;
            case 3:
                System.out.printf("%s\n", isEven(n) ? "Even" : "Odd");
                break;
            case 4:
                printFibonacciSeries(n);
                break;
            case 5:
                System.out.printf("Reversed: %d\n", reverseNumber(n));
                break;
            case 6:
                System.out.printf("Sum of Digits: %d\n", addDigits(n));
                break;
            default:
                System.out.printf("Incorrect Choice!\n");
                break;
            }

            System.out.printf("\n");
        }
    }
};
/* end of numberOperations.java */
