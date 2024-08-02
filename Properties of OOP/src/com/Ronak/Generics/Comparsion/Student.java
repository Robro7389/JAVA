package com.Ronak.Generics.Comparsion;

public class Student implements Comparable<Student>{
    int rno;
    float marks;

    public Student(int rno,float marks){
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + rno;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("CompareTo method");
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
