package com.Ronak.Interfaces;

public class powerEngine implements Engine{
    @Override
    public void acc() {
        System.out.println("Power Engine acclerated!");
    }

    @Override
    public void start() {
        System.out.println("Power Engine Starts!");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop!");
    }
}
