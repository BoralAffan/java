package com.company;

import java.util.Scanner;

public class String_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               //strings are immutable
        String FirstName="AFFAN BORAL jj";
        String LastName="tony stark";
        String sentence = "My Name is Boral Affan";
        String name= sentence.substring(10);
        System.out.println(name);
        String str ="123777";
        int number = Integer.parseInt(str);
        System.out.println(number);
        //concatenation
//        String FullName= FirstName +" " + LastName;
//        System.out.println(FullName);
//        String name=sc.nextLine();
//        System.out.println("Hii "+name);
//
//        if (FirstName.compareTo(LastName)==0){
//            System.out.println("String1 is  equal");
//        }
//         else System.out.println("String are not equal");
//        System.out.println(sentence.length());
//        System.out.println(FirstName.toLowerCase());
//        System.out.println(LastName.toUpperCase());
////        System.out.println(sentence.charAt(11));
////        for (int i=0; i<sentence.length();i++){
////            System.out.println(sentence.charAt(i));
////        }
//        if (new String("hii")==new String("hiii")){
//            System.out.println("equal");
//        }
//        else System.out.println("not equal");

    }

}
