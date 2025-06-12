import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> integer = x -> System.out.println(x+x);
        integer.accept(5);
    }
}
