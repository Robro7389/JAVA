public class CircularQueueMain {
    public static void main(String[] args) throws QueueException{
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);

        System.out.println(queue.front());
        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(34);
        queue.insert(12);
        System.out.println(queue.front());
        queue.display();
    }
}
