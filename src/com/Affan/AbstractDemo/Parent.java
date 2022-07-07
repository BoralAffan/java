package com.Affan.AbstractDemo;

public abstract class Parent {
   abstract void career(String name);
   abstract void partner(String name, int age);
   abstract void stream(String stream);

   static void greet(){
      System.out.println("Good evening");
   }
}
