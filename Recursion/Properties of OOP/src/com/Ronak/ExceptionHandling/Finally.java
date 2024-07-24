package com.Ronak.ExceptionHandling;
import java.io.IOException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d= in.nextInt();
        try {
            System.out.println(n/d);
        }
        catch(ArithmeticException e){
            System.out.println("Number cannot be divided by 0!");
        }
        finally {
            System.out.println("Code has been executed!");
        }

    }
}
