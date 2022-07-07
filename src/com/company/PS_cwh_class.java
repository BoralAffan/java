package com.company;

/*class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
} */
      /*class Phone{
    public void ring(){
        System.out.println("Ringing.......");
    }

    public void call(){
        System.out.println("calling Ansari");
    }

    public void vibrate(){
        System.out.println("vibrating.......");
    }
} */
class square{
         int side;
         int p;
         int a;
 public int perimeter(){
     p= 4*side;
     System.out.println("perimeter of square is "+p);
     return p;
 }
 public int area(){
     a= side*side;
     System.out.println("Area of square is "+a);
     return a;
    }
}


public class PS_cwh_class {
    public static void main(String[] args) {
        //problem1
       /* Employee1 affan=new Employee1();
        affan.name="Boral Affan";
        System.out.println(affan.name);
        affan.salary=450000;
        affan.getSalary();
        System.out.println(affan.getSalary());
         affan.setName("Affan Boral");
        System.out.println(affan.getName()); */

        //problem2

      /*  Phone xiomi=new Phone();
        xiomi.call();
        xiomi.ring();
        xiomi.vibrate(); */


        //problem3
        square s=new square();
        s.side=4;
        System.out.println(s.area());
        System.out.println(s.perimeter());




    }
}
