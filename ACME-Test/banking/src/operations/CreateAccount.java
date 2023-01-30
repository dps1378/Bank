package operations;

import banking.accounts.Current;
import banking.accounts.Savings;
import banking.printable.PrintAccountDetails;

import java.util.Scanner;

public class CreateAccount {
    public static void createAccount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which type of account you want to create?");
        String type=sc.nextLine();
        type=type.toLowerCase();
        if(type.equals("savings"))
        {
            String Name,bname="",city,street,mobile_no=null,Aadhar_id;
            int hno,pincode;
            double InitialDeposit=0;
            System.out.println("Enter Name:");
            Name=sc.nextLine();
            System.out.println("Enter The AadharId:");
            Aadhar_id=sc.nextLine();
            System.out.println("Enter the Mobile number:");
            mobile_no=sc.nextLine();
            System.out.println("Enter the Building Name:");
            bname=sc.nextLine();
            System.out.println("Enter the House Number:");
            hno=sc.nextInt();
            System.out.println("Enter the street:");
            sc.nextLine();
            street=sc.nextLine();
            System.out.println("Enter the city:");
            city= sc.nextLine();
            System.out.println("Enter the pincode:");
            pincode=sc.nextInt();
            System.out.println("Enter the initial deposit:");
            InitialDeposit=sc.nextDouble();
            Savings SavAcc=new Savings(Name,hno,bname,city,street,pincode,mobile_no,Aadhar_id,InitialDeposit);
            System.out.println("Your Account Created Successfully.Your account details are:");
            PrintAccountDetails.printAccDetails(SavAcc.getAccount_no());
        }
        else if(type.equals("current"))
        {
            String Name,bname="",city,street,mobile_no,Aadhar_id;
            int hno,pincode;
            double InitialDeposit=0;
            System.out.println("Enter Name:");
            Name=sc.nextLine();
            System.out.println("Enter The AadharId:");
            Aadhar_id=sc.nextLine();
            System.out.println("Enter the Mobile number:");
            mobile_no=sc.nextLine();
            System.out.println("Enter the Building Name:");
            bname=sc.nextLine();
            System.out.println("Enter the House Number:");
            hno=sc.nextInt();
            System.out.println("Enter the street:");
            sc.nextLine();
            street=sc.nextLine();
            System.out.println("Enter the city:");
            city= sc.nextLine();
            System.out.println("Enter the pincode:");
            pincode=sc.nextInt();
            System.out.println("Enter the initial deposit:");
            InitialDeposit=sc.nextDouble();
            Current CurrAcc=new Current(Name,hno,bname,city,street,pincode,mobile_no,Aadhar_id,InitialDeposit);
            System.out.println("Your Account Created Successfully.Your account details are:");
            PrintAccountDetails.printAccDetails(CurrAcc.getAccount_no());
        }
        else
        {
            System.out.println("Please enter correct type of account");
        }

    }
}
