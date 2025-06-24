import java.util.Arrays;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "three", "five", "seven");
        long count = list.stream()
                .filter(s -> s.length() > 4)
                .count();
        System.out.println(count);

    }
}
