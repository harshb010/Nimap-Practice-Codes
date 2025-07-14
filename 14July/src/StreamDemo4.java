//Remove duplicate elements from a list using Java 8 streams.
//Write a Java 8 program to remove duplicate elements from a
//list using the stream API and lambda expressions.


import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,5,3,2);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}
