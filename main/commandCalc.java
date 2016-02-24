/* commandCalc.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class commandCalc{
    public static void main(String args[])
    {
        int i, choice;
        double st0, st1;
        Scanner sc;

        st0 = 0.0;
        sc = new Scanner(System.in);

        do{
            System.out.printf(
                "What would you like to do?\n" +
                "( 0) Exit\n" +
                "( 1) Add\n" +
                "( 2) Subtract\n" +
                "( 3) Multiply\n" +
                "( 4) Divide\n" +
                "( 5) Square Root\n" +
                "( 6) Power\n" +
                "( 7) Mean\n" +
                "( 8) Variance\n"
            );
            choice = sc.nextInt(); sc.nextLine();

            switch(choice){
            case 0:
                break;
            case 1:
                st0 = 0.0;
                for(i = 0; i < args.length; ++i)
                    st0 += Double.parseDouble(args[i]);
                break;
            case 2:
                st0 = args.length == 0 ? 0.0 : Double.parseDouble(args[0]);
                for(i = 1; i < args.length; ++i)
                    st0 -= Double.parseDouble(args[i]);
                break;
            case 3:
                st0 = args.length == 0 ? 0.0 : 1.0;
                for(i = 0; i < args.length; ++i)
                    st0 *= Double.parseDouble(args[i]);
                break;
            case 4:
                st0 = args.length == 0 ? 0.0 : Double.parseDouble(args[0]);
                for(i = 1; i < args.length; ++i)
                    if(Double.parseDouble(args[i]) == 0.0)
                        System.out.printf("Division by Zero!\n");
                    else
                        st0 /= Double.parseDouble(args[i]);
                break;
            case 5:
                st0 = args.length == 0 ? 0.0 : Math.sqrt(
                    Double.parseDouble(args[0])
                );
                break;
            case 6:
                st0 = args.length == 0 ? 0.0 : Double.parseDouble(args[0]);
                for(i = 1; i < args.length; ++i)
                    st0 = Math.pow(st0, Double.parseDouble(args[i]));
                break;
            case 7:
                st0 = 0.0;
                for(i = 0; i < args.length; ++i)
                    st0 += Double.parseDouble(args[i]);
                st0 /= args.length;
                break;
            case 8:
                st1 = 0.0;
                for(i = 0; i < args.length; ++i)
                    st1 += Double.parseDouble(args[i]);
                st1 /= args.length;

                st0 = 0.0;
                for(i = 0; i < args.length; ++i)
                    st0 += Math.pow(Double.parseDouble(args[i]) - st1, 2.0);
                st0 /= args.length;
                break;
            default:
                System.out.printf("Incorrect Choice!\n");
                break;
            }
            if(choice >= 1 && choice <= 8) System.out.printf("= %f\n\n", st0);
        } while(choice != 0);

        return;
    }
};
/* end of commandCalc.java */

/* OUTPUT

$ java commandCalc 4 3 5 2 1

What would you like to do?
( 0) Exit
( 1) Add
( 2) Subtract
( 3) Multiply
( 4) Divide
( 5) Square Root
( 6) Power
( 7) Mean
( 8) Variance

1
= 15.000000

2
= -7.000000

3
= 120.000000

4
= 0.133333

5
= 2.000000

6
= 1152921504606846980.000000

7
= 3.000000

8
= 2.000000

0

*/
