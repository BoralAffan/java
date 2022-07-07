package com.company;

class circle{
    int radius;
    double area;

public circle(int myRadius, double myArea){
    radius=myRadius;
    area=myArea;

}
public int getRadius(){
    return radius;
}
public double getArea(){
    return area;
}
}
public class constructor_prac {
    public static void main(String[] args) {
        circle c=new circle(4,99);
        System.out.println("radius of a circle is ");
        System.out.println(c.getRadius());

        System.out.println("area of circle is ");
        System.out.println(c.getArea());
    }
}
