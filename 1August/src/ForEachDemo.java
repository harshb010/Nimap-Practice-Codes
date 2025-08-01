import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> cities = List.of("Delhi", "Mumbai", "Pune", "Chennai", "Bangalore");
        cities.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
