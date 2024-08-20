package com.OOPs.Interfaces.Static;

public class Main {
    public static void main(String[] args) {
        C obj = new C();
//        obj.greet(); I can't access through objects
        A.greet();
        B.greet();
    }
}
