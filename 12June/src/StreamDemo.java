import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Harsh","Bhavesh","Harshal","Venk","Durgesh","Harsha");
        long y = students.stream().filter(x -> x.startsWith("H")).count();
        System.out.println(y);
    }
}
