/* IntStackDemo.java */
/* Date  : 22 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;
import in.edu.sitpune.ankitpati.intstack.IntStack;
import in.edu.sitpune.ankitpati.intstack.EmptyException;

class IntStackDemo{
    public static void main(String args[])
    {
        int temp;
        Scanner sc;
        IntStack is;

        sc = new Scanner(System.in);
        is = new IntStack();

        System.out.printf("Enter as many +ve integers as needed.\n" +
                          "Enter -ve integer to finish entering.\n"  );
        while((temp = sc.nextInt()) >=0) is.push(temp);

        System.out.printf(
            "IntStack Details:\n" +
            "- Capacity : " + is.getCapacity() + '\n' +
            "- Top      : " + is.getTop()      + '\n' +
            "- Popping  : "
        );

        try{
            for(;;) System.out.printf("%d ", is.pop());
        }
        catch(EmptyException e){
            System.err.printf(e.getMessage());
        }
        System.out.printf("\n");

        return;
    }
};
/* end of IntStackDemo.java */

/* OUTPUT

Enter as many +ve integers as needed.
Enter -ve integer to finish entering.
43
50
13
12
95
60
70
80
-1
IntStack Details:
- Capacity : 10
- Top      : 8
- Popping  : 80 70 60 95 12 13 50 43 Stack empty.

*/
