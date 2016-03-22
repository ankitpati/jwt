/* Growable.java */
/* Date  : 22 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.intstack;

public interface Growable{
    void push(int element);
    int  pop() throws EmptyException;

    int  getCapacity();
    void ensureCapacity(int capacity);

    int getTop();
};
/* end of Growable.java */

/* OUTPUT

$ javac -d . Growable.java

./in/edu/sitpune/ankitpati/intstack/Growable.class

*/
