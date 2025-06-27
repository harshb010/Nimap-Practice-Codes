import java.util.List;

public class UnboundedWildCard {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Harshal", "Bhavesh");
        List<Integer> numbers = List.of(1, 2, 3);

        printList(names);
        printList(numbers);
    }
}
