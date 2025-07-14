//Join a list of strings with '[' as prefix, ']' as suffix,
//and ',' as delimiter. Given a list of strings, write a Java 8
//program to join the strings with '[' as a prefix, ']' as a suffix,
//and ',' as a delimiter


import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo6 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","World","Java","Program","Code");
        String collect = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }
}
