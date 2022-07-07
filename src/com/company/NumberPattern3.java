package com.company;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        int i,j,num;
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
         num = sc.nextInt();

         for (i=1;i<=num;i++) {
                for (j=1;j<=i;j++) {
                    System.out.print("  "+j+"  ");
                }
             System.out.println();
         }
    }
}
