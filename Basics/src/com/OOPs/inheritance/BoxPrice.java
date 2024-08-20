package com.OOPs.inheritance;

public class BoxPrice extends BoxWeight{
    int price;

    public BoxPrice() {

    }

    public BoxPrice(int l, int h, int w, int weight, int price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public int getW(){
        return super.w;
    }
}
