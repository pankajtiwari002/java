package com.OOPs;

public class InnerClass {
    static class A{
        String name;
        A(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        A obj1 = new A("Pankaj");
        A obj2 = new A("Rahul");
        // name is dependent on the A object

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
