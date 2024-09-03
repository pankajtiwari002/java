package com.Java8;

import java.util.function.*;

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
        // supplier does not take any parameter and return only
        Supplier<String> s = () -> "Enter a Number";
        System.out.println(s.get());

        // there are many more such as BiPredicate, BiFunction, BiConsumer for 2 argument
        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(4,7));

        //Some are for primitive also
        // because in above example int->Integer->int->Integer conversion take place
        //AutoBoxing means from primitive to Wrapper Class
        // AutoUnboxing means from Wrapper to primitive

        IntPredicate checkEven = i -> i%2==0; // Here i is of int type
        System.out.println(checkEven.test(26));

        DoubleFunction<Integer> square = i -> (int)(i*i);
        System.out.println(square.apply(2.5));

        DoubleToIntFunction sq = i -> (int)(i*i); // Here input is double and return is int
        System.out.println(sq.applyAsInt(2.5));

        UnaryOperator<Integer> add1 = i -> i+1;
        IntUnaryOperator sum1 = i -> i+1;

        IntBinaryOperator sum = (a,b) -> a+b; // both parameter and return type is int
        //If return type is primitive then function name changed such as for int apply -> applyAsInt.

    }
}
