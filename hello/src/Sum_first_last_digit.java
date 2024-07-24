import java.util.Scanner;
public class Sum_first_last_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, sum = 0, digit;
        System.out.println("Enter your number");
        a = input.nextInt();

        digit = a % 10;
        sum += digit;
        while (a != 0) {
            if (a < 10) {
                sum += a;
                break;
            } else {
                a = a / 10;
            }
        }
        System.out.println("Your answer:" + sum);
    }
}