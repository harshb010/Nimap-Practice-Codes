import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Ankit", "Raj", "Ajay", "Ramesh", "Arjun", "Karan");
        long a = names.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(a);
    }
}
