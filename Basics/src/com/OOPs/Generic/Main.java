package com.OOPs.Generic;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<14;i++){
            str.append((char)(97+i));
            list.add(str.toString());
        }
        System.out.println(list);
    }
}
