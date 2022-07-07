package com.company;

class multiplication{
    int mul=1;

    public int mulInt(int a,int b){
        mul=a*b;
        return mul;
    }
    public int mulInt(int a,int b,int c){
        mul=a*b*c;
        return mul;
    }

}
public class methods_multiplication {
    public static void main(String[] args) {
        multiplication m=new multiplication();
        int n=m.mulInt(33,456);
        System.out.println("The multiplication of is "+n );

        multiplication p=new multiplication();
        int g=p.mulInt(20,33,99);
        System.out.println("multiplication of 20 33 and 99 is "+g);

        System.out.println("\n*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * * \n");


        System.out.println("A");
        System.out.println("A B");
        System.out.println("A B C");
        System.out.println("A B C D");
        System.out.println("A B C D E");


    }
}
