package com.pankaj;

public class Shadowing {
    static int x = 50; // it is shadowed at line no 8

    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x); scope will begin when value is initialized. Give error.
        x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
