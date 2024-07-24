public class XOR_a_to_b {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans1 = wholeXOR(a);
        int ans2 = wholeXOR(b);
        System.out.println(ans1 ^ ans2);
    }
    static int wholeXOR(int n){
        int mod = n % 4;
        switch (mod){
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
        }
        return 0;
    }
}
