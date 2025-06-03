import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(30);
        stack.add(3);
        stack.push(20);
        System.out.println(stack);

    }
}
