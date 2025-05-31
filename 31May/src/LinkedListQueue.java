import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Queue: " + queue);

        System.out.println("Polled: " + queue.poll());
        System.out.println("Now Queue: " + queue);

        System.out.println("Peek: " + queue.peek());
    }
}
