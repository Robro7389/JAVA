import java.util.LinkedList;
import java.util.Queue;

public class Inbuilt_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(8);
        queue.add(5);
        queue.add(2);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
