package banking.accounts;

import banking.basicdetails.CustomerDetails;

import java.util.ArrayList;

public class Savings extends Account{
    static private ArrayList<Savings> TotalSavingsAccounts=new ArrayList<Savings>();
    private final double InterestRate =10.9;
    public Savings(String Name, int hno,String bname,String city,String street,int pincode, String Mobile_no, String Aadhar_Id, Double Balance)
    {
        super(Name,hno,bname,city,street,pincode,Mobile_no,Aadhar_Id,Balance);
        Type="SAVINGS";
        TotalSavingsAccounts.add(this);
    }
    public void setBalance(double amount)
    {
        this.Balance=amount;
    }
    public double getInterestRate() {
        return InterestRate;
    }
    public double creditIntrest(int Months)
    {
        return InterestRate *this.Balance*Months/100;
    }
    public int getAccount_no()
    {
        return this.Account_no;
    }
    public Double getBalance()
    {
        return this.Balance;
    }
    public CustomerDetails getCustomer()
    {
        return this.customer;
    }
    public static int getTotalAccounts()
    {
        return TOTAL_ACCOUNTS;
    }
    public String getType(){
        return this.Type;
    }
    public static Savings getAccount(int Account_no)
    {
        for(Savings acc:TotalSavingsAccounts)
        {
            if(acc.Account_no==Account_no)
            {
                return acc;
            }
        }
        return null;
    }

}
