package com.Ronak.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Derived extends Base {

    Derived(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Derived obj = new Derived(34, "Ronak");
        System.out.println(obj.num);
        System.out.println(obj.name);
    }
}
