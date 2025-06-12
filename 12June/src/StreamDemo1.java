//Separate odd and even numbers in a list of integers.
//  ○ Given a list of integers, write a Java 8 program
//  to separate the odd and even numbers into two separate lists.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList = (list.stream().filter(x -> x % 2 != 0).toList());
        List<Integer> oddList = (list.stream().filter(x -> x % 2 == 0).toList());
        System.out.println(evenList);
        System.out.println(oddList);
    }
}
