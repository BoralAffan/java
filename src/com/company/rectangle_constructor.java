package com.company;

class Rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    String s;

 public String getS(String n){
     s=n;
     return s;
 }



//    public Rectangle() {
//        this.length =  5;
//        this.breadth=  8;
//        this.area=100;
//        this.perimeter= 33;
//    }
    public Rectangle(int mylength,int mybreadth,int myarea, int myperimeter){
        this.length=mylength;
        this.breadth=mybreadth;
        this.area=myarea;
        this.perimeter=myperimeter;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
}
public class rectangle_constructor {
    public static void main(String[] args) {


        Rectangle r=new Rectangle(44,55,66,77);
     System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        System.out.println(r.getS("hii finally you did it"));
         System.out.println(r.getArea());
         System.out.println(r.getPerimeter());
    }

}
