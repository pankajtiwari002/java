package com.OOPs.Clone;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name,int []arr) {
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is shallow copy
        // return super.clone();
        //for deep copy
        Human twin = (Human) super.clone();
        twin.arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            twin.arr[i] = arr[i];
        }
        return twin;
        //
    }
}
