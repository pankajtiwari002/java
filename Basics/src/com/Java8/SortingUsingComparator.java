package com.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingUsingComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(34);
        list.add(1);
        list.add(37);
        // Comparator is a functional interface
        // contains compare method
        // -ve means I1 comes before tha I2
        // +ve means I2 comes before tha I1
        // 0 means equal
        Comparator<Integer> desc = (I1,I2) -> I2-I1;
        Comparator<Integer> asc = (I1,I2) -> I1-I2;
        Collections.sort(list,asc);
        System.out.println(list);
    }
}
