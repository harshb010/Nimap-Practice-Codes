import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(1,x -> x+1).limit(10).forEach(System.out::println);

    }
}