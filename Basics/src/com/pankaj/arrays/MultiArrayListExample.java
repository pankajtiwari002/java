package com.pankaj.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>(m));
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arr);
    }
}
