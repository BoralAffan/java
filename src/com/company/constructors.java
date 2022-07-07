package com.company;

class myEmployee1{
    int id;
    String name;
    int salary;

public myEmployee1(String myName,int mySalary, int myId){
    salary=mySalary;
    name=myName;
    id=myId;
}
public String getName(){
    return name;
}
public void setName(String n){
    this.name = n;
}
public void setId(int i){
    this.id=i;
}
public int getId(){
    return id;
    }
public int getSalary(){
    return salary;
    }
public void setSalary(int s){
    this.salary=s;
}
}


public class constructors {
    public static void main(String[] args) {
        myEmployee1 f=new myEmployee1("Affan Boral",400000,45);
        System.out.println(f.getName());
        System.out.println(f.getSalary());
        System.out.println(f.getId());

    }
}
