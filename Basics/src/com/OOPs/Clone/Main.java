package com.OOPs.Clone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human pankaj = new Human(20,"Pankaj",new int[]{1,2,3,4,5,6});
        Human twin = (Human)pankaj.clone();
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(pankaj.arr));
    }
}
