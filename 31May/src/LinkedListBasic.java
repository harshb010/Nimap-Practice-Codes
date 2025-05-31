import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("LinkedList: " + list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After addFirst and addLast: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("After removing first and last: " + list);
    }
}
