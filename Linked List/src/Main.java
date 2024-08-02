import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the size of the list: ");
//        int n = in.nextInt();
        PracticeLL list = new PracticeLL();

        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.add(2,30);

        list.display();
        list.insertRec(2,25);
        list.insertRec(0,5);
        list.insertRec(7,60);
        list.display();

    }

}