package com.Ronak.Inheritance;

public class C extends B{
    int c;
    C(int a, int b,int c) {
        super(a, b);
        this.c = c;
    }

    public static void main(String[] args) {
        A a1 = new A(1);
        System.out.println(a1.a);

        B b1 = new B(9,2);
        System.out.println(b1.a + " " + b1.b);

        C c1 = new C(4,5,6);
        System.out.println(c1.a + " " + c1.b + " " + c1.c);

    }
}
