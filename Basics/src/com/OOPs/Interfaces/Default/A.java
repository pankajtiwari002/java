package com.OOPs.Interfaces.Default;

public interface A {
    // you can create both default and static method in interface
    // while if 2 interface has same name static method and be implements by a class they don't produce any error
    // because they are not dependent on Object
    // while if 2 interface has same name default method and be implements by a class they produce error
    // you have to override the method
    default void greet(){
        System.out.println("Hi I am A");
    }
}
