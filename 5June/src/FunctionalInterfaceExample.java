import java.util.function.Function;

interface SquareFunction {
    int apply(int number);
}

class SquareCalculator implements SquareFunction {
    @Override
    public int apply(int number) {
        return number * number;
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        SquareFunction calculator = new SquareCalculator();
        int result = calculator.apply(5);
        System.out.println("Square of 5: " + result);
    }
}
