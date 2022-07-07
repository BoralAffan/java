package com.Affan.Interface;

public class Car implements Brake,Engine,Media{
    @Override
    public void brake() {
        System.out.println("Applying brake");
    }

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("applying brake");

    }

    @Override
    public void acc() {
        System.out.println("Speeeeediiiiiing uuuuuupppppppppp");
    }
}
