public class OddEven {
    public static void main(String[] args) {
        int n = 59;
        System.out.println(oddEven((n)));
    }
    static String oddEven(int n){
       if((n & 1) == 1){
           return new String("Odd");
       }
       return new String("Even");
    }
}
