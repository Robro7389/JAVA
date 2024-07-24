import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        char op;
        System.out.println("Enter two numbers:");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Enter your operator:");
        op = input.next().charAt(0);

        switch (op){
            case '+':
                System.out.println((a+b));
                break;
            case '-':
                System.out.println((a-b));
                break;
            case '*':
                System.out.println((a*b));
                break;
            case '/':
                System.out.println((a/b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
                

        }
    }
}
