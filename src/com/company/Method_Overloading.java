package com.company;

public class Method_Overloading {
    static void hi(){
        System.out.println("Good Morning" );
    }
    static  void hi(int  a){
        System.out.println("Good Morning " + a + " bro!");
    }

    public static void main(String[] args) {
      //  str="Affan";
        hi();
        hi(300);
    }
}
