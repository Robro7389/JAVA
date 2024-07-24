public class Right_most_set_bit {
    public static void main(String[] args) {
        int n = 4768;
        System.out.println(Integer.toBinaryString(n));
        int ans = RM_Setbit(n);
        System.out.println(ans);
    }
    static int RM_Setbit(int n){
        int count = 1;
        while((n & 1) != 1){
            count++;
            n >>= 1;
        }
        return count;
    }
}
