package com.OOPs;

public class Singleton {
    public static void main(String[] args) {
        Test test1 = Test.getInstance();
        Test test2 = Test.getInstance();
        test1.a = 3;
        System.out.println(test2.a);
    }
}

class Test{
    int a;
    int b;
    private static Test obj;
    private Test(){
        a=0;
    }
    static Test getInstance(){
        if(obj==null){
            obj = new Test();
        }
        return obj;
    }
}
