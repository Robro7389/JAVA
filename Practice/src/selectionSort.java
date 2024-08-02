import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {12,8, 5, 3, 4, 6,};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int r,int c,int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[max] < arr[c]){
                max = c;
            }
            sort(arr,r,c+1,max);
        }
        else{
            int temp = arr[r-1];
            arr[r-1] = arr[max];
            arr[max] = temp;
            sort(arr,r-1,0,0);
        }
    }
}
