package com.pankaj.arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // try to create a 2d array of size n*m and take input and output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m]; //it's not mandatory to assign column
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
