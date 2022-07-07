package com.Affan.Recursion;

public class factorial {
    public static void main(String[] args) {
        float ans = fact(3);

        System.out.println(ans);
      //  System.out.println(Float.MAX_VALUE);

    }
    static float fact(int n){
        if (n==0 | n==1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}
