package com.Ronak.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();

        Circle circle = new Circle();
        circle.area();

        Shapes box = new Circle();
        box.area(); 

//        Square square = new Square();
//        square.area();

//        CIrcle box = new Shapes();
//        box.area();
    }
}
