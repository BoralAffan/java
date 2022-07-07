package com.Affan.Recursion;

public class recursion2 {
    public static void printNum(int n) {
//        if (n == 50){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//        for (int i = 1; i <= n ; i++) {
//            System.out.println(i);
//        }
//    }
        if (n == 18) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);

    }

    public static void main(String[] args) {
        printNum(1);
    }
}
