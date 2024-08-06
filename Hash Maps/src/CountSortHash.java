import java.util.Arrays;
import java.util.HashMap;

public class CountSortHash {
    public static void main(String[] args) {
        int[] arr = {3,4,1,3,2,5,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        GenericHashMap<Integer,Integer> map = new GenericHashMap<>();
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        for (int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = map.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
