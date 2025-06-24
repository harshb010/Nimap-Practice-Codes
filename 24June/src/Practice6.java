import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice6 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "grape");
        List<String> sorted = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}
