package com.Ronak.Polymorphism;

import com.Ronak.Inheritance.Protected_modifier;

public class Protected_use extends Protected_modifier{

    public Protected_use(int num){
        super(num);
    }
    public static void main(String[] args) {
        Protected_use A = new Protected_use(34);
        System.out.println(A.num);
    }
}
