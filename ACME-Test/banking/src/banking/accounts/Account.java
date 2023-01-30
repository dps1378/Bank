package banking.accounts;

import banking.basicdetails.Address;
import banking.basicdetails.CustomerDetails;

public abstract class Account {
    static private int ACCOUNT_NUMBER=1;
    static protected int TOTAL_ACCOUNTS=0;
    public String Type;


    protected int Account_no;
    protected CustomerDetails customer;
    protected Double Balance;
    protected Account(String Name, int hno,String bname,String city,String street,int pincode, String Mobile_no, String Aadhar_Id, Double Balance)
    {
        Address address=new Address(hno,bname,city,street,pincode);
        this.customer=new CustomerDetails(Name,address,Mobile_no,Aadhar_Id);
        this.Account_no=ACCOUNT_NUMBER;
        ACCOUNT_NUMBER++;
        TOTAL_ACCOUNTS++;
        this.Balance=Balance;
    }
    abstract public double getInterestRate();
    abstract public CustomerDetails getCustomer();
    abstract public int getAccount_no();
    abstract public Double getBalance();
    abstract public String getType();
    abstract public void setBalance(double amount);
    abstract public double creditIntrest(int Months);
}

