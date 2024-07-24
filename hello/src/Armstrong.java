import java.util.Scanner;
//import java.lang.Math;
public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,prev;
        double digit,cub,ans=0;
        double three = 3;
        n = input.nextInt();
        prev = n;
        while(n!=0){
            digit = n%10;
            cub = Math.pow(digit, three);
            ans = ans + cub;
            n = n/10;
        }
        if (prev==ans){
            System.out.println("Armstrong no.");
        }
        else {
            System.out.println("Not an Armstrong no.");
        }
    }
}
