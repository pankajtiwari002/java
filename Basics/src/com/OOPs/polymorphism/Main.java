package com.OOPs.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shape circle2 = new Circle();
        // Here which method is call depend on the type of object
        // it is known as Upcasting
        // Dynamic method dispatch: which function will call handle at runtime
        circle2.area(); // called the function of child class
    }
}
