package com.company;

public class typeconversion2 {
    public static void main(String[] args) {
        int i=257;
        double d=323.142;

        System.out.println("conversion int to byte");
        //i%256
        byte b=(byte) i;
        System.out.println(" i is "+ i + " b is "+ b);
        System.out.println("double to byte");
        //d%256
        byte c=(byte)d;
        System.out.println("d is" + d + " c is "+ c );
    }
}
