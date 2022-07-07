package com.company;
import java.util.Scanner;

public class Patterns_Practise {
    public static void main(String[] args) {
        //int n=4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n and m ");                            //triangle
        int n = sc.nextInt();
        int m = sc.nextInt();          // <-- //rectangle                                            //   System.out.println("Enter no of rows ");
        for (int i = 1; i <= n; i++) {                                                      //    int n= sc.nextInt();
            for (int j = 1; j <=m; j++) {                                             //    for (int i=1;i<=n;i++){
                System.out.print(" * ");                                                   //   for (int j=1;j<=i;j++){
            }                                                                             //     System.out.print(" * ");
            System.out.println();                                                                //     }
        }                                                                                      //     System.out.println();
    }                                                                                                   //     }
                                                                                                        //    }

}





