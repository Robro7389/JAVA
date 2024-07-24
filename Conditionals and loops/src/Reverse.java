import java.util.Scanner;
public class Reverse {
    public static int reverseNo(int num){
        int digit,rev=0;
        while (num != 0){
            digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = in.nextInt();
        int ans = reverseNo(num);
        System.out.println("THe reveresed no. is " + ans);
    }
}
