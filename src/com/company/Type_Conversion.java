package com.company;

public class Type_Conversion {
    public static void main(String[] args) {
        int x=100;
        long y= x;        //windening or automatic type conversion done by compiler
        double z=y;
     short a=(short)z;   //  narrow or explicit conversion for incompatibale data types
        byte b=(byte)x;
        double f=(double) x;

//       byte--> short-->int-->long-->float-->double    widening or automatic conversion(small data type to large data type eg int to double )

     //   double-->float-->long-->int--> short --> byte    narrowing or explicit conversion(large datatype to small datatype eg int to byte)
        System.out.println("Int value is "+x);
        System.out.println("long value is "+y);
        System.out.println("double value is "+z);
        System.out.println("short value is "+a);
        System.out.println("byte value is "+b);
        System.out.println("double explit value is "+f);

    }
}
