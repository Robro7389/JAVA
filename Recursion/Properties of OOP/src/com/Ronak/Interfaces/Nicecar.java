package com.Ronak.Interfaces;

public class Nicecar {
    private Engine engine;
    private Media player = new CDPlayer();
    public Nicecar(){
        this.engine = new powerEngine();
    }
    public Nicecar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    System.out.println("Engine upgraded!");
    }

    public void musicStart(){
        player.start();
    }

    public void musicStop(){
        player.stop();
    }

}
