public class IntegerDemo {
    public static void main(String[] args) {
        Integer x = 200;
        Integer y = 200;

        System.out.println(x == 200);  // false ❌ (different objects)

        Integer a = 100;
        Integer b = 100;

        System.out.println(a == 100);  // true ✅ (same object from cache)

    }
}
