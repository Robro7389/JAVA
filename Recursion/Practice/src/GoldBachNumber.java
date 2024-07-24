import java.util.ArrayList;
import java.util.Scanner;
public class GoldBachNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
    public static void print(int n){
        if (n%2!=0){
            System.out.println("Invalid! ODD number.");
            return;
        }
        if (n < 9 || n > 50){
            System.out.println("OUT OF RANGE!!");
        }
        ArrayList<ArrayList<Integer>> list = GoldBach(n,2,new ArrayList<Integer>());
        System.out.println(list);
    }

    public static ArrayList<ArrayList<Integer>> GoldBach(int target,int check,ArrayList<Integer> smallList){
        if (check == 0 && target == 0){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(smallList);
            return list;
        }
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        for (int i = 3;i <= target && check > 0;i = i+2){
            if(isPrime(i)){
                smallList.add(i);
                bigList.addAll(GoldBach(target - i,check - 1,smallList));
                smallList.removeLast();
            }
        }

        return bigList;
    }
    public static boolean isPrime(int n){
        for (int i = 2;i < n/2+1;i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

