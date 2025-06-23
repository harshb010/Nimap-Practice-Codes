//Write a Java 8 program to find the frequency of each element in
//an array or a list using streams and collectors.

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,4,5,6,1,2};

        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
