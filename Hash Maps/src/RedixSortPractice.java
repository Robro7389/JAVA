import java.util.Arrays;

public class RedixSortPractice {
    public static void main(String[] args) {
        int[] arr = {45,2,56,24,314,64,76};
        System.out.println("Original Array:" + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array:" + Arrays.toString(arr));

    }

    public static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        for(int exp = 1;max / exp > 0;exp *= 10){
            compute(arr,exp);
        }
    }

    private static void compute(int[] arr,int exp){
        int[] count = new int[10];
        int[] output = new int[arr.length];
        Arrays.fill(count,0);
        for (int j : arr) {
            count[(j / exp) % 10]++;
        }

        System.out.println("Count array : " + Arrays.toString(count));


        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i-1];
        }

        System.out.println("Updated Count array : " + Arrays.toString(count));

        for (int i = arr.length-1;i >= 0;i--){
            output[count[((arr[i] / exp) % 10)] - 1] = arr[i];
            count[((arr[i] / exp) % 10)]--;
        }
        System.out.println("Output Array : " + Arrays.toString(output));
        System.out.println();

        System.arraycopy(output,0,arr,0,arr.length - 1);
    }
}
