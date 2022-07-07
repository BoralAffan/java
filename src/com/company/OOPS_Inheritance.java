package com.company;
class Shape{
    String color;
   String shape;
   public void area(){
       System.out.println("area display");
   }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle1 extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class OOPS_Inheritance {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.shape="Triangle";
        System.out.println(t.shape);


        Circle1 c=new Circle1();
        c.shape="circle";
        System.out.println(c.shape);



    }
}
