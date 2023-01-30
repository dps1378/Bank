package banking.printable;
import banking.basicdetails.Address;
import banking.basicdetails.CustomerDetails;

public class PrintCustomerDetails extends PrintCustomerAddress{
    protected static void printCustomerDetails(CustomerDetails cust)
    {
        System.out.println("Name:"+cust.getName());
        System.out.println("Mobile Number:"+cust.getMobile_no());
        System.out.println("Aadhar Number:"+cust.getAadhar_Id());
        Address tempAddr=cust.getAddress();
        PrintCustomerAddress.PrintAddress(tempAddr);
    }
}
