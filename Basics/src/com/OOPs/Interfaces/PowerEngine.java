package com.OOPs.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Power Engine");
    }
}
