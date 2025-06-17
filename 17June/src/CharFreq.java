//Find the frequency of each character in a string using Java 8 streams.
//○ Write a Java 8 program to find the frequency of each character
// in a given string using the stream API and collectors.

import java.util.Map;
import java.util.stream.Collectors;

public class CharFreq {
    public static void main(String[] args) {
        String str = "harshal";

       Map<Character, Long> freq = str.chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(freq);
    }
}
