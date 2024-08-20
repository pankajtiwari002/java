package com.OOPs;

public class Final {
    public static void main(String[] args) {
        final int a = 5;
//        a = 3; you can't change the value of final variable
        final A obj = new A(8);
        obj.a = 3; // But when you make object as a final then you can change the data member but can't change reference of object
        System.out.println(obj.a);
//        obj = new A(); I can't do that because now i am changing reference of obj

        B b = new B();
        for(int i=0;i<400000;i++){
            b = new B();
        }
    }
}

class A{
    int a;
    A(){}
    A(int a){
        this.a=a;
    }
}

class B{
    static int c=0,d=0;
    B(){
        c++;
    }

    @Override
    protected void finalize() throws Throwable {
        d++;
        System.out.println("Object is destroyed: " + c + " " + d);
        super.finalize();
    }
}
