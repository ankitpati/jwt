/* reverseRecursive.java */
/* Date  : 05 February 2016
 * Author: Ankit Pati
 */

import java.util.*;

class reverseRecursive{
    public static byte revcore(byte str[], int i, int j)[]
    {
        byte temp;

        if(i >= j) return str;

        temp   = str[i];
        str[i] = str[j];
        str[j] = temp  ;

        return revcore(str, i + 1, j - 1);
    }

    public static String recrev(String str)
    {
        return new String(revcore(str.getBytes(), 0, str.length() - 1));
    }

    public static void main(String args[])
    {
        String str;

        System.out.printf("Enter a string.\n");
        str = new Scanner(System.in).nextLine();

        System.out.printf("Reversed String:\n%s\n", recrev(str));

        return;
    }
};
/* end of reverseRecursive.java */

/* OUTPUT

Enter a string.
hello, world
Reversed String:
dlrow ,olleh

*/
