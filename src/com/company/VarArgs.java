package com.company;

public class VarArgs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
    static int sum(int ...arr){
        int result=0;
        for (int a: arr){
            result =result+a;
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs");
        System.out.println("The value of 6 and 4 is : "+sum(6,4));
        System.out.println("The value of 6 4 and 6 is :"+sum(6,4,6));
        System.out.println("the value of 10 20 30 40 is "+sum(10,20,30,40,50));
    }
}
