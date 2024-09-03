package com.Java8;

import java.util.function.Consumer;
import java.util.function.Function;

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {
        // First is the parameter type and then return type
        Function<Integer,Integer> d = i -> 2*i;
        Function<Integer,Integer> f = i -> i*i;
        System.out.println(d.andThen(f).apply(2)); // d executes then its result pass to f
        System.out.println(d.compose(f).apply(2)); // f executes then its result pass to d
        // return type is void and takes String as a parameter
        Consumer<String> upper = (s) -> System.out.println(s.toUpperCase());
        upper.accept("hello");
    }
}
