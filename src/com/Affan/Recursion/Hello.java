package com.Affan.Recursion;

public class Hello {
    public static void main(String[] args) {
        // print hello world 5 times using functions
        message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World 1");
        message2();
    }
    static void message2(){
        System.out.println("Hello World 2");
        message3();
    }
    static void message3(){
        System.out.println("Hello World 3");
        message4();
    }
    static void message4(){
        System.out.println("Hello World 4");
    }
}
