package com.company;

class Employee4{
    String name;
    String JD;
    double salary;
    public void PrintInfo(String name){
        System.out.println(name);
    }
    public void PrintInfo(int age){
        System.out.println(age);
    }
    public void PrintInfo( double salary){
        System.out.println(salary);
    }

    public void PrintInfo(String name, int age, double salary){
        System.out.println(name + " " + age + " " + salary);
    }
}

public class OOPS_Polymorphism {
    public static void main(String[] args) {
//        System.out.println("max value is "+Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
        Employee4 e= new Employee4();
        System.out.println("First Employee");
        e.PrintInfo("Affan",33,55555);


        Employee4 f = new Employee4();
        System.out.println("2nd emoployee");
//        f.PrintInfo("affan");
//        f.PrintInfo(22);
        f.name="harry";
        f.salary=5550988;
        f.PrintInfo(f.name);
        f.PrintInfo(f.salary);
    }
}
