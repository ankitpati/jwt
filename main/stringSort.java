/* stringSort.java */
/* Date  : 03 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class stringSort{
    public static String sort(String str)
    {
        int i, j, small;
        byte srt[], tmp;

        srt = str.getBytes();

        for(i = 0; i < srt.length; ++i){
            small = i;
            for(j = i; j < srt.length; ++j)
                if(srt[small] > srt[j])
                    small = j;
            tmp = srt[i];
            srt[i] = srt[small];
            srt[small] = tmp;
        }

        return new String(srt);
    }

    public static void main(String args[])
    {
        String str;

        System.out.printf("Enter a string:\n");
        str = new Scanner(System.in).nextLine();

        System.out.printf("Sorted string:\n%s\n", sort(str));

        return;
    }
};
/* end of stringSort.java */

/* OUTPUT

Enter a string:
hello, world
Sorted string:
 ,dehllloorw

*/
