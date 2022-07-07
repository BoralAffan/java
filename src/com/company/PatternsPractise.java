package com.company;

import java.util.Scanner;

public class PatternsPractise {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ROWS: ");
        int n= sc.nextInt();
        System.out.println("ENTER NO OF COLOUMNS : ");
        int m= sc.nextInt();
        for (i=1; i<=n; i++){
            for (j=1; j<=m; j++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
}
    }
