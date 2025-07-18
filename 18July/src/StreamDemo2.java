import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filtered); // Output: [Alice]

    }
}
