import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practice4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Apricot", "Orange");
        Optional<String> result = words.stream()
                .filter(s -> s.startsWith("A"))
                .findFirst();
        result.ifPresent(System.out::println);

    }
}
