package com.Java8;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            // Here Object of an anonymous class is created which implements Runnable interface
            // whose body is written here only
            // Anonymous class means class which does not have any Name
            @Override
            public void run() {
                for(int i =0 ;i<4;i++){
                    System.out.println("Child Thread");
                }
            }
        };
        // In the case of Functional Interface we directly write Lambda expression
        // as compare to Anonymous Inner class
        // Anonymous Inner class is more powerful than Lambda Expression
        // But using Anonymous Inner class we can also make object of other anonymous class
        // implement interface other than functional interface also
        // It can also extend normal class and abstract class
//        System.out.println(r);
        Thread t = new Thread(r);
        t.start();
        for(int i =0 ;i<4;i++){
            System.out.println("Main Thread");
        }
    }
}
