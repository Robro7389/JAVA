public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum(356));
    }

    static int sum(int n){
        if(n < 10){
            return n;
        }
        return n%10 + sum(n/10);
    }
}
