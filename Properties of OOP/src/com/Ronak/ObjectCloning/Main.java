package com.Ronak.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Ronak = new Human(20,"Ronak Gour");
        Human Twin = (Human)Ronak.clone();
        System.out.println(Twin.age + " " + Twin.name);
        System.out.println(Arrays.toString(Ronak.arr));
        System.out.println(Arrays.toString(Twin.arr));

        Twin.arr[0] = 100;

        System.out.println(Arrays.toString(Ronak.arr));
        System.out.println(Arrays.toString(Twin.arr));

    }
}
