import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> odd = x -> x % 2 != 0;
        System.out.println(odd.test(8));

        Predicate<String> startWithH = str -> str.startsWith("H");
        Predicate<String> endsWithL = str -> str.endsWith("L");
        Predicate<String> and = startWithH.or(endsWithL);
        System.out.println(and.test("HARSHAL"));

    }
}
