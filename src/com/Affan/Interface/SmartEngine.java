package com.Affan.Interface;

public class SmartEngine implements Engine{
    @Override
    public void start() {
        System.out.println("engine can start by voice");
    }

    @Override
    public void stop() {
        System.out.println("engine can stop by voice");
    }

    @Override
    public void acc() {
        System.out.println("change speed according to traffic");
    }
}
