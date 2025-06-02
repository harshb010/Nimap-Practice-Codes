public class StaticMethodDemo {

    static int count = 0;
    int id;

    static {
        System.out.println("Static block executed once when class is loaded.");
    }

    StaticMethodDemo() {
        count++;
        id = count;
        System.out.println("Object created with id: " + id);
    }

    public static void showCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        StaticMethodDemo obj1 = new StaticMethodDemo();
        StaticMethodDemo obj2 = new StaticMethodDemo();

        StaticMethodDemo.showCount();
    }
}
