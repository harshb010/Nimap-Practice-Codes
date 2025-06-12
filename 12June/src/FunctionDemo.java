import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> fun = x -> x*x;
        System.out.println(fun.apply(5));
    }
}
