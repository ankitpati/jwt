/* SalaryDemo.java */
/* Date  : 19 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;
import in.edu.sitpune.ankitpati.salary.NSal;
import in.edu.sitpune.ankitpati.salary.PSal;

class Employee{
    void decideSal(float salary) throws NSal, PSal
    {
        if(salary < 0.0f)
            throw new NSal("Invalid Salary");
        else
            throw new PSal("Valid Salary");
    }
};

class SalaryDemo{
    public static void main(String args[])
    {
        Employee e;

        e = new Employee();

        System.out.printf("Salary?\n");

        try{
            e.decideSal(new Scanner(System.in).nextFloat());
        }
        catch(NSal ns){
            System.err.printf("Negative value entered!\n");
        }
        catch(PSal ps){
            System.err.printf("Postive value is accepted.\n");
        }
        finally{
            System.out.printf("Final\n");
        }

        return;
    }
};
/* end of SalaryDemo.java */

/* OUTPUT

Salary?
-43
Negative value entered!
Final

*/
