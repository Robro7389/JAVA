package com.Ronak.Inheritance;

public class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(int l,int b,int h,int weight){
        super(l, b, h);
        this.weight = weight;
    }

    BoxWeight(int side,int weight){
        super(side);
        this.weight = weight;
    }

    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " + box.b + " " + box.h);
//
//        Box box2 = new Box(2);
//        System.out.println(box2.l + " " + box2.b + " " + box2.h);
//
//        Box box3 = new Box(3,4,5);
//        System.out.println(box3.l + " " + box3.b + " " + box3.h);
//
//        Box box4 = new Box(box2);
//        System.out.println(box4.l + " " + box4.b + " " + box4.h);

        BoxWeight box = new BoxWeight();
        System.out.println(box.l + " " + box.b + " " + box.h + " " + box.weight);

        BoxWeight box2 = new BoxWeight(4,2);
        System.out.println(box2.l + " " + box2.b + " " + box2.h + " " + box2.weight);

        BoxWeight box3 = new BoxWeight(2,4,6,8);
        System.out.println(box3.l + " " + box3.b + " " + box3.h + " " + box3.weight);


//        Box box5 = new BoxWeight();
//        System.out.println(box5.l);  error
        // Reference type is parent class and object is of child class

//        BoxWeight box5 = new Box();   error
        //
    }
}
