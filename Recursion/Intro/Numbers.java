import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
    }
    static void print(int x,int n){
        if (x == n){
            System.out.println(n);
            return;
        }
        System.out.println(x);
        print(x+1,n);
    }
}
