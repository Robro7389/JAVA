package com.Ronak.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.acc();
//        car.brake();
//        car.stop();

        Nicecar car = new Nicecar(new electricEngine());
        car.start();
        car.stop();
        car.musicStart();
        car.upgradeEngine(new powerEngine());
        car.start();
    }
}
