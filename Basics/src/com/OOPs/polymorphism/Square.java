package com.OOPs.polymorphism;

public class Square extends Shape{
    // there is no concept of method hiding if parameter are changed
//    @Override
    void area(int side){
        System.out.println("Area of square is " + side*side);
    }
}
