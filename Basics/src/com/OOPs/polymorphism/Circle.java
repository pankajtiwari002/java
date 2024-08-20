package com.OOPs.polymorphism;

public class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area of Circle is pi * r * r");
    }
    // you can't override final method
//    @Override
//    void parameter(){
//
//    }
}
