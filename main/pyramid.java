/* pyramid.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class pyramid{
    public static void main(String args[])
    {
        int i, j, n, x;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter number:\n");
        n = sc.nextInt();

        System.out.printf("Enter X:\n");
        x = sc.nextInt();

        for(i = 0; i < n; ++i){
            for(j = 0; j <= i; ++j)
                System.out.printf("%d ", (i*(i+1)/2 + j) * x);
            System.out.printf("\n");
        }

        return;
    }
};
/* end of pyramid.java */
