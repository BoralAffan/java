package com.company;

public class _VarArgs2 {
    static void fun2(String  str, int...a){
        System.out.println("String :" +str);
        System.out.println("Number of argument is:"+a.length);

        for (int i:a){
            System.out.println(i+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fun2("hi affan",100,2);
        fun2("affan",4);
    }
}
