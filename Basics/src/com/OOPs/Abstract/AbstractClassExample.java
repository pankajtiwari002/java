package com.OOPs.Abstract;

public class AbstractClassExample {
    static abstract class Parent{
        // static methods are allow, but you can't make them abstract
        // because static methods are not override
        static int age;

        static {
            age=0;
        }
        static void hello(){
            System.out.println("Hello");
        }

        void normal(){
            System.out.println("Normal method in abstract class");
        }
        abstract void chooseCareer(String name);
    }

    static class Child extends Parent{
        String career;
        @Override
        void chooseCareer(String name) {
            career = name;
        }
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.chooseCareer("Btech");
        System.out.println(obj.career);

        obj.hello();
    }
}
