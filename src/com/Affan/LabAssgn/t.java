package com.Affan.LabAssgn;

public class t {
    static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        int a=3;
        int b=0;
        try {
            div(a,b);
        }
        catch (NullPointerException ne ){
            System.out.println("1");
        }
        catch (RuntimeException re){
            System.out.println("2");
        }
        finally {
            System.out.println("3");
        }
    }

}
