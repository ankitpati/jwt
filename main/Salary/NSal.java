/* NSal.java */
/* Date  : 19 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.salary;

public class NSal extends Exception{
    final static long serialVersionUID = 0l;

    public NSal(String message)
    {
        super(message);
    }
};
/* end of NSal.java */

/* OUTPUT

$ javac -d . NSal.java

./in/edu/sitpune/ankitpati/salary/NSal.class

*/
