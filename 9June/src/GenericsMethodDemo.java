public class GenericsMethodDemo {

    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        printItem(100);
        printItem("Hello Generics!");
        printItem(3.14);
    }
}
