public class No_of_zeroes {
    public static void main(String[] args) {
        System.out.println(count(300200304));
    }

    static int count(int n){
        if(n == 0){
            return 0;
        }
        if(n%10 == 0){
            return 1 + count(n/10);
        }
        else{
            return count(n/10);
        }
    }
}
