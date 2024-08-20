package com.pankaj;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int rollNo = 123; // 4byte
        char letter = 's';// 1byte
        float marks = 89.23f;// 4byte
        double largeDecimal = 456732323.31131; // 8byte
        long largeNumber = 7482749827482894L; // 8byte
        boolean flag = true; // 1byte
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("n = " + n);

        int a = 234_000_000;
        System.out.println(a);
    }
}