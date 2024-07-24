import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextInt();
        double power = in.nextInt();
        double ans = Math.pow(num,power);
        System.out.println(ans);
    }
}
