package com.OOPs.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student pankaj = new Student(101,99);
        Student manish = new Student(102,91);
        Student harshit = new Student(103,93);
        Student ayush = new Student(104,89);
        Student nikhil = new Student(105,79);

        Student[] arr = {pankaj,manish,harshit,ayush,nikhil};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        Integer[] a = {34,12,89,45,98};
        Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return (int)(b-a);
            }
        });
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,(o1,o2) -> (o1-o2)); // lambda expression
        System.out.println(Arrays.toString(a));
    }
}
