/* BoxDemo.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

import in.edu.sitpune.ankitpati.box.Box;

class BoxDemo{
    public static void main(String args[])
    {
        Box b;
        b = new Box(43.5, 5.43, 4.35);

        b.v = b.l * b.b * b.h;
        b.disp();
    }
};
/* end of BoxDemo.java */

/* OUTPUT

Box Details:
- Length  : 43.5
- Breadth : 5.43
- Height  : 4.35
- Volume  : 1027.49175

*/
