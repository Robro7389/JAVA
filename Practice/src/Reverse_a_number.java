public class Reverse_a_number {
    public static void main(String[] args) {
        System.out.println(rev(4573));
    }
    static int rev(int n){
        if(n < 10){
            return n;
        }
        int digit = (int)Math.log10(n)+1;
        return (int)n%10 * (int)Math.pow(10,digit-1) + rev(n/10);
    }
}
