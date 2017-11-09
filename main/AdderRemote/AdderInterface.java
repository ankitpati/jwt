/* AdderInterface.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.rmi.*;

public interface AdderInterface extends Remote {
    int add(int x, int y) throws RemoteException;
};
/* end of AdderInterface.java */
