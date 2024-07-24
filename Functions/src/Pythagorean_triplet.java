//A Pythagorean triplet is when the sum of the square of two numbers is equal to the square
// of the third number.

import java.util.Scanner;
public class Pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter your triplet:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        boolean check = isTriplet(a,b,c);
        if (check){
            System.out.println("It's a Pythagorean triplet.");
        }
        else{
            System.out.println("It's not a pythagorean triplet.");
        }
    }
    static boolean isTriplet(int a,int b,int c){
        if ((a*a)+(b*b)==(c*c)){
            return true;
        }
        if ((b*b)+(c*c)==(a*a)){
            return true;
        }
        if ((a*a)+(c*c)==(b*b)){
            return true;
        }
        return false;
    }
}
