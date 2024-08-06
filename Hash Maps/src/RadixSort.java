import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91,8};
        System.out.println("Original Array : " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("SOrted Array : " + Arrays.toString(arr));
    }

    public static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println();
        for (int exp = 1;max / exp > 0;exp *= 10){
            countSort(arr,exp);
            System.out.println();
        }
    }

    public static void countSort(int[] arr,int exp){
        int[] count = new int[10];
        int[] output = new int[arr.length];
        Arrays.fill(count,0);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("Count Array : " + Arrays.toString(count));

        for (int i = 1;i < count.length;i++){
            count[i] = count[i] + count[i-1];
        }

        System.out.println("Updated Count Array : " + Arrays.toString(count));
        for (int i = arr.length - 1;i >= 0;i--){
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output,0,arr,0,arr.length);
        System.out.println("Sorted Array of " + exp + "place : " + Arrays.toString(arr));
    }


}
