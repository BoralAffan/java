package com.Affan.AbstractDemo;

public class Son extends Parent{

    int age;
    final int value;
    public Son(int age) {
        super();
        this.age = age;
        value = 27336;
    }

    @Override
    void career(String name) {
        {
            System.out.println("I am going to be a "+name);
        }
    }

    @Override
    void partner(String name, int age) {
        {
            System.out.println("I love "+name+ " and she is "+ age + " years old " );
        }
    }

    @Override
    void stream(String stream) {
        System.out.println("i am going to take "+stream );
    }
}
