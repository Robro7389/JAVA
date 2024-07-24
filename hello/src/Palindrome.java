import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,ans=0,digit,prev;
        System.out.println("Enter your number");
        n = input.nextInt();
        prev = n;

        while(n!=0){
            digit = n%10;
            ans = (ans*10)+digit;
            n = n/10;
        }
        if (prev==ans){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
