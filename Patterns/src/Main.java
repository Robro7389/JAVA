// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = 808201;
        int start = 0;
        int end = num/2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == num){
                System.out.println("true");
                break;
            }
            else if(mid*mid < num){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("false");
    }
}