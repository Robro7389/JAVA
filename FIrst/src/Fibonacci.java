import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t0 = 0,t1 = 1,temp;
        int a = input.nextInt();
        System.out.print(t0 + " " + t1);
        for (int i = 0;i <= a-3; i++){
            temp = t0 + t1;
            System.out.print(" " + temp);
            t0 = t1;
            t1 = temp;
        }
    }
}
