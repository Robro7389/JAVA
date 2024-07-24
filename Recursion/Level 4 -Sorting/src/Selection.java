import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7,6};
        selectionSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr,int max,int r,int c){
        if(r == 0){
            return;
        }
        if(c <= r){
            if(arr[max] < arr[c]){
                max = c;
            }
            selectionSort(arr,max,r,c+1);
        }
        else{
            swap(arr,max,r);
            selectionSort(arr,0,r-1,0);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
