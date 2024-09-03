package com.CollectionExample;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>(); // unordered_set in c++
        TreeSet<Integer> set = new TreeSet<>(); // set in c++
        int[] arr = {1,2,3,41,1,41,5,3};

//        for(int ele: arr){
//            st.add(ele);
//        }
//        System.out.println(st);
//        System.out.println(st.contains(3));
//        System.out.println(st.isEmpty());
//        st.remove(3);
//        System.out.println(st);

        for(int ele: arr){
            set.add(ele);
        }
        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.isEmpty());
        set.remove(3);
        System.out.println(set.floor(3));
        System.out.println(set.ceiling(3));

    }
}
