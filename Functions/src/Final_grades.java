import java.util.Scanner;
public class Final_grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks = in.nextInt();
        Final(marks);
    }
    static void Final(int v){
        if (v>90 && v<=100){
            System.out.println("A+");
        }
        if (v>80 && v<=90){
            System.out.println("A");
        }
        if (v>70 && v<=80){
            System.out.println("B+");
        }
        if (v>60 && v<=70){
            System.out.println("B");
        }
        if (v>50 && v<=60){
            System.out.println("C");
        }
        if (v>=40 && v<=50){
            System.out.println("D");
        }
        if (v<40){
            System.out.println("Fail");
        }

    }
}
