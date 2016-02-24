/* arrayOddEven.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class arrayOddEven{
    public static void main(String args[])
    {
        int even[], odd[], n, t;
        int i, j, k;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Number of array elements?\n");
        n = sc.nextInt(); sc.nextLine();

        even = new int[n];
        odd  = new int[n];

        System.out.printf("%d array elements?\n", n);
        for(i = j = k = 0; i < n; ++i)
            if((t = sc.nextInt()) % 2 == 0)
                even[j++] = t;
            else
                odd [k++] = t;
        sc.nextLine();

        System.out.printf("Even elements:\n");
        for(i = 0; i < j; ++i) System.out.printf("%d ", even[i]);
        System.out.printf("\n");

        System.out.printf("Odd  elements:\n");
        for(i = 0; i < k; ++i) System.out.printf("%d ", odd [i]);
        System.out.printf("\n");

        return;
    }
};
/* end of arrayOddEven.java */

/* OUTPUT

Number of array elements?
7
7 array elements?
4 3 5 2 6 0 9
Even elements:
4 2 6 0
Odd  elements:
3 5 9

*/
