package com.pankaj.string;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
//        str.append("hidskha adha njoi");
//        System.out.println(str);
//        str.append(213);
//        str.insert(3,'@');
//        str.setCharAt(2,'#');
//        System.out.println(str);
//        System.out.println(str.indexOf("a"));

//        for(int i=0;i<str.length();i++){
//            str.append((char)('A'+i)); // not create new string
//        }
//        System.out.println(str);
        str.append("abjadcaadljl;sd");
        // split and strip are of String function
//        System.out.println("    kkjkl   ".strip());
        System.out.println(Arrays.toString(str.toString().split("a")));
    }
}
