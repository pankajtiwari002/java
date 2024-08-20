package com.pankaj;

public class Scope {
    public static void main(String[] args) {
        int a=10,b=20;
        {
//            int a = 30; already initialized outside the block in the same function
            a = 30;
            int c = 90;
        }
//        System.out.println(c); you can't access c outside block
        System.out.println(a);
    }
}
