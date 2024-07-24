import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = in.nextInt();
        int ans = Fact(n);
        System.out.println(ans);
    }
    static int Fact(int n){
        int num = 1;
        if(n==0){
            return 1;
        }
        for (int i = n;i>=1;i--){
            num*=i;
        }
        return num;
    }
}
