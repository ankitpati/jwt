/* diamondPattern.java */
/* Date  : 10 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class diamondPattern{
    public static void main(String args[])
    {
        int i, j, n;
        boolean low;

        System.out.printf("Depth of central row?\n");
        n = new Scanner(System.in).nextInt();

        for(i = 1, low = false; low ? i >= 1 : i <= n; i += low ? -1 : 1){
            for(j = 1; j <= n - i; ++j) System.out.printf(" ");
            for(j = 1; j <= 2 * i - 1; ++j) System.out.printf("*");
            System.out.printf("\n");
            if(i == n) low = true;
        }

        return;
    }
};
/* end of diamondPattern.java */

/* OUTPUT

Depth of central row?
4
   *
  ***
 *****
*******
 *****
  ***
   *

*/
