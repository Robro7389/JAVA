import java.util.Scanner;
public class Neg_poseven_posodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = in.nextInt();
        int neg=0,pose=0,poso=0;
        do{
            if (n<0){
                neg+=n;
            }
            else if (n>0 && n%2==0){
                pose+=n;
            }
            else{
                poso+=n;
            }
            n = in.nextInt();

        }while (n!=0);
        System.out.println(neg + " " + pose + " " + poso);
    }
}
