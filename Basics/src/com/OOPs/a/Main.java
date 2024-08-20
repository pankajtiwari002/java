package com.OOPs.a;

import com.OOPs.b.Greeting;

public class Main {
    public static void main(String[] args) {
        Greeting obj = new Greeting();
        com.OOPs.a.Greeting obj2 = new com.OOPs.a.Greeting();
        obj.greet();
        obj2.greet();
    }
}
