package com.Ronak.Generics.Comparsion;

public class Main {
    public static void main(String[] args) {
        Student Ronak = new Student(36,95.45f);
        Student Kunal = new Student(36,90.75f);

        if (Kunal.compareTo(Ronak) > 0){
            System.out.println("Kunal scores more!!");
        } else if (Kunal.compareTo(Ronak) == 0) {
            System.out.println("Equal!");
        }
        else {
            System.out.println("Ronak scores more!!");
        }
    }

}
