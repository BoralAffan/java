package com.company;

class Base{
    Base(){

        System.out.println("i am an base constructor");
    }
    Base(int x){
        System.out.println("i am an over loaded base constructor "+x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("i am an derived constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("i am over loaded derived constructor with value "+y);
    }
}
class childOfDerived extends Derived{
    childOfDerived(){
        System.out.println("i am an child constructor");
    }
    childOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an over loaded child constructor");
    }
}

public class constructor_in_inheritance {
    public static void main(String[] args) {
        Base b=new Base(5);

        Derived d=new Derived();

        childOfDerived c=new childOfDerived(77,99,00);

    }
}
