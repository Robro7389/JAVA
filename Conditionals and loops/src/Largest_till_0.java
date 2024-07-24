import java.util.Scanner;
public class Largest_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers:");
        int a = in.nextInt();
        int max = a;
        do{
            a = in.nextInt();
           max = Math.max(a,max);
        } while (a!=0);
        System.out.println("The largest no. is " + max);
    }
}
