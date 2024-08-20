package com.pankaj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,21,3,45,1,34,5);
        fun(2,21,3,45,34,52);
    }
    static void multiple(int a,int b,int ...v){ // varargs always at the end

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
