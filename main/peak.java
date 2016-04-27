/* peak.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class peak{
    public static void main(String args[])
    {
        int a[], n;
        int i;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Number of array elements?\n");
        n = sc.nextInt(); sc.nextLine();

        a = new int[n];

        System.out.printf("%d array elements?\n", n);
        for(i = 0; i < n; ++i) a[i] = sc.nextInt();
        sc.nextLine();

        System.out.printf("Peak elements:\n");
        for(i = 0; i < n; ++i)
            if((i == 0 || a[i] > a[i-1]) && (i == a.length-1 || a[i] > a[i+1]))
                System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        return;
    }
};
/* end of peak.java */

/* OUTPUT

Number of array elements?
7
7 array elements?
4 3 5 2 6 0 9
Peak elements:
4 5 6 9

*/
