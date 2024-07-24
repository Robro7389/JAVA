import java.util.Arrays;
public class Merge_inPlace {
    public static void main(String[] args) {
        int[] arr = {8,5,3,4,6,12};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s == 1) {
            return;
        }
        int m = (e + s) / 2;

        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m,e);

        mergeInPlace(arr,s,m,e);
    }

    static void mergeInPlace(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}
