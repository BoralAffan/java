package com.Affan.Recursion;

public class NumbersExampleRecursion {

    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //base condition to stop calling recursion itself
        if (n == 10){
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
