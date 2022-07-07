package com.company;


import java.util.Random;

public class BitManipulation {
    public static void main(String[] args) {

        System.out.println("GET BIT");
        int a=5;
        int pos =3;
        int BitMask= 1<<pos;  // 0001<<3 --> 1000
        int num1=BitMask & a; // 1000 & 0101 --> 0000
        System.out.println(num1);
        if ((BitMask & a) == 0){    //get bit me AND operation
            System.out.println("Bit was zero\n");
        }
        else System.out.println("Bit was one\n");

        System.out.println("SET BIT");
        int b=5;
        int pos1 =1;
        int BitMask1= 1<<pos1;  // 0001<<1 --> 0010
        int num2=BitMask1 | b;   //0010 | 0101 --> 0111 --> 7 in decimal
        System.out.println(num2);

        if ((BitMask | b) == 0){    //get bit me AND operation
            System.out.println("Bit was zero\n");
        }
        else System.out.println("Bit was one\n");


        System.out.println("CLEAR BIT");
        int c=5;
        int pos3=2;
        int BitMask3=1<<pos3;       // (1 in binary )0001<<2 --> 0100
        int notBitMask=~(BitMask3); // ~(0100) == 1011

        int num3= notBitMask & c;   // 1011 & 0101 --> 0001
        System.out.println(num3);

        System.out.println("UPDATE BIT");
        int d=5;
        int pos4=2;
        int BitMask4=1<<pos4; // 0001<<2 --> 0100
        int opr=1;
        if (opr==0){
            int notBitMask2=~(BitMask4); // ~(0100) = 1011
            int num4=notBitMask2 & d;    // 1011 & 0101 --> 0001
            System.out.println(num4);
        }
        else if (opr==1){
            int BitMask2=1<<pos4;     // 0001<<2 --> 0100
            int num4=BitMask2 | d;    // 0100 | 0101 --> 0101
            System.out.println(d);
        }

    }



}


