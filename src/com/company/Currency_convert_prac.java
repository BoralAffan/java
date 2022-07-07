package com.company;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;
public class Currency_convert_prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rupee,dollar,choice1,choice2;
        System.out.println("*********************CURRENCY CONVERTER***********************");
        System.out.println("Enter currency u want to convert from");
        System.out.println("\n1.Indian rupee(INR)\n2.United states Dollar(USD)\n3.canadian dollar(CAD)\n");
        choice1=sc.nextDouble();
        System.out.println("enter currency u want to convert too\n");
        System.out.println("\n1.Indian rupee(INR)\n2.United states Dollar(USD)\n3.canadian dollar(CAD)\n");
        choice2=sc.nextDouble();
        if (choice1==1 && choice2==2){
            System.out.println("same");
        }
    }
}
