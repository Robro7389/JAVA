package com.Ronak.ExceptionHandling;
import java.io.IOException;
import java.util.Scanner;

public class Throws_throw {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.equals("John")){
            throw new IOException("John is not allowed!");
        }
        else {
            System.out.println("Welcome, " + s + "!");
        }

    }
}
