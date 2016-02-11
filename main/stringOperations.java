/* stringOperations.java */
/* Date  : 27 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

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
        int choice;
        int index;
        String str1, str2;
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

            choice = sc.nextInt(); sc.nextLine();
            if(choice == 0) System.exit(0);
            System.out.printf("Enter string 1:\n");
            str1 = sc.nextLine();

            switch(choice){
            case 1:
                System.out.printf("%s\n", strcpy(str1));
                break;
            case 2:
                System.out.printf("Enter string 2:\n");
                str2 = sc.nextLine();
                System.out.printf("%s\n", strcat(str1, str2));
                break;
            case 3:
                System.out.printf("%d\n", strlen(str1));
                break;
            case 4:
                System.out.printf("%s\n", revstr(str1));
                break;
            case 5:
                System.out.printf(
                    "%sPalindrome\n",
                    isPalindrome(str1) ? "" : "Not "
                );
                break;
            case 6:
                System.out.printf("Enter string 2:\n");
                str2 = sc.nextLine();
                System.out.printf(
                    "strcmp(str1, str2): %d\n",
                    strcmp(str1, str2)
                );
                break;
            case 7:
                System.out.printf("Enter string 2:\n");
                str2 = sc.nextLine();
                if((index = strstr(str1, str2)) == -1)
                    System.out.printf("Substring not found.\n");
                else
                    System.out.printf("Index of Substring: %d\n", index);
                break;
            }

            System.out.printf("\n");
        }
    }
};
/* end of stringOperations.java */

/* OUTPUT

What would you like to do?
( 0) Exit
( 1) Copy
( 2) Concatenate
( 3) Find Length
( 4) Reverse
( 5) Check Palindrome
( 6) Compare
( 7) Substring

1
Enter string 1:
hello
hello

2
Enter string 1:
hello
Enter string 2:
world
helloworld

3
Enter string 1:
hello
5

4
Enter string 1:
world
dlrow

5
Enter string 1:
racecar
Palindrome

6
Enter string 1:
hello
Enter string 2:
world
strcmp(str1, str2): -15

7
Enter string 1:
technetium
Enter string 2:
net
Index of Substring: 4

0

*/
