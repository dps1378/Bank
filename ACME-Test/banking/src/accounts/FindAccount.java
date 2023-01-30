package banking.accounts;

public class FindAccount {
    public static Account findAcc(int AccountNumber)
    {
        if(Savings.getAccount(AccountNumber)!=null)
        {
            return Savings.getAccount(AccountNumber);
        }
        else if(Current.getAccount(AccountNumber)!=null)
        {
            return Current.getAccount(AccountNumber);
        }
        return null;
    }
}
