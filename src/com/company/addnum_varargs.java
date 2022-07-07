package com.company;

public class addnum_varargs {
    static int sum(int a, int b){
        int z= a+b;
        System.out.println("add is "+z);
        return z;
    }

    public static void main(String[] args) {
        sum(4,5);
    }
}
