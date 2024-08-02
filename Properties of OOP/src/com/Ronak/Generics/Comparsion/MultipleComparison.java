package com.Ronak.Generics.Comparsion;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MultipleComparison {
    public static void main(String[] args) {
        Student A = new Student(1,95.45f);
        Student B = new Student(2,90.75f);
        Student C = new Student(3,67.75f);
        Student D = new Student(4,88.75f);
        Student E = new Student(5,99.75f);

        Student[] list = {A, B, C, D, E};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
