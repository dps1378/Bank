package banking.printable;

import banking.basicdetails.Address;

public class PrintCustomerAddress {
    protected static void PrintAddress(Address addr)
    {
        System.out.println("H.no:" + addr.getH_no());
        System.out.println("Building:" + addr.getB_name());
        System.out.println("Street:" + addr.getStreet());
        System.out.println("City:" + addr.getCity());
        System.out.println("Pincode:" + addr.getPincode());
    }

}
