package com.Java8;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
// Runnable is also a Functional Interface which contains one run method that we have to override
public class MultiThreadingExample {
    public static void main(String[] args) {
//        MyRunnable obj = new MyRunnable(); // This is old-fashioned
        Runnable r = () -> { // use Lambda Function
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };
//        Thread t = new Thread(obj);
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
