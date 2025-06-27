import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Harshal");
        Optional<String> emptyName = Optional.empty();

        name.ifPresent(n -> System.out.println("Name: " + n));

        String result = emptyName.orElse("No name provided");
        System.out.println(result);
    }
}
