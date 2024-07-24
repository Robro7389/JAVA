import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Inbuilt_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(54);
        deque.addFirst(21);
        deque.addFirst(76);
        deque.addLast(87);
        deque.addLast(77);
        deque.addLast(12);

        System.out.println(Arrays.toString(deque.toArray()));
    }
}
