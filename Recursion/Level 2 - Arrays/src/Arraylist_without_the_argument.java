import java.util.ArrayList;

public class Arraylist_without_the_argument {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,4,8,8,2,7,0,4};
        System.out.println(search(arr,2,0));
    }
    static ArrayList<Integer> search(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> belowCalls = search(arr,target,index + 1);
        list.addAll(belowCalls);
        return list;
    }
}
