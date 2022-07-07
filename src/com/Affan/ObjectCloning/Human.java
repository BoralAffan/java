package com.Affan.ObjectCloning;

public class Human {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{1,2,3,4,5};
    }
    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
