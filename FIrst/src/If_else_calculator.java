import java.util.Scanner;
public class If_else_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        char op;
        op = input.next().charAt(0);

        if (op=='+'){
            System.out.println(a+b);
        } else if (op=='-') {
            System.out.println(a-b);
        } else if (op=='*') {
            System.out.println(a*b);
        } else if (op=='/') {
            System.out.println(a/b);
        }
        else {
            System.out.println("Invalid Operator.");
        }
    }
}
