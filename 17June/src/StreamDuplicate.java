//Remove duplicate elements from a list using Java 8 streams.
//○ Write a Java 8 program to remove duplicate elements from a
// list using the stream API and lambda expressions.

import java.util.*;
import java.util.stream.Collectors;

public class StreamDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8,2,3,3,3,2,4,5,6,5,4,5,4,4,44);
        list.stream().distinct().forEach(System.out::print);   //distinct elements

        Set<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(duplicates);

    }
}
