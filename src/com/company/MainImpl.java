package com.company;
import java.util.Scanner;
class Account {
    int acc_no;
    String name;
    float amount;
    void insert(int a,String n,float amt)
    {
        acc_no=a;
        name=n;
        amount=amt;
    }

    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }

    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }

    void checkBalance(){System.out.println("Balance is: "+amount);}

    void display()
    { System.out.println("Account Number : "+acc_no); System.out.println("Customer Name : "+name);
        System.out.println("Customer Amount: "+amount);
    }

}

public class MainImpl extends Main {
    public static void main(String[] args)
    {
        int acc_no;
        String name;
        float amount;

        Scanner sc=new Scanner(System.in);
        Account a1=new Account();

        System.out.print("\n Enter account number : "); acc_no=sc.nextInt();

        System.out.print("\n Enter Customer Name : "); name=sc.next();

        System.out.print("\n Enter Customer Amount : "); amount=sc.nextFloat();

        a1.insert(acc_no,name,amount);

        a1.display();
        a1.checkBalance();

        System.out.print("\n Enter Amount to be deposited : "); float dep_amount=sc.nextFloat();
        a1.deposit(dep_amount);
        a1.checkBalance();

        System.out.print("\n Enter Amount to be withdrawn : "); float wit_amount=sc.nextFloat();
        a1.withdraw(wit_amount);
        a1.checkBalance();
        System.out.print("\n THANK YOU ");
    }
}






