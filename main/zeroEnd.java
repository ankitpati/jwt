/* zeroEnd.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class zeroEnd{
    public static void main(String args[])
    {
        int a[], n;
        int i, j;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Number of array elements?\n");
        n = sc.nextInt(); sc.nextLine();

        a = new int[n];

        System.out.printf("%d array elements?\n", n);
        for(i = 0; i < n; ++i) a[i] = sc.nextInt();
        sc.nextLine();

        for(i = 0; i < n; ++i)
            if(a[i] == 0){
                --n;
                for(j = i; j < n; ++j) a[j] = a[j + 1];
                --i;
            }

        while(n < a.length) a[n++] = 0;

        System.out.printf("Zeros moved to end:\n");
        for(i = 0; i < a.length; ++i) System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
};
/* end of zeroEnd.java */

/* OUTPUT

Number of array elements?
16
16 array elements?
0 0 2 2 1 0 3 3 4 0 4 5 5 6 1 0
Zeros moved to end:
2 2 1 3 3 4 4 5 5 6 1 0 0 0 0 0

*/
