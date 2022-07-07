package com.company;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income;
        System.out.println("Enter your income ");
        income = sc.nextFloat();

        if (income>=250000 && income<= 500000) {
            System.out.println("you hve to pay 5% income tax");
        }
          else if (income>=500000 && income<= 1000000) {
            System.out.println("you have to pay 20% income tax");
        }
          else if (income>1000000){
            System.out.println("you have to pay 30% tax");
        }
          else {
            System.out.println("No need to pay tax");
        }
    }
}
