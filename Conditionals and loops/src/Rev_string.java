import java.util.Scanner;
public class Rev_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i = str.length() - 1;
        String rev = "";
        while (i>=0){
            rev = rev+str.charAt(i);
            i--;
        }
        System.out.println(rev);
    }
}
