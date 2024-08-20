package com.OOPs.inheritance;

public class Main {
    // java does not support multiple and hybrid inheritance
    public static void main(String[] args) {
        BoxWeight box1 = new BoxWeight(1,2,3,4);
        System.out.println(box1.h);

        Box box2 = new BoxWeight(4,5,6,7); // you can store the child class object address in parent class reference variable
//      System.out.println(box2.weight); gives error because what you can access decide by the type of reference variable
//        BoxWeight box3 = new Box(1,2,3); you can't store parent object in child class reference

        BoxPrice box4 = new BoxPrice(1,2,3,4,5);

        System.out.println(box4.w); // BoxWeight also has w which value was printed
        System.out.println(((Box)(box4)).w); // to print Box w

        Box box5 = new BoxWeight();
        box5.greeting(); // static method are inherited but not override
         }
}
