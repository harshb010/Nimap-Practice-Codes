import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = List.of("Nikhil","Harshal");

        List<Character> list1 = list.stream().flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .toList();
        System.out.println(list1);



    }
}
