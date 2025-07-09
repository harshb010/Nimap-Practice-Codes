import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreamDemo {
    public static void main(String[] args) {
        List<String> animals = List.of("lion", "tiger", "lion", "elephant", "tiger", "zebra");
        Set<String> collect = animals.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
