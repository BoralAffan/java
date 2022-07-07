package com.company;

public class varArgs_add {
    static int sum(int...args){
        System.out.println("no of arguments is :"+args.length);
        int add=0;
        for (int x: args){
            System.out.println(x+" ");
          //  System.out.println();
            add=add+x;

        }
        System.out.println("add of above no is "+add);
        return add;
    }

    public static void main(String[] args) {
        sum(4,5,6);
        sum(10,20,30,40);
    }
}
