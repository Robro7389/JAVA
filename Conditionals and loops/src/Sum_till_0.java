import java.util.Scanner;
public class Sum_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Start entering the numbers:");
        int num = in.nextInt();
        int sum=0;
        do {
            sum+=num;
            num = in.nextInt();
        } while (num!=0);
        System.out.println("The sum of numbers is " + sum);
    }
}
