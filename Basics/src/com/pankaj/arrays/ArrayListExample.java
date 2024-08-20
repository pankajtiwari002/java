package com.pankaj.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
        for (int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.add(1,56);
        System.out.println(arr);
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,5)); // initialize at a time of declaration
        if(nums.contains(5)) System.out.println("It contains 5");
        nums.set(0,34); // update 0 index to 34
        nums.remove(1);
        System.out.println(nums);
    }
}
