//Merge two unsorted arrays into a single sorted array using Java 8 streams.
//Write a Java 8 program to merge two unsorted arrays into a single-sorted
//array using the stream API.


import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo9{
    public static void main(String[] args) {
        Integer[] arr = {1,3,4,5,6,3,2};
        Integer[] arr1 = {1,8,6,2,9,4,5,6,7,3,2};

        Integer[] array = Stream.concat(Arrays.stream(arr), Arrays.stream(arr1))
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));


    }
}
