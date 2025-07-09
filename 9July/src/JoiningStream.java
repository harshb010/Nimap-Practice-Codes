import java.util.List;
import java.util.stream.Collectors;

public class JoiningStream {
    public static void main(String[] args) {
        List<String> languages = List.of("Java", "Python", "JavaScript", "Kotlin");
        String collect = languages.stream().map(String::toLowerCase)
                .collect(Collectors.joining("-", "<", ">"));
        System.out.println(collect);

    }
}
