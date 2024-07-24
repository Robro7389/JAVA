public class XOR_0_to_n {
    public static void main(String[] args) {
        int n = 2;
        int mod = n % 4;
        switch (mod){
            case 0:
                System.out.println(n);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(n + 1);
                break;
            case 3:
                System.out.println(0);
                break;
        }
    }
}
