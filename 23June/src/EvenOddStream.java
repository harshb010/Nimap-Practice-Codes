import java.util.List;

//Separate odd and even numbers in a list of integers.
//○ Given a list of integers, write a Java 8 program to separate
//the odd and even numbers into two separate lists.
public class EvenOddStream {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> list2 = list.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(list1+" "+list2);
    }
}
