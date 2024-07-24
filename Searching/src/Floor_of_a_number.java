import java.util.Scanner;
public class Floor_of_a_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target:");
        int target = in.nextInt();
        int ans = findFloor(arr,target);
        System.out.println(ans);
    }

    static int findFloor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start) / 2;
        while(start<end){
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
