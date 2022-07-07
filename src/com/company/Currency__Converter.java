package com.company;

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;


public class Currency__Converter {
    public static void main(String[] args) {
        double Rupee,Code,Dollar,Pound,Euro,Yen;
        DecimalFormat f = new DecimalFormat("##.###");
       // Scanner sc = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t******************** CURRENCY CONVERTER ********************");
       // System.out.println("Enter the currency code:- \n\t1:Rupees(INR)\n\t2:Dollar(USD)\n\t3:Pound(GBP)\n\t4:Euro(EUR)\n\t5:Yen(JPY)" );

        System.out.println("1:Rupees(INR)\n2:Dollar(USD)\n3:Pound(GBP)\n4:Euro(EUR)\n5:Yen(JPY)\nEnter your currency choice :- " );
        Code=sc.nextInt();
        //For Rupees Conversion
        if (Code == 1){
            System.out.println("Enter amount in rupees : ");
            Rupee = sc.nextFloat();
           // Dollar = Rupee / 66;
            Dollar = Rupee * 0.013;
           // System.out.println("Rupees Converted to Dollar : "+f.format(Dollar));
            System.out.println("Rupees Converted to Dollar : "+Dollar);
           // Pound = Rupee / 98;
            Pound = Rupee * 0.0098;
            System.out.println("Rupees Converted to Pounds : "+f.format(Pound));
           // Euro = Rupee / 72;
            Euro = Rupee * 0.012;
            System.out.println("Rupees Converted to Euros : "+f.format(Euro));
            //Yen = Rupee / 0.55;
            Yen = Rupee * 1.52;
            System.out.println("Rupees Converted to Yen : "+f.format(Yen));
           // System.out.println("Thankyou!! have a great future ahead\n");
        }
        //For Dollar Conversion
        else if (Code == 2)
        {
            System.out.println("Enter amount in dollar :");
            Dollar = sc.nextFloat();
          //  Rupee = Dollar / 0.013;
            Rupee = Dollar * 74.75;

            System.out.println("Dollar converted to Rupees : "+f.format(Rupee));
           // Pound = Dollar * 1.36;
            Pound = Dollar * 0.73;
            System.out.println("Dollar converted to Pound : "+f.format(Pound));
           // Euro = Dollar * 1.16;
             Euro = Dollar * 0.86;
            System.out.println("Dollar converted to Euro : "+f.format(Euro));
           // Yen = Dollar * 0.0088;
             Yen = Dollar * 113.67;
            System.out.println("Dollar converted to Yen : "+f.format(Yen));
           // System.out.println("Thankyou!! have a great future ahead\n");
        }
        //For Pound Conversion
        else if(Code == 3)
        {
            System.out.println("Enter amount in Pound :");
            Pound = sc.nextFloat();
            //Rupee = Pound / 0.0098;
            Rupee = Pound * 102.00;
            // System.out.println(“Rupees : “+f.format(rupee));
            System.out.println("Pounds converted to Rupees : "+f.format(Rupee));
            //Dollar = Pound * 1.49;
            Dollar = Pound * 1.37;
            System.out.println("Pounds converted to Dollar : "+f.format(Dollar));
            //Euro = Pound * 0.85;
            Euro = Pound * 1.18;
            System.out.println("Pounds converted to Euro : "+f.format(Euro));
            //Yen = Pound * 0.0064;
            Yen = Pound * 155.20;
            System.out.println("Pounds converted to Yen : "+f.format(Yen));
           // System.out.println("Thankyou!! have a great future ahead\n");
        }
        //For Euro Conversion
        else if(Code == 4)
        {
            System.out.println("Enter amount in Euro :");
            Euro = sc.nextFloat();
            Rupee = Euro * 86.76;
            System.out.println("Euros converted to Rupees : "+f.format(Rupee));
            Dollar = Euro * 1.16;
            System.out.println("Euros converted to Dollar : "+f.format(Dollar));
            Pound = Euro * 0.85;
            System.out.println("Euros converted to Pound : "+f.format(Pound));
            Yen = Euro * 131.94;
            System.out.println("Euros converted to Yen : "+f.format(Yen));
            //System.out.println("Thankyou!! have a great future ahead\n");
        }
        //For Yen Conversion
        else if(Code == 5)
        {
            System.out.println("Enter amount in Yen :");
            Yen = sc.nextFloat();
            Rupee = Yen * 0.66;
            System.out.println("Yen converted to Rupees : "+f.format(Rupee));
            Dollar = Yen * 0.0088;
            System.out.println("Yen converted to Dollar : "+f.format(Dollar));
            Pound = Yen * 0.0064;
            System.out.println("Yen converted to Pound : "+f.format(Pound));
            Euro = Yen * 0.0076;
            System.out.println("Yen converted to Euro : "+f.format(Euro));
            //System.out.println("Thankyou!! have a great future ahead\n");
        }
        else
        System.out.println("Invalid Option!!");
        System.out.println("\ndo you want to convert other currency?\n Enter 1 for yes \n 0 for no : ");
         int c=sc.nextInt();
        if (c==1){
            System.out.println("h");
        }
        else
            System.out.println("Thankyou!! have a great future ahead\n");
    }

}
