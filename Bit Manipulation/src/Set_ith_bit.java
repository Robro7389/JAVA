public class Set_ith_bit {
    public static void main(String[] args) {
        int n = 16;
        int bit = 4;
        System.out.println(Integer.toBinaryString(n));
        int ans = setBit(n, bit);
        System.out.println(Integer.toBinaryString(ans));
    }
    static int setBit(int n,int bit){
       int shift = 1<<bit - 1;
       return n | shift;
    }
}
