/* fileWords.java */
/* Date  : 09 February 2016
 * Author: Ankit Pati
 */

import java.io.*;
import java.util.*;

class fileWords{
    public static void main(String args[]) throws IOException
    {
        int read, i;
        String filename, word;
        ArrayList<String> wordList;
        FileReader fr;

        System.out.printf("Filename?\n");
        filename = new Scanner(System.in).nextLine();

        try{
            fr = new FileReader(filename);
        } catch(FileNotFoundException fnfe){
            System.err.printf("%s not found!\n", filename);
            System.exit(5);
            return;
        }

        wordList = new ArrayList<String>();

        read = 0;
        wordList.add("");
        while(read != -1){
            for(
                word = "";
                (read = fr.read()) != -1 && Character.isLetterOrDigit(read);
                word += (char)read
            );
            if(!wordList.contains(word)) wordList.add(word);
        }

        System.out.printf("%s contains following words:\n", filename);
        for(i = 1; i < wordList.size(); ++i)
            System.out.printf("%s ", wordList.get(i));
        System.out.printf("\n");

        return;
    }
};
/* end of fileWords.java */

/* OUTPUT

Filename?
fileWords.txt
fileWords.txt contains following words:
Technetium is an element with atomic number 43 Boron 5

Contents of fileWords.txt:
Technetium is an element with atomic number 43.
Boron is an element with atomic number 5.

*/
