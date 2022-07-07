package com.Affan.Recursion;

import java.util.Scanner;



public class num5to1 {
    public static void printNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
       // int n=11;
//        function f = new function();
//        f.fun(10);

        printNum(12);

    }


}
