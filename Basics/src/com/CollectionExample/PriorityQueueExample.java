package com.CollectionExample;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
//        K largest & Smallest Elements in array .
        PriorityQueue<Integer> lg = new PriorityQueue<>(); // min heap
        PriorityQueue<Integer> sm = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        int[] arr = {1,2,56,43,20,19,102};
        int k = 3;
        // offer return true if element added successfully else false
        // while add throw error
        for(int ele: arr){
            lg.offer(ele);
            sm.offer(ele);
            if(lg.size() > k) lg.poll();
            if(sm.size() > k) sm.poll();
        }
        if(!lg.isEmpty()){ // to check empty
            System.out.println(k + "rd largest element is " + lg.peek());
            System.out.println(k + "rd smallest element is " + sm.peek());
        }
    }
}
