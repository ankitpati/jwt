/* AdderRemote.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.rmi.*;
import java.rmi.server.*;

public class AdderRemote extends UnicastRemoteObject implements AdderInterface {
    final static long serialVersionUID = 0l;

    AdderRemote() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
};
/* end of AdderRemote.java */
