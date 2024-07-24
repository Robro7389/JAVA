package com.Ronak.Abstraction;

public class Main {
    public static void main(String[] args) {
        Child son = new Child(12);
        Child daughter = new Child(14);

        System.out.println(son.age);
        System.out.println(daughter.age);

        son.career("Engineer");
        son.superhero("Doctor Strange", 150);
        daughter.career("Developer");
        daughter.superhero("Iron man",43);

        Parent.hello();
        son.hy();
    }
}
