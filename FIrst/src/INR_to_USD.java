import java.util.Scanner;
public class INR_to_USD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in INR:");
        double inr = input.nextFloat();
        double usd = ((1/83.09) * inr);
        System.out.println(usd + " US Dollars");
    }
}
