public class Factors {
    public static void main(String[] args) {
        int n = 24;
        factors(n);
    }

    static void factors(int n){
        for (int i = 1;i <= n/2 + 1;i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(n);
    }
}
