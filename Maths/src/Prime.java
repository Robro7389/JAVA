public class Prime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] check = new boolean[n+1];
        steve(n,check);
    }

    public static void steve(int n,boolean[] check){
        for (int i = 2; i * i <= n;i++){

            if(isPrime(i)){
                for(int j = i*2;j <= n;j += i){
                    check[j] = true;
                }
            }
        }
        for (int i = 2;i <= n;i++){
            if(!check[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2;i * i <= n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
