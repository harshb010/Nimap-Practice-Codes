@FunctionalInterface
interface Greeter {
    default void sayHi(String name) {
        System.out.println("Default Hi "+name);
    }

    void greet(String name);
}
public class FunctionalDemo{
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hello, " + name);
        greeter.greet(" ");
    }

}