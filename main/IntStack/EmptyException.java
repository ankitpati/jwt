/* EmptyException.java */
/* Date  : 22 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.intstack;

public class EmptyException extends Exception{
    final static long serialVersionUID = 0l;

    public EmptyException(String message)
    {
        super(message);
    }
};
/* end of EmptyException.java */

/* OUTPUT

$ javac -d . EmptyException.java

./in/edu/sitpune/ankitpati/intstack/EmptyException.class

*/
