package com.company;

import java.util.Locale;
import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
//  String name = "Affan";   //1st method
//  System.out.println(name);
//  String a = new String("Affan");   // 2nd method
//  System.out.println(a);
//  String a1 = sc.nextLine();  // 3rd method
//   System.out.println(a1);
       String name = "AFFAN BHAI IS PRO";
       String a3 = "     affan    ";
               int value = name.length();
        System.out.println(value);
             String a1= name.toLowerCase();
        System.out.println("to lowercase: "+a1);
             String a2 = name.toUpperCase();
        System.out.println("to uppercase :"+a2);
        System.out.println(a3.trim());
        System.out.println(name.substring(8));
        System.out.println(a2.replace('A','O'));
        System.out.println(name.replace("FAN", "NAF"));
        System.out.println(name.startsWith("AFF"));
        System.out.println(name.startsWith("NAF"));
        System.out.println(name.endsWith("PRO"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("N"));
        System.out.println(name.equals("AFFAN BHAI IS pro "));
        System.out.println(name.equalsIgnoreCase("AFFAN BHAI IS pro "));


    }
}
