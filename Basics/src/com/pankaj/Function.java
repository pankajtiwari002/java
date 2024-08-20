package com.pankaj;

import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        int a=10,b=20;
        swap(a,b);
        System.out.println("a = "+a+" b = "+b); // pass by value

        String name = "Pankaj";
        changeName(name);
        System.out.println(name);

        int[] arr = {1,2,34,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    static void changeName(String naam){
        naam = "Pankaj Tiwari"; // create new Object
    }

    static void change(int[] a){
        a[0] = 99; // It's change the value in arr
    }
}
