import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaDemo2 {
    public static void main(String[] args) {
        String str = "helloworrrld";
        str.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
