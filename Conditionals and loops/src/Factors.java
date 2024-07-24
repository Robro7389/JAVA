import java.util.Scanner;
public class Factors {
    public static void factor(int num){
        System.out.print("THe factors of " + num + " are:");
        for (int i = 1;i<=num;i++){
            if (num%i==0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        factor(num);
    }
}
