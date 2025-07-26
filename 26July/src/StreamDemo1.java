import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = List.of("Harshal","1Bhavesh","Nikhil","3Ganesh");
        List<String> list1 = list.stream()
                .filter(x -> Character.isDigit(x.charAt(0)))
                .toList();
        System.out.println(list1);

    }
}
