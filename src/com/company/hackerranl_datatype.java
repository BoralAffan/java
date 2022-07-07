package com.company;

import java.util.Scanner;

public class hackerranl_datatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        short s=sc.nextShort();
        System.out.println("Byte");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("short");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Integer");
        System.out.println( Integer.MIN_VALUE);
        System.out.println( Integer.MAX_VALUE);
        System.out.println("Long");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        if(s>=Short.MIN_VALUE && s<=Short.MAX_VALUE)
            System.out.println("it fits in short");
        else
            System.out.println("does not fit in short");
    }
}
