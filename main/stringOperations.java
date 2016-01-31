/* stringOperations.java */
/* Date  : 27 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;

class stringOperations{
    public static String strcpy(String str)
    {
        int i;
        String ret;

        for(i = 0, ret = ""; i < str.length(); ++i) ret += str.charAt(i);

        return ret;
    }

    public static String strcat(String str1, String str2)
    {
        int i, j;
        String str;

        str = "";

        for(i = 0; i < str1.length(); ++i) str += str1.charAt(i);
        for(j = 0; j < str2.length(); ++j) str += str2.charAt(j);

        return str;
    }

    public static int strlen(String str)
    {
        int i;

        i = 0;

        try{
            while(str.charAt(i) == str.charAt(i)) ++i;
        } catch(StringIndexOutOfBoundsException sie){
        }

        return i;
    }

    public static String revstr(String str)
    {
        int i;
        String rev;

        for(i = str.length() - 1, rev = ""; i >= 0; --i) rev += str.charAt(i);

        return rev;
    }

    public static boolean isPalindrome(String str)
    {
        int i, j;

        for(i = 0, j = str.length() - 1; i < j; ++i, --j)
            if(str.charAt(i) != str.charAt(j))
                return false;

        return true;
    }

    public static int strcmp(String str1, String str2)
    {
        int i;

        for(i = 0; i < str1.length() && i < str2.length(); ++i)
            if(str1.charAt(i) != str2.charAt(i))
                return (int) str1.charAt(i) - (int) str2.charAt(i);

        return (int) (i == str1.length() ? 0 : str1.charAt(i)) -
               (int) (i == str2.length() ? 0 : str2.charAt(i));
    }

    public static int strstr(String haystack, String needle)
    {
        int i, j;

        for(i = 0; i < haystack.length() - needle.length() + 1; ++i){
            for(j = 0; j < needle.length(); ++j)
                if(haystack.charAt(i + j) != needle.charAt(j)) break;

            if(j == needle.length()) return i;
        }

        return -1;
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
                "( 1) Copy\n" +
                "( 2) Concatenate\n" +
                "( 3) Find Length\n" +
                "( 4) Reverse\n" +
                "( 5) Check Palindrome\n" +
                "( 6) Compare\n" +
                "( 7) Substring\n"
            );

            choice = sc.nextInt();
            if(choice == 0) System.exit(0);
            System.out.printf("Enter number:\n");
            n = sc.nextInt();

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
/* end of stringOperations.java */
