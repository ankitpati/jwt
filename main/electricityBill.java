/* electricityBill.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class electricityBill{
    public static void main(String args[])
    {
        int units;
        float bill;

        bill = 250.0f;

        System.out.printf("How many units consumed?\n");
        units = new Scanner(System.in).nextInt();

             if(units < 100) bill += 1.5f * units;
        else if(units < 200) bill += 1.5f * units + 2.0f * (units - 100);
        else if(units < 250) bill += 1.5f * units + 2.0f * (units - 100)
                                                  + 2.5f * (units - 200);
        else bill += 1.5f * units + 2.0f * (units - 100) + 2.5f * (units - 200)
                                                         + 4.0f * (units - 250);

        System.out.printf("Bill amount is %f.\n", bill);

        return;
    }
};
/* end of electricityBill.java */

/* OUTPUT

How many units consumed?
243
Bill amount is 1008.000000.

*/
