package banking.accounts;

import banking.basicdetails.CustomerDetails;

import java.util.ArrayList;

public class Current extends Account {
    static private ArrayList<Current> TotalCurrentAccounts=new ArrayList<Current>();
    private final double IntrestRate=12.9;
    public Current(String Name, int hno,String bname,String city,String street,int pincode, String Mobile_no, String Aadhar_Id, Double Balance)
    {
        super(Name,hno,bname,city,street,pincode,Mobile_no,Aadhar_Id,Balance);
        Type="CURRENT";
        TotalCurrentAccounts.add(this);
    }
    public void setBalance(double amount)
    {
        this.Balance=amount;
    }
    public double getInterestRate() {
        return IntrestRate;
    }

    public double creditIntrest(int Months) {
        return IntrestRate*this.Balance*Months/100;
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
    public static Current getAccount(int Account_no)
    {
        for(Current acc:TotalCurrentAccounts)
        {
            if(acc.Account_no==Account_no)
            {
                return acc;
            }
        }
        return null;
    }
}
