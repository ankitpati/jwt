import java.lang.*;
import java.util.Scanner;

class stringSort{
    public static String sort(String str)
    {
        int i, j, small;
        char srt[], tmp;

        srt = new char[str.length()];

        for(i = 0; i < str.length(); ++i) srt[i] = str.charAt(i);

        for(i = 0; i < srt.length; ++i){
            small = i;
            for(j = i; j < srt.length; ++j)
                if(srt[small] > srt[j])
                    small = j;
            tmp = srt[i];
            srt[i] = srt[small];
            srt[small] = tmp;
        }

        for(i = 0, str = ""; i < srt.length; ++i) str += srt[i];

        return str;
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
