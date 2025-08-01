import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {
        List<String> names = List.of("Ankit", "Raj", "Ajay", "Ramesh", "Arjun", "Karan");
        List<String> a = names.stream().filter(x -> x.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(a);
    }
}
