import java.util.Arrays;

public class StrictlySortedBS {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(elementSearch(arr,9)));
    }
    public static int[] binarySearch(int[][] arr,int row,int rStart,int rEnd,int target){
        while(rStart <= rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[row][mid] == target){
                return new int[]{row, mid};
            } else if (arr[row][mid] < target) {
                rStart = mid + 1;
            }
            else{
                rEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] elementSearch(int[][] arr, int target) {
        int rStart = 0;
        int rEnd = arr.length - 1;
        int cStart = 0;
        int cEnd = arr[0].length - 1;

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[mid][0] == target){
                return new int[]{mid, 0};
            }
            else if(arr[mid][0] < target){
                rStart = mid;
            }
            else if(arr[mid][0] > target){
                rEnd = mid;
            }
        }
        if(arr[rStart + 1][0] <= target){
            return binarySearch(arr, rStart + 1,0,arr[rStart + 1].length - 1,target);
        }
        else{
            return binarySearch(arr,rStart,0,arr[rStart].length - 1,target);
        }
    }
}
