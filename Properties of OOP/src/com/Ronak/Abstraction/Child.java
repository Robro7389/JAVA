package com.Ronak.Abstraction;

public class Child extends Parent{

    Child(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("I'm gonna be a " + name);
    }

    @Override
    void superhero(String name,int age){
        System.out.println("I love " + name + " and he is " + age + " years old");
    }
}
