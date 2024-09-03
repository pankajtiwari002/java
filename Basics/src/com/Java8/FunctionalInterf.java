package com.Java8;
@FunctionalInterface
public interface FunctionalInterf {
    // contains only one abstract method
    // and contains as many static or default method
    public void fun();
    default void f(){
        System.out.println("Hello");
    }
    public static void greet(){
        System.out.println("Hi");
    }
}

@FunctionalInterface
interface childInterface extends FunctionalInterf{
    //public void fun2(); If i create this abstract then 2 abstract method will become in interface so it
    //not remains as a functional interface
    //But if i not include it then it remains as a functional interface

}
