package com.company;

public class Methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a=4;
        int b=8;
        int c;
        c=logic(a,b);
        int a1=6;
        int b1=2;
        int c1;
        c1=logic(a1,b1);

        int a3=8;
        int b3=9;
        int c3;
        c3=logic(a3,a3);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c3);
    }
}
