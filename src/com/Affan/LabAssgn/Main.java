package com.Affan.LabAssgn;
class box{
 int h;
 int w;
 int l;
}
 class Main {
  public static void main(String[] args) {
   box b = new box();
   b.h=2;
   b.w=10;
   b.l=10;
   int y = b.w * b.h * b.l ;
   System.out.println(y);

   int g =3;
   System.out.println(++g * 8);
  }
}
