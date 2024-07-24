public class Sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,12};
        System.out.println(check(arr,0));
    }
    static boolean check(int[] arr,int x){
        if(x == arr.length - 1){
            return true;
        }
        if(arr[x] > arr[x+1]){
            return false;
        }
        return check(arr,x+1);
    }
}
