import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String str = "aabbbccdddddee";
        LongStream longStream = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(x -> x.getValue()).mapToLong(x -> x);
        System.out.println(longStream);


        // System.out.print(map);
        // .entryset()
        // .stream()
        // .

    }
}