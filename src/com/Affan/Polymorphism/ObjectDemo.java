package com.Affan.Polymorphism;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return  num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(2);
        ObjectDemo obj1= new ObjectDemo(2);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj.getClass());
      //  System.out.println(obj.clone());
    }
}
