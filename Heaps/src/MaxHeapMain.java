import java.util.ArrayList;

public class MaxHeapMain {
    public static void main(String[] args) throws Exception{

        ArrayList<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(40);
        list.add(1);
        list.add(16);
        list.add(50);
        list.add(20);
        System.out.println(list);
        MaxHeap<Integer> heap = new MaxHeap<>(list);



        System.out.println(list);
    }
}
