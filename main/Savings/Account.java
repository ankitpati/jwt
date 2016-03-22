/* Account.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

package in.edu.sitpune.ankitpati.account;

public class Account{
    int accountNo;
    float balance;

    public Account(int accountNo, float balance)
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void disp()
    {
        System.out.printf(
            "Account Details:\n" +
            "- Account Number : " + accountNo + '\n' +
            "- Balance        : " + balance   + '\n'
        );
    }
};
/* end of Account.java */

/* OUTPUT

$ javac -d . Account.java

./in/edu/sitpune/ankitpati/account/Account.class

*/
