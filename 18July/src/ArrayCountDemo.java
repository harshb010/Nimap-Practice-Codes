import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayCountDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,4,5,3,2,2,3,5,6,7,5,4,3,2,2);
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);
    }
}
