package com.pankaj.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v; // declaration
        v = new int[5]; // object is created in memory
        // initialize at a time of declaration
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        // take input from user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
