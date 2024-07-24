public class PowOfTwo {
    public static void main(String[] args) {
        int n = 16;
        int ans = (n & n-1);
        if(ans == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
