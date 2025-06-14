class Outer1 {
    static class Inner {
        static void showStatic() {
            System.out.println("Static method in static inner class");
        }

        void showInstance() {
            System.out.println("Instance method in static inner class");
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Outer1.Inner.showStatic();

        Outer1.Inner inner = new Outer1.Inner();
        inner.showInstance();


    }
}
