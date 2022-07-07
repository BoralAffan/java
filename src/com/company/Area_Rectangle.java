package com.company;

class triangle{
    int length;
    int breadth;
public int area(){
    System.out.print("Area of triangle is ");
    return (int) (0.5*length*breadth);
}


}


public class Area_Rectangle {
    public static void main(String[] args) {
        triangle t=new triangle();
        t.length=4;
        t.breadth=5;
        System.out.println(t.area());
    }


}
