import java.util.Scanner;
public class Largest_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        if (a>b){
            System.out.println("The largest no. is " + a);
        }
        else {
            System.out.println("The largest no. is " + b);
        }
    }
}
