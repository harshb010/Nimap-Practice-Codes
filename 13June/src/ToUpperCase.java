import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> UpperCase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(UpperCase);
    }
}