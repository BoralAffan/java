package com.company;

class Employee{
    int id;
    String name;
    double salary;
    public void printDetails(){
//        System.out.print("MY id is "+id);
//        System.out.println(" and My name is "+name);
//        System.out.println("his salary is "+salary+ " RS");
        System.out.println("Name: "+name+" \t ID is "+id+" \t Salary is "+salary+" /-RS");
    }
}

public class creating_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee affan=new Employee();  // instiating a new Employee object

//        setting attributes
        affan.id=201;
        affan.name="Affan Boral";
        affan.salary=459097.08;
        Employee nick=new Employee();
        nick.id=202;
        nick.name="Nick Jonas";
        nick.salary=864097.08;
        Employee ash=new Employee();
        ash.id=203;
        ash.name="Ash Ketchum";
        ash.salary=4597.08;
//        System.out.println(affan.id);
//        System.out.println(affan.name);
        affan.printDetails();
        ash.printDetails();
        nick.printDetails();
    }
}
