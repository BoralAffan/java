package com.Affan.Polymorphism;

public class main{
    public static void main(String[] args) {
        shapes s = new shapes();
        circle c = new circle();
       // shapes c = new circle(); in this the object and class is diffrent //type of object determines which function to run
        square q = new square();

        //s.area();
        c.area();
        //q.area();
    }

}
