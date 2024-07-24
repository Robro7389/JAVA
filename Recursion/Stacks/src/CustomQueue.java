public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = 0;
    private int size = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int val) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is full!");
        }
        data[ptr++] = val;
        size++;
        return true;
    }

    public boolean isFull(){
        return size == data.length;
    }

        public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot remove from an empty queue!");
        }
        size--;
        int removed = data[0];
        for (int i = 1; i < ptr; i++) {
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        return data[0];

    }public int rear() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        return data[ptr-1];
    }

    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
