package com.OOPs.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b = 0;

        try {
//            divide(a,b);
            throw new MyException("Study Well");
        }catch(MyException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("It will always execute");
        }

    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("You can't divide by zero");
        return a/b;
    }

}
