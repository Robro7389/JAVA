import java.util.ArrayList;

public class Array_occurances_bodyFunction {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,4,4,5};
        System.out.println(search(arr,3,0));
    }
    static ArrayList<Integer> search(int[] arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> bellowCalls = search(arr,target,i+1);
        list.addAll(bellowCalls);
        return list;
    }
}
