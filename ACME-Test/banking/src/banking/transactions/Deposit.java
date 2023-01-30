package banking.transactions;

import banking.accounts.Account;
import banking.accounts.FindAccount;

public class Deposit {
    public static void deposit(int Account_number,double Amount)
    {
        Account Acc= FindAccount.findAcc(Account_number);
        if(Acc!=null)
        {
            Double Balance=Acc.getBalance()+Amount;
            Acc.setBalance(Balance);
            System.out.println("Deposited Successfully");
            System.out.println("The new Balance is:"+Acc.getBalance());
        }
        else
        {
            System.out.println("No Account found with the Account Number");
        }
    }
}
