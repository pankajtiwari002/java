package com.OOPs;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++) arr.add(i+1);
        arr.forEach((item) -> {System.out.print(item + " ");});
        Operator sum = (a,b) -> a+b;
        Operator prod = (a,b) -> a*b;
        Operator sub = (a,b) -> a-b;
        System.out.println();
        System.out.println(operate(1,2,sum));
        System.out.println(operate(1,2,prod));
        System.out.println(operate(1,2,sub));
    }

    private static int operate(int a,int b,Operator op){
        return op.operate(a,b);
    }
}

interface Operator{
    int operate(int a,int b);
}
