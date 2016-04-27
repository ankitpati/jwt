/* repeatedElements.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class repeatedElements{
    public static void main(String args[])
    {
        int a[], n, k, count;
        int i, j, l; /* counters */
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Number of array elements?\n");
        n = sc.nextInt(); sc.nextLine();

        a = new int[n];

        System.out.printf("%d array elements?\n", n);
        for(i = 0; i < n; ++i) a[i] = sc.nextInt();
        sc.nextLine();

        System.out.printf("k?\n");
        k = sc.nextInt(); sc.nextLine();

        System.out.printf("Elements repeated more than %d times:\n", k = n / k);
        for(i = 0; i < n; ++i){
            count = 1;
            for(j = i + 1; j < n; ++j)
                if(a[i] == a[j]){
                    ++count;
                    --n;
                    for(l = j; l < n; ++l) a[l] = a[l + 1];
                    --j;
                }
            if(count > k) System.out.printf("%d\n", a[i]);
        }

        return;
    }
};
/* end of repeatedElements.java */

/* OUTPUT

Number of array elements?
16
16 array elements?
3 1 2 2 1 2 3 3 4 1 4 4 5 5 6 1
k?
8
Elements repeated more than 2 times:
3
1
2
4

*/
