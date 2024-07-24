import java.util.Scanner;
import java.io.*;
public class String_palindrome {
    public static void main(String[] args) {
        System.out.print("Enter your string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toLowerCase();
        boolean check = true;
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)) {
                check = false;
                break;
            }
                i++;
                j--;
        }
        if (check==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
