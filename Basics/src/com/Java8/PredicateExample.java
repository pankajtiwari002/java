package com.Java8;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> even = (i) -> i%2==0;
        Predicate<Integer> gt = (i) -> i>10;
        int[] arr = {10,34,23,8,5,64};
        for(int ele: arr){
//            if(even.and(gt).test(ele)){
//                System.out.println(ele);
//            }
//            if(even.or(gt).test(ele)){
//                System.out.println(ele);
//            }
            if(even.negate().test(ele)){
                System.out.println(ele);
            }
        }
    }
}
