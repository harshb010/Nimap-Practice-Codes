class A {
    synchronized void methodA(B b) {
        System.out.println("Thread-1: locked A, trying to lock B...");
        try { Thread.sleep(100); } catch (Exception e) {}
        b.last(); // wants lock on B
    }

    synchronized void last() {
        System.out.println("Inside A.last()");
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread-2: locked B, trying to lock A...");
        try { Thread.sleep(100); } catch (Exception e) {}
        a.last(); // wants lock on A
    }

    synchronized void last() {
        System.out.println("Inside B.last()");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Thread-1 locks A then tries to lock B
        new Thread(() -> a.methodA(b)).start();

        // Thread-2 locks B then tries to lock A
        new Thread(() -> b.methodB(a)).start();
    }
}
