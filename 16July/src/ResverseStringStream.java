import java.util.List;
import java.util.stream.Collectors;

public class ResverseStringStream {
    public static void main(String[] args) {
        String str = "helloWorld";
         String str1 =  str.chars().mapToObj(ch -> (char) ch)
                .toList().reversed()
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(str1);

    }
}
