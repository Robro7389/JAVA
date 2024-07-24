import java.util.ArrayList;
import java.util.List;

public class arrays_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetDuplicate(arr));
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            if(i != 0 && arr[i] == arr[i-1]){
                start = end;
            }
            else{
                start = 0;
                end = n;
            }
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }

        }
        return outer;
    }
}
