//Find the frequency of each element in an array or a list.
//        ○ Write a Java 8 program to find the frequency of
//        each element in an array or a list using streams and collectors.


import java.util.Arrays;
import java.util.stream.Collectors;

public class IntFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,4,3,4,3,6,7};

        Arrays.stream(arr).mapToObj(x -> x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(arr);
    }
}
