import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws Exception{
        DynamicStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);

        System.out.println(stack.peek());
    }
}
