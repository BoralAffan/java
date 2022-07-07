package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int marks [] = new int[8];
//        marks[0]=44;
//        marks[1]=424;
//        marks[2]=414;
//        marks[3]=434;
//        marks[4]=0;
//        marks[5]=444;
//        marks[6]=1144;
//        marks[7]=414;

//        String sub [] = new String[5];
//        sub[0]="Engl";
//        sub[1]="Maths";
//        sub[2]="Chem";
//        sub[3]="phy";
//        sub[4]="DS";
//        for (int i=0; i<5;i++){
//            System.out.println(marks[i]);
//        }
//        for (int j=0; j<5;j++){
//            System.out.println(sub[j]);
//        }
//       int prac[]={55,55,66,77};
//        for (int k=0;k<4;k++){
//            System.out.println(prac[k]);
//        }
        Scanner sc= new Scanner(System.in);
      //  int marks=sc.nextInt();
       // int size = sc.nextInt();
        int marks[] = new int[3];
        for (int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
        for (int i=0; i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
