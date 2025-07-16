class Shared {
    synchronized void method1(Shared s2) {
        System.out.println(Thread.currentThread().getName() + " entered method1");
        try { Thread.sleep(100); } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " trying to call method2 on other object");
        s2.method2(this);
    }

    synchronized void method2(Shared s1) {
        System.out.println(Thread.currentThread().getName() + " entered method2");
        try { Thread.sleep(100); } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + " trying to call method1 on other object");
        s1.method1(this);
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Shared obj1 = new Shared();
        Shared obj2 = new Shared();

        Thread t1 = new Thread(() -> obj1.method1(obj2), "Thread-1");
        Thread t2 = new Thread(() -> obj2.method2(obj1), "Thread-2");

        t1.start();
        t2.start();
    }
}
