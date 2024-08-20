package com.OOPs.Generic;

import java.util.Arrays;

public class CustomArrayList<T> {
    Object[] data;
    int size = 0;
    int DEFAULT_SIZE=10;
    CustomArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    T remove(){
        T value = (T)(data[--size]);
        return value;
    }

    void set(int ind,T value){
        data[ind] = value;
    }

    T get(int ind){
        return (T)(data[ind]);
    }

    private void resize() {
        Object[] temp = new Object[2*data.length];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
