import java.util.Scanner;
public class Largest_and_smallest_of_3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a,b,c;
        System.out.print("Enter three numbers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        print(a,b,c);
    }
    static void print(int a,int b,int c){
        int max = Math.max(a,b);
        max = Math.max(max,c);
        int min = Math.min(a,b);
        min = Math.min(min,c);
        System.out.println("Greatest number:"+max);
        System.out.println("Smallest Number:"+min);
    }
}
