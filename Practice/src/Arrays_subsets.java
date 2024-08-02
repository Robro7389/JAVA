import java.util.ArrayList;
import java.util.List;

public class Arrays_subsets {
    public static void main(String[] args) {
        System.out.println(subset(new int[]{1, 2, 3} ));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0;i < n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
