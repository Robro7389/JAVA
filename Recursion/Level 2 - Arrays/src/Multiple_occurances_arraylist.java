import java.util.ArrayList;

public class Multiple_occurances_arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,5,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr,3,0,list));
    }

    static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
