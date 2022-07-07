package com.company;

import java.util.Scanner;

public class multiplication_table {
    static void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                                         //        System.out.println("Enter the number whose table you want : ");
                                                                       //        int n= sc.nextInt();
                                                                        //       // int mul=1;
                                                                        //        for (int i=1;i<=10;i++){
                                                                //            System.out.printf("%d x %d = %d\n",n,i,n*i);
                                                                     //        }
                                                                    //        System.out.println("Thank you!!!!");
                                                                                //    }
        mul(8);
    }
}