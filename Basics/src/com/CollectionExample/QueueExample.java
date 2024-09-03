package com.CollectionExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void reverseK(Queue<Integer> q,int k){
        solve(q,k);
        int t = q.size()-k;
        while (t>0){
            int ele = q.poll();
            q.offer(ele);
            t--;
        }
    }

    public static void solve(Queue<Integer> q,int k){
        if(k==0) return;
        int ele = q.poll();
        solve(q,k-1);
        q.offer(ele);
    }
    public static void main(String[] args) {
        // reverse first K element of queue
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseK(q,5);
        System.out.println(q);
    }
}
