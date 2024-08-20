package com.pankaj.string;

public class StringBufferExample {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb1 = new StringBuffer(); // default capacity 16
        // constructor 2
        StringBuffer sb2 = new StringBuffer("Pankaj Tiwari");
        // constructor 3
        StringBuffer sb3 = new StringBuffer(30); //initial capacity 30
        System.out.println(sb1.capacity());
        sb3.append("Hi my name is Pankaj Tiwari");
        System.out.println(sb3);
        String str = "   jkfla    djakl jdsakl    djakf jlka";
        System.out.println(str.replaceAll("\\s",""));
    }
}
