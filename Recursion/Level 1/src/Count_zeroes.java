public class Count_zeroes {
    public static void main(String[] args) {
        System.out.println(zeroCount(500020,0));
    }
    static int zeroCount(int n,int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return zeroCount(n/10,count);
    }
}
