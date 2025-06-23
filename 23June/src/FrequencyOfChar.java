//Write a Java 8 program to find the frequency of each character in
//        a given string using the stream API and collectors.

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "harshal";
        Map<Character, Long> collect = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
