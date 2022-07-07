package com.Affan.Recursion;

public class multi_n {
    public static void main(String[] args) {
        int ans = product(12345);
        int ans1= product(5005);
        int ans2= product(55);

        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int product(int n){
        if ( n%10 == n){
            return n;
        }
        return (n%10)*product(n/10);
    }
}
