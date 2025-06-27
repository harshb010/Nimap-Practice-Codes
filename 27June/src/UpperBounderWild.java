import java.util.List;

public class UpperBounderWild{
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(4.5, 5.5);

        System.out.println("Sum (integers): " + sumList(integers));
        System.out.println("Sum (doubles): " + sumList(doubles));
    }
}
