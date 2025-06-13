import java.util.Arrays;
import java.util.List;

public class StringLongestThen4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "banana", "cat", "elephant");
        words.stream().filter(x -> x.length()>4).forEach(System.out::println);
    }
}
