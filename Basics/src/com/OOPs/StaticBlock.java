package com.OOPs;

public class StaticBlock {
    static int a;
    static  int b;
    static { //  will only runs once when the class is loaded
        System.out.println("I am in static block");
        a = 4;
        b = 5*a;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        StaticBlock obj2 = new StaticBlock();
        StaticBlock obj3 = new StaticBlock();
        StaticBlock obj4 = new StaticBlock();
        System.out.println(StaticBlock.b);
    }
}
