package com.Affan.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s= new Son(22);

        s.stream("Science");
        s.partner("iron man",6);
        s.career("doctor");
     //    Parent p = new Parent();  --> abstract class ke constructors nhi bana sakte
        Parent.greet();
    }
}
