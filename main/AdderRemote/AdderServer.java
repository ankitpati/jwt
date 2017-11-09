/* AdderServer.java */
/* Date  : 23 March 2016
 * Author: Ankit Pati
 */

import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class AdderServer {
    public static void main(String args[])
    throws RemoteException, MalformedURLException {
        System.setProperty("java.rmi.server.hostname", "localhost");

        Naming.rebind("add", new AdderRemote());
    }
};
/* end of AdderServer.java */
