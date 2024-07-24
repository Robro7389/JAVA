import java.util.Scanner;
public class Ceil_of_a_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target:");
        int target = in.nextInt();
        int ans = findCeil(arr,target);
        System.out.println(ans);
    }


    static int findCeil(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start < end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
}



