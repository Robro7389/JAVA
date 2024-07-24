public class SingleElement_In_Array_Double {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,4,5,3,8};
        System.out.println(singleElement(arr));
    }
    static int singleElement(int[] arr){
        int unique = 0;
        for (int element : arr){
            unique ^= element;
        }
        return unique;
    }
}
