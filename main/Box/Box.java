/* Box.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.box;

public class Box{
    public double l, b, h, v;

    public Box(double l, double b, double h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void disp()
    {
        System.out.printf(
            "Box Details:\n" +
            "- Length  : " + l + '\n' +
            "- Breadth : " + b + '\n' +
            "- Height  : " + h + '\n' +
            "- Volume  : " + v + '\n'
        );
    }
};
/* end of Box.java */

/* OUTPUT

$ javac -d . Box.java

./in/edu/sitpune/ankitpati/box/Box.class

*/
