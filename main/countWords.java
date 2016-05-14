/* countWords.java */
/* Date  : 27 January 2016
 * Author: Ankit Pati
 */

import java.io.*;

class countWords{
    public static int wordCount(String para, String word)
    {
        int i, offset, hlen, count;

        for(offset = count = 0; offset < para.length(); offset += hlen + 1){
            for(
                hlen = 0;
                hlen < para.length() - offset &&
                    para.charAt(offset + hlen) != ' ';
                ++hlen
            );

            for(i = 0; i < word.length() && offset + i < para.length(); ++i)
                if(para.charAt(offset + i) != word.charAt(i)) break;

            if(i == word.length()) ++count;
        }

        return count;
    }

    public static void main(String args[]) throws IOException
    {
        int offset, words;
        String para, word;
        BufferedReader br;

        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Enter a paragraph. Use a blank line to end.\n\n");
        for(
            para = br.readLine();
            (word = br.readLine()).equals("") == false;
            para += word
        ) para += " ";

        System.out.printf("Enter a word to count.\n");
        word = br.readLine();

        System.out.printf(
            "Number of occurences are %d.\n",
            wordCount(para, word)
        );
    }
};
/* end of countWords.java */

/* OUTPUT

Enter a paragraph. Use a blank line to end.

This is a Java program.
The coder is Boron.

Enter a word to count.
is
Number of occurences are 2.

*/
