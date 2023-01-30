package banking.printable;
import banking.accounts.*;

public class PrintAccountDetails extends PrintCustomerDetails {
    public static void printAccDetails(int Account_no)
    {
        Account Acc=FindAccount.findAcc(Account_no);
        if(Acc!=null)
        {
            System.out.println("Account Number:"+Account_no);
            System.out.println("Balance:"+Acc.getBalance());
            System.out.println("Intrest Rate:"+Acc.getInterestRate());
            System.out.println("Type:"+Acc.getType());
            printCustomerDetails(Acc.getCustomer());
        }
        else if(Acc==null)
        {
            System.out.println("No details found");
        }
    }
}
