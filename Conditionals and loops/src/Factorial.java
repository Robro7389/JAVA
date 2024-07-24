import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        int digit = 1;
        for (int i = n;i>=1;i--){
            digit*=i;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}
