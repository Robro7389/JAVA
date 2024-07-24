import java.util.Scanner;
public class Counting_occurances{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = in.nextInt();
        System.out.print("Enter the digit:");
        int digit = in.nextInt();
        int sum=0,rem;
        while (num != 0){
            rem = num%10;
            if (rem == digit){
                sum++;
            }
            num/=10;
        }
        System.out.println("The digit has been occured " + sum + " no. of times.");
    }
}
