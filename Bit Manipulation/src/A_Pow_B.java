public class A_Pow_B {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int ans = pow(a,b);
        System.out.println(ans);
    }
    static int pow(int a,int b){
        int base = a;
        int ans = 1;
        while(b > 0){
            if((b & 1) == 1){
                ans *= base;
            }
            base *= base;
            b >>= 1;
        }
        return ans;
    }
}
