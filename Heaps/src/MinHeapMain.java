import java.util.ArrayList;

public class MinHeapMain {
    public static void main(String[] args) throws Exception{
        MinHeap<Integer> heap = new MinHeap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(99);
        heap.insert(78);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);


    }
}