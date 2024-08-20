package com.OOPs;

public class StaticExample {
    public static void main(String[] args) {
        Human pankaj = new Human();
        Human nikhil = new Human();
        Human manish = new Human();
        System.out.println(Human.population);
        System.out.println(pankaj.population);
    }
}

class X{
    static void fun(){
//        greet(); I can't use non-static member in static function without referencing
        X obj = new X();
        obj.greet();
    }
    void greet(){
        fun();
    }
}

class Human{
    static int population;

    int age;
    String name;
    Human(){
        population++;
    }
}
