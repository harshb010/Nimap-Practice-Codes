import java.util.Arrays;
import java.util.List;

public class NamesStartingWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Brian", "Andrew");
        names.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
    }
}
