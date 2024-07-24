public class Reset_ith_bit {
    public static void main(String[] args) {
        int n = 234;
        int bit = 7;
        System.out.println(Integer.toBinaryString(n));
        int ans = resetBit(n,bit);
        System.out.println(Integer.toBinaryString(ans));
    }
    static int resetBit(int n,int bit){
        int shift = ~(1<<bit - 1);
        return n & shift;
    }
}
