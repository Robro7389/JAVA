public class Magic_number {
    public static void main(String[] args) {
        int n = 6;
        int ans = magicNo(n);
        System.out.println(ans);
    }
    static int magicNo(int n){
        int base = 5;
        int ans = 0;
        while(n > 0){
            if((n & 1) == 1){
                ans += base;
            }
            base *= 5;
            n = n>>1;
        }
        return ans;
    }
}
