package com.Java8;

public class StaticMethod implements A{
    public static void main(String[] args) {
        A.m1();
        StaticMethod obj = new StaticMethod();
        // static methods are not available in implementation class
//        m1();
//        StaticMethod.m1();
//        obj.m1();
    }
}

interface A{
    public static void m1(){
        System.out.println("Static Method");
    }
}