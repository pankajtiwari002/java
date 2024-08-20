package com.pankaj.string;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal"; // pointing to same string kunal present in string pool
        if(a==b) System.out.println("a == b"); // check they are pointing to same reference or not

        String str1 = new String("kunal"); // create a String object with value kunal outside string pool
        String str2 = new String("kunal"); // New Objects are created
        if(str1 == str2) System.out.println("1: str1 == str2"); //false because it checks reference is equal or not means they are pointing to same memory or not
        // to compare value we use equals method
        if(str1.equals(str2)) System.out.println("2: str1 equals str2");

        // string is immutable
        String str = "Pankaj";
        str = "Pankaj Tiwari"; // new object is created
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("Hi"));
    }
}
