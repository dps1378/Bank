package banking.transactions;

import banking.accounts.Account;
import banking.accounts.Savings;

public class Withdraw {
    public static void withdraw(int Account_number,double Amount)
    {
        Account Acc=Savings.getAccount(Account_number);
        if(Acc!=null)
        {
            Double Balance=Acc.getBalance();
            if(Balance<Amount)
            {
                System.out.println("Insufficient Balance");
                return;
            }
            Balance=Balance-Amount;
            Acc.setBalance(Balance);
            System.out.println("Amount Deducted Succesfull");
            System.out.println("The new Balance is:"+Acc.getBalance());
        }
        else
        {
            System.out.println("No Account found with the Account Number");
        }
    }
}
