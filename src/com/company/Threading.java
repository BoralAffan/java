package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<12){
            System.out.println("1st phase of threadingg...");
            System.out.println("1st");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<12){
            System.out.println("2nd phase of threadingg...");
            System.out.println("2nd");
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        Thread t1 =new Thread(bullet1);
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
