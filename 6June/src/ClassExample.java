public class ClassExample {
    int count = 10;

    void display() {
        System.out.println("Count is: " + count);
        showMessage();
    }

    void showMessage() {
        System.out.println("Hello from showMessage()");
    }

    public static void main(String[] args) {
        ClassExample obj = new ClassExample();
        obj.display();
        obj.showMessage();

    }
}
