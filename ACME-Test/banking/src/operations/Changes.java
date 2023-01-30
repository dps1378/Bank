package operations;

import banking.accounts.Current;
import banking.accounts.Savings;
import banking.basicdetails.Address;

import java.util.Scanner;

public class Changes {
    public static void makeChanges(int Account_Number){
        System.out.println("1:Change Name" +
                "\n2:Change Mobile Number" +
                "\n3:Change Address" +
                "\n4:exit");
        Scanner sc=new Scanner(System.in);
        int choice_3=sc.nextInt();
        sc.nextLine();
        switch (choice_3){
            case 1:
            {
                if(Savings.getAccount(Account_Number)!=null)
                {
                    System.out.println("Enter the name:");
                    String Name=sc.nextLine();
                    Savings.getAccount(Account_Number).getCustomer().setName(Name);
                }
                else if(Current.getAccount(Account_Number)!=null)
                {
                    System.out.println("Enter the name:");
                    String Name=sc.nextLine();
                    Current.getAccount(Account_Number).getCustomer().setName(Name);
                }
                else
                {
                    System.out.println("Account doesn't exist");
                }
                break;
            }
            case 2:
            {
                if (Savings.getAccount(Account_Number) != null) {
                    System.out.println("Enter the Mobile Number:");
                    String MobileNo = sc.nextLine();
                    Savings.getAccount(Account_Number).getCustomer().setMobile_no(MobileNo);
                } else if (Current.getAccount(Account_Number) != null) {
                    System.out.println("Enter the Mobile Number:");
                    String MobileNo = sc.nextLine();
                    Current.getAccount(Account_Number).getCustomer().setMobile_no(MobileNo);
                } else {
                    System.out.println("Account doesn't exist");
                }
                break;
            }
            case 3:
            {
                if(Savings.getAccount(Account_Number) != null)
                {
                    String bname="",city,street;
                    int hno,pincode;
                    System.out.println("Enter the Building Name:");
                    bname=sc.nextLine();
                    System.out.println("Enter the House Number:");
                    hno=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the street:");
                    street=sc.nextLine();
                    System.out.println("Enter the city:");
                    city= sc.nextLine();
                    System.out.println("Enter the pincode:");
                    pincode=sc.nextInt();
                    Address address=new Address(hno,bname,city,street,pincode);
                    Savings.getAccount(Account_Number).getCustomer().setAddress(address);
                }
                else if (Current.getAccount(Account_Number) != null) {
                    String bname="",city,street;
                    int hno,pincode;
                    System.out.println("Enter the Building Name:");
                    bname=sc.nextLine();
                    System.out.println("Enter the House Number:");
                    hno=sc.nextInt();
                    System.out.println("Enter the street:");
                    street=sc.nextLine();
                    System.out.println("Enter the city:");
                    city= sc.nextLine();
                    System.out.println("Enter the pincode:");
                    pincode=sc.nextInt();
                    Address address=new Address(hno,bname,city,street,pincode);
                    Current.getAccount(Account_Number).getCustomer().setAddress(address);
                }
                else {
                    System.out.println("Account doesn't exist");
                }
                break;
            }
            case 4:
            {
                break;
            }

        }
    }
}
