public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,3,52,23};
        System.out.println(search(arr,0,35));
    }
    static int search(int[] arr,int x,int target){
        if(x == arr.length){
            return -1;
        }
        if(arr[x] == target){
            return x;
        }
        return search(arr,x+1,target);
    }
}
