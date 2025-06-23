//Write a Java 8 program to sort a given list
//of decimal numbers in reverse order.


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class SortReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,1,4,2,5,6,2,3);
        System.out.println(list.reversed());

        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);

    }
}
