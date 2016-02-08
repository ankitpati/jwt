/* reverseWords.java */
/* Date  : 27 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;

class reverseWords{
    public static String revstr(String str)
    {
        int i;
        String rev;

        for(i = str.length() - 1, rev = ""; i >= 0; --i) rev += str.charAt(i);

        return rev;
    }

    public static void main(String args[]) throws IOException
    {
        StringTokenizer st;

        System.out.printf("Enter a sentence.\n");
        st = new StringTokenizer(
            new BufferedReader(new InputStreamReader(System.in)).readLine());

        System.out.printf("Sentence with reversed words:\n");
        while(st.hasMoreTokens())
            System.out.printf("%s ", revstr(st.nextToken()));

        return;
    }
};
/* end of reverseWords.java */

/* OUTPUT

Enter a sentence.
hello, world
Sentence with reversed words:
,olleh dlrow

*/
