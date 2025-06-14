public class Demo {

    static void staticMethod() {
        System.out.println("Static method called");
    }

    void instanceMethod() {

        staticMethod();
    }

    static void anotherStaticMethod() {

        staticMethod();
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.instanceMethod();
        anotherStaticMethod();
    }
}
