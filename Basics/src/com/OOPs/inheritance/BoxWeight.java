package com.OOPs.inheritance;

public class BoxWeight extends Box {
    int weight;
    int w=10;

    public BoxWeight(){}
    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(int l, int h, int w, int weight) {
        super(l, h, w);
        System.out.println(super.w);
        this.weight = weight;
//        super(l, h, w); you have to call parent constructor always in the beginning
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
//    @Override
    static void greeting(){
        System.out.println("Hey I am BoxWeight Class");
    }
}
