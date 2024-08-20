package com.OOPs.Interfaces.Default;

public class C implements A,B{
    // Interface A and B both contains the greet method so you have to override it
    //Either you can't implement both
    @Override
    public void greet() {
        B.super.greet();
    }
}
