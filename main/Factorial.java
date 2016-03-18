/* Factorial.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.factorial;

public class Factorial{
    public static int factorial(int n)
    {
        int ret;
        for(ret = 1; n != 0; --n) ret *= n;
        return ret;
    }
};
/* end of Factorial.java */

/* OUTPUT

javac -d . Factorial.java

./in/edu/sitpune/factorial/Factorial.class

*/
