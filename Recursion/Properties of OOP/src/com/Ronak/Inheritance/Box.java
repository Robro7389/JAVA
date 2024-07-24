package com.Ronak.Inheritance;

public class Box {
    double l;
    double b;
    double h;
    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(double size){
        this.l = size;
        this.b = size;
        this.h = size;
    }

    Box(int l,int b,int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box other){
        this.l = other.l;
        this.b = other.b;
        this.h = other.h;
    }
}
