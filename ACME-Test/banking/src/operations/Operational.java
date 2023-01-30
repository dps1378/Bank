package operations;

import banking.customer.GetBalance;
import banking.printable.PrintAccountDetails;
import banking.transactions.AddInterest;
import banking.transactions.Deposit;
import banking.transactions.Withdraw;

import java.util.Scanner;

public class Operational {
    public Operational(){
        System.out.println("Welecome to MYBANK");
    }
    public void start()
    {
        Scanner sc=new Scanner(System.in);
        OuterLoop:
        while (true){
            System.out.println("1:Create a New Account");
            System.out.println("2:For doing operations on existing account");
            System.out.println("Please Enter the Number corresponding to task you want perform:");
            int choice_1=sc.nextInt();
            switch (choice_1)
            {
                case 1:
                {
                    CreateAccount.createAccount();
                    break;
                }
                case 2:
                {
                    System.out.println("Please Enter the Account Number:");
                    int Account_Number=sc.nextInt();
                    System.out.println("1:Print Account Details" +
                            "\n2:Print Balance" +
                            "\n3:Add Interest" +
                            "\n4:To make a deposit" +
                            "\n5:To withdraw money" +
                            "\n6:To perform some Changes" +
                            "\n7:Exit");
                    System.out.println("Enter the number corresponding to the operation  you want to perform:");
                    int choice_2= sc.nextInt();
                    switch (choice_2){
                        case 1:
                        {
                            PrintAccountDetails.printAccDetails(Account_Number);
                            break;
                        }
                        case 2:
                        {
                            GetBalance.getBalance(Account_Number);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Enter the months:");
                            int month= sc.nextInt();
                            AddInterest.addInterest(Account_Number,month);
                            break;
                        }
                        case 4:
                        {
                            System.out.println("Enter the deposited Amount:");
                            double Amount= sc.nextDouble();
                            Deposit.deposit(Account_Number,Amount);
                            break;
                        }
                        case 5:
                        {
                            System.out.println("Enter the withdrawn Amount:");
                            double Amount=sc.nextDouble();
                            Withdraw.withdraw(Account_Number,Amount);
                            break;
                        }
                        case 6:
                        {
                            Changes.makeChanges(Account_Number);
                            break;
                        }
                        case 7:
                        {
                            break OuterLoop;
                        }
                    }


                }
                default:
                    System.out.println("Enter the correct choice");
            }
        }
    }
}
