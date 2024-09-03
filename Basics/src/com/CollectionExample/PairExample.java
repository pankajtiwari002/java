package com.CollectionExample;

class Pair<x,y>{
    private x key;
    private y value;
    public Pair(){}
    public Pair(x key,y value){
        this.key = key;
        this.value = value;
    }
    public x getKey(){
        return key;
    }
    public y getValue(){
        return value;
    }
    public void setKey(x key){
        this.key = key;
    }
    public void setValue(y value){
        this.value = value;
    }
}
public class PairExample {
    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<>(3,4);
        Pair<Integer,Integer> pair = new Pair<>();
        pair.setKey(40);
        pair.setValue(67);
        System.out.println("Key: " + p.getKey() + " value: " + p.getValue());
        System.out.println("Key: " + pair.getKey() + " value: " + pair.getValue());
    }
}
