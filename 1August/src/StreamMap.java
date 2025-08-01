import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> countries = List.of("India", "USA", "Germany", "France");
        Map<String, Integer> collect = countries.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(collect);
    }
}
