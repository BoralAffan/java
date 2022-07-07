package com.company;

public class Recursion {
    static int factorial(int n){
        //factorial(n)=n*n-1*....1
        //factorial(5)=5*4*....1
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
      int n=5;
        System.out.println("The Factorial of 5 is :"+factorial(n));
    }
}
