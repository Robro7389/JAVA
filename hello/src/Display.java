import java.util.Scanner;
public class Display {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your grade:");
        char grade = input.next().charAt(0);
        System.out.println("Enter your roll_No:");
        int roll_no = input.nextInt();
        System.out.println("Enter your percentage:");
        float percentage = input.nextFloat();

        System.out.println("Name:" + name);
        System.out.println("Grade:" + grade);
        System.out.println("Roll-no.:" + roll_no);
        System.out.println("percentage:" + percentage + "%");
    }
}
