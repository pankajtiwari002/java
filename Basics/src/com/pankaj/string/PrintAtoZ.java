package com.pankaj.string;

public class PrintAtoZ {
    public static void main(String[] args) {
//        String str = "";
//        for(int i=0;i<26;i++){ // takes n*n time
//            str = str + (char)('A'+i); // new string is created
//        }
//        System.out.println(str);

        String str = "";
        for(int i=0;i<26;i++){ // takes n*n time
            str += (char) ('A' + i); // new string is created
        }
        System.out.println(str);
    }
}
