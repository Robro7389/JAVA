public class Reverse_no {
    public static void main(String[] args) {
        System.out.println(rev(12345678));
    }
    static int rev(int n){
        if(n < 10){
            return n;
        }
        int digits = (int)(Math.log10(n)) + 1;
        int rem = n % 10;
        return (int) (rem * Math.pow(10,digits - 1) + rev(n/10));
    }
}
