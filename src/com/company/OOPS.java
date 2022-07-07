package com.company;

class pen{
    String color;
    String type;
    String brand;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
    public void printBrand(){
        System.out.println(this.brand);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);


    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}



public class OOPS {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.brand="cello";
        pen1.color="red";
        pen1.type="ball";
        pen1.printColor();
        pen1.printType();
        pen1.write();
        pen1.printBrand();

        pen pen2 = new pen();
        pen2.color="pink";
        pen2.type="gel";
        pen2.brand="montex";
        pen2.printColor();
        pen2.printBrand();
        pen2.printType();
        pen2.write();
        Student s1= new Student("Affan",19);
//        s1.name="Affan Boral";
//        s1.age=19;
    s1.printInfo();

        Student s2= new Student("Aman",55);
//        s2.name="Jhon Cena";
//        s2.age=77;
      s2.printInfo();
    }
}
