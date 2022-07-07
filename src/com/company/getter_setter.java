package com.company;
//as we have make use of private class therefore we have to make getters and setters
class myEmployee{
   private int id;
    private String name;

public String getName(){
    return name;
}
public void setName(String n){
   this.name=n;
}
public int setId(int i){
    this.id=i;
    return id;
}
public int getId(){
    return id;
}
}

public class getter_setter {
    public static void main(String[] args) {
        myEmployee af=new myEmployee();
        af.setName("Affan Boral");
        af.setId(4);
        System.out.println(af.getName());
        System.out.println(af.getId());
    }
}
