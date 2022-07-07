package com.company;

import java.util.Scanner;

public class haclerranl_23rd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//       Q3
//        int i=sc.nextInt();
//        double d=sc.nextDouble();
//        sc.nextLine();
//        String s= sc.nextLine();
//
//        System.out.println("String: "+s);
//        System.out.println("Double: "+d);
//        System.out.println("Int: "+i);

        //Q4
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-14s %03d\n", s1, x);
//        }
//        System.out.println("================================");


        //Q5
        int N= sc.nextInt();
        for(int i=1;i<=10;i++){
//            int m=N*i;
//            printf("%d x %d = %d",N,i,m);
            System.out.println(N+ " x "+i+" = "+i*N);
        }
    }
}
