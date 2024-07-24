public class No_Of_Setbits {
    public static void main(String[] args) {
        int n = 375  ;
        int ans = digits(n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ans);
    }
    static int digits(int n){
        int count = 0;
        while(n > 0){
            n &= n-1;
            count++;
        }
        return count;
    }
}
