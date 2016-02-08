/* reverseRecursive.java */
/* Date  : 05 February 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.*;

class reverseRecursive{
    public static char revcore(char str[], int i, int j)[]
    {
        char temp;

        if(i >= j) return str;

        temp   = str[i];
        str[i] = str[j];
        str[j] = temp  ;

        return revcore(str, i + 1, j - 1);
    }

    public static String recrev(String str)
    {
        int i;
        char cstr[];
        String ret;

        cstr = new char[str.length()];

        for(i = 0; i < str.length(); ++i) cstr[i] = str.charAt(i);

        cstr = revcore(cstr, 0, cstr.length - 1);

        for(i = 0, ret = ""; i < cstr.length; ++i) ret += cstr[i];

        return ret;
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

