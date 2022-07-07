package com.Project;

class calci {
    double add(double a, double b){
        return a+b;
    }
    double subtract(double a, double b){
        return a-b;
    }

    double multiply(double a, double b) {
        return a*b;
    }
}

public class CustomCalculator {
    public static void main(String[] args) {
        calci c = new calci();
      //  c.add(4,5);
        System.out.println(c.add(3,5));
    }
}
