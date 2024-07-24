import java.util.Scanner;
public class All_primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Enter your range of numbers:");
        int m,n;
        m = in.nextInt();
        n = in.nextInt();
        allPrimes(m,n);
    }
    static void allPrimes(int m,int n){
        boolean check;
        for (int i = m;i <= n;i++){
            check = true;
            for (int j = 2;j<i;j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(i+" ");
            }
        }
    }
}
