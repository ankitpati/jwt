/* Savings.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

import in.edu.sitpune.ankitpati.transaction.Transaction;
import in.edu.sitpune.ankitpati.account.Account;

class Savings extends Account implements Transaction{
    float amt;

    Savings(int accountNo, float balance, float amt)
    {
        super(accountNo, balance);
        this.amt = amt;
    }

    void display()
    {
        disp();
        System.out.printf("- Savings Amount : %f\n", amt);
    }

    public void deposit(float amount)
    {
        amt += amount;
    }

    public static void main(String args[])
    {
        Savings s;
        s = new Savings(1312, 43519.54f, 23435.43f);

        s.deposit(1000.00f);
        s.display();
    }
};
/* end of Savings.java */

/* OUTPUT

Account Details:
- Account Number : 1312
- Balance        : 43519.54
- Savings Amount : 24435.429688

*/
