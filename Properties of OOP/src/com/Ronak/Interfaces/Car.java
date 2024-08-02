package com.Ronak.Interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("Apply brakes!");
    }

    @Override
    public void start() {
        System.out.println("Start the engine!");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the car...");
    }

    @Override
    public void stop() {
        System.out.println("Stop the engine!");
    }
}
