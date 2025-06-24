import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "stream", "api");
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);

    }
}
