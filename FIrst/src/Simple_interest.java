import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write down the Principal,rate of interest and time respectively:");
        int p,r,t;
        p = input.nextInt();
        r = input.nextInt();
        t = input.nextInt();
        System.out.println("The simple interest will be : " + p*r*t/100);
    }
}
