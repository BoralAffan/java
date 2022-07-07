package com.company;

class Dog{
    int age;
    String name;
    String breed;
    String color;
//    public Dog(String name,String breed,String color,int age){
//        this.name=name;
//        this.breed=breed;
//        this.age=age;
//        this.color=color;
    }
//    public String getName(){
//        return name;
//    }
//    public String getBreed(){
//        return breed;
//    }
//    public String getColor(){
//        return color;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void a(){
//        System.out.println("My name is "+name+ "I belong to the breed is"+breed+);
//        return a;
//    }

//    public String a{
//        System.out.println("My name is "+this.getName() +\n "my  Breed color and age is : "+this.getBreed()+ + this.getColor() + +this.getAge());
//    }




public class object {
    public static void main(String[] args) {
        Dog tiger=new Dog();
        tiger.age=22;
        tiger.breed="GSD";
        tiger.color="brown";
        tiger.name="oreo";

        System.out.println("My name is :"+tiger.name);
        System.out.println(tiger.breed);
        System.out.println(tiger.age);
        System.out.println(tiger.color);
        System.out.println();


    }


}
