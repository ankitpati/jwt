/* DBDemo.java */
/* Date  : 05 April 2016
 * Author: Ankit Pati
 */

import java.sql.*;
import java.util.Properties;

public class DBDemo
{
    public static void main(String args[])
                                    throws ClassNotFoundException, SQLException
    {
        Properties p;
        Connection c;
        Statement stmt;
        ResultSet rs;

        /* Properties for user and password */
        p = new Properties();
        p.put("user", "coderush");
        p.put("password", "coderush");

        c = DriverManager.getConnection("jdbc:mysql://localhost/coderush", p);
        /*
            Connection String
            Database Name: coderush

            Not recommended, but user and password can be included by adding
            ?user=coderush&password=coderush
            to the string, where "coderush" is both username and password.
        */

        stmt = c.createStatement();
        rs = stmt.executeQuery("select username from users");

        while(rs.next()) System.out.printf("%s\n", rs.getString("username"));

        c.close();
        return;
    }
};
/* end of DBDemo.java */

/* OUTPUT

ankit.pati@sitpune.edu.in
ankitpati@gmail.com
test@example.com

*/
