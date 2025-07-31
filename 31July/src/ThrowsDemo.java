public class ThrowsDemo {
    static void check() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Checked after delay");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
    }
}
