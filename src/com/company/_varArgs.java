package com.company;

public class _varArgs {
    static void fun(int...a){
        System.out.println("Number of arguments :"+ a.length);
        for (int i: a)
            System.out.println(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        fun(100);
        fun(12,22,33,44,55,55);
        fun();
    }

}
