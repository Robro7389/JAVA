public class QueueMain {
    public static void main(String[] args) throws QueueException{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(1);
        queue.insert(9);
        queue.insert(2);

        queue.display();

        System.out.println(queue.front());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        queue.insert(6);
        queue.insert(0);

        queue.display();
    }
}
