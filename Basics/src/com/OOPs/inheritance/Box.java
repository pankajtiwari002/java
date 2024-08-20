package com.OOPs.inheritance;

public class Box {
    int l;
    int h;
    int w;
    public Box() {}

    public Box(int l, int h, int w) {
        super(); // call object class constructor
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

    static void greeting(){
        System.out.println("Hey I am Box Class");
    }
}
