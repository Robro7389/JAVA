public class Digits_in_base_b {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = digits(n,b);
        System.out.println(ans);
    }
    static int digits(int n, int b){
        return (int)(Math.log(n)/Math.log(b)) + 1;
    }
}
