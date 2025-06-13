import java.util.Arrays;
import java.util.List;

public class SquareEachNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().map(x -> x*x).forEach(System.out::println);
    }
}
