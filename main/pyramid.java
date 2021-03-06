/* pyramid.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

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
                System.out.printf("%3d ", (i*(i+1)/2 + j) * x);
            System.out.printf("\n");
        }
    }
};
/* end of pyramid.java */

/* OUTPUT

Enter number:
5
Enter X:
4
  0
  4   8
 12  16  20
 24  28  32  36
 40  44  48  52  56

*/
