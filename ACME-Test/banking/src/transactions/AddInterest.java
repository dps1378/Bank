package banking.transactions;
import banking.accounts.Account;
import banking.accounts.FindAccount;

public class AddInterest {
    public static void addInterest(int Account_number, int months)
    {
        Account Acc=FindAccount.findAcc(Account_number);
            if(Acc!=null)
            {
                double Amount=Acc.creditIntrest(months);
                double Balance=Acc.getBalance()+Amount;
                Acc.setBalance(Balance);
                System.out.println("Interest credited successfully");
            }
            else
            {
               System.out.println("No Account found with the Account Number");
            }
    }
}
