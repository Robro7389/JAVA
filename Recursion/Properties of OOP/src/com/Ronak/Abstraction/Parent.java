package com.Ronak.Abstraction;

public abstract class Parent {

    int age;
        public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey!");
    }

    void hy(){
        System.out.println("hy!");
    }

    abstract void career(String name);
    abstract void superhero(String name,int age);
}
