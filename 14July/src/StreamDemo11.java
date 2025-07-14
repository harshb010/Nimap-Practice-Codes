//Get the three maximum and three minimum numbers from a given list of integers.
//Write a Java 8 program to get the three maximum and three minimum numbers
//from a given list of integers.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo11 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,8,6,2,9,4,5,6,7,3,2);
        List<Integer> limit = list.stream().sorted().distinct().limit(3).toList();
        List<Integer> limit1 = list.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toList();

        System.out.println(limit);
        System.out.println(limit1);

    }
}
