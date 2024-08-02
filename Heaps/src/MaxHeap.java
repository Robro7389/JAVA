import java.util.ArrayList;

public class MaxHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MaxHeap(){
        list = new ArrayList<>();
    }

    public MaxHeap(ArrayList<T> list){
        this.list = list;
        int n = list.size() / 2;
        for (int i = n; i >= 0; i--) {
            downheap(i);
        }
    }

    private T[] arr;
    public MaxHeap(T[] arr){
        this.arr = arr;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private int left(int index){
        return (index * 2) + 1;
    }

    private int right(int index){
        return (index * 2) + 2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }

    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    private void upheap(int index){
        if (index == 0){
            return;
        }

        int p = parent(index);
        if (list.get(p).compareTo(list.get(index)) < 0){
            swap(p, index);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        T removed = list.get(0);
        T last = list.get(list.size() - 1);
        if (!list.isEmpty()){
            list.set(0,last);
            list.remove(last);
            downheap(0);
        }

        return removed;
    }

    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) < 0){
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) < 0){
            min = right;
        }

        if (min != index){
            swap(min,index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while (!list.isEmpty()){
            data.add(this.remove());
        }

        return data;
    }
}
