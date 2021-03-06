/* AdderClient.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class AdderClient {
    public static void main(String args[])
    throws RemoteException, NotBoundException, MalformedURLException {
        AdderInterface stub;

        if (args.length != 2) {
            System.err.printf("Usage:\n\tjava AdderClient <int 1> <int 2>\n");
            System.exit(1);
        }

        stub = (AdderInterface)Naming.lookup("rmi://localhost/add");

        System.out.printf("Sum = %d\n",
                stub.add(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
};
/* end of AdderClient.java */
