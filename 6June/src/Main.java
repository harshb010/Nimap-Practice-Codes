interface A {
    void methodA();
}

interface B {
    void methodA();
}

class C implements A, B { // Implements multiple interfaces
    public void methodA() { System.out.println("Method A implemented"); }
    public void methodB() { System.out.println("Method B implemented"); }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
