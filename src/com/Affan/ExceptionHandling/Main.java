package com.Affan.ExceptionHandling;


public class Main {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        int c=4;
        int d=0;
       try {
        //int c=a/b;
           divide(a,b);
       }catch (ArithmeticException e){
        //   System.out.println(e.getMessage());  //default mssg will print that / by zero one can can edit the messsage
           System.out.println("do not divide by zero");
       }
       finally {
           System.out.println("This will always run");
       }
       try {
           div(c,d);
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }

    }
   static int divide(int a, int b){
        return a / b;
    }

    static int div(int c, int d) throws ArithmeticException{
        if (d == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return c / d;
    }
}
