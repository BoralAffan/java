package com.company;

class Addition{
    int sum=0;
    public int addInt(int a, int b){
        sum = a+b;
        return sum;
    }

}
public class method_addition {
    public static void main(String[] args) {
        Addition a=new Addition();
        int s=a.addInt(10,20);
        System.out.println("The addition of the number is "+s);
    }
}
