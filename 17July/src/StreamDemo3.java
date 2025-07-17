import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper); // Output: [ALICE, BOB]

    }
}
