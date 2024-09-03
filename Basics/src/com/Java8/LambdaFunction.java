package com.Java8;

public class LambdaFunction {
    public static void main(String[] args) {
        // Lambda function are function in which we does not specify name, return type
        // nameless function
        //sometime we also don't write the type of parameter
        // if body contains single line then we can omit curly braces and don't write return keyword
        // if there is only one parameter then we can omit paranthesis also
//        Interf i = Integer::sum;
        Interf i = (a,b) -> a+b;
        System.out.println(i.add(34,12));

        /*
         Is Lambda function are extra overhead and increase the execution time
         Only at compile time it matter but execution time depend on runtime and is not effected
        */
    }
}

interface Interf{
    public int add(int a,int b);
}
