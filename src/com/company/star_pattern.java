package com.company;

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        int i,j,num;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER OF ROWS: ");
        num = sc.nextInt();
        for (i=1;i<=num;i++){
            for (j=1;j<=i;j++){
                System.out.print("  *  ");
            }
            System.out.println("\n");
        }
    }
}
