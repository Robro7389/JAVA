import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number:");
        int a = input.nextInt();
        if (a%2==0){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's an odd number");
        }
    }
}