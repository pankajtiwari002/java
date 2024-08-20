package com.OOPs.Interfaces;

public class NewCar {
    private Engine engine;
    private Media player;
    NewCar(){
        engine = new PowerEngine();
        player = new CDPlayer();
    }
    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void startMedia(){
        player.start();
    }
    void stopMedia(){
        player.stop();
    }
    void upgradeEngine(){
        engine = new ElectricEngine();
    }
}
