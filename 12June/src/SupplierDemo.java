import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> str = () -> "Hello" ;
        System.out.println(str.get());
    }
}
