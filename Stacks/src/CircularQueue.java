import java.util.Queue;

public class CircularQueue {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;

        protected int front = 0;
        protected int end = 0;
        private int size = 0;

        public CircularQueue(){
            this(DEFAULT_SIZE);
        }

        public CircularQueue(int size){
            this.data = new int[size];
        }

        public boolean insert(int val) throws QueueException{
            if (isFull()) {
                throw new QueueException("Queue is full!");
            }
            data[end++] = val;
            size++;
            end = end % data.length;
            return true;
        }

        public boolean isFull(){
            return size == data.length;
        }

        public int remove() throws QueueException{
            if (isEmpty()) {
                throw new QueueException("Queue is empty!");
            }
            int removed = data[front];
            front++;
            front = front % data.length;
            size--;
            return removed;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public int front() throws QueueException{
            if (isEmpty()) {
                throw new QueueException("Queue is empty!");
            }
            return data[front];
        }

        public void display() throws QueueException{
            if (isEmpty()) {
                throw new QueueException("Queue is empty!");
            }
            int i = front;
            do {
                System.out.print(data[i] + " <- ");
                i++;
                i = i % data.length;
            }while(i != end);
            System.out.println("END");
        }
}
