import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LL list = new LL();
        System.out.print("Enter the size of the list: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < 5; i++) {
            list.insert(in.nextInt());
        }
        list.display();

    }
}