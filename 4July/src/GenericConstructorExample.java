public class GenericConstructorExample {
    public <T> GenericConstructorExample(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenericConstructorExample obj1 = new GenericConstructorExample(100);
        GenericConstructorExample obj2 = new GenericConstructorExample("Hello");
    }
}
