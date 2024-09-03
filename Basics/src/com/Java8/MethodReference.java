package com.Java8;

import java.util.function.Function;

public class MethodReference {
    public static int m1(int a){
        return a+1;
    }
    private int m2(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Function<Integer,Integer> fun = MethodReference::m1;
        // Function<Integer,Integer> square = MethodReference::m2; can't reference non-static member with Class Name
        // You need object to refer non-static method
        // :: -> DoubleColon Operator used for method or constructor reference
        MethodReference obj = new MethodReference();
        Function<Integer,Integer> square = obj::m2;

        System.out.println(fun.apply(10));
        System.out.println(square.apply(10));
    }
}
