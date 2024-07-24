public class Ith_bit {
    public static void main(String[] args) {
        int n = 3534;
        int bit = 5;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(ithBit(n,bit));
    }
    static int ithBit(int n,int bit){
        n = n>>bit-1;
        return n & 1;
    }
}
