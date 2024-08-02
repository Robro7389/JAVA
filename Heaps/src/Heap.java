import java.util.*;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    public int parent(int index){
        return (index - 1) / 2;
    }

    public int left(int index){
        return (2 * index) + 1;
    }

    public int right(int index) {
        return (2 * index) + 2;
    }

    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size() - 1);
    }


    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(p).compareTo(list.get(index)) < 0){
            swap(p,index);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }

        T removed = list.get(0);
        T last = list.get(list.size() - 1);

        list.set(0,last);
        list.remove(0);
        downheap(0);


        return removed;
    }

    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if (min != index){
            swap(min,index);
        }
    }
}
