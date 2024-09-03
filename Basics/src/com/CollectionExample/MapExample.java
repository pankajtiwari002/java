package com.CollectionExample;

import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
//        HashMap<Integer,Integer> mp = new HashMap<>();
//        int[] arr = {1,2,3,3,1,4,6};
//        for(int ele: arr){
//            if(mp.containsKey(ele)) mp.replace(ele,mp.get(ele) + 1);
//            else mp.put(ele,1);
//        }
//        mp.remove(6);
//        System.out.println(mp);

        TreeMap<Integer,Integer> mp = new TreeMap<>();
        int[] arr = {1,2,3,3,1,4,6};
        for(int ele: arr){
            if(mp.containsKey(ele)) mp.replace(ele,mp.get(ele) + 1);
            else mp.put(ele,1);
        }
        mp.remove(6);
        System.out.println(mp);
    }
}
