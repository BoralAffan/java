package com.Affan.Interface;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.acc();
        honda.brake();
        honda.start();
        honda.stop();

        Car suv = new Car();
        suv.start();
        suv.brake();

        CDplayer c = new CDplayer();
        c.start();
        c.stop();

        SmartEngine s = new SmartEngine();
        s.acc();
        s.start();
        s.stop();

    }
}
