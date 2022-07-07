package com.company;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String a= sc.nextLine();
        System.out.println("Age :");
        int c=sc.nextInt();
        System.out.println("Gender");
        String b=sc.next();

        System.out.println("Name: "+a);
        System.out.println("Age: "+c);
        System.out.println("Gender:"+b);
    }


}
