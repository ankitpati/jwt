/* ThreadDemo.java */
/* Date  : 15 April 2016
 * Author: Ankit Pati
 */

public class ThreadDemo implements Runnable{
    public void run()
    {
        System.out.println("hello, world from Thread t");
    }

    public static void main(String args[])
    {
        Thread t;
        t = new Thread(new ThreadDemo());
        t.start();
    }
};
/* end of ThreadDemo.java */

/* OUTPUT

hello, world from Thread t

*/
