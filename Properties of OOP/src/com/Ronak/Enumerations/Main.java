package com.Ronak.Enumerations;

public class Main{

    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //enums constants
        //all are public static and final

        Week(){
            System.out.println("Constructor for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Helloooo");
        }
    }


    public static void main(String[] args) {
        Week week = Week.Monday;
        week.hello();

//        for (Week day : Week.values()){
//            System.out.println(day);
//        }
    }
}
