import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99,110};
        System.out.println(search(arr,11,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
