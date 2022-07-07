package com.company;
abstract class Animal{
     String name;
 public static void message(){
     System.out.println("importing....");
 }
 }
 class Horse extends Animal{
     public void walk(){
         System.out.println("walks on 4 legs");
     }
 }
 class Eagle extends Animal{
     public void walks(){
         System.out.println("walks on 2 legs");
     }
 }




public class Abstract {
    public static void main(String[] args) {
         Horse h = new Horse();
         h.name="tiger";
         h.walk();

         Eagle r = new Eagle();
         r.name ="eagle";
         r.walks();

    }
}