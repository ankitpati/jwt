/* pattern.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

class pattern{
    public static void main(String args[])
    {
        int i, j;

        for(i = 5; i != 0; --i){
            for(j = i; j != 0; --j)
                System.out.printf("*");
            System.out.printf("\n");
        }

        for(i = 0; i < 5; ++i){
            for(j = 0; j <= i; ++j)
                System.out.printf("*");
            System.out.printf("\n");
        }

        return;
    }
};
/* end of pattern.java */

/* OUTPUT

*****
****
***
**
*
*
**
***
****
*****

*/
