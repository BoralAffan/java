package com.Affan.Recursion;

import java.util.Scanner;

public class SumOfn {

    static  int sum(int n){
        if(n==0) return 0;
        int partialAns=sum(n -1);
        return n + partialAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        if (n==0){
            System.out.println("0");
        }
        else {
            System.out.println(sum(n));
        }
    }
}
