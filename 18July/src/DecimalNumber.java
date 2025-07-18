//Sort a given list of decimals in reverse order.
//Write a Java 8 program to sort a given list
//of decimal numbers in reverse order.


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecimalNumber {
    public static void main(String[] args) {
        List<Double> list = List.of(1.2,2.2,3.1,1.1,1.99,5.4,2.4);
        List<Double> sorted = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);
    }
}
