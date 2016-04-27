/* arrayRecursion.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class arrayRecursion{
    public static int maxCore(int a[], int i)
    {
        return i == a.length ? Integer.MIN_VALUE : a[i] > maxCore(a, i + 1) ?
                                                       a[i] : maxCore(a, i + 1);
    }

    public static int max(int a[]) { return maxCore(a, 0); }

    public static int minCore(int a[], int i)
    {
        return i == a.length ? Integer.MAX_VALUE : a[i] < minCore(a, i + 1) ?
                                                       a[i] : minCore(a, i + 1);
    }

    public static int min(int a[]) { return minCore(a, 0); }

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

        System.out.printf("Maximum Number: %d\nMinimum Number: %d\n",
                                                                max(a), min(a));

        return;
    }
};
/* end of arrayRecursion.java */

/* OUTPUT

Number of array elements?
7
7 array elements?
4 3 5 2 6 0 9
Maximum Number: 9
Minimum Number: 0

*/
