public class DynamicQueueMain {
    public static void main(String[] args) throws QueueException{
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(12);
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);
        queue.insert(56);

        System.out.println(queue.front());

        queue.display();

        System.out.println(queue.remove());

        queue.insert(67);
        queue.insert(78);

        System.out.println(queue.front());
        queue.display();
    }
}
