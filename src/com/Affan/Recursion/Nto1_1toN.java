package com.Affan.Recursion;

public class Nto1_1toN {
    static void printrev(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printrev(n - 1);
    }

    static void print(int n){
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
       // printrev(10);
        print(10);
    }

}
