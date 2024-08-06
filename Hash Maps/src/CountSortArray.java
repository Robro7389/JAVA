import java.util.Arrays;

public class CountSortArray {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,6,8,4,1,6,1,5};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int[] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
