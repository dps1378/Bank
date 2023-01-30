package banking.customer;

import banking.accounts.Account;
import banking.accounts.FindAccount;

public class GetBalance {
    public static void getBalance(int Account_Number)
    {
        Account Acc= FindAccount.findAcc(Account_Number);
        if(Acc!=null)
        {
            System.out.println("Account Number:"+Account_Number);
            System.out.println("Balance:"+Acc.getBalance());

        }
        else
        {

            System.out.println("No details found");
            return;
        }
    }
    }

