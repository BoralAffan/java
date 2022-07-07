package com.company;
import java.util.Scanner;

public class java_exp2 {
    public static void main(String[] args) {
        int i,j,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS: ");
         num = sc.nextInt();
         stop:
         {
             nextRow:
             for (i=1;i<=num;i++) {
                     if (i == num+1)
                      break stop;
                      System.out.println();
                      for (j=1;j<=num;j++) {
                            if (j>i)
                         continue nextRow;
                          System.out.print("  *  ");
                     }
                }
         }
    }
}
