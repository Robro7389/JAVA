package com.Ronak.Interfaces;

public class electricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine starts!");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerated!");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop!");
    }
}
